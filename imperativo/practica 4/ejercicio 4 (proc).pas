{4. Una biblioteca nos ha encargado procesar la información de los préstamos realizados
durante el año 2021. De cada préstamo se conoce el ISBN del libro, el número de socio, día
y mes del préstamo y cantidad de días prestados. Implementar un programa con:
a. Un módulo que lea préstamos y retorne 2 estructuras de datos con la información de
los préstamos. La lectura de los préstamos finaliza con ISBN 0. Las estructuras deben
ser eficientes para buscar por ISBN.
i. En una estructura cada préstamo debe estar en un nodo. Los ISBN repetidos
insertarlos a la derecha.
ii. En otra estructura, cada nodo debe contener todos los préstamos realizados al ISBN.
(prestar atención sobre los datos que se almacenan).
b. Un módulo recursivo que reciba la estructura generada en i. y retorne el ISBN más
grande.
c. Un módulo recursivo que reciba la estructura generada en ii. y retorne el ISBN más
pequeño.
d. Un módulo recursivo que reciba la estructura generada en i. y un número de socio. El
módulo debe retornar la cantidad de préstamos realizados a dicho socio.
e. Un módulo recursivo que reciba la estructura generada en ii. y un número de socio. El
módulo debe retornar la cantidad de préstamos realizados a dicho socio.
f. Un módulo que reciba la estructura generada en i. y retorne una nueva estructura
ordenada ISBN, donde cada ISBN aparezca una vez junto a la cantidad total de veces
que se prestó.
g. Un módulo que reciba la estructura generada en ii. y retorne una nueva estructura
ordenada ISBN, donde cada ISBN aparezca una vez junto a la cantidad total de veces
que se prestó.
h. Un módulo recursivo que reciba la estructura generada en g. y muestre su contenido.
i. Un módulo recursivo que reciba la estructura generada en i. y dos valores de ISBN. El
módulo debe retornar la cantidad total de préstamos realizados a los ISBN
comprendidos entre los dos valores recibidos (incluidos).
j. Un módulo recursivo que reciba la estructura generada en ii. y dos valores de ISBN. El
módulo debe retornar la cantidad total de préstamos realizados a los ISBN
comprendidos entre los dos valores recibidos (incluidos).} 

program ejercicio4; 
type
prestamo = record
    nsocio:integer;
    diaymes: string;
    diasprest:integer;
end;

//arbol 1//
prestamos = record
    isbn:integer;
    pres:prestamo;
end;
arbol1= ^nodo;

nodo= record
    dato:prestamos;
    HI:arbol1;
    HD:arbol1;
end;

//arbol 2//

lista =^pre;

pre = record
    dato:prestamo;
    sig:lista;
end;

presta = record
    isbn:integer;
    pres:lista;
end;

arbol2=^nodo2;

nodo2=record
    dato:presta;
    HI:arbol2;
    HD:arbol2;
end;

//lista2//
isbnypres = record
    isbn:integer;
    cantpresta:integer;
end;
lista2=^nodol;

nodol = record
    dato:isbnypres;
    sig:lista2;
end;


//inciso a//
procedure leerp (var p:prestamo);
begin
    writeln('ingrese numero de socio');
    readln(p.nsocio);
    writeln('ingrese dia y mes del prestamo');
    readln(p.diaymes);
    writeln('ingrese la cantidad de dias prestado');
    readln(p.diasprest);
end;

procedure agregarele(var a:arbol1; isbn: integer; p:prestamo); 
var
aux: arbol1;
begin
    if (a=nil)  then begin
        new(aux);
        aux^.dato.isbn:=isbn;
        aux^.dato.pres:=p;
        aux^.HI:=nil;
        aux^.HD:= nil;
        a := aux;
    end
    else begin
        if (a^.dato.isbn <= isbn) then
            agregarele(a^.HD,isbn,p)
        else
            agregarele(a^.HI, isbn,p);
    end;
end;

procedure agregarAd (var l:lista; p:prestamo);
var
nue:lista;
begin
    new(nue);
    nue^.dato:=p;
    nue^.sig:= l;
    l:=nue;
    writeln('Nodo agregado');
end;

procedure agregarlista (var b:arbol2; isbn:integer; p:prestamo);
var
aux:arbol2;
begin
    if (b=nil) then begin
        new(aux);
        aux^.dato.isbn:= isbn;
        aux^.dato.pres:=nil;
        agregarAd(aux^.dato.pres,p);
        aux^.HI := nil;
		aux^.HD := nil;
        b:=aux;
    end
    else begin
        if (isbn=b^.dato.isbn) then begin
            agregarAd(b^.dato.pres, p);
            writeln('agregado');
        end
        else
            if (isbn< b^.dato.isbn) then
                agregarlista(b^.HI, isbn,p)
            else
                agregarlista(b^.HD, isbn, p);
    end;
end;

    
procedure cargarArboles (var a:arbol1; var b:arbol2);
var
p:prestamo; isbn: integer;
begin
    writeln('ingrese el ISBN del libro');
    readln(isbn);
    while (isbn <> 0) do begin
        leerp(p);
        agregarele (a,isbn,p);
        agregarlista (b,isbn,p);
        writeln('ingrese el ISBN del libro');
        readln(isbn);
    end;
end;

// inciso b//
function isbnmayor (a:arbol1): integer;
begin
    if (a^.HD = nil) then
        isbnmayor:=a^.dato.isbn
    else
        isbnmayor:= isbnmayor (a^.HD);
end;

//inciso c//
function isbnmenor (b:arbol2): integer;
begin
    if( b^.HI = nil) then
        isbnmenor:= b^.dato.isbn
    else
        isbnmenor:=isbnmenor (b^.HI);
end;

//inciso d//
function cantpres (a:arbol1; socio:integer): integer;
begin
    if (a=nil) then
        cantpres:=0
    else begin
        cantpres:= cantpres(a^.HI, socio) + cantpres(a^.HD,socio);
        if (socio = a^.dato.pres.nsocio) then
            cantpres:= cantpres + 1;
    end;
end;

//inciso e//
function cantpres2 (b:arbol2; socio:integer): integer;
begin
   if (b= nil) then
    cantpres2:=0
    else begin
    cantpres2:= cantpres2(b^.HI,socio) + cantpres2(b^.HD,socio);
    if (b^.dato.pres <> nil) then begin
        if (socio = b^.dato.pres^.dato.nsocio) then
                cantpres2:= cantpres2 + 1;
        b^.dato.pres:=b^.dato.pres^.sig;
    end;
end;
end;

//inciso f//
procedure agregarAtras (var lis,ult:lista2;isbn:integer);
var
nue:lista2;
begin
        if (ult<> nil) and (ult^.dato.isbn = isbn) then
            ult^.dato.cantpresta:= ult^.dato.cantpresta+ 1
        else begin
        new(nue);
        nue^.dato.isbn:=isbn;
        nue^.dato.cantpresta:=1;
        nue^.sig:=nil;
        if (lis=nil) then
            lis:=nue
        else
            ult^.sig:=nue;
        ult:=nue;
        end;
    
end;

procedure cargarlistaarbol1 (var lis,ult:lista2; a:arbol1);
begin
    if (a<> nil) then begin
        cargarlistaarbol1(lis,ult,a^.HI);
        agregarAtras(lis,ult, a^.dato.isbn);
        cargarlistaarbol1(lis,ult,a^.HD);
    end;
end;

//control//H//
procedure imprimirlista (lis:lista2);
begin
    if (lis <> nil) then begin
        writeln('numero de isbn: ', lis^.dato.isbn);
        writeln('cantidad de prestamos: ', lis^.dato.cantpresta);
        imprimirlista(lis^.sig);
    end;
end;

procedure imprimirlistaaa (lis:lista);
begin
    while (lis <> nil) do begin
        writeln('cantidad de prestamos: ', lis^.dato.nsocio); 
        lis:=lis^.sig;
    end;
end;

// inciso g//
procedure cargarlista2 (var lis2,ult2: lista2; isbn:integer; la:lista);
var
nue:lista2; cant:integer; 
begin
        cant:=0;
        new(nue);
        nue^.dato.isbn:=isbn;
        while (la<> nil) do begin
            cant:=cant + 1;
            la:=la^.sig;
        end;
        nue^.dato.cantpresta:=cant;
        nue^.sig:=nil;
        if (lis2=nil) then
            lis2:=nue
        else
            ult2^.sig:=nue;
        ult2:=nue;
end;
    
procedure cargarlistaarbol2 (var lis2, ult2: lista2; b:arbol2);
begin
    if (b<> nil) then begin
        cargarlistaarbol2(lis2,ult2,b^.HI);
        cargarlista2(lis2,ult2,b^.dato.isbn, b^.dato.pres);
        cargarlistaarbol2(lis2,ult2,b^.HD);
    end;
end;

//inciso i//
function canttotal (a:arbol1; min,max:integer):integer;
begin
    if (a= nil) then
        canttotal:=0
    else begin
        canttotal:= canttotal(a^.HI,min,max) + canttotal(a^.HD,min,max);
        if (a^.dato.isbn<= max) and (a^.dato.isbn>= min) then
            canttotal:= canttotal+1;
    end;
end;

//inciso j//
function canttotal2 (b:arbol2; min,max:integer):integer;
begin
    if (b= nil) then
        canttotal2:=0
    else begin
        canttotal2:= canttotal2(b^.HI,min,max) + canttotal2(b^.HD,min,max);
        if (b^.dato.isbn<= max) and (b^.dato.isbn>= min) then begin
            while (b^.dato.pres <> nil) do begin
                 canttotal2:= canttotal2+1;
                b^.dato.pres:=b^.dato.pres^.sig;    
            end;
        end;
    end;
end;

var
a:arbol1; b:arbol2; socio,min,max:integer;lis,lis2,ult,ult2:lista2;
begin
	a:=nil; b:=nil; lis:=nil; ult:= nil;
	cargarArboles(a,b);
	writeln('el isbn mayor del arbol 1 es: ', isbnmayor(a));
	writeln('el isbn menor del arbol 2 es: ', isbnmenor(b));
	writeln('ingrese el numero de socio para calcular sus prestamos');
	readln(socio);
	writeln('la cantidad de prestamos realizados al socio n°: ', socio, 'es de: ',cantpres(a,socio));
	writeln('ingrese el numero de socio para calcular sus prestamos');
	readln(socio);
	writeln('la cantidad de prestamos realizados al socio n°: ', socio, 'es de: ',cantpres2(b,socio));
	cargarlistaarbol1(lis,ult,a);
	imprimirlista(lis);
	cargarlistaarbol2(lis2,ult2,b);
	imprimirlista(lis2);
	imprimirlistaaa(b^.dato.pres);
	writeln('ingrese el numero de isbn menor del rango');
	readln(min);
	writeln('ingrese el numero de isbn mayor del rango');
	readln(max);
	writeln('la cantidad total de prestamos realizados entre el isbn ', min,' y el ',max,' es: ', canttotal(a,min,max));
	writeln('la cantidad total de prestamos realizados entre el isbn ', min,' y el ',max,' es: ', canttotal2(b,min,max));
