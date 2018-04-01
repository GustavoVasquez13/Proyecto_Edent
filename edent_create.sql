-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-03-31 07:04:55.374

-- tables
-- Table: AbonoCompra
CREATE TABLE AbonoCompra (
    id_abonoCompra int NOT NULL AUTO_INCREMENT,
    abono_prodto double(9,2) NULL,
    saldo_prodto double(9,2) NULL,
    detalleCompra_id_detalleCom int NOT NULL,
    fecha_abono date NULL,
    CONSTRAINT AbonoCompra_pk PRIMARY KEY (id_abonoCompra)
) COMMENT 'en esta tabla se registran los diferentes abonos que la clínica realiza por los productos comprados.';

-- Table: Consulta
CREATE TABLE Consulta (
    id_consulta int NOT NULL AUTO_INCREMENT,
    motivo_consulta varchar(100) NULL,
    fecha_consulta date NULL,
    PacienteN_id_pacienteN int NOT NULL,
    Total_pagar double(9,2) NULL,
    CONSTRAINT Consulta_pk PRIMARY KEY (id_consulta)
) COMMENT 'registra las consulta registradas para establecer su historial';

-- Table: Contable
CREATE TABLE Contable (
    id_contable int NOT NULL AUTO_INCREMENT,
    DetalleGastos_id_gastos int NOT NULL,
    DetalleIngresos_id_ingresos int NOT NULL,
    CONSTRAINT Contable_pk PRIMARY KEY (id_contable)
) COMMENT 'controla los ingresos y egresos de la clinica en forma general';

-- Table: DetalleGastos
CREATE TABLE DetalleGastos (
    id_gastos int NOT NULL AUTO_INCREMENT,
    AbonoCompra_id_abonoCompra int NOT NULL,
    Empleado_id_empleado int NOT NULL,
    Equipo_id_equipo int NOT NULL,
    MantoEquipo_id_manto int NOT NULL,
    Materiales_id_material int NOT NULL,
    ReparacionClinica_id_raparaClinica int NOT NULL,
    ServicioBasico_id_serviBasico int NOT NULL,
    CONSTRAINT DetalleGastos_pk PRIMARY KEY (id_gastos)
) COMMENT 'en esta tabla se registran los gastos que la clinica tiene en sus diversos tipos';

-- Table: DetalleIngresos
CREATE TABLE DetalleIngresos (
    id_ingresos int NOT NULL AUTO_INCREMENT,
    ingresos_productos_id_ingresoP int NOT NULL,
    Tratamiento_paciente_id_tratamiento int NOT NULL,
    CONSTRAINT DetalleIngresos_pk PRIMARY KEY (id_ingresos)
) COMMENT 'aqui se registran los ingresos que tiene la clinica en consultas y venta de productos';

-- Table: DientesPacte
CREATE TABLE DientesPacte (
    id_diente int NOT NULL AUTO_INCREMENT,
    num_diente char(5) NULL,
    estado_diente varchar(25) NULL,
    CONSTRAINT DientesPacte_pk PRIMARY KEY (id_diente)
) COMMENT 'informacion sobre la dentadura del paciente';

-- Table: Empleado
CREATE TABLE Empleado (
    id_empleado int NOT NULL AUTO_INCREMENT,
    nombre_empl varchar(25) NOT NULL,
    apellido_empl varchar(25) NOT NULL,
    direccion_empl varchar(100) NULL,
    correo_empl varchar(75) NULL,
    tel_empl varchar(15) NULL,
    cargo_empl varchar(50) NOT NULL,
    sueldo_empl double(9,2) NULL,
    dui_empl char(10) NULL,
    CONSTRAINT Empleado_pk PRIMARY KEY (id_empleado)
) COMMENT 'esta tabla regista el personal empleado por la clinica';

-- Table: Equipo
CREATE TABLE Equipo (
    id_equipo int NOT NULL AUTO_INCREMENT,
    tipo_equipo varchar(50) NULL,
    estado_equipo varchar(50) NULL,
    descripcion_equipo varchar(150) NULL,
    costo_equipo double(9,2) NULL,
    CONSTRAINT Equipo_pk PRIMARY KEY (id_equipo)
) COMMENT 'Equipo comprado para usos de la clinica';

-- Table: Examen
CREATE TABLE Examen (
    id_examen int NOT NULL AUTO_INCREMENT,
    tipo_examen varchar(100) NULL,
    fecha_examen date NULL,
    observaciones_examen varchar(200) NULL,
    descrip_examen varchar(150) NULL,
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
    tipo_manto varchar(50) NULL,
    descripcion_manto varchar(150) NULL,
    costo_manto double(9,2) NULL,
    Equipo_id_equipo int NOT NULL,
    CONSTRAINT MantoEquipo_pk PRIMARY KEY (id_manto)
) COMMENT 'esta tabla es para los gastos en mantenimiento de equipo';

-- Table: Materiales
CREATE TABLE Materiales (
    id_material int NOT NULL AUTO_INCREMENT,
    tipo_material varchar(50) NULL,
    nombre_material varchar(150) NULL,
    descripcion_material varchar(150) NULL,
    costo_material double(9,2) NULL,
    CONSTRAINT Materiales_pk PRIMARY KEY (id_material)
) COMMENT 'en esta tabla se muestran los diferentes materiales que usa la clinica para saber cuanto gasta y cuales materiales tiene';

-- Table: PacienteN
CREATE TABLE PacienteN (
    id_pacienteN int NOT NULL AUTO_INCREMENT,
    nombre_pacte varchar(25) NOT NULL,
    apellido_pacte varchar(25) NOT NULL,
    direccion_pacte varchar(100) NULL,
    correo_pacte varchar(75) NULL,
    tel_pacte varchar(15) NULL,
    genero_pacte char(1) NULL,
    fechaNac_pacte date NULL,
    clasificacion_maxilares varchar(100) NULL,
    entorno_dental varchar(100) NULL,
    objetivos varchar(150) NULL,
    estado_paciente bool NULL,
    DientesPacte_id_diente int NOT NULL,
    TipoPaciente_id_tipoPaciente int NOT NULL,
    CONSTRAINT PacienteN_pk PRIMARY KEY (id_pacienteN)
) COMMENT 'guarda los datos generales de un paciente de categoria normal';

-- Table: Proveedores
CREATE TABLE Proveedores (
    id_proveedor int NOT NULL AUTO_INCREMENT,
    nombre_prov varchar(25) NOT NULL,
    direccion_prov varchar(100) NULL,
    correo_prov varchar(75) NULL,
    tel_prov varchar(15) NULL,
    CONSTRAINT Proveedores_pk PRIMARY KEY (id_proveedor)
) COMMENT 'esta tabla regista el personal empleado por la clinica';

-- Table: ReparacionClinica
CREATE TABLE ReparacionClinica (
    id_raparaClinica int NOT NULL AUTO_INCREMENT,
    tipo_reparacion varchar(50) NULL,
    descrip_reparacion varchar(150) NULL,
    costo_reparacion double(9,2) NULL,
    CONSTRAINT ReparacionClinica_pk PRIMARY KEY (id_raparaClinica)
) COMMENT 'enesta tabla se establecen las reparaciones y mantenimiento realizado a la clinica';

-- Table: ServicioBasico
CREATE TABLE ServicioBasico (
    id_serviBasico int NOT NULL AUTO_INCREMENT,
    costo_servicio double(9,2) NULL,
    fechaPago_servicio date NULL,
    TipoServicio_id_tipoServicio int NOT NULL,
    CONSTRAINT ServicioBasico_pk PRIMARY KEY (id_serviBasico)
) COMMENT 'en esta tabla se muestran los diferentes servicios basicos que la clinica paga';

-- Table: TipoPaciente
CREATE TABLE TipoPaciente (
    id_tipoPaciente int NOT NULL AUTO_INCREMENT,
    nombre_tipo varchar(100) NOT NULL,
    CONSTRAINT TipoPaciente_pk PRIMARY KEY (id_tipoPaciente)
) COMMENT 'se ingresan los tipos de pacientes con los que trabaja la clinica';

-- Table: TipoServicio
CREATE TABLE TipoServicio (
    id_tipoServicio int NOT NULL AUTO_INCREMENT,
    nombre_servicio varchar(150) NOT NULL,
    proveedor_servicio varchar(50) NULL,
    correo_provS varchar(100) NULL,
    tel_provS char(15) NULL,
    CONSTRAINT TipoServicio_pk PRIMARY KEY (id_tipoServicio)
) COMMENT 'aqui se almacenan los diferentes tipos de servicios de los que hace uso la clinica';

-- Table: TipoUsuario
CREATE TABLE TipoUsuario (
    id_tipoUsuario int NOT NULL AUTO_INCREMENT,
    tipo_usuario varchar(50) NOT NULL,
    CONSTRAINT TipoUsuario_pk PRIMARY KEY (id_tipoUsuario)
) COMMENT 'aqui se muestran los tipos de usuarios que podran acceder al sistema';

-- Table: Tratamiento_paciente
CREATE TABLE Tratamiento_paciente (
    id_tratamiento int NOT NULL AUTO_INCREMENT,
    fecha date NULL,
    Examen_id_examen int NULL,
    Tratamiento_reallizado varchar(200) NULL,
    Abono double(9,2) NULL,
    Consulta_id_consulta int NOT NULL,
    CONSTRAINT Tratamiento_paciente_pk PRIMARY KEY (id_tratamiento)
) COMMENT 'aqui se lleva el registro del tratamiento que todo paciente debe llevar';

-- Table: Usuario
CREATE TABLE Usuario (
    id_usuario int NOT NULL AUTO_INCREMENT,
    TipoUsuario_id_tipoUsuario int NOT NULL,
    nombre_usuario varchar(50) NOT NULL,
    apellido_usuario varchar(50) NOT NULL,
    usuario varchar(50) NOT NULL,
    clave varchar(150) NOT NULL,
    correo_usuario varchar(100) NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (id_usuario)
) COMMENT 'en esta tabla se registra los datos de los usuarios que manejaran el sistema';

-- Table: detalleCompra
CREATE TABLE detalleCompra (
    id_detalleCom int NOT NULL AUTO_INCREMENT,
    productos_id_prodto int NOT NULL,
    costo_prodto double(9,2) NULL,
    cantidad_prodto int NULL,
    marca_producto varchar(25) NULL,
    fecha_compra date NULL,
    Proveedores_id_proveedor int NOT NULL,
    CONSTRAINT detalleCompra_pk PRIMARY KEY (id_detalleCom)
) COMMENT 'esta tabla regista la compra de productos a los proveedores';

-- Table: ingresos_productos
CREATE TABLE ingresos_productos (
    id_ingresoP int NOT NULL AUTO_INCREMENT,
    tipo_producto varchar(100) NULL,
    fecha_venta date NULL,
    costo_producto double(9,2) NULL,
    CONSTRAINT ingresos_productos_pk PRIMARY KEY (id_ingresoP)
) COMMENT 'ingresos por venta de algunos productos clinicos ';

-- Table: productos
CREATE TABLE productos (
    id_prodto int NOT NULL AUTO_INCREMENT,
    nombre_prodto varchar(25) NOT NULL,
    descripcion_prodto varchar(100) NOT NULL,
    CONSTRAINT productos_pk PRIMARY KEY (id_prodto)
) COMMENT 'en esta tabla se registran los diferentes productos que proporcionan los proveedores';

-- foreign keys
-- Reference: AbonoCompra_detalleCompra (table: AbonoCompra)
ALTER TABLE AbonoCompra ADD CONSTRAINT AbonoCompra_detalleCompra FOREIGN KEY AbonoCompra_detalleCompra (detalleCompra_id_detalleCom)
    REFERENCES detalleCompra (id_detalleCom);

-- Reference: Consulta_PacienteN (table: Consulta)
ALTER TABLE Consulta ADD CONSTRAINT Consulta_PacienteN FOREIGN KEY Consulta_PacienteN (PacienteN_id_pacienteN)
    REFERENCES PacienteN (id_pacienteN);

-- Reference: Contable_DetalleGastos (table: Contable)
ALTER TABLE Contable ADD CONSTRAINT Contable_DetalleGastos FOREIGN KEY Contable_DetalleGastos (DetalleGastos_id_gastos)
    REFERENCES DetalleGastos (id_gastos);

-- Reference: Contable_DetalleIngresos (table: Contable)
ALTER TABLE Contable ADD CONSTRAINT Contable_DetalleIngresos FOREIGN KEY Contable_DetalleIngresos (DetalleIngresos_id_ingresos)
    REFERENCES DetalleIngresos (id_ingresos);

-- Reference: DetalleGastos_AbonoCompra (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_AbonoCompra FOREIGN KEY DetalleGastos_AbonoCompra (AbonoCompra_id_abonoCompra)
    REFERENCES AbonoCompra (id_abonoCompra);

-- Reference: DetalleGastos_Empleado (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_Empleado FOREIGN KEY DetalleGastos_Empleado (Empleado_id_empleado)
    REFERENCES Empleado (id_empleado);

-- Reference: DetalleGastos_Equipo (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_Equipo FOREIGN KEY DetalleGastos_Equipo (Equipo_id_equipo)
    REFERENCES Equipo (id_equipo);

-- Reference: DetalleGastos_MantoEquipo (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_MantoEquipo FOREIGN KEY DetalleGastos_MantoEquipo (MantoEquipo_id_manto)
    REFERENCES MantoEquipo (id_manto);

-- Reference: DetalleGastos_Materiales (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_Materiales FOREIGN KEY DetalleGastos_Materiales (Materiales_id_material)
    REFERENCES Materiales (id_material);

-- Reference: DetalleGastos_ReparacionClinica (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_ReparacionClinica FOREIGN KEY DetalleGastos_ReparacionClinica (ReparacionClinica_id_raparaClinica)
    REFERENCES ReparacionClinica (id_raparaClinica);

-- Reference: DetalleGastos_ServicioBasico (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_ServicioBasico FOREIGN KEY DetalleGastos_ServicioBasico (ServicioBasico_id_serviBasico)
    REFERENCES ServicioBasico (id_serviBasico);

-- Reference: DetalleIngresos_Tratamiento_paciente (table: DetalleIngresos)
ALTER TABLE DetalleIngresos ADD CONSTRAINT DetalleIngresos_Tratamiento_paciente FOREIGN KEY DetalleIngresos_Tratamiento_paciente (Tratamiento_paciente_id_tratamiento)
    REFERENCES Tratamiento_paciente (id_tratamiento);

-- Reference: DetalleIngresos_ingresos_productos (table: DetalleIngresos)
ALTER TABLE DetalleIngresos ADD CONSTRAINT DetalleIngresos_ingresos_productos FOREIGN KEY DetalleIngresos_ingresos_productos (ingresos_productos_id_ingresoP)
    REFERENCES ingresos_productos (id_ingresoP);

-- Reference: Examen_Consulta (table: Examen)
ALTER TABLE Examen ADD CONSTRAINT Examen_Consulta FOREIGN KEY Examen_Consulta (Consulta_id_consulta)
    REFERENCES Consulta (id_consulta);

-- Reference: HistorialPaciente_Consulta (table: HistorialPaciente)
ALTER TABLE HistorialPaciente ADD CONSTRAINT HistorialPaciente_Consulta FOREIGN KEY HistorialPaciente_Consulta (Consulta_id_consulta)
    REFERENCES Consulta (id_consulta);

-- Reference: MantoEquipo_Equipo (table: MantoEquipo)
ALTER TABLE MantoEquipo ADD CONSTRAINT MantoEquipo_Equipo FOREIGN KEY MantoEquipo_Equipo (Equipo_id_equipo)
    REFERENCES Equipo (id_equipo);

-- Reference: PacienteN_DientesPacte (table: PacienteN)
ALTER TABLE PacienteN ADD CONSTRAINT PacienteN_DientesPacte FOREIGN KEY PacienteN_DientesPacte (DientesPacte_id_diente)
    REFERENCES DientesPacte (id_diente);

-- Reference: PacienteN_TipoPaciente (table: PacienteN)
ALTER TABLE PacienteN ADD CONSTRAINT PacienteN_TipoPaciente FOREIGN KEY PacienteN_TipoPaciente (TipoPaciente_id_tipoPaciente)
    REFERENCES TipoPaciente (id_tipoPaciente);

-- Reference: ServicioBasico_TipoServicio (table: ServicioBasico)
ALTER TABLE ServicioBasico ADD CONSTRAINT ServicioBasico_TipoServicio FOREIGN KEY ServicioBasico_TipoServicio (TipoServicio_id_tipoServicio)
    REFERENCES TipoServicio (id_tipoServicio);

-- Reference: Tratamiento_paciente_Consulta (table: Tratamiento_paciente)
ALTER TABLE Tratamiento_paciente ADD CONSTRAINT Tratamiento_paciente_Consulta FOREIGN KEY Tratamiento_paciente_Consulta (Consulta_id_consulta)
    REFERENCES Consulta (id_consulta);

-- Reference: Usuario_TipoUsuario (table: Usuario)
ALTER TABLE Usuario ADD CONSTRAINT Usuario_TipoUsuario FOREIGN KEY Usuario_TipoUsuario (TipoUsuario_id_tipoUsuario)
    REFERENCES TipoUsuario (id_tipoUsuario);

-- Reference: detalleCompra_Proveedores (table: detalleCompra)
ALTER TABLE detalleCompra ADD CONSTRAINT detalleCompra_Proveedores FOREIGN KEY detalleCompra_Proveedores (Proveedores_id_proveedor)
    REFERENCES Proveedores (id_proveedor);

-- Reference: detalleCompra_productos (table: detalleCompra)
ALTER TABLE detalleCompra ADD CONSTRAINT detalleCompra_productos FOREIGN KEY detalleCompra_productos (productos_id_prodto)
    REFERENCES productos (id_prodto);

-- End of file.

