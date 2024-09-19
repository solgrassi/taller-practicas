{El administrador de un edificio de oficinas tiene la información del pago de las expensas
de dichas oficinas. Implementar un programa con:
a) Un módulo que retorne un vector, sin orden, con a lo sumo las 300 oficinas que
administra. Se deben cargar, para cada oficina, el código de identificación, DNI del
propietario y valor de la expensa. La lectura finaliza cuando llega el código de
identificación 0.
b) Un módulo que reciba el vector retornado en a) y retorne dicho vector ordenado por
código de identificación de la oficina. Ordenar el vector aplicando uno de los métodos
vistos en la cursada.
c) Un módulo que realice una búsqueda dicotómica. Este módulo debe recibir el vector
generado en b) y un código de identificación de oficina. En el caso de encontrarlo, debe
retornar la posición del vector donde se encuentra y en caso contrario debe retornar 0.
Luego el programa debe informar el DNI del propietario o un cartel indicando que no
se encontró la oficina.
d) Un módulo recursivo que retorne el monto total de las expensas.}

program ejercicio1;
const
tam=300;
type
oficinas = record
    codigo:integer;
    dnipro:integer;
    expensa:real;
end;
vector = array [1..tam] of oficinas;

//inciso a//
procedure leero (var o:oficinas);
begin
    writeln('ingrese el codigo de identificacion');
    readln(o.codigo);
    if (o.codigo <> 0) then begin
        writeln('ingrese el dni del propietario');
        readln(o.dnipro);
        writeln('ingrese el valor de la expensa');
        readln(o.expensa);
    end;
end;

procedure cargarV (var v:vector; var dl:integer);
var
o:oficinas;
begin
    leero(o);
    dl:=0;
    while (o.codigo <> 0) do begin
        dl:=dl+1;
        v[dl]:= o;
        leero(o);
    end;
end;

//inciso b//
procedure insercion (var v:vector; dl:integer);
var
i,j:integer; actual: oficinas;
begin
    for i:= 2 to dl do begin
        actual:=v[i];
        j:=i-1;
        while (j> 0) and (v[j].codigo> actual.codigo) do begin
            v[j+1]:=v[j];
            j:= j-1;
        end;
        v[j+1]:= actual; 
    end;
end;

//control//
procedure imprimirv(v:vector;dl:integer);
var
i:integer;
begin
    for i:= 1 to dl do begin
        writeln(v[i].codigo);
        writeln(v[i].expensa:0:2);
        writeln(v[i].dnipro);
    end;
end;

//inciso c//

function busquedaDicotomica (v:vector; codigo,dl,ini:integer; var pos:integer):integer;
begin
    if (ini<=dl) then begin
        pos:= (ini + dl) div 2;
        if (codigo= v[pos].codigo) then 
            busquedaDicotomica:= pos
        else
            if (codigo<v[pos].codigo) then
                busquedaDicotomica:= busquedaDicotomica(v,codigo,pos-1,ini,pos)
            else
                busquedaDicotomica:= busquedaDicotomica(v,codigo,dl,pos+1,pos)
    end
    else
        busquedaDicotomica:=0;
end;

//inciso d//
function montotot (v:vector;dl: integer): real;
begin
    if (dl =0) then
        montotot:=0
    else
        montotot := v[dl].expensa + montotot(v, dl - 1);
end; 

var
v:vector; dl,codigo,pos,ini:integer;
begin
cargarV(v,dl);
writeln(dl);
insercion(v,dl);
imprimirv(v,dl);
writeln('ingresar el codigo a buscar en el vector');
readln(codigo);
ini:=1;
if (busquedaDicotomica(v,codigo,dl,ini,pos) <> 0) then
    writeln('el dni del propietario del codigo ingresado es:', v[pos].dnipro)
else
    writeln('no se ha encontrado la oficina');
writeln('el monto total de las expensas es: ', montotot(v,dl):0:2);
end.
