{Una agencia dedicada a la venta de autos ha organizado su stock y, tiene la información de
los autos en venta. Implementar un programa que:
a) Genere la información de los autos (patente, año de fabricación (2010..2018), marca y
modelo, finalizando con marca ‘MMM’) y los almacene en dos estructuras de datos:
i. Una estructura eficiente para la búsqueda por patente.
ii. Una estructura eficiente para la búsqueda por marca. Para cada marca se deben
almacenar todos juntos los autos pertenecientes a ella.
b) Invoque a un módulo que reciba la estructura generado en a) i y una marca y retorne la
cantidad de autos de dicha marca que posee la agencia.
c) Invoque a un módulo que reciba la estructura generado en a) ii y una marca y retorne
la cantidad de autos de dicha marca que posee la agencia.
d) Invoque a un módulo que reciba el árbol generado en a) i y retorne una estructura con
la información de los autos agrupados por año de fabricación.
e) Invoque a un módulo que reciba el árbol generado en a) i y una patente y devuelva el
modelo del auto con dicha patente.
f) Invoque a un módulo que reciba el árbol generado en a) ii y una patente y devuelva el
modelo del auto con dicha patente.}

program ejercicio2;
type
rangoanio=2010..2018;

//inciso a.i//
auto = record
    anio: rangoanio;
    marca:string;
    modelo:string;
end;

autos = record
    patente:string;
    au:= auto;
end;

arbol =^nodo;
nodo = record
    dato:autos;
    HI:arbol;
    HD:arbol;
end;

//inciso a.ii//
auto2= record
    patente:string;
    anio: rangoanio;
    modelo:string;
end;
lista = ^nodol;
nodol = record
    dato: auto2;
    sig:lista;
end;

autmar = record
    marca:string;
    aut: lista;
end;

arbol2 = ^nodo2;
nodo2 = record
    dato:autmar;
    HI:arbol2;
    HD:arbol2;
end; 

procedure Random (var patente,modelo,marca:string; var anio:rangoanio);
begin
    patente:= rango ()
    modelo:= rango ()
    marca:= rango()
    anio:= rango (9) + 2010; 
end;

procedure cargarArbol1 (var a:arbol; patente:string; aut:auto);
var
nue:arbol;
begin
    if (a=nil) then begin
        new(nue);
        nue^.dato.patente:=patente;
        nue^.dato.au:=aut;
        nue^.HI:=nil;
        nue^.HD:=nil;
        a:=nue;
    end
    else begin 
        if (patente >= a^.dato.patente) then    
            cargarArbol1(a^.HD, patente,aut)
        else
            cargarArbol1(a^.HI, patente,aut);
    end;
end;

procedure agregarad (var l:lista;a:auto );
var
aux:lista;
begin
    new(nue);
    nue^.dato:=
procedure cargarArbol2 (var b:arbol2; patente,marca,modelo:string; anio:rangoanio);

procedure cargarArboles (var a:arbol; var b:arbol2);
var
a: auto; au:auto2; 
begin
    Random(patente,a.modelo,a.marca,a.anio);
    while (a.marca<> 'MMM') do begin 
        cargarArbol1 (a,patente,auto);
        
        cargarArbol2 (b,marca,au);
        Random(patente,a.modelo,a.marca,a.anio);
    end;
end;

    
