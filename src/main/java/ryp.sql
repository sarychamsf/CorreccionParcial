CREATE TABLE empresacliente (
  NIT int PRIMARY KEY NOT NULL,
  nombreEmpresa varchar(30) NOT NULL,
  usuarioE varchar(30) NOT NULL,
  passwordE varchar(30) NOT NULL,
  direccion varchar(30) NOT NULL,
  estado int NOT NULL
) 

CREATE TABLE funciones (
  idUsuario int NOT NULL,
  idServicio int NOT NULL,
  valoracion int NOT NULL,
  PRIMARY KEY (idUsuario, idServicio)
)

CREATE TABLE mensaje (
  idU1 int NOT NULL,
  idU2 int NOT NULL,
  Asunto varchar(30) NOT NULL,
  Texto varchar(100) NOT NULL,
  PRIMARY KEY (idU1, idU2)
)

CREATE TABLE servicio (
  idServicio SERIAL PRIMARY KEY,
  nombreS varchar(30) NOT NULL,
  estado int NOT NULL
)

CREATE TABLE trabajador (
  idUsuario SERIAL PRIMARY KEY,
  usuarioT varchar(30) NOT NULL,
  passwordT varchar(30) NOT NULL,
  nombre varchar(30) NOT NULL,
  cargo varchar(30) NOT NULL,
  supervisor int DEFAULT NULL,
  estado int NOT NULL
)

CREATE TABLE terminado (
  idHorario int NOT NULL PRIMARY KEY,
  fechaTerminado varchar(12) NOT NULL,
  fechaRevisado varchar(12) NOT NULL,
  supervisor int NOT NULL,
  estado int NOT NULL,
  FOREIGN KEY (supervisor) REFERENCES trabajador(idUsuario)
)

CREATE TABLE trabajoarealizar (
  idTrabajo SERIAL PRIMARY KEY,
  idEmpresa int NOT NULL,
  idServicio int NOT NULL,
  Urgencia int NOT NULL,
  Detalles varchar(50) NOT NULL,
  estado int NOT NULL,
  FOREIGN KEY (idEmpresa) REFERENCES empresaCliente(NIT),
  FOREIGN KEY (idServicio) REFERENCES servicio(idServicio)
)

CREATE TABLE horario (
  idHorario SERIAL PRIMARY KEY,
  idTaR int NOT NULL,
  idTrabajador int NOT NULL,
  horaInicio int NOT NULL,
  horaFinal int NOT NULL,
  Fecha varchar(12) NOT NULL,
  estado int NOT NULL,
  FOREIGN KEY (idTaR) REFERENCES trabajoarealizar(idTrabajo),
  FOREIGN KEY (idTrabajador) REFERENCES trabajador(idUsuario)
)