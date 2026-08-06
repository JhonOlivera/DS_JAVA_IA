CREATE DATABASE tienda;
USE tienda;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(150) NOT NULL UNIQUE,
    activo BOOLEAN DEFAULT TRUE,
    fecha_registro DATE
);

DESCRIBE usuario;

INSERT INTO usuario (nombre, correo, fecha_registro)
VALUES ('Ana Torres', 'ana@correo.com', '2026-07-01');

INSERT INTO usuario (nombre, correo, fecha_registro)
VALUES ('Carlos Ruiz', 'carlos@correo.com', '2026-07-05');

SELECT * FROM usuario;

CREATE TABLE perfil (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL UNIQUE,
    bio VARCHAR(255),
    telefono VARCHAR(20),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

INSERT INTO perfil (usuario_id, bio, telefono)
VALUES (1, 'Desarrolladora backend', '3001234567');

INSERT INTO perfil (usuario_id, bio, telefono)
VALUES (2, 'Disenador UX', '3009876543');

SELECT * FROM perfil;
CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    ciudad VARCHAR(80)
);

CREATE TABLE pedido (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT NOT NULL,
    producto VARCHAR(120) NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    fecha DATE,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

INSERT INTO cliente (nombre, ciudad)
VALUES ('Laura Gomez', 'Bogota');

INSERT INTO cliente (nombre, ciudad)
VALUES ('Pedro Diaz', 'Medellin');

INSERT INTO pedido (cliente_id, producto, monto, fecha)
VALUES (1, 'Teclado mecanico', 180000.00, '2026-07-10');

INSERT INTO pedido (cliente_id, producto, monto, fecha)
VALUES (1, 'Mouse gamer', 95000.00, '2026-07-11');

INSERT INTO pedido (cliente_id, producto, monto, fecha)
VALUES (2, 'Monitor 24', 620000.00, '2026-07-12');

SELECT nombre, ciudad
FROM cliente;

SELECT producto, monto

SELECT producto, monto
FROM pedido
ORDER BY monto DESC;
FROM pedido
WHERE monto > 100000;

SELECT cliente.nombre, pedido.producto, pedido.monto
FROM cliente
JOIN pedido ON cliente.id = pedido.cliente_id
ORDER BY cliente.nombre;

-- practica integradora
-- insertar un cliente de ciudad diferente
INSERT INTO cliente (nombre, ciudad) VALUES ('juan', 'Ibague');

-- registrar dos pedidos para ese cliente usando su identificador
INSERT INTO pedido (cliente_id, producto, monto, fecha)
VALUES (3, 'Laptop Gamer', 7500000.00, '2026-08-11');

INSERT INTO pedido (cliente_id, producto, monto, fecha)
VALUES (3, 'Monitor Curvo', 700.000, '2026-08-15');
-- consulta unicamnete los montos superiores a 150000
SELECT producto, monto 
FROM pedido
WHERE monto > 150000;

-- ordena el resultado desde el monto mas alto
SELECT producto, monto

-- usa join para mostrar el nombre del cliente, producto, monto y fecha
SELECT cliente.nombre, pedido.producto, pedido.monto, pedido.fecha
FROM cliente
JOIN pedido ON cliente.id = pedido.cliente_id
ORDER BY pedido.fecha;
FROM pedido
WHERE monto > 150000
ORDER BY monto DESC;
