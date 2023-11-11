DROP TABLE IF EXISTS trabajador;

CREATE TABLE trabajador (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(115),
    apellido VARCHAR(125),
    trabajo ENUM('Secretario', 'Electricista', 'Profesor', 'Abogado','DJ'),
    salario DOUBLE
);

INSERT INTO trabajador (nombre, apellido,  trabajo, salario) VALUES ('Robert', 'Lopez',  'Secretario', 1580.25);
INSERT INTO trabajador (nombre, apellido,  trabajo, salario) VALUES ('Victor', 'Machuca',  'Electricista', 2200.45);
INSERT INTO trabajador (nombre, apellido,  trabajo, salario) VALUES ('Laura', 'Fornos',  'Profesor', 2580.32);
INSERT INTO trabajador (nombre, apellido,  trabajo, salario) VALUES ('Sandra', 'Bonilla',  'Abogado', 3500.10);
INSERT INTO trabajador (nombre, apellido,  trabajo, salario) VALUES ('Jose', 'Mosquero',  'DJ', 10000.50);