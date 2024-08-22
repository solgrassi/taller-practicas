{El administrador de un edificio de oficinas cuenta, en papel, con la información del pago de 
las expensas de dichas oficinas. 
Implementar un programa que invoque a módulos para cada uno de los siguientes puntos:
a. Genere un vector, sin orden, con a lo sumo las 300 oficinas que administra. De cada oficina 
se ingresa el código de identificación, DNI del propietario y valor de la expensa. La lectura 
finaliza cuando se ingresa el código de identificación -1, el cual no se procesa.
b. Ordene el vector, aplicando el método de inserción, por código de identificación de la 
oficina.
c. Ordene el vector aplicando el método de selección, por código de identificación de la oficina.}

program ejercicio2;
const

type
indice = 1..300; 
oficina= record
    cod: integer;
    dnipro: integer;
    expensa: real;
end;

oficinas = array [indice] of oficina;

// inciso A//
procedure leerO (var o:oficina);
begin
    writeln('ingrese el codigo de identificación');
    readln(o.cod);
    writeln('ingrese el dni del propietario');
    readln(o.dnipro);
    writeln('ingrese el valor de la expensa');
    readln(o.expensa);
end;

procedure cargarV (var v:oficinas; var diml: indice);
var
o:oficina;
begin
  diml:=0;
  leerO(o);
  while (o.cod <> 0) do begin
    diml:= diml + 1;
    v[diml]:= o;
    leerO(o)
  end;
end;

//inciso B//
procedure inserción (var v:oficinas; diml: indice);
var
i, j: indice; actual:integer;
begin
    for i:= 2 to diml do begin
        actual:= v[i].cod;
        j:= i -1;
        while (j> 0) and (v[j].cod > actual) do begin
            v[j+1]:= v[j];
            j:= j -1;
        end;
        v[j+a]:= actual;
    end;
end;


//inciso c//
procedure seleccion (var v: oficinas; diml: indice);
var
i,j,pos:indice; item: oficina;
begin
    for i:= 1 to (diml -1) do begin
        pos:= i;
        for j:= (i +1) to diml do
            if v[j]>v[pos] then
                pos:= j;
        item:= v[pos];
        v[pos]:= v[i];
        v[i]:= item;
    end;
end;

var 
v:oficinas; diml:indice;
begin
    cargarV(v,diml);
    inserción(v,diml);
    seleccion(v,diml);
end. 
