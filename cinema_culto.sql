-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-11-2020 a las 04:54:11
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: cinema_culto
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla clientes
--

CREATE TABLE clientes (
  documento_cliente varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  nombre_cliente varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  edad int(11) NOT NULL,
  correo varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla clientes
--

INSERT INTO clientes (documento_cliente, nombre_cliente, edad, correo) VALUES
('1010', 'Juana Lopez', 25, 'juanita@gmail.com'),
('2020', 'Mario Hernandez', 32, 'maroh@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla detalle_venta
--

CREATE TABLE detalle_venta (
  id_detalle_venta int(11) NOT NULL,
  id_venta int(11) NOT NULL,
  id_pelicula varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  cantidad_tickets int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla detalle_venta
--

INSERT INTO detalle_venta (id_detalle_venta, id_venta, id_pelicula, cantidad_tickets) VALUES
(1, 1, 'pf1994', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla pelicula
--

CREATE TABLE pelicula (
  id_pelicula varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  nombre_pelicula varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  genero varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  hora varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  precio int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla pelicula
--

INSERT INTO pelicula (id_pelicula, nombre_pelicula, genero, hora, precio) VALUES
('fg1994', 'Forrest Gump', 'Drama', '5:15', 7000),
('pf1994', 'Pulp Fiction', 'Acción', '6:50', 7000),
('ps1960', 'Psycho', 'Terror', '11:15', 9000),
('tg1972', 'The Godfather', 'Drama', '9:50', 9000),
('tp1996', 'Trainspotting', 'Drama', '8:15', 7000),
('ts1980', 'The Shining', 'Terror', '11:15', 9000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla vendedores
--

CREATE TABLE vendedores (
  documento_vendedor varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  nombre_vendedor varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  correo_vendedor varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla vendedores
--

INSERT INTO vendedores (documento_vendedor, nombre_vendedor, correo_vendedor) VALUES
('0101', 'Patricia García', 'paty@cinemaculto.com'),
('0202', 'Carlos Cifuentes', 'carloscifu@cinemaculto.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla venta
--

CREATE TABLE venta (
  id_venta int(11) NOT NULL,
  documento_cliente varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  documento_vendedor varchar(15) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla venta
--

INSERT INTO venta (id_venta, documento_cliente, documento_vendedor) VALUES
(1, '1010', '0202');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla clientes
--
ALTER TABLE clientes
  ADD PRIMARY KEY (documento_cliente);

--
-- Indices de la tabla detalle_venta
--
ALTER TABLE detalle_venta
  ADD PRIMARY KEY (id_detalle_venta),
  ADD KEY id_venta (id_venta),
  ADD KEY id_pelicula (id_pelicula);

--
-- Indices de la tabla pelicula
--
ALTER TABLE pelicula
  ADD PRIMARY KEY (id_pelicula);

--
-- Indices de la tabla vendedores
--
ALTER TABLE vendedores
  ADD PRIMARY KEY (documento_vendedor);

--
-- Indices de la tabla venta
--
ALTER TABLE venta
  ADD PRIMARY KEY (id_venta),
  ADD KEY documento_cliente (documento_cliente),
  ADD KEY documento_vendedor (documento_vendedor);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla detalle_venta
--
ALTER TABLE detalle_venta
  MODIFY id_detalle_venta int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla venta
--
ALTER TABLE venta
  MODIFY id_venta int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla detalle_venta
--
ALTER TABLE detalle_venta
  ADD CONSTRAINT detalle_venta_ibfk_1 FOREIGN KEY (id_venta) REFERENCES venta (id_venta) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT detalle_venta_ibfk_2 FOREIGN KEY (id_pelicula) REFERENCES pelicula (id_pelicula) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla venta
--
ALTER TABLE venta
  ADD CONSTRAINT venta_ibfk_1 FOREIGN KEY (documento_cliente) REFERENCES clientes (documento_cliente) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT venta_ibfk_2 FOREIGN KEY (documento_vendedor) REFERENCES vendedores (documento_vendedor) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
