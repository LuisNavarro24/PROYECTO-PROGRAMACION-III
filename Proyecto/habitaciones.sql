-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-06-2021 a las 04:41:30
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `habitaciones`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consumo`
--

CREATE TABLE `consumo` (
  `idconsumo` int(11) NOT NULL,
  `idreserva` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` decimal(7,2) NOT NULL,
  `precio_venta` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `cuenta` varchar(10) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cuenta`, `password`) VALUES
('angela', '77fe37c61821ffd406e38a0947f9ec07'),
('johana15', 'e16866458c9403fe9fb3df93bd4b3a41'),
('kpdelgado', 'efae9ef4464ecd2777ad5aa4cf606d8a'),
('luisnava', '8b9127934238e9a03691225c734a0a71');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idhabitacion` int(11) NOT NULL,
  `numero` varchar(4) NOT NULL,
  `piso` varchar(2) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `caracteristicas` varchar(512) DEFAULT NULL,
  `precio_diario` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `tipo_habitacion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idhabitacion`, `numero`, `piso`, `descripcion`, `caracteristicas`, `precio_diario`, `estado`, `tipo_habitacion`) VALUES
(1, '1', '1', 'pruebas', 'pruebas', '500.00', 'Disponible', 'individual'),
(2, '2', '2', 'fesf', 'sdfsdf', '12.00', 'Disponible', 'matimonial'),
(3, '2', '2', 'x', 'y', '500.00', 'Disponible', 'familiar'),
(4, '3', '1', 'xdvd', 'xcvbxc', '300.00', 'Disponible', 'individual'),
(5, '4', '1', 'sdfg', 'sdfsdf', '699.00', 'Disponible', 'individual'),
(6, '7', '2', 'Samuel ', 'kk', '5.00', 'OCUPADO', 'INDIVIDUAL'),
(7, '12', '2', 'se', 'sd', '111.00', 'OCUPADO', 'FAMILIAR'),
(8, '122', '1', 'sd', 'sdd', '1212.00', 'OCUPADO', 'FAMILIAR'),
(9, '22', '3', 'dsd', 'sd', '12.00', 'DISPONIBLE', 'INDIVIDUAL'),
(10, '53', '2', 'rfrf', 'frfrfrf', '123.00', 'OCUPADO', 'INDIVIDUAL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `nombre` varchar(20) NOT NULL,
  `habitacion` int(3) NOT NULL,
  `ingreso` date NOT NULL,
  `salida` date NOT NULL,
  `pago_tot` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`nombre`, `habitacion`, `ingreso`, `salida`, `pago_tot`) VALUES
('Antonio', 8, '2021-07-12', '2021-07-13', 901),
('Imelda', 3, '2021-07-12', '2021-07-13', 901),
('Juan Jose Delgado', 12, '2021-07-12', '2021-07-13', 1200),
('Samuel', 1, '2021-07-12', '2021-07-14', 1802);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idpersona` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apaterno` varchar(20) NOT NULL,
  `amaterno` varchar(20) NOT NULL,
  `tipo_documento` varchar(15) NOT NULL,
  `num_documento` varchar(8) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(8) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `unidad_medida` varchar(20) NOT NULL,
  `precio_venta` decimal(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba1`
--

CREATE TABLE `prueba1` (
  `idpersona` int(11) NOT NULL,
  `codigo_cliente` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `Num_Habitacion` int(3) NOT NULL,
  `Tipo_Habitacion` varchar(20) NOT NULL,
  `Piso` int(3) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Ciudad` varchar(20) NOT NULL,
  `Num_Huespedes` int(10) NOT NULL,
  `Num_HuespedesExtra` int(3) NOT NULL,
  `Entrada` date NOT NULL,
  `Dias` int(3) NOT NULL,
  `salida` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`Num_Habitacion`, `Tipo_Habitacion`, `Piso`, `Nombre`, `Ciudad`, `Num_Huespedes`, `Num_HuespedesExtra`, `Entrada`, `Dias`, `salida`) VALUES
(2, 'Individual', 1, 'Javier', 'Ags', 1, 1, '2021-07-12', 1, '2021-07-13'),
(3, 'Individual', 1, 'Mariana Lopez', 'Ags', 1, 2, '2021-07-12', 2, '2021-07-14'),
(12, 'Doble', 1, 'Isela Delgado', 'Aguascalientes', 2, 2, '2021-07-12', 2, '2021-07-14');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idreserva` int(11) NOT NULL,
  `idhabitacion` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `idtrabajador` int(11) NOT NULL,
  `tipo_reserva` varchar(20) NOT NULL,
  `fecha_reserva` date NOT NULL,
  `fecha_ingresa` date NOT NULL,
  `fecha_salida` date NOT NULL,
  `costo_alojamiento` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `idpersona` int(11) NOT NULL,
  `sueldo` decimal(7,2) NOT NULL,
  `acceso` varchar(15) NOT NULL,
  `login` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  `estado` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `consumo`
--
ALTER TABLE `consumo`
  ADD PRIMARY KEY (`idconsumo`),
  ADD KEY `fk_consumo_producto_idx` (`idproducto`),
  ADD KEY `fk_consumo_reserva_idx` (`idreserva`);

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD PRIMARY KEY (`cuenta`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idhabitacion`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `telefono_UNIQUE` (`telefono`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`);

--
-- Indices de la tabla `prueba1`
--
ALTER TABLE `prueba1`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `codigo_cliente_UNIQUE` (`codigo_cliente`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`Num_Habitacion`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idreserva`),
  ADD KEY `fk_reserva_habitacion_idx` (`idhabitacion`),
  ADD KEY `fk_reserva_cliente_idx` (`idcliente`),
  ADD KEY `fk_reseva_trabajador_idx` (`idtrabajador`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `login_UNIQUE` (`login`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `consumo`
--
ALTER TABLE `consumo`
  MODIFY `idconsumo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idhabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idproducto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idreserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `consumo`
--
ALTER TABLE `consumo`
  ADD CONSTRAINT `fk_consumo_producto` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_consumo_reserva` FOREIGN KEY (`idreserva`) REFERENCES `reserva` (`idreserva`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `prueba1`
--
ALTER TABLE `prueba1`
  ADD CONSTRAINT `fk_persona_cliente` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `fk_reserva_cliente` FOREIGN KEY (`idcliente`) REFERENCES `prueba1` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_reserva_habitacion` FOREIGN KEY (`idhabitacion`) REFERENCES `habitacion` (`idhabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_reseva_trabajador` FOREIGN KEY (`idtrabajador`) REFERENCES `trabajador` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD CONSTRAINT `fk_persona_trabajador` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
