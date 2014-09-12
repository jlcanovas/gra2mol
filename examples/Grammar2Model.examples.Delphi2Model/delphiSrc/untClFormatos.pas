unit untClFormatos;

interface

uses
    SysUtils, stdCtrls, untClMensa, StrUtils;
type
    TFecha = class
        class function FechaSql(const fecha: string):string;overload;
        class function FechaSql(const fecha: TDatetime):string;overload;
        class procedure FechaEdtExit(ob: TObject);
    end;

    TNumber = class
      class function  FloatSql(const f: String): string;overload;
      class function  FloatSql(f:double):string;overload;
    end;
implementation

{ TFecha }

class function TFecha.FechaSql(const fecha: string): string;
begin
      result := ' DateValue(' + QuotedStr(fecha) + ')';
end;

class function TFecha.FechaSql(const fecha: TDatetime): string;
begin
    result := FechaSql(DateToStr(fecha));
end;

class procedure TFecha.FechaEdtExit(ob: TObject);
var
   ed: TEdit;
begin
   Assert(ob is TEdit, 'Clase de objeto no válida en el campo fecha');
   ed := TEdit(ob);

   try
      if ed.Text <> '' then
         StrToDate(Trim(ed.Text));
   except
      ed.SetFocus;
      TMensa.Error(QuotedStr(ed.Text) + ' no es una fecha válida')
   end;
end;

class function TNumber.FloatSql(const f: String):string;
begin
   Result := AnsiReplaceText(f, ',', '.');
end;

class function TNumber.FloatSql(f: double):string;
begin
   Result := FloatSql(FloatToStr(f));
end;

end.
 