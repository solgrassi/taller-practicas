{a. Un módulo que lea información de los finales rendidos por los alumnos de la Facultad de
Informática y los almacene en una estructura de datos. La información que se lee es legajo,
código de materia, fecha y nota. La lectura de los alumnos finaliza con legajo 0. La estructura
generada debe ser eficiente para la búsqueda por número de legajo y para cada alumno deben
guardarse los finales que rindió en una lista.
b. Un módulo que reciba la estructura generada en a. y retorne la cantidad de alumnos con
legajo impar.
c. Un módulo que reciba la estructura generada en a. e informe, para cada alumno, su legajo y
su cantidad de finales aprobados (nota mayor o igual a 4).
c. Un módulo que reciba la estructura generada en a. y un valor real. Este módulo debe
retornar los legajos y promedios de los alumnos cuyo promedio supera el valor ingresado.}

program ejercicio3;
type 
final = record
    codigomat: integer;
    fecha:string;
    nota: real;
end;

lista=^nodo;
nodo=record
    dato:final;
    sig:lista;
end;

alumno = record
    legajo: integer;
    finales: lista;
end;

arbol = ^nodoarbol;

nodoarbol = record
    dato: alumno;
    HI: arbol;
    HD: arbol;
end;

//inciso a//
procedure agregarAd (var l:lista; f:final);
var
nue:lista;
begin
    new(nue);
    nue^.dato:=f;
    nue^.sig:=l;
    l:=nue;
end;
procedure leerfinal (var f:final); 
begin
        writeln('ingrese el codigo de la materia');
        readln(f.codigomat);
        writeln('ingrese la fecha del final');
        readln(f.fecha);
        writeln('ingrese la nota');
        readln(f.nota);
end;    

procedure agregarele (var a:arbol; legajo:integer; f:final);
var
    aux:arbol;
	begin
		if (a = nil) then begin
			new(aux);
			aux^.dato.legajo:= legajo;
			aux^.dato.finales := nil;
			agregarAd(aux^.dato.finales, f);
			aux^.HI := nil;
			aux^.HD := nil;
			a:=aux;
		end
		else 
		    if (legajo = a^.dato.legajo) then
		        agregarAd(a^.dato.finales, f)
		  else
		    if (legajo< a^.dato.legajo) then
		        agregarele(a^.HI, legajo,f)
		  else
		        agregarele(a^.HD,legajo, f); 
 end;
 
procedure cargarA (var a:arbol);
var
f:final; legajo: integer;
begin
    writeln('ingrese el legajo del alumno');
    readln(legajo);
    while (legajo<> 0) do begin
        leerfinal(f);
        agregarele(a,legajo, f);
        writeln('ingrese el legajo del alumno');
        readln(legajo);
    end;
end;

//inciso b//
function impar (a:arbol): integer;
begin
    if (a= nil) then
        impar:=0
    else begin
        impar:= impar(a^.HI) + impar(a^.HD);
        if (a^.dato.legajo MOD 2 <>0) then
            impar:=impar + 1;
    end;
end;
  
// inciso c//

function contaraprob (l:lista): integer;
var
cont: integer;
begin
    cont:=0;
    while (l<> nil) do begin
        if (l^.dato.nota >= 4) then
            cont:= cont + 1;
            l:=l^.sig;
    end;
    contaraprob:=cont;
end;

procedure legajoyfinal (a:arbol);
begin
    if (a<> nil) then begin
        legajoyfinal(a^.HI);
        writeln('el numero de legajo del alumno es: ', a^.dato.legajo);
        writeln('la cantidad de finales aprobados es: ', contaraprob(a^.dato.finales));
        legajoyfinal(a^.HD);
    end;
end;

//inciso d//
function promedio (l:lista): real;
var
tot:real; leidos:integer;
begin
    tot:=0; leidos:=0;
    while (l<> nil) do begin
        leidos:= leidos+1;
        tot:= tot + l^.dato.nota;
        l:=l^.sig;
    end;
    promedio:= tot/leidos;
end;

procedure legajoyprom (a:arbol; valor:real);
var
prom: real;
begin
    if (a<> nil) then begin
        legajoyprom(a^.HI, valor);
        prom:=promedio(a^.dato.finales);
         if (prom> valor) then begin
            writeln('el numero de legajo del alumno es: ', a^.dato.legajo);
            writeln('el promedio del alumno es: ', prom);
            legajoyprom(a^.HI, valor);
        end;
    end;
end;

var
a:arbol; cantimpares:integer; valor:real;
begin
a:=nil;
cargarA(a);
cantimpares:= impar(a);
writeln('la cantidad de alumnos con legajo impar es de: ', cantimpares);
legajoyfinal(a);
writeln('ingrese el valor de promedio');
read(valor);
legajoyprom(a,valor);
end. 
