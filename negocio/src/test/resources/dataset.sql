insert into cliente values (1,"pepe@gmail.com","pepe","321",1,"ruta");
insert into cliente values (2,"luis@gmail.com","luis","654",0,"ruta");
insert into cliente values (3,"maria@gmail.com","maria","392",1,"ruta");
insert into cliente values (4,"juan@gmail.com","juan","019",0,"ruta");
insert into cliente values (5,"pablo@gmail.com","pablo","786",1,"ruta");

insert into cliente_telefonos values (1,"821721");
insert into cliente_telefonos values (1,"921418");
insert into cliente_telefonos values (2,"656321");
insert into cliente_telefonos values (3,"863421");

insert into ciudad values (1,"Armenia");
insert into ciudad values (2,"Pereira");
insert into ciudad values (3,"Manizales");
insert into ciudad values (4,"Cali");

insert into administrador values(1,"administrador1@gmail.com","Admin1","admi123");
insert into administrador values(2,"administrador2@gmail.com","Admin2","admi456");
insert into administrador values(3,"administrador3@gmail.com","Admin1","admi789");

insert into administrador_teatro values(1,"admin1@gmail.com","Admin 1","4321");
insert into administrador_teatro values(2,"admin2@gmail.com","Admin 2","9102");
insert into administrador_teatro values(3,"admin3@gmail.com","Admin 3","7612");

insert into confiteria values(1,"UrlFoto","Perro Caliente",3.500);
insert into confiteria values(2,"UrlFoto","Hamburguesa",4.500);
insert into confiteria values(3,"UrlFoto","Palomitas",2.500);
insert into confiteria values(4,"UrlFoto","Gaseosa",2.200);
insert into confiteria values(5,"UrlFoto","Chocolatina",900);

insert into cupon values(1,"Criterio 1", "Descripcion 1", "10%", 30-09-2022);
insert into cupon values(2,"Criterio 2", "Descripcion 2", "25%", 05-10-2022);
insert into cupon values(3,"Criterio 3", "Descripcion 3", "30%", 15-10-2022);
insert into cupon values(4,"Criterio 4", "Descripcion 4", "15%", 22-10-2022);
insert into cupon values(5,"Criterio 5", "Descripcion 5", "20%", 30-10-2022);

insert into horario values(1,"Lunes","10-10-2022", "10-11-2022","9:30 Am");
insert into horario values(2,"Martes","11-11-2022", "11-12-2022","12:00 Pm");
insert into horario values(3,"Miercoles","15-11-2022", "15-12-2022", "2:00 Pm");
insert into horario values(4,"Juvees","20-11-2022", "20-12-2022","4:00 Pm");
insert into horario values(5,"Viernes","30-11-2022", "30-12-2022","5:30 Pm");
insert into horario values(6,"Sabado","25-11-2022", "25-12-2022","8:00 Pm");
insert into horario values(7,"Domingo","2-12-2022", "2-2-2023","11:00 Am");

insert into pelicula values(1,1,0,"Imagen 1","Rapido y Furioso","Reparto 1", "Sinopsis 1","trailer 1");
insert into pelicula values(2,0,5,"Imagen 2","Deatpool","Reparto 2", "Sinopsis 2","trailer 2");
insert into pelicula values(3,1,4,"Imagen 3","Anabella","Reparto 3", "Sinopsis 3","trailer 3");
insert into pelicula values(4,1,3,"Imagen 4","Hulk","Reparto 4", "Sinopsis 4","trailer 4");
insert into pelicula values(5,0,6,"Imagen 5","Thor","Reparto 5", "Sinopsis 5","trailer 5");
insert into pelicula values(6,1,2,"Imagen 6","Alerta Roja","Reparto 6", "Sinopsis 6","trailer 6");

insert into teatro values(1,"carrera 33 # 2 - 3","324232",1,1);
insert into teatro values(2,"unicentro local 3","8236121",1,1);
insert into teatro values(3,"parque Arboleda","14232",2,2);
insert into teatro values(4,"calle 2 # 4 - 2","124132",3,3);

insert into sala values(1,"Sala 1",1);
insert into sala values(2,"Sala 2",2);
insert into sala values(3,"Sala 3",3);
insert into sala values(4,"Sala 4",4);
insert into sala values(5,"Sala 5",1);
insert into sala values(6,"Sala 6",2);

insert into distribucion_sillas values (1,"Columna 1","Esquema 1","Fila 1",34,1);
insert into distribucion_sillas values (2,"Columna 2","Esquema 2","Fila 2",20,2);
insert into distribucion_sillas values (3,"Columna 3","Esquema 3","Fila 3",50,3);
insert into distribucion_sillas values (4,"Columna 4","Esquema 4","Fila 4",24,4);
insert into distribucion_sillas values (5,"Columna 5","Esquema 5","Fila 5",38,5);
insert into distribucion_sillas values (6,"Columna 6","Esquema 6","Fila 6",40,6);
insert into distribucion_sillas values (7,"Columna 7","Esquema 7","Fila 7",60,1);

insert into funcion values(1,5.700,2,1,1);
insert into funcion values(2,6.500,6,5,6);
insert into funcion values(3,8.000,4,4,5);
insert into funcion values(4,10.000,5,2,3);
insert into funcion values(5,12.500,7,6,4;

insert into compra values(1,10-10-2022,0,20.000,1,2,5);
insert into compra values(2,11-10-2022,1,50.000,2,1,1);
insert into compra values(3,12-10-2022,2,45.000,3,4,2);
insert into compra values(4,13-10-2022,3,15.000,5,3,3);
insert into compra values(5,14-10-2022,2,10.500,4,5,4);

insert into cupon_cliente values(1,1,1,1,4);
insert into cupon_cliente values(2,1,2,2,5);
insert into cupon_cliente values(3,1,4,3,3);
insert into cupon_cliente values(4,0,5,4,2);
insert into cupon_cliente values(5,0,3,5,1);

insert into entrada values(1,"Columna 1","Fila 1",20.000,1);
insert into entrada values(2,"Columna 2","Fila 2",10.500,5);
insert into entrada values(3,"Columna 3","Fila 3",15.000,4);
insert into entrada values(4,"Columna 4","Fila 4",45.000,3);
insert into entrada values(5,"Columna 5","Fila 5",50.000,2);

insert into compra_confiteria values(1,20.000,3,5,5);
insert into compra_confiteria values(2,15.000,2,3,4);
insert into compra_confiteria values(3,10.000,2,3,2);
insert into compra_confiteria values(4,18.000,3,1,1);
insert into compra_confiteria values(5,22.000,4,2,3);

