CREATE DATABASE zoo;
USE zoo;

CREATE TABLE zona(
	idZona INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	nombreZona VARCHAR NOT NULL,
	extension DOUBLE PRECISION(4) NOT NULL
);

CREATE TABLE habitat(
	idHabitat INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	nombreHabitat VARCHAR NOT NULL,
	clima VARCHAR NOT NULL,
	vegetacion VARCHAR NOT NULL,
	continente VARCHAR NOT NULL
);

CREATE TABLE especie(
	idEspecie INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	nombreEspanol VARCHAR NOT NULL,
	nombreCientifico VARCHAR NOT NULL,
	descripcion VARCHAR NOT NULL
);
/*ALTER TABLE especie ADD CONSTRAINT fkEspecieHabitat FOREIGN KEY (idHabitat) 
REFERENCES habitat (idHabitat);
ALTER TABLE especie ADD CONSTRAINT fkEspecieZona FOREIGN KEY (idZona)
REFERENCES zona (idZona);*/

CREATE TABLE ubicacion(
	idubicacion INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	idZona INT FOREIGN KEY REFERENCES zona(idZona) NOT NULL,
	idHabitat INT FOREIGN KEY REFERENCES habitat(idHabitat) NOT NULL,
	idEspecie INT FOREIGN KEY REFERENCES especie(idEspecie) NOT NULL
);

CREATE TABLE itinerario(
	idItinerario INT IDENTITY (1,1) PRIMARY KEY NOT NULL,
	codigo INT NOT NULL,
	duracion TIME NOT NULL,
	longitud DOUBLE PRECISION(4) NOT NULL,
	maxVisitante SMALLINT NOT NULL,
	especiesVisita SMALLINT NOT NULL
);
/*ALTER TABLE itinerario ADD CONSTRAINT fkItinerarioZona FOREIGN KEY (idZona)
REFERENCES zona (idZona);*/

CREATE TABLE recorrido(
	idRecorrido INT IDENTITY(1,1) NOT NULL,
	idZona INT NOT NULL FOREIGN KEY REFERENCES zona(idZona),
	idItinerario INT NOT NULL FOREIGN KEY REFERENCES itinerario(idItinerario)
);

CREATE TABLE guia(
	idGuia INT IDENTITY (1,1) PRIMARY KEY NOT NULL,
	nombreGuia VARCHAR NOT NULL,
	direccionGuia VARCHAR NOT NULL,
	telGuia INT NOT NULL,
	inicioGuia DATETIME NOT NULL, /*hasta 8 bytes*/
	horaGuia TIME NOT NULL, /*hora asignacion guia*/
);
/*ALTER TABLE guia ADD CONSTRAINT fkGuiaItinerario FOREIGN KEY (idItinerario)
REFERENCES itinerario (idItinerario);*/

CREATE TABLE recorrido_guiado(
	idRecorrido_guiado INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	idItinerario INT NOT NULL FOREIGN KEY REFERENCES itinerario(idItinerario),
	idGuia INT NOT NULL FOREIGN KEY REFERENCES guia(idGuia)	
);

CREATE TABLE cuidador(
	idCuidador INT IDENTITY (1,1) PRIMARY KEY NOT NULL,
	nombre VARCHAR NOT NULL,
	direccionCuidador VARCHAR NOT NULL,
	inicioCuidador DATETIME NOT NULL, /*hasta 8 bytes*/
	horaCuidador TIME NOT NULL, /*hora asignacion cuidador*/
);
/*ALTER TABLE cuidador ADD CONSTRAINT fkCuidadorEspecie FOREIGN KEY (idEspecie)
REFERENCES especie (idEspecie);*/

CREATE TABLE cuidado_especie(
	idCuidado_especie INT IDENTITY (1,1) PRIMARY KEY NOT NULL,
	idCuidador INT FOREIGN KEY REFERENCES cuidador(idCuidador) NOT NULL,
	idEspecie INT FOREIGN KEY REFERENCES especie(idEspecie) NOT NULL
);