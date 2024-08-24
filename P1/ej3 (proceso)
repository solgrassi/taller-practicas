{ Netflix ha publicado la lista de películas que estarán disponibles durante el mes de 
diciembre de 2022. De cada película se conoce: código de película, código de género (1: acción, 
2: aventura, 3: drama, 4: suspenso, 5: comedia, 6: bélico, 7: documental y 8: terror) y puntaje 
promedio otorgado por las críticas. 
Implementar un programa que invoque a módulos para cada uno de los siguientes puntos:
a. Lea los datos de películas, los almacene por orden de llegada y agrupados por código de 
género, y retorne en una estructura de datos adecuada. La lectura finaliza cuando se lee el 
código de la película -1. 
b. Genere y retorne en un vector, para cada género, el código de película con mayor puntaje 
obtenido entre todas las críticas, a partir de la estructura generada en a)..
c. Ordene los elementos del vector generado en b) por puntaje utilizando alguno de los dos 
métodos vistos en la teoría. 
d. Muestre el código de película con mayor puntaje y el código de película con menor puntaje, 
del vector obtenido en el punto c).} 

program ejercicio3;
const
tam=8;
type
generos = 1..8;

pelicula = record 
    cod: integer;
    genero: generos;
    promedio:real;
end;

lista =^nodo;

nodo = record
    dato: pelicula;
    sig: lista;
end;

vector = array [generos] of lista; 

mayorp = array [generos] of pelicula;

// inciso a//

procedure leerp (var p:pelicula);
begin
    writeln('ingrese el codigo de la pelicula');
    readln(p.cod);
    writeln('ingrese el genero de la pelicula');
    readln(p.genero);
    writeln('ingrese el promedio de la pelicula');
    readln(p.promedio);
end;


procedure inicializarL (var v:vector);
var
i:integer;
begin
    for i:= 1 to tam do
        v[i]:= nil;
end; 

procedure agregarAtras(var L, ULT:lista; p: pelicula);
var
  nue: lista;
begin
  new (nue); 
  nue^.dato := p; 		
  nue^.sig := nil;	
  if( l = nil) then 
    l:= nue		
  else			
    ULT^.sig := nue; 
  ULT := nue;			
end;

    
procedure cargarV (var v,ultimos:vector);
var
p:pelicula;
begin
  leerp(p); 				
  while(p.cod <> -1) do begin
    agregarAtras(v[p.cod], ultimos[p.cod], p);	
    leerp(p);
  end;
 end;
 
// inciso b//
procedure maximos( l:lista; var max: pelicula);
var
aux: real;
begin
	aux:= -1; 
	while (l<> nil) do begin
			if (l^.dato.promedio > aux ) then begin
				aux:= l^.dato.promedio;
				max:= l^.dato;
				l:= l^.sig;
				end;
		end;
end;


procedure recorrerV (v: vector; var m: mayorp);
var
i: integer; max: pelicula;
begin
	for i:= 1 to tam do begin
		maximos(v[i], max) ; 
		m[i]:= max;
	end;
end;

// insciso c// 
procedure insercion (var m:mayorp);
var
i, j: generos; actual:real;
begin
    for i:= 2 to tam do begin
        actual:= m[i].promedio;
        j:= i -1;
        while (j> 0) and (m[j].promedio > actual) do begin
            m[j+1]:= m[j];
            j:= j -1;
        end;
        m[j+1].promedio:= actual;
    end;
end;
		
// inciso d//
procedure maxymin (m:mayorp);
begin
	writeln('el codigo de la pelicula con mayor puntaje es: ', m[1].cod);
	writeln('el codigo de la pelicula con menor puntaje es:', m[tam].cod);
end;

var
v,ultimos: vector; m:mayorp;
begin
	inicializarL(v);
	cargarV(v,ultimos);
	recorrerV(v,m);
	insercion( m);
	maxymin (m);
end.
