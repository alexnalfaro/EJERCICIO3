CREATE DATABASE JDBC2;

USE JDBC2;


CREATE TABLE fotos (
	id INT,
    titulo VARCHAR (50),
    fecha DATE,
    archivo VARCHAR(50),
    visitas INT,
    idfotografo INT,
    PRIMARY  KEY (id));
    
CREATE TABLE fotografos (
	idfotografo INT,
    nombre VARCHAR (15),
    premiado BOOLEAN,
    PRIMARY KEY(idfotografo));
    
ALTER TABLE fotos ADD FOREIGN KEY (idfotografo) REFERENCES fotografos (idfotografo);


INSERT INTO fotografos VALUES ("1","Alex","0");
INSERT INTO fotografos VALUES ("2","Goizeder","1");

INSERT INTO fotos VALUES ("1","Ferrari","2000-03-03","ferrari.jpg",20,1);
INSERT INTO fotos VALUES ("2","Nordes","2022-06-08","nordes.jpg",50,1);
INSERT INTO fotos VALUES ("3","Stop","2022-03-29","Stop.jpg",20,2);
INSERT INTO fotos VALUES ("4","Red Bull","2022-03-03","redbull.jpg",20,2);