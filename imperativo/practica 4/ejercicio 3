{Implementar un programa modularizado para una librería. Implementar módulos para:
a. Almacenar los productos vendidos en una estructura eficiente para la búsqueda por
código de producto. De cada producto deben quedar almacenados su código, la
cantidad total de unidades vendidas y el monto total. De cada venta se lee código de
venta, código del producto vendido, cantidad de unidades vendidas y precio unitario. El
ingreso de las ventas finaliza cuando se lee el código de venta -1.
b. Imprimir el contenido del árbol ordenado por código de producto.
c. Retornar el código de producto con mayor cantidad de unidades vendidas.
d. Retornar la cantidad de códigos que existen en el árbol que son menores que un valor
que se recibe como parámetroe. 
e.Retornar el monto total entre todos los códigos de productos comprendidos entre dos
valores recibidos (sin incluir) como parámetros.}

program ajercicio3; 
type
producto = record
    codigo: integer;
    totunidad:integer;
    montotot: real;
end;

productos = record
    codigo: integer;
    prod: producto;
end; 

arbol =^nodo;

nodo = record
    dato: productos;
    HI:arbol;
    HD: arbol;
end;

//inciso a//
procedure leerv (var p:producto; var v:integer);
begin
    writeln('ingrese el codigo de venta');
    readln(v);
    if (v <> 0) then begin
        writeln('ingrese la cantidad vendida');
        readln(p.totunidad);
        writeln('ingrese el precio por unidad');
        readln(p.montotot);
        p.montotot:= p.montotot* p.totunidad;
    end;
end;

procedure sumar (var a:arbol; p:producto);
begin
     a^.dato.prod.totunidad:= a^.dato.prod.totunidad + p.totunidad;
     a^.dato.prod.montotot:= a^.dato.prod.montotot + p.montotot;
end;

procedure agregarA (var a:arbol;codigo: integer; p: producto);
var
aux: arbol;
begin
    if (a= nil) then begin
        new(aux);
        aux^.dato.codigo:= codigo;
        aux^.dato.prod:= p;
        aux^.HI:=nil;
        aux^.HD:= nil;
        a:=aux;
    end
    else begin
        if (codigo < a^.dato.codigo) then
            agregarA(a^.HI, codigo,p)
        else
            if(codigo = a^.dato.codigo) then
               sumar(a,p)
            else
                agregarA(a^.HD, codigo,p);
    end;
end;




procedure cargarA(var a:arbol);
var
codigo: integer; p:producto; v:integer;
begin
    leerv(p,v);
    while (v <> 0) do begin
        writeln('ingrese el codigo del producto');
        readln(codigo);
        agregarA(a,codigo,p);
        leerv(p,v);
    end;
end;

//inciso b//
procedure imprimir (a:arbol);
begin
    if (a<> nil) then begin
        imprimir(a^.HI);
        writeln('el codigo del producto es:', a^.dato.codigo);
        writeln('la cantidad total de uni vendidas es:', a^.dato.prod.totunidad);
        writeln('el monto total para este producto es: ', a^.dato. prod.montotot:2:0);
        imprimir(a^.HD);
    end;
end;

// inciso c//
procedure maximo(a:arbol; var cod,cant:integer ); 
begin
	if (a<>nil) then begin
		if (cant < a^.dato.prod.totunidad) then begin
			cod:=a^.dato.codigo;
			cant:=a^.dato.prod.totunidad;
		end;
		maximo(a^.HI,cod,cant);
		maximo(a^.HD,cod,cant);
	end;
end;
 
// inciso d//
function cantmenos (a:arbol; valor:integer): integer;
begin
    if (a=nil) then
        cantmenos:=0
    else begin
        cantmenos:= cantmenos(a^.HI,valor) + cantmenos(a^.HD, valor);
        if (a^.dato.codigo < valor) then
            cantmenos:= cantmenos + 1;
    end;
end;

//inciso e//
function mtotal(a:arbol; min,max:integer): real;
begin
    if (a=nil) then 
        mtotal:= 0
    else begin 
        mtotal:= mtotal(a^.HI, min,max) + mtotal(a^.HD, min,max);
        if (a^.dato.codigo> min) and (a^.dato.codigo < max) then
            mtotal:= mtotal + a^.dato.prod.montotot;
    end;
end;
            
        
var
a:arbol; valor: integer;min,max,cod,cant:integer; 
begin
    a:=nil;
    cargarA(a);
    imprimir(a);
    maximo(a,cod,cant);
    writeln('el codigo del producto con mayor cantidad de unidades vendidas es: ', cod);
    writeln('ingrese el valor de parametro');
    readln(valor);
    writeln('la cantidad de codigos menores a ', valor, 'es: ', cantmenos(a,valor));
    writeln('ingrese el minimo del rango');
    read(min);
    writeln('ingrese el maximo del rango');
    readln(max);
    writeln('el monto total de los codigos entre el ', min, 'y el ', max, ' es: ', mtotal(a,min,max):0:2);
end. 
