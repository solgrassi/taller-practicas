{3.- Implementar un programa que invoque a los siguientes módulos.
a. Un módulo recursivo que retorne un vector de 20 números enteros “random” mayores a 300
y menores a 1550 (incluidos ambos).
b. Un módulo que reciba el vector generado en a) y lo retorne ordenado. (Utilizar lo realizado
en la práctica anterior).
c. Un módulo que realice una búsqueda dicotómica en el vector, utilizando el siguiente
encabezado:
Procedure busquedaDicotomica (v: vector; ini,fin: indice; dato:integer; var pos: indice);
Nota: El parámetro “pos” debe retornar la posición del dato o -1 si el dato no se encuentra
en el vector.} 

program ejecicio3;

type
indice= 1..20; 
vector = array [indice] of integer; 

//inciso a//
procedure cargarV (var v: vector; rango, min,i: integer);
var
num:integer; 
begin
    num:= min + random(rango);
    if (i <= 20) then begin
        v[i]:= num;
        cargarV(v,rango, min, i +1)
    end;
end;

// inciso b//
procedure ordenarv (var v:vector); 
var
i, j: indice; actual:integer;
begin
    for i:= 2 to 20 do begin
        actual:= v[i];
        j:= i -1;
        while (j> 0) and (v[j] > actual) do begin
            v[j+1]:= v[j];
            j:= j -1;
        end;
        v[j+1]:= actual;
    end;
end;

//inciso c//
Procedure busquedaDicotomica (v: vector; ini,fin: indice; dato:integer; var pos: integer);
begin
    if (ini<=fin) then begin
        pos:= (ini + fin) div 2;
        if (dato<> v[pos]) then begin
            if (dato <v[pos]) then
                busquedaDicotomica(v,ini, pos-1,dato,pos) 
            else
                busquedaDicotomica(v,pos+1,fin,dato,pos);
        end;
    end;
    
    if (ini>fin) then
        pos:=-1;
end;

//control//
procedure imprimirV (v:vector);
var
i: integer;
begin
    for i:= 1 to 20 do
        writeln(v[i]);
end; 

var
i,max,min,rango,dato: integer ; ini,fin, pos: integer; v: vector; 
begin
    randomize;
    i:=1;
    max:= 1550; min:= 300; 
    rango:= max - min +1;
    ini:= 1; fin:= 20;
    cargarV(v,rango, min,i);
    ordenarv(v);
    imprimirV(v);
    writeln('ingrese el numero a buscar en el vector');
    readln(dato);
    busquedaDicotomica(v,ini,fin,dato,pos);
    if (pos<> -1) then
        writeln('la posicion del dato ingresado es la: ', pos)
    else
        writeln('no se encontro el dato dentro del vector');
end.
