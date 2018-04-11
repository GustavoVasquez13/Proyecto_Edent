-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 10-04-2018 a las 21:04:38
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `edent`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abonocompra`
--

CREATE TABLE IF NOT EXISTS `abonocompra` (
  `id_abonoCompra` int(11) NOT NULL AUTO_INCREMENT,
  `abono_prodto` double(9,2) DEFAULT NULL,
  `saldo_prodto` double(9,2) DEFAULT NULL,
  `detalleCompra_id_detalleCom` int(11) NOT NULL,
  `fecha_abono` date DEFAULT NULL,
  PRIMARY KEY (`id_abonoCompra`),
  KEY `AbonoCompra_detalleCompra` (`detalleCompra_id_detalleCom`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='en esta tabla se registran los diferentes abonos que la clínica realiza por los productos comprados.' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta`
--

CREATE TABLE IF NOT EXISTS `consulta` (
  `id_consulta` int(11) NOT NULL AUTO_INCREMENT,
  `motivo_consulta` varchar(100) DEFAULT NULL,
  `fecha_consulta` date DEFAULT NULL,
  `PacienteN_id_pacienteN` int(11) NOT NULL,
  `Total_pagar` double(9,2) DEFAULT NULL,
  `HistoriaM` varchar(100) NOT NULL,
  `HistoriaO` varchar(100) NOT NULL,
  `ExamenC` varchar(100) NOT NULL,
  `DXodon` varchar(100) NOT NULL,
  PRIMARY KEY (`id_consulta`),
  KEY `Consulta_PacienteN` (`PacienteN_id_pacienteN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='registra las consulta registradas para establecer su historial' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contable`
--

CREATE TABLE IF NOT EXISTS `contable` (
  `id_contable` int(11) NOT NULL AUTO_INCREMENT,
  `DetalleGastos_id_gastos` int(11) NOT NULL,
  `DetalleIngresos_id_ingresos` int(11) NOT NULL,
  PRIMARY KEY (`id_contable`),
  KEY `Contable_DetalleGastos` (`DetalleGastos_id_gastos`),
  KEY `Contable_DetalleIngresos` (`DetalleIngresos_id_ingresos`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='controla los ingresos y egresos de la clinica en forma general' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE IF NOT EXISTS `detallecompra` (
  `id_detalleCom` int(11) NOT NULL AUTO_INCREMENT,
  `productos_id_prodto` int(11) NOT NULL,
  `costo_prodto` double(9,2) DEFAULT NULL,
  `cantidad_prodto` int(11) DEFAULT NULL,
  `marca_producto` varchar(25) DEFAULT NULL,
  `fecha_compra` date DEFAULT NULL,
  `Proveedores_id_proveedor` int(11) NOT NULL,
  PRIMARY KEY (`id_detalleCom`),
  KEY `detalleCompra_Proveedores` (`Proveedores_id_proveedor`),
  KEY `detalleCompra_productos` (`productos_id_prodto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='esta tabla regista la compra de productos a los proveedores' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallegastos`
--

CREATE TABLE IF NOT EXISTS `detallegastos` (
  `id_gastos` int(11) NOT NULL AUTO_INCREMENT,
  `AbonoCompra_id_abonoCompra` int(11) NOT NULL,
  `Empleado_id_empleado` int(11) NOT NULL,
  `Equipo_id_equipo` int(11) NOT NULL,
  `MantoEquipo_id_manto` int(11) NOT NULL,
  `Materiales_id_material` int(11) NOT NULL,
  `ReparacionClinica_id_raparaClinica` int(11) NOT NULL,
  `ServicioBasico_id_serviBasico` int(11) NOT NULL,
  PRIMARY KEY (`id_gastos`),
  KEY `DetalleGastos_AbonoCompra` (`AbonoCompra_id_abonoCompra`),
  KEY `DetalleGastos_Empleado` (`Empleado_id_empleado`),
  KEY `DetalleGastos_Equipo` (`Equipo_id_equipo`),
  KEY `DetalleGastos_MantoEquipo` (`MantoEquipo_id_manto`),
  KEY `DetalleGastos_Materiales` (`Materiales_id_material`),
  KEY `DetalleGastos_ReparacionClinica` (`ReparacionClinica_id_raparaClinica`),
  KEY `DetalleGastos_ServicioBasico` (`ServicioBasico_id_serviBasico`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='en esta tabla se registran los gastos que la clinica tiene en sus diversos tipos' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleingresos`
--

CREATE TABLE IF NOT EXISTS `detalleingresos` (
  `id_ingresos` int(11) NOT NULL AUTO_INCREMENT,
  `ingresos_productos_id_ingresoP` int(11) NOT NULL,
  `Tratamiento_paciente_id_tratamiento` int(11) NOT NULL,
  PRIMARY KEY (`id_ingresos`),
  KEY `DetalleIngresos_Tratamiento_paciente` (`Tratamiento_paciente_id_tratamiento`),
  KEY `DetalleIngresos_ingresos_productos` (`ingresos_productos_id_ingresoP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='aqui se registran los ingresos que tiene la clinica en consultas y venta de productos' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dientespacte`
--

CREATE TABLE IF NOT EXISTS `dientespacte` (
  `id_diente` int(11) NOT NULL AUTO_INCREMENT,
  `num_diente` char(5) DEFAULT NULL,
  `estado_diente` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id_diente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='informacion sobre la dentadura del paciente' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `id_empleado` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_empl` varchar(25) NOT NULL,
  `apellido_empl` varchar(25) NOT NULL,
  `direccion_empl` varchar(100) DEFAULT NULL,
  `correo_empl` varchar(75) DEFAULT NULL,
  `tel_empl` varchar(15) DEFAULT NULL,
  `cargo_empl` varchar(50) NOT NULL,
  `sueldo_empl` double(9,2) DEFAULT NULL,
  `dui_empl` char(10) DEFAULT NULL,
  PRIMARY KEY (`id_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='esta tabla regista el personal empleado por la clinica' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE IF NOT EXISTS `equipo` (
  `id_equipo` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_equipo` varchar(50) DEFAULT NULL,
  `estado_equipo` varchar(50) DEFAULT NULL,
  `descripcion_equipo` varchar(150) DEFAULT NULL,
  `costo_equipo` double(9,2) DEFAULT NULL,
  PRIMARY KEY (`id_equipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Equipo comprado para usos de la clinica' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen`
--

CREATE TABLE IF NOT EXISTS `examen` (
  `id_examen` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_examen` varchar(100) DEFAULT NULL,
  `fecha_examen` date DEFAULT NULL,
  `observaciones_examen` varchar(200) DEFAULT NULL,
  `descrip_examen` varchar(150) DEFAULT NULL,
  `Consulta_id_consulta` int(11) NOT NULL,
  PRIMARY KEY (`id_examen`),
  KEY `Examen_Consulta` (`Consulta_id_consulta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='caracteristicas que contiene un examen realizado al paciente' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialpaciente`
--

CREATE TABLE IF NOT EXISTS `historialpaciente` (
  `id_historialP` int(11) NOT NULL AUTO_INCREMENT,
  `Consulta_id_consulta` int(11) NOT NULL,
  PRIMARY KEY (`id_historialP`),
  KEY `HistorialPaciente_Consulta` (`Consulta_id_consulta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='se alamcena el historial de los pacientes' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresos_productos`
--

CREATE TABLE IF NOT EXISTS `ingresos_productos` (
  `id_ingresoP` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_producto` varchar(100) DEFAULT NULL,
  `fecha_venta` date DEFAULT NULL,
  `costo_producto` double(9,2) DEFAULT NULL,
  PRIMARY KEY (`id_ingresoP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='ingresos por venta de algunos productos clinicos ' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantoequipo`
--

CREATE TABLE IF NOT EXISTS `mantoequipo` (
  `id_manto` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_manto` varchar(50) DEFAULT NULL,
  `descripcion_manto` varchar(150) DEFAULT NULL,
  `costo_manto` double(9,2) DEFAULT NULL,
  `Equipo_id_equipo` int(11) NOT NULL,
  PRIMARY KEY (`id_manto`),
  KEY `MantoEquipo_Equipo` (`Equipo_id_equipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='esta tabla es para los gastos en mantenimiento de equipo' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales`
--

CREATE TABLE IF NOT EXISTS `materiales` (
  `id_material` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_material` varchar(50) DEFAULT NULL,
  `nombre_material` varchar(150) DEFAULT NULL,
  `descripcion_material` varchar(150) DEFAULT NULL,
  `costo_material` double(9,2) DEFAULT NULL,
  PRIMARY KEY (`id_material`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='en esta tabla se muestran los diferentes materiales que usa la clinica para saber cuanto gasta y cuales materiales tiene' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacienten`
--

CREATE TABLE IF NOT EXISTS `pacienten` (
  `id_pacienteN` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_pacte` varchar(25) NOT NULL,
  `apellido_pacte` varchar(25) NOT NULL,
  `direccion_pacte` varchar(100) DEFAULT NULL,
  `tel_pacte` varchar(15) DEFAULT NULL,
  `clasificacion_maxilares` varchar(100) DEFAULT NULL,
  `entorno_dental` varchar(100) DEFAULT NULL,
  `estado_paciente` tinyint(1) DEFAULT NULL,
  `DientesPacte_id_diente` int(11) NOT NULL,
  `TipoPaciente_id_tipoPaciente` int(11) NOT NULL,
  `edad` int(11) NOT NULL,
  PRIMARY KEY (`id_pacienteN`),
  KEY `PacienteN_DientesPacte` (`DientesPacte_id_diente`),
  KEY `PacienteN_TipoPaciente` (`TipoPaciente_id_tipoPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='guarda los datos generales de un paciente de categoria normal' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `id_prodto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_prodto` varchar(25) NOT NULL,
  `descripcion_prodto` varchar(100) NOT NULL,
  PRIMARY KEY (`id_prodto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='en esta tabla se registran los diferentes productos que proporcionan los proveedores' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE IF NOT EXISTS `proveedores` (
  `id_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_prov` varchar(25) NOT NULL,
  `direccion_prov` varchar(100) DEFAULT NULL,
  `correo_prov` varchar(75) DEFAULT NULL,
  `tel_prov` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='esta tabla regista el personal empleado por la clinica' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparacionclinica`
--

CREATE TABLE IF NOT EXISTS `reparacionclinica` (
  `id_raparaClinica` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_reparacion` varchar(50) DEFAULT NULL,
  `descrip_reparacion` varchar(150) DEFAULT NULL,
  `costo_reparacion` double(9,2) DEFAULT NULL,
  PRIMARY KEY (`id_raparaClinica`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='enesta tabla se establecen las reparaciones y mantenimiento realizado a la clinica' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `serviciobasico`
--

CREATE TABLE IF NOT EXISTS `serviciobasico` (
  `id_serviBasico` int(11) NOT NULL AUTO_INCREMENT,
  `costo_servicio` double(9,2) DEFAULT NULL,
  `fechaPago_servicio` date DEFAULT NULL,
  `TipoServicio_id_tipoServicio` int(11) NOT NULL,
  PRIMARY KEY (`id_serviBasico`),
  KEY `ServicioBasico_TipoServicio` (`TipoServicio_id_tipoServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='en esta tabla se muestran los diferentes servicios basicos que la clinica paga' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipopaciente`
--

CREATE TABLE IF NOT EXISTS `tipopaciente` (
  `id_tipoPaciente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_tipo` varchar(100) NOT NULL,
  PRIMARY KEY (`id_tipoPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='se ingresan los tipos de pacientes con los que trabaja la clinica' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiposervicio`
--

CREATE TABLE IF NOT EXISTS `tiposervicio` (
  `id_tipoServicio` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_servicio` varchar(150) NOT NULL,
  `proveedor_servicio` varchar(50) DEFAULT NULL,
  `correo_provS` varchar(100) DEFAULT NULL,
  `tel_provS` char(15) DEFAULT NULL,
  PRIMARY KEY (`id_tipoServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='aqui se almacenan los diferentes tipos de servicios de los que hace uso la clinica' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipousuario`
--

CREATE TABLE IF NOT EXISTS `tipousuario` (
  `id_tipoUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_usuario` varchar(50) NOT NULL,
  PRIMARY KEY (`id_tipoUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='aqui se muestran los tipos de usuarios que podran acceder al sistema' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento_paciente`
--

CREATE TABLE IF NOT EXISTS `tratamiento_paciente` (
  `id_tratamiento` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `Examen_id_examen` int(11) DEFAULT NULL,
  `Tratamiento_reallizado` varchar(200) DEFAULT NULL,
  `Abono` double(9,2) DEFAULT NULL,
  `Consulta_id_consulta` int(11) NOT NULL,
  PRIMARY KEY (`id_tratamiento`),
  KEY `Tratamiento_paciente_Consulta` (`Consulta_id_consulta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='aqui se lleva el registro del tratamiento que todo paciente debe llevar' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `TipoUsuario_id_tipoUsuario` int(11) NOT NULL,
  `nombre_usuario` varchar(50) NOT NULL,
  `apellido_usuario` varchar(50) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `clave` varchar(150) NOT NULL,
  `correo_usuario` varchar(100) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `Usuario_TipoUsuario` (`TipoUsuario_id_tipoUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='en esta tabla se registra los datos de los usuarios que manejaran el sistema' AUTO_INCREMENT=1 ;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `abonocompra`
--
ALTER TABLE `abonocompra`
  ADD CONSTRAINT `AbonoCompra_detalleCompra` FOREIGN KEY (`detalleCompra_id_detalleCom`) REFERENCES `detallecompra` (`id_detalleCom`);

--
-- Filtros para la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `Consulta_PacienteN` FOREIGN KEY (`PacienteN_id_pacienteN`) REFERENCES `pacienten` (`id_pacienteN`);

--
-- Filtros para la tabla `contable`
--
ALTER TABLE `contable`
  ADD CONSTRAINT `Contable_DetalleIngresos` FOREIGN KEY (`DetalleIngresos_id_ingresos`) REFERENCES `detalleingresos` (`id_ingresos`),
  ADD CONSTRAINT `Contable_DetalleGastos` FOREIGN KEY (`DetalleGastos_id_gastos`) REFERENCES `detallegastos` (`id_gastos`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detalleCompra_productos` FOREIGN KEY (`productos_id_prodto`) REFERENCES `productos` (`id_prodto`),
  ADD CONSTRAINT `detalleCompra_Proveedores` FOREIGN KEY (`Proveedores_id_proveedor`) REFERENCES `proveedores` (`id_proveedor`);

--
-- Filtros para la tabla `detallegastos`
--
ALTER TABLE `detallegastos`
  ADD CONSTRAINT `DetalleGastos_ServicioBasico` FOREIGN KEY (`ServicioBasico_id_serviBasico`) REFERENCES `serviciobasico` (`id_serviBasico`),
  ADD CONSTRAINT `DetalleGastos_AbonoCompra` FOREIGN KEY (`AbonoCompra_id_abonoCompra`) REFERENCES `abonocompra` (`id_abonoCompra`),
  ADD CONSTRAINT `DetalleGastos_Empleado` FOREIGN KEY (`Empleado_id_empleado`) REFERENCES `empleado` (`id_empleado`),
  ADD CONSTRAINT `DetalleGastos_Equipo` FOREIGN KEY (`Equipo_id_equipo`) REFERENCES `equipo` (`id_equipo`),
  ADD CONSTRAINT `DetalleGastos_MantoEquipo` FOREIGN KEY (`MantoEquipo_id_manto`) REFERENCES `mantoequipo` (`id_manto`),
  ADD CONSTRAINT `DetalleGastos_Materiales` FOREIGN KEY (`Materiales_id_material`) REFERENCES `materiales` (`id_material`),
  ADD CONSTRAINT `DetalleGastos_ReparacionClinica` FOREIGN KEY (`ReparacionClinica_id_raparaClinica`) REFERENCES `reparacionclinica` (`id_raparaClinica`);

--
-- Filtros para la tabla `detalleingresos`
--
ALTER TABLE `detalleingresos`
  ADD CONSTRAINT `DetalleIngresos_ingresos_productos` FOREIGN KEY (`ingresos_productos_id_ingresoP`) REFERENCES `ingresos_productos` (`id_ingresoP`),
  ADD CONSTRAINT `DetalleIngresos_Tratamiento_paciente` FOREIGN KEY (`Tratamiento_paciente_id_tratamiento`) REFERENCES `tratamiento_paciente` (`id_tratamiento`);

--
-- Filtros para la tabla `examen`
--
ALTER TABLE `examen`
  ADD CONSTRAINT `Examen_Consulta` FOREIGN KEY (`Consulta_id_consulta`) REFERENCES `consulta` (`id_consulta`);

--
-- Filtros para la tabla `historialpaciente`
--
ALTER TABLE `historialpaciente`
  ADD CONSTRAINT `HistorialPaciente_Consulta` FOREIGN KEY (`Consulta_id_consulta`) REFERENCES `consulta` (`id_consulta`);

--
-- Filtros para la tabla `mantoequipo`
--
ALTER TABLE `mantoequipo`
  ADD CONSTRAINT `MantoEquipo_Equipo` FOREIGN KEY (`Equipo_id_equipo`) REFERENCES `equipo` (`id_equipo`);

--
-- Filtros para la tabla `pacienten`
--
ALTER TABLE `pacienten`
  ADD CONSTRAINT `PacienteN_TipoPaciente` FOREIGN KEY (`TipoPaciente_id_tipoPaciente`) REFERENCES `tipopaciente` (`id_tipoPaciente`),
  ADD CONSTRAINT `PacienteN_DientesPacte` FOREIGN KEY (`DientesPacte_id_diente`) REFERENCES `dientespacte` (`id_diente`);

--
-- Filtros para la tabla `serviciobasico`
--
ALTER TABLE `serviciobasico`
  ADD CONSTRAINT `ServicioBasico_TipoServicio` FOREIGN KEY (`TipoServicio_id_tipoServicio`) REFERENCES `tiposervicio` (`id_tipoServicio`);

--
-- Filtros para la tabla `tratamiento_paciente`
--
ALTER TABLE `tratamiento_paciente`
  ADD CONSTRAINT `Tratamiento_paciente_Consulta` FOREIGN KEY (`Consulta_id_consulta`) REFERENCES `consulta` (`id_consulta`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `Usuario_TipoUsuario` FOREIGN KEY (`TipoUsuario_id_tipoUsuario`) REFERENCES `tipousuario` (`id_tipoUsuario`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
