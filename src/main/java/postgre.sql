CREATE TABLE centroProduccion (
idCentro int PRIMARY KEY NOT NULL,
nombre varchar(30) NOT NULL,
ubicacion varchar(30) NOT NULL
)

CREATE TABLE fabrica (
idFabrica int PRIMARY KEY NOT NULL,
nombre varchar(30) NOT NULL
)

CREATE TABLE recolector (
idRecolector int PRIMARY KEY NOT NULL,
nombre varchar(30) NOT NULL
)

CREATE TABLE apiario (
idApiario int PRIMARY KEY NOT NULL,
idCentro int NOT NULL,
FOREIGN KEY (idCentro) REFERENCES CentroProduccion(idCentro)
)

CREATE TABLE cajon (
idCajon int PRIMARY KEY NOT NULL,
idFabrica int NOT NULL,
ubicacion varchar(30) NOT NULL,
material varchar(30) NOT NULL,
FOREIGN KEY (idFabrica) REFERENCES fabrica(idFabrica)
)

CREATE TABLE visitaTecnica (
idVisita int PRIMARY KEY NOT NULL,
fecha date NOT NULL,
aprobado varchar NOT NULL
)

CREATE TABLE colmena (
idColmena int PRIMARY KEY NOT NULL,
poblacion varchar(10) NOT NULL,
reina varchar(10) NOT NULL,
miel varchar(10) NOT NULL,
cera varchar(10) NOT NULL,
alimento varchar(10) NOT NULL,
cria varchar(10) NOT NULL,
vacio varchar(10) NOT NULL,
fechaInstalacion date NOT NULL,
idVisita int NOT NULL,
idApiario int NOT NULL,
idCajon int NOT NULL,
idRecoleccion int NOT NULL,
idMadre int NOT NULL,
FOREIGN KEY (idVisita) REFERENCES visitaTecnica(idVisita),
FOREIGN KEY (idApiario) REFERENCES apiario(idApiario),
FOREIGN KEY (idCajon) REFERENCES cajon(idCajon),
FOREIGN KEY (idRecoleccion) REFERENCES recoleccion(idRecoleccion),
FOREIGN KEY (idMadre) REFERENCES colmena(idColmena)
)

CREATE TABLE recoleccion (
idRecoleccion int PRIMARY KEY NOT NULL,
idRecolector int NOT NULL,
idColmena int NOT NULL,
fecha date NOT NULL,
kg double NOT NULL,
FOREIGN KEY (idRecolector) REFERENCES recolector(idRecolector),
FOREIGN KEY (idColmena) REFERENCES colmena(idColmena)
)