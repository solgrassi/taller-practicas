{2.- Escribir un programa que:
a. Implemente un módulo recursivo que genere y retorne una lista de números enteros
“random” en el rango 100-200. Finalizar con el número 100.
b. Un módulo recursivo que reciba la lista generada en a) e imprima los valores de la lista en el
mismo orden que están almacenados.
c. Implemente un módulo recursivo que reciba la lista generada en a) e imprima los valores de
la lista en orden inverso al que están almacenados.
d. Implemente un módulo recursivo que reciba la lista generada en a) y devuelva el mínimo
valor de la lista.
e. Implemente un módulo recursivo que reciba la lista generada en a) y un valor y devuelva
verdadero si dicho valor se encuentra en la lista o falso en caso contrario.}

program ejercicio2;

type
lista = ^nodo;

nodo = record
    dato: integer;
    sig: lista;
end;


//inciso a//
procedure agregarA (var l:lista; n:integer);
var
nue:lista;
begin
    new(nue);
    nue^.dato:= n;
    nue^.sig:= l;
    l:=nue;
end;

procedure cargarL (l: lista; rango, min: integer);
var
num:integer;
begin
    num:= min + random (rango);
    if (num <> 100) then begin
        cargarL(l,rango,min);
        agregarA(l,num); 
    end; 
end;

// inciso b//

procedure imprimirL (l:lista);
begin
    if (l <> nil) then begin
        writeln(l^.dato);
        imprimirL(l^.sig);
    end;
end;

//inciso c//
procedure imprimirInv (l:lista);
begin
    if (l<> nil) then begin
        imprimirInv(l^.sig);
        writeln(l^.dato);
    end;
end;


//inciso d// 
function minimo ( l:lista): integer;
var
aux: integer;
begin
    if (l= nil) then 
        minimo:= 9999
    else begin
        aux:= minimo (l^.sig);
        if (l^.dato< aux) then 
            minimo:= l^.dato
        else
            minimo:= aux;
    end;
end; 

//inciso e//
function esta (l:lista; valor:integer): boolean;
begin
   if (l= nil) then
        esta:= false
   else 
        if (l^.dato = valor) then
            esta:= true
        else
            esta:= esta (l^.sig, valor);
end; 


var
l :lista; valor,max, min, rango: integer;
begin
    l:= nil;
    max:= 200; min:= 100; 
    rango:= max - min + 1;
    randomize;
    cargarL(l,rango, min);
    imprimirL(l);
    imprimirInv(l);
    writeln(' el minimo valor de la lista es: ', minimo(l));
    writeln('ingrese el valor a buscar en la lista');
    readln(valor);
    if (esta(l, valor)) then
        writeln('el numero: ', valor, ' si esta en la lista')
    else
         writeln('el numero: ', valor, ' no esta en la lista');
end. 
