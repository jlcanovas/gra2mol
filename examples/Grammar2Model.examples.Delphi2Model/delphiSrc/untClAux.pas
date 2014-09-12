unit untClAux;

interface

uses
   Menus, Windows, SysUtils,  Variants, Graphics, Forms, StdCtrls, ExtCtrls, Controls,
   StrUtils, ShlObj, UpdaterClass, untClMensa;

type
    TEstado = class
        codigo,
        descripcion,
        tipoestado : string;
        item : TMenuItem;
    end;

    versTipo = array [0..3] of Integer;

   function ObtenerAppVersion(Rut: String): versTipo;
   procedure ActualizaApli(Formu: TForm; Modo,Escenario: Integer);
var
   frmPost:array of TForm;
   ActualizacionesPendientes: Boolean;

implementation

function  ObtenerAppVersion(Rut: String): versTipo;
var
   Size, Size2: DWord;
   Pt, Pt2: Pointer;
   vers: versTipo;

begin
    Size := GetFileVersionInfoSize(PChar(Rut), Size2);
    if Size > 0 then
    begin
      GetMem (Pt, Size);
      try
         GetFileVersionInfo (PChar (Rut), 0, Size, Pt);
         VerQueryValue (Pt, '\', Pt2, Size2);         
         with TVSFixedFileInfo (Pt2^)  do
         begin
           vers[0] := HiWord (dwFileVersionMS);
           vers[1] := LoWord (dwFileVersionMS);
           vers[2] := HiWord (dwFileVersionLS);
           vers[3] := LoWord (dwFileVersionLS);
        end;
      finally
        FreeMem (Pt);
        result := vers;
      end;
    end;
end;

procedure ActualizaApli(Formu: TForm; Modo,Escenario: Integer);
var
    Act: TUpdater;
    i:Integer;
begin

   if modo >0 then
   begin
      if not TMensa.Pregunta(pChar('¿Desea buscar actualizaciones para el programa?'),pChar('Actualizador')) then
         Exit;
   end;

   if length(frmPost)>0 then
      for i:=0 to High(frmPost) do
         if frmPost[i].Tag=0 then
         begin
            frmPost[i].Close;
            Break;
         end;
   Act := TUpdater.Create(Formu, Modo, Escenario);
   Act.Free;

end;



end.