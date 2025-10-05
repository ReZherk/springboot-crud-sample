CREATE DATABASE db_empleados;

USE db_empleados;

CREATE TABLE empleado (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    puesto VARCHAR(100),
    salario DECIMAL(10, 2)
);

-- Insertar algunos registros iniciales
INSERT INTO
    empleado (
        nombre,
        correo,
        puesto,
        salario
    )
VALUES (
        'Juan Pérez',
        'juan@empresa.com',
        'Analista',
        2500.00
    ),
    (
        'María López',
        'maria@empresa.com',
        'Desarrolladora',
        3200.00
    ),
    (
        'Carlos Ramos',
        'carlos@empresa.com',
        'Diseñador',
        2800.00
    );