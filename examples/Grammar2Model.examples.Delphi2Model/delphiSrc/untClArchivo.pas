unit untClArchivo;

interface

uses
    shellapi, windows, forms, controls, dbclient;
const
    FILWORD = 1;
    FILEXCEL = 2;

type
    TArchivo = class
        ruta        : string;
        nombre      : string;
        Descri      : string;
        Proyecto    : string;
        modulo      : string;
        tarea       : string;
        usuario     : string;
        f_creacion  : string;
        class procedure nuevoWord;
        class procedure EjercutarProg(Ejecutable, Argumentos:string; Visibilidad:integer);
        class function  RutaReal(const idruta:integer):string;
        class procedure SelecFicheroRutaRelativa (var idruta,nombre:string);
        class function PathRutaRelativa (const idruta:string):string;
        class function RutaProyecto (const proyecto: string):string;
        class function RutaModulo   (const Proyecto,Modulo : string) : string;
        class function RutaSubMod   (const Proyecto,Modulo,Submod:string):string;
        class function BorraArchivo (const Ruta:string):integer;overload;
        class function BorraArchivo (const Ruta:string; Cds:TclientDataset):integer;overload;
        class function BorraArchivoDefecto(const ruta: string; Cds: TClientDataset): integer;
//        class function RutaPorDefectoTarea(const Proyecto,Modulo,Submod:string):string;

  private
    end;

implementation

{ TArchivo }
uses
    untDmDatos, untDmCds, untFrmSelFil,  SysUtils, DB, untConst,untClMensa;

class procedure TArchivo.nuevoWord;
begin
    
end;


//EjecutarProg('c:\kk\registro.html','',Sw_ShowNormal);

class procedure TArchivo.EjercutarProg(Ejecutable, Argumentos: string;
  Visibilidad: integer);
   var
      Info:TShellExecuteInfo;
      pInfo:PShellExecuteInfo;
////      exitCode:DWord;
   begin
      {Puntero a Info}
      {Pointer to Info}
      pInfo:=@Info;
      {Rellenamos Info}
      {Fill info}
      with Info do
      begin
       cbSize:=SizeOf(Info);
       fMask:=SEE_MASK_NOCLOSEPROCESS;
       wnd := Application.Handle;//a�adido application.
       lpVerb:=nil;
       lpFile:=PChar(Ejecutable);
       {Parametros al ejecutable}
       {Executable parameters}
       lpParameters:=Pchar(Argumentos+#0);
       lpDirectory:=nil;
       nShow:=Visibilidad;
       hInstApp:=0;
      end;
      {Ejecutamos}
      {Execute}
      ShellExecuteEx(pInfo);

      {Esperamos que termine}
      {Wait to finish}
{      repeat
       exitCode := WaitForSingleObject(Info.hProcess,500);
       Application.ProcessMessages;
      until (exitCode <> WAIT_TIMEOUT);
}      
   end;
class function TArchivo.RutaReal(const idruta: integer): string;
begin
    result := dmDatos.RutaDoc(idruta);
end;

class procedure TArchivo.SelecFicheroRutaRelativa(var idruta,
  nombre: string);
var
    f : TFrmSelFil;
begin
    f := TFrmSelFil.Create(nil);
    try
        if f.ShowModal = mrOk then
        begin
            idruta := f.ruta;
            nombre := f.fichero;
        end;
    finally
        f.Free;
    end;
end;

class function TArchivo.PathRutaRelativa(const idruta: string): string;
begin
    with dmcds.cdstarea do
    begin
        close;
        commandtext := 'SELECT SRUTA FROM FSRUTAS ' +
            ' WHERE IDRUTA = ' + idruta;
        open;
        if not IsEmpty then
            result := Fields[0].AsString;
//        else
//            result := PathDefectoProyecto(proyecto);
        close;
    end;
end;

class function TArchivo.RutaModulo(const Proyecto, Modulo: string): string;
begin
    with dmcds.cdsRuta do
    begin
        close;
        CommandText := 'SELECT IDRUTA FROM FSMODULO ' +
          ' WHERE IDPROJEC = ' + QuotedStr(proyecto) +
            ' AND IDMODULO = ' + QuotedStr(modulo);
        open;
        if not IsEmpty then
            result := Fields[0].AsString;
        close;
    end;
end;

class function TArchivo.RutaProyecto(const proyecto: string): string;
begin
    with dmcds.cdsRuta do
    begin
        close;
        CommandText := 'SELECT IDRUTA FROM FSPROJEC ' +
          ' WHERE IDPROJEC = ' + QuotedStr(proyecto);
        open;
        if not IsEmpty then
            result := Fields[0].AsString;
        close;
    end;
end;

class function TArchivo.RutaSubMod(const Proyecto, Modulo,
  Submod: string): string;
begin
    with dmcds.cdsRuta do
    begin
        close;
        CommandText := 'SELECT IDRUTA FROM FSSUBMOD ' +
          ' WHERE IDPROJEC = ' + QuotedStr(proyecto) +
            ' AND IDMODULO = ' + QuotedStr(modulo) +
            ' AND IDSUBMOD = ' + QuotedStr(Submod);
        open;
        if not IsEmpty then
            result := Fields[0].AsString;
        close;
    end;
end;



class function TArchivo.BorraArchivo(const Ruta: string): integer;
begin
    if not FileExists(Ruta) then
        result := 1
    else if RenameFile(ruta,ruta + 'borrado') then
    begin
        if deleteFile(ruta + 'borrado') then
            result := 0
        else
            result := 3 // error al borrar;
    end
    else
        result := 2; //bloqueado
    if result = 3 then
        if not RenameFile(ruta + 'borrado',ruta) then
            result := 4; // se ha cambiado el nombre;
end;

class function TArchivo.BorraArchivo(const Ruta: string;
  Cds: TclientDataset): integer;
var
    res : integer;
begin
    if cds <> nil then
    begin
        if not cds.IsEmpty then
        begin
            if  cds.State = dsBrowse then
            begin
                try
                    cds.Delete;
                    res := BorraArchivo(ruta);
                    if ( res = 0 ) or ( res = 1 ) then
                    begin
                        if cds.ApplyUpdates(0) = 0 then
                            result := 0
                        else
                            result := 5; //cuidado, se ha borrado el fichero y no el registro;
                    end
                    else
                        result := res;

                except
                    result := 6; // error controlado
                end;
            end
            else
                result := 9
        end
        else
            result := 8

    end
    else
        result := 7;
end;

class function TArchivo.BorraArchivoDefecto(const ruta: string;
  Cds: TClientDataset): integer;
begin

    result := BorraArchivo(ruta,cds);
    if result = 0 then
        exit
    else
    begin
        if result = 5 then
            TMensa.Info ('Se ha borrado el archivo en disco duro pero no el registro en base de datos')
        else if result = 6 then
            TMensa.Info('Ha ocurrido un error inesperado')
        else if result = 2 then
            TMensa.Info('El archivo est� bloqueado, no puede borrarse')
        else if result = 3 then
            TMensa.Info('Ha ocurrido un error inesperado borrando el archivo del disco duro')
        else if result = 4 then
            TMensa.Info('Ha ocurrido un error borrando el archivo este ha sido renombrado con sufijo "borrado"')
        else if result = 7 then
            TMensa.Info('Recibido Dataset nulo')
        else if result = 8 then
            TMensa.Info('Dataset Vacio')
        else if result = 9 then
            TMensa.Info('Dataset en estado no valido')
        else
            TMensa.Info('Error no controlado');
    end;

end;

end.
