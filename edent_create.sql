-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-03-27 06:06:17.429

-- tables
-- Table: Consulta
CREATE TABLE Consulta (
    id_consulta int NOT NULL AUTO_INCREMENT,
    motivo_consulta varchar(100) NOT NULL,
    fecha_consulta date NOT NULL,
    PacienteN_id_pacienteN int NOT NULL,
    Total_pagar double(9,2) NOT NULL,
    CONSTRAINT Consulta_pk PRIMARY KEY (id_consulta)
) COMMENT 'registra las consulta registradas para establecer su historial';

-- Table: Contable
CREATE TABLE Contable (
    id_contable int NOT NULL AUTO_INCREMENT,
    Ingresos_id_ingresos int NOT NULL,
    Gastos_id_gastos int NOT NULL,
    CONSTRAINT Contable_pk PRIMARY KEY (id_contable)
) COMMENT 'controla los ingresos y egresos de la clinica en forma general';

-- Table: DetalleGastos
CREATE TABLE DetalleGastos (
    id_gastos int NOT NULL AUTO_INCREMENT,
    ServicioBasico_id_serviBasico int NOT NULL,
    Empleado_id_empleado int NOT NULL,
    Equipo_id_equipo int NOT NULL,
    MantoEquipo_id_manto int NOT NULL,
    Materiales_id_material int NOT NULL,
    ReparacionClinica_id_raparaClinica int NOT NULL,
    productos_id_prodto int NOT NULL,
    CONSTRAINT DetalleGastos_pk PRIMARY KEY (id_gastos)
) COMMENT 'en esta tabla se registran los gastos que la clinica tiene en sus diversos tipos';

-- Table: DetalleIngresos
CREATE TABLE DetalleIngresos (
    id_ingresos int NOT NULL AUTO_INCREMENT,
    Tratamiento_paciente_id_tratamiento int NOT NULL,
    ingresos_productos_id_ingresoP int NOT NULL,
    CONSTRAINT DetalleIngresos_pk PRIMARY KEY (id_ingresos)
) COMMENT 'aqui se registran los ingresos que tiene la clinica en consultas y venta de productos';

-- Table: DientesPacte
CREATE TABLE DientesPacte (
    id_diente int NOT NULL AUTO_INCREMENT,
    num_diente char(5) NOT NULL,
    estado_diente varchar(25) NOT NULL,
    CONSTRAINT DientesPacte_pk PRIMARY KEY (id_diente)
) COMMENT 'informacion sobre la dentadura del paciente';

-- Table: Empleado
CREATE TABLE Empleado (
    id_empleado int NOT NULL AUTO_INCREMENT,
    nombre_empl varchar(25) NOT NULL,
    apellido_empl varchar(25) NOT NULL,
    direccion_empl varchar(100) NOT NULL,
    correo_empl varchar(75) NOT NULL,
    tel_empl varchar(15) NOT NULL,
    cargo_empl varchar(50) NOT NULL,
    sueldo_empl double(9,2) NOT NULL,
    dui_empl char(10) NOT NULL,
    CONSTRAINT Empleado_pk PRIMARY KEY (id_empleado)
) COMMENT 'esta tabla regista el personal empleado por la clinica';

-- Table: Equipo
CREATE TABLE Equipo (
    id_equipo int NOT NULL AUTO_INCREMENT,
    tipo_equipo varchar(50) NOT NULL,
    estado_equipo varchar(50) NOT NULL,
    descripcion_equipo varchar(150) NOT NULL,
    costo_equipo double(9,2) NOT NULL,
    CONSTRAINT Equipo_pk PRIMARY KEY (id_equipo)
) COMMENT 'Equipo comprado para usos de la clinica';

-- Table: Examen
CREATE TABLE Examen (
    id_examen int NOT NULL AUTO_INCREMENT,
    tipo_examen varchar(100) NOT NULL,
    fecha_examen date NOT NULL,
    observaciones_examen varchar(200) NOT NULL,
    descrip_examen varchar(150) NOT NULL,
    Consulta_id_consulta int NOT NULL,
    CONSTRAINT Examen_pk PRIMARY KEY (id_examen)
) COMMENT 'caracteristicas que contiene un examen realizado al paciente';

-- Table: HistorialPaciente
CREATE TABLE HistorialPaciente (
    id_historialP int NOT NULL AUTO_INCREMENT,
    Consulta_id_consulta int NOT NULL,
    CONSTRAINT HistorialPaciente_pk PRIMARY KEY (id_historialP)
) COMMENT 'se alamcena el historial de los pacientes';

-- Table: MantoEquipo
CREATE TABLE MantoEquipo (
    id_manto int NOT NULL AUTO_INCREMENT,
    tipo_manto varchar(50) NOT NULL,
    descripcion_manto varchar(150) NOT NULL,
    costo_manto double(9,2) NOT NULL,
    Equipo_id_equipo int NOT NULL,
    CONSTRAINT MantoEquipo_pk PRIMARY KEY (id_manto)
) COMMENT 'esta tabla es para los gastos en mantenimiento de equipo';

-- Table: Materiales
CREATE TABLE Materiales (
    id_material int NOT NULL AUTO_INCREMENT,
    tipo_material varchar(50) NOT NULL,
    nombre_material varchar(150) NOT NULL,
    descripcion_material varchar(150) NOT NULL,
    costo_material double(9,2) NOT NULL,
    CONSTRAINT Materiales_pk PRIMARY KEY (id_material)
) COMMENT 'en esta tabla se muestran los diferentes materiales que usa la clinica para saber cuanto gasta y cuales materiales tiene';

-- Table: PacienteN
CREATE TABLE PacienteN (
    id_pacienteN int NOT NULL AUTO_INCREMENT,
    nombre_pacte varchar(25) NOT NULL,
    apellido_pacte varchar(25) NOT NULL,
    direccion_pacte varchar(100) NOT NULL,
    correo_pacte varchar(75) NOT NULL,
    tel_pacte varchar(15) NOT NULL,
    genero_pacte char(1) NOT NULL,
    fechaNac_pacte date NOT NULL,
    clasificacion_maxilares varchar(100) NOT NULL,
    entorno_dental varchar(100) NOT NULL,
    objetivos varchar(150) NOT NULL,
    DientesPacte_id_diente int NOT NULL,
    TipoPaciente_id_tipoPaciente int NOT NULL,
    CONSTRAINT PacienteN_pk PRIMARY KEY (id_pacienteN)
) COMMENT 'guarda los datos generales de un paciente de categoria normal';

-- Table: Proveedores
CREATE TABLE Proveedores (
    id_proveedor int NOT NULL AUTO_INCREMENT,
    nombre_prov varchar(25) NOT NULL,
    direccion_prov varchar(100) NOT NULL,
    correo_prov varchar(75) NOT NULL,
    tel_prov varchar(15) NOT NULL,
    CONSTRAINT Proveedores_pk PRIMARY KEY (id_proveedor)
) COMMENT 'esta tabla regista el personal empleado por la clinica';

-- Table: ReparacionClinica
CREATE TABLE ReparacionClinica (
    id_raparaClinica int NOT NULL AUTO_INCREMENT,
    tipo_reparacion varchar(50) NOT NULL,
    descrip_reparacion varchar(150) NOT NULL,
    costo_reparacion double(9,2) NOT NULL,
    CONSTRAINT ReparacionClinica_pk PRIMARY KEY (id_raparaClinica)
) COMMENT 'enesta tabla se establecen las reparaciones y mantenimiento realizado a la clinica';

-- Table: ServicioBasico
CREATE TABLE ServicioBasico (
    id_serviBasico int NOT NULL AUTO_INCREMENT,
    tipo_servicio varchar(150) NOT NULL,
    costo_servicio double(9,2) NOT NULL,
    fechaPago_servicio date NOT NULL,
    CONSTRAINT ServicioBasico_pk PRIMARY KEY (id_serviBasico)
) COMMENT 'en esta tabla se muestran los diferentes servicios basicos que la clinica paga';

-- Table: TipoPaciente
CREATE TABLE TipoPaciente (
    id_tipoPaciente int NOT NULL AUTO_INCREMENT,
    nombre_tipo varchar(100) NOT NULL,
    CONSTRAINT TipoPaciente_pk PRIMARY KEY (id_tipoPaciente)
) COMMENT 'se ingresan los tipos de pacientes con los que trabaja la clinica';

-- Table: TipoUsuario
CREATE TABLE TipoUsuario (
    id_tipoUsuario int NOT NULL AUTO_INCREMENT,
    tipo_usuario varchar(50) NOT NULL,
    CONSTRAINT TipoUsuario_pk PRIMARY KEY (id_tipoUsuario)
) COMMENT 'aqui se muestran los tipos de usuarios que podran acceder al sistema';

-- Table: Tratamiento_paciente
CREATE TABLE Tratamiento_paciente (
    id_tratamiento int NOT NULL AUTO_INCREMENT,
    fecha date NOT NULL,
    Examen_id_examen int NOT NULL,
    Tratamiento_reallizado varchar(200) NOT NULL,
    Abono double(9,2) NOT NULL,
    Consulta_id_consulta int NOT NULL,
    CONSTRAINT Tratamiento_paciente_pk PRIMARY KEY (id_tratamiento)
) COMMENT 'aqui se lleva el registro del tratamiento que todo paciente debe llevar';

-- Table: Usuario
CREATE TABLE Usuario (
    id_usuario int NOT NULL AUTO_INCREMENT,
    nombre_usuario varchar(50) NOT NULL,
    apellido_usuario varchar(50) NOT NULL,
    usuario varchar(20) NOT NULL,
    clave varchar(25) NOT NULL,
    TipoUsuario_id_tipoUsuario int NOT NULL,
    correo_usuario varchar(100) NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (id_usuario)
) COMMENT 'en esta tabla se registra los datos de los usuarios que manejaran el sistema';

-- Table: ingresos_productos
CREATE TABLE ingresos_productos (
    id_ingresoP int NOT NULL AUTO_INCREMENT,
    tipo_producto varchar(100) NOT NULL,
    fecha_venta date NOT NULL,
    costo_producto double(9,2) NOT NULL,
    CONSTRAINT ingresos_productos_pk PRIMARY KEY (id_ingresoP)
) COMMENT 'ingresos por venta de algunos productos clinicos ';

-- Table: productos
CREATE TABLE productos (
    id_prodto int NOT NULL AUTO_INCREMENT,
    nombre_prodto varchar(25) NOT NULL,
    descripcion_prodto varchar(100) NOT NULL,
    costo_prodto double(9,2) NOT NULL,
    Proveedores_id_proveedor int NOT NULL,
    abono_prodto double(9,2) NOT NULL,
    saldo_prodto double(9,2) NOT NULL,
    cantidad_prodto int NOT NULL,
    CONSTRAINT productos_pk PRIMARY KEY (id_prodto)
) COMMENT 'en esta tabla se registran los diferentes productos que proporcionan los proveedores';

-- foreign keys
-- Reference: Consulta_PacienteN (table: Consulta)
ALTER TABLE Consulta ADD CONSTRAINT Consulta_PacienteN FOREIGN KEY Consulta_PacienteN (PacienteN_id_pacienteN)
    REFERENCES PacienteN (id_pacienteN);

-- Reference: Contable_Gastos (table: Contable)
ALTER TABLE Contable ADD CONSTRAINT Contable_Gastos FOREIGN KEY Contable_Gastos (Gastos_id_gastos)
    REFERENCES DetalleGastos (id_gastos);

-- Reference: Contable_Ingresos (table: Contable)
ALTER TABLE Contable ADD CONSTRAINT Contable_Ingresos FOREIGN KEY Contable_Ingresos (Ingresos_id_ingresos)
    REFERENCES DetalleIngresos (id_ingresos);

-- Reference: Examen_Consulta (table: Examen)
ALTER TABLE Examen ADD CONSTRAINT Examen_Consulta FOREIGN KEY Examen_Consulta (Consulta_id_consulta)
    REFERENCES Consulta (id_consulta);

-- Reference: Gastos_Empleado (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT Gastos_Empleado FOREIGN KEY Gastos_Empleado (Empleado_id_empleado)
    REFERENCES Empleado (id_empleado);

-- Reference: Gastos_Equipo (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT Gastos_Equipo FOREIGN KEY Gastos_Equipo (Equipo_id_equipo)
    REFERENCES Equipo (id_equipo);

-- Reference: Gastos_MantoEquipo (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT Gastos_MantoEquipo FOREIGN KEY Gastos_MantoEquipo (MantoEquipo_id_manto)
    REFERENCES MantoEquipo (id_manto);

-- Reference: Gastos_Materiales (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT Gastos_Materiales FOREIGN KEY Gastos_Materiales (Materiales_id_material)
    REFERENCES Materiales (id_material);

-- Reference: Gastos_ReparacionClinica (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT Gastos_ReparacionClinica FOREIGN KEY Gastos_ReparacionClinica (ReparacionClinica_id_raparaClinica)
    REFERENCES ReparacionClinica (id_raparaClinica);

-- Reference: Gastos_ServicioBasico (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT Gastos_ServicioBasico FOREIGN KEY Gastos_ServicioBasico (ServicioBasico_id_serviBasico)
    REFERENCES ServicioBasico (id_serviBasico);

-- Reference: Gastos_productos (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT Gastos_productos FOREIGN KEY Gastos_productos (productos_id_prodto)
    REFERENCES productos (id_prodto);

-- Reference: HistorialPaciente_Consulta (table: HistorialPaciente)
ALTER TABLE HistorialPaciente ADD CONSTRAINT HistorialPaciente_Consulta FOREIGN KEY HistorialPaciente_Consulta (Consulta_id_consulta)
    REFERENCES Consulta (id_consulta);

-- Reference: Ingresos_Tratamiento_paciente (table: DetalleIngresos)
ALTER TABLE DetalleIngresos ADD CONSTRAINT Ingresos_Tratamiento_paciente FOREIGN KEY Ingresos_Tratamiento_paciente (Tratamiento_paciente_id_tratamiento)
    REFERENCES Tratamiento_paciente (id_tratamiento);

-- Reference: Ingresos_ingresos_productos (table: DetalleIngresos)
ALTER TABLE DetalleIngresos ADD CONSTRAINT Ingresos_ingresos_productos FOREIGN KEY Ingresos_ingresos_productos (ingresos_productos_id_ingresoP)
    REFERENCES ingresos_productos (id_ingresoP);

-- Reference: MantoEquipo_Equipo (table: MantoEquipo)
ALTER TABLE MantoEquipo ADD CONSTRAINT MantoEquipo_Equipo FOREIGN KEY MantoEquipo_Equipo (Equipo_id_equipo)
    REFERENCES Equipo (id_equipo);

-- Reference: PacienteN_DientesPacte (table: PacienteN)
ALTER TABLE PacienteN ADD CONSTRAINT PacienteN_DientesPacte FOREIGN KEY PacienteN_DientesPacte (DientesPacte_id_diente)
    REFERENCES DientesPacte (id_diente);

-- Reference: PacienteN_TipoPaciente (table: PacienteN)
ALTER TABLE PacienteN ADD CONSTRAINT PacienteN_TipoPaciente FOREIGN KEY PacienteN_TipoPaciente (TipoPaciente_id_tipoPaciente)
    REFERENCES TipoPaciente (id_tipoPaciente);

-- Reference: Tratamiento_paciente_Consulta (table: Tratamiento_paciente)
ALTER TABLE Tratamiento_paciente ADD CONSTRAINT Tratamiento_paciente_Consulta FOREIGN KEY Tratamiento_paciente_Consulta (Consulta_id_consulta)
    REFERENCES Consulta (id_consulta);

-- Reference: Usuario_TipoUsuario (table: Usuario)
ALTER TABLE Usuario ADD CONSTRAINT Usuario_TipoUsuario FOREIGN KEY Usuario_TipoUsuario (TipoUsuario_id_tipoUsuario)
    REFERENCES TipoUsuario (id_tipoUsuario);

-- Reference: productos_Proveedores (table: productos)
ALTER TABLE productos ADD CONSTRAINT productos_Proveedores FOREIGN KEY productos_Proveedores (Proveedores_id_proveedor)
    REFERENCES Proveedores (id_proveedor);

-- End of file.

