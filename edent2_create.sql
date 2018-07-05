-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-06-29 03:53:37.747

-- tables
-- Table: Cefalometria
CREATE TABLE Cefalometria (
    id_cefalometria int NOT NULL AUTO_INCREMENT,
    articular varchar(100) NULL,
    goniaco varchar(100) NULL,
    impa varchar(150) NULL,
    jarabak varchar(100) NULL,
    facial varchar(100) NULL,
    `is` varchar(100) NULL,
    ii varchar(100) NULL,
    fhis varchar(100) NULL,
    anb82 varchar(100) NULL,
    anb80 varchar(100) NULL,
    anb2 varchar(100) NULL,
    pals varchar(100) NULL,
    pali varchar(100) NULL,
    ptb varchar(100) NULL,
    speeleve bool NULL,
    speemoderada bool NULL,
    speesvera bool NULL,
    dsd varchar(100) NULL,
    clasim varchar(100) NULL,
    entornod varchar(100) NULL,
    CONSTRAINT Cefalometria_pk PRIMARY KEY (id_cefalometria)
) COMMENT 'registra las consulta de ortodoncias registradas para establecer su historial';

-- Table: Consulta
CREATE TABLE Consulta (
    id_consulta int NOT NULL AUTO_INCREMENT,
    motivo_consulta varchar(100) NULL,
    fecha_consulta date NULL,
    Total_pagar double(9,2) NULL,
    HistoriaM varchar(100) NOT NULL,
    HistoriaO varchar(100) NOT NULL,
    ExamenC varchar(100) NOT NULL,
    DXodon varchar(100) NOT NULL,
    PacienteN_id_pacienteN int NOT NULL,
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
    ServicioBasico_id_serviBasico int NOT NULL,
    PagoEmpleado_id_pagoEmpl int NOT NULL,
    PagoMateriales_id_pagoMaterial int NOT NULL,
    pagoReparacion_id_pagoRepa int NOT NULL,
    pagoEquipo_id_pagoEquipo int NOT NULL,
    detalleCompra_id_detalleCom int NOT NULL,
    CONSTRAINT DetalleGastos_pk PRIMARY KEY (id_gastos)
) COMMENT 'en esta tabla se registran los gastos que la clinica tiene en sus diversos tipos';

-- Table: DetalleIngresos
CREATE TABLE DetalleIngresos (
    id_ingresos int NOT NULL AUTO_INCREMENT,
    ingresos_productos_id_ingresoP int NOT NULL,
    Tratamiento_paciente_id_tratamiento int NOT NULL,
    detalleconsulta_id_detalleconsulta int NOT NULL,
    CONSTRAINT DetalleIngresos_pk PRIMARY KEY (id_ingresos)
) COMMENT 'aqui se registran los ingresos que tiene la clinica en consultas y venta de productos';

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
    estado_empl varchar(10) NOT NULL,
    fecha_inicio date NOT NULL,
    CONSTRAINT Empleado_pk PRIMARY KEY (id_empleado)
) COMMENT 'esta tabla regista el personal empleado por la clinica';

-- Table: Equipo
CREATE TABLE Equipo (
    id_equipo int NOT NULL AUTO_INCREMENT,
    tipo_equipo varchar(50) NULL,
    estado_equipo varchar(50) NULL,
    descripcion_equipo varchar(150) NULL,
    CONSTRAINT Equipo_pk PRIMARY KEY (id_equipo)
) COMMENT 'Equipo comprado para usos de la clinica';

-- Table: HistorialPaciente
CREATE TABLE HistorialPaciente (
    id_historialP int NOT NULL AUTO_INCREMENT,
    detalleconsulta_id_detalleconsulta int NOT NULL,
    CONSTRAINT HistorialPaciente_pk PRIMARY KEY (id_historialP)
) COMMENT 'se alamcena el historial de los pacientes';

-- Table: Materiales
CREATE TABLE Materiales (
    id_material int NOT NULL AUTO_INCREMENT,
    tipo_material varchar(50) NULL,
    nombre_material varchar(150) NULL,
    descripcion_material varchar(150) NULL,
    costo_material double(9,2) NULL,
    cantidad int NOT NULL,
    CONSTRAINT Materiales_pk PRIMARY KEY (id_material)
) COMMENT 'en esta tabla se muestran los diferentes materiales que usa la clinica para saber cuanto gasta y cuales materiales tiene';

-- Table: PacienteN
CREATE TABLE PacienteN (
    id_pacienteN int NOT NULL AUTO_INCREMENT,
    nombre_pacte varchar(25) NOT NULL,
    apellido_pacte varchar(25) NOT NULL,
    direccion_pacte varchar(100) NULL,
    tel_pacte varchar(15) NULL,
    estado_paciente bool NULL,
    TipoPaciente_id_tipoPaciente int NOT NULL,
    edad int NOT NULL,
    CONSTRAINT PacienteN_pk PRIMARY KEY (id_pacienteN)
) COMMENT 'guarda los datos generales de un paciente de categoria normal';

-- Table: PagoEmpleado
CREATE TABLE PagoEmpleado (
    id_pagoEmpl int NOT NULL AUTO_INCREMENT,
    sueldo_empl double(9,2) NULL,
    fechaPago_empl date NULL,
    Empleado_id_empleado int NOT NULL,
    CONSTRAINT PagoEmpleado_pk PRIMARY KEY (id_pagoEmpl)
) COMMENT 'almacena los pagos a los diferentes empleados que se manejan';

-- Table: PagoMateriales
CREATE TABLE PagoMateriales (
    id_pagoMaterial int NOT NULL AUTO_INCREMENT,
    costo_material double(9,2) NULL,
    fechaPago_material date NULL,
    Materiales_id_material int NOT NULL,
    CONSTRAINT PagoMateriales_pk PRIMARY KEY (id_pagoMaterial)
) COMMENT 'almacena los pagos a los diferentes materiales que se compran para la clinica';

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
    Tratamiento_reallizado varchar(200) NULL,
    Abono double(9,2) NULL,
    detalleconsulta_id_detalleconsulta int NOT NULL,
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

-- Table: detalleconsulta
CREATE TABLE detalleconsulta (
    id_detalleconsulta int NOT NULL AUTO_INCREMENT,
    extracciondiente_id_diente int NOT NULL,
    rellenodiente_id_diente int NOT NULL,
    Consulta_id_consulta int NOT NULL,
    fecha date NULL,
    Tratamiento_reallizado varchar(200) NULL,
    Abono double(9,2) NULL,
    CONSTRAINT detalleconsulta_pk PRIMARY KEY (id_detalleconsulta)
) COMMENT 'relaciones con las extracciones y rellenos de los dientes';

-- Table: diente
CREATE TABLE diente (
    id_diente int NOT NULL AUTO_INCREMENT,
    nombre_diente varchar(100) NULL,
    tipo varchar(100) NULL,
    CONSTRAINT diente_pk PRIMARY KEY (id_diente)
) COMMENT 'tabla que contiene los dientes de adultos y niños';

-- Table: extracciondiente
CREATE TABLE extracciondiente (
    id_extraccion int NOT NULL AUTO_INCREMENT,
    extraccion bool NULL,
    verificar_ext bool NULL,
    diente_id_diente int NOT NULL,
    CONSTRAINT extracciondiente_pk PRIMARY KEY (id_extraccion)
) COMMENT 'extracciones de dientes';

-- Table: ingresos_productos
CREATE TABLE ingresos_productos (
    id_ingresoP int NOT NULL AUTO_INCREMENT,
    tipo_producto varchar(100) NULL,
    fecha_venta date NULL,
    costo_producto double(9,2) NULL,
    CONSTRAINT ingresos_productos_pk PRIMARY KEY (id_ingresoP)
) COMMENT 'ingresos por venta de algunos productos clinicos ';

-- Table: pagoEquipo
CREATE TABLE pagoEquipo (
    id_pagoEquipo int NOT NULL AUTO_INCREMENT,
    costo_equipo double(9,2) NULL,
    fechaPago_equuipo date NULL,
    Equipo_id_equipo int NOT NULL,
    CONSTRAINT pagoEquipo_pk PRIMARY KEY (id_pagoEquipo)
) COMMENT 'almacena los pagos a los diferentes equipos que se compran para la clinica';

-- Table: pagoReparacion
CREATE TABLE pagoReparacion (
    id_pagoRepa int NOT NULL AUTO_INCREMENT,
    costo_repa double(9,2) NULL,
    fechaPago_repa date NULL,
    ReparacionClinica_id_raparaClinica int NOT NULL,
    CONSTRAINT pagoReparacion_pk PRIMARY KEY (id_pagoRepa)
) COMMENT 'almacena los pagos a los diferentes reparciones que se hacen para la clinica';

-- Table: plan_trata_ortodon
CREATE TABLE plan_trata_ortodon (
    id_ortodoncia int NOT NULL AUTO_INCREMENT,
    arcos varchar(100) NULL,
    f_faciales bool NULL,
    f_intraorales bool NULL,
    modelo_mx bool NULL,
    modelo_md bool NULL,
    rx_panoramica bool NULL,
    rx_cefalometrica bool NULL,
    rx_incicivos bool NULL,
    rx_rocabado varchar(150) NULL,
    bandas varchar(100) NULL,
    tubos varchar(100) NULL,
    otros varchar(150) NULL,
    aparato varchar(100) NULL,
    exodoncia varchar(100) NULL,
    brackets varchar(100) NULL,
    retenciones varchar(100) NULL,
    md varchar(100) NULL,
    Cefalometria_id_cefalometria int NOT NULL,
    Consulta_id_consulta int NOT NULL,
    CONSTRAINT plan_trata_ortodon_pk PRIMARY KEY (id_ortodoncia)
) COMMENT 'registra las consulta de ortodoncias registradas para establecer su historial';

-- Table: productos
CREATE TABLE productos (
    id_prodto int NOT NULL AUTO_INCREMENT,
    nombre_prodto varchar(25) NOT NULL,
    descripcion_prodto varchar(100) NOT NULL,
    CONSTRAINT productos_pk PRIMARY KEY (id_prodto)
) COMMENT 'en esta tabla se registran los diferentes productos que proporcionan los proveedores';

-- Table: rellenodiente
CREATE TABLE rellenodiente (
    id_relleno int NOT NULL AUTO_INCREMENT,
    arriba bool NULL,
    abajo bool NULL,
    derecha bool NULL,
    izquierda bool NULL,
    centro bool NULL,
    diente_id_diente int NOT NULL,
    CONSTRAINT rellenodiente_pk PRIMARY KEY (id_relleno)
) COMMENT 'rellenos de dientes';

-- foreign keys
-- Reference: Consulta_PacienteN (table: Consulta)
ALTER TABLE Consulta ADD CONSTRAINT Consulta_PacienteN FOREIGN KEY Consulta_PacienteN (PacienteN_id_pacienteN)
    REFERENCES PacienteN (id_pacienteN);

-- Reference: Contable_DetalleGastos (table: Contable)
ALTER TABLE Contable ADD CONSTRAINT Contable_DetalleGastos FOREIGN KEY Contable_DetalleGastos (DetalleGastos_id_gastos)
    REFERENCES DetalleGastos (id_gastos);

-- Reference: Contable_DetalleIngresos (table: Contable)
ALTER TABLE Contable ADD CONSTRAINT Contable_DetalleIngresos FOREIGN KEY Contable_DetalleIngresos (DetalleIngresos_id_ingresos)
    REFERENCES DetalleIngresos (id_ingresos);

-- Reference: DetalleGastos_PagoEmpleado (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_PagoEmpleado FOREIGN KEY DetalleGastos_PagoEmpleado (PagoEmpleado_id_pagoEmpl)
    REFERENCES PagoEmpleado (id_pagoEmpl);

-- Reference: DetalleGastos_PagoMateriales (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_PagoMateriales FOREIGN KEY DetalleGastos_PagoMateriales (PagoMateriales_id_pagoMaterial)
    REFERENCES PagoMateriales (id_pagoMaterial);

-- Reference: DetalleGastos_ServicioBasico (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_ServicioBasico FOREIGN KEY DetalleGastos_ServicioBasico (ServicioBasico_id_serviBasico)
    REFERENCES ServicioBasico (id_serviBasico);

-- Reference: DetalleGastos_detalleCompra (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_detalleCompra FOREIGN KEY DetalleGastos_detalleCompra (detalleCompra_id_detalleCom)
    REFERENCES detalleCompra (id_detalleCom);

-- Reference: DetalleGastos_pagoEquipo (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_pagoEquipo FOREIGN KEY DetalleGastos_pagoEquipo (pagoEquipo_id_pagoEquipo)
    REFERENCES pagoEquipo (id_pagoEquipo);

-- Reference: DetalleGastos_pagoReparacion (table: DetalleGastos)
ALTER TABLE DetalleGastos ADD CONSTRAINT DetalleGastos_pagoReparacion FOREIGN KEY DetalleGastos_pagoReparacion (pagoReparacion_id_pagoRepa)
    REFERENCES pagoReparacion (id_pagoRepa);

-- Reference: DetalleIngresos_Tratamiento_paciente (table: DetalleIngresos)
ALTER TABLE DetalleIngresos ADD CONSTRAINT DetalleIngresos_Tratamiento_paciente FOREIGN KEY DetalleIngresos_Tratamiento_paciente (Tratamiento_paciente_id_tratamiento)
    REFERENCES Tratamiento_paciente (id_tratamiento);

-- Reference: DetalleIngresos_detalleconsulta (table: DetalleIngresos)
ALTER TABLE DetalleIngresos ADD CONSTRAINT DetalleIngresos_detalleconsulta FOREIGN KEY DetalleIngresos_detalleconsulta (detalleconsulta_id_detalleconsulta)
    REFERENCES detalleconsulta (id_detalleconsulta);

-- Reference: DetalleIngresos_ingresos_productos (table: DetalleIngresos)
ALTER TABLE DetalleIngresos ADD CONSTRAINT DetalleIngresos_ingresos_productos FOREIGN KEY DetalleIngresos_ingresos_productos (ingresos_productos_id_ingresoP)
    REFERENCES ingresos_productos (id_ingresoP);

-- Reference: HistorialPaciente_detalleconsulta (table: HistorialPaciente)
ALTER TABLE HistorialPaciente ADD CONSTRAINT HistorialPaciente_detalleconsulta FOREIGN KEY HistorialPaciente_detalleconsulta (detalleconsulta_id_detalleconsulta)
    REFERENCES detalleconsulta (id_detalleconsulta);

-- Reference: PacienteN_TipoPaciente (table: PacienteN)
ALTER TABLE PacienteN ADD CONSTRAINT PacienteN_TipoPaciente FOREIGN KEY PacienteN_TipoPaciente (TipoPaciente_id_tipoPaciente)
    REFERENCES TipoPaciente (id_tipoPaciente);

-- Reference: PagoEmpleado_Empleado (table: PagoEmpleado)
ALTER TABLE PagoEmpleado ADD CONSTRAINT PagoEmpleado_Empleado FOREIGN KEY PagoEmpleado_Empleado (Empleado_id_empleado)
    REFERENCES Empleado (id_empleado);

-- Reference: PagoMateriales_Materiales (table: PagoMateriales)
ALTER TABLE PagoMateriales ADD CONSTRAINT PagoMateriales_Materiales FOREIGN KEY PagoMateriales_Materiales (Materiales_id_material)
    REFERENCES Materiales (id_material);

-- Reference: ServicioBasico_TipoServicio (table: ServicioBasico)
ALTER TABLE ServicioBasico ADD CONSTRAINT ServicioBasico_TipoServicio FOREIGN KEY ServicioBasico_TipoServicio (TipoServicio_id_tipoServicio)
    REFERENCES TipoServicio (id_tipoServicio);

-- Reference: Tratamiento_paciente_detalleconsulta (table: Tratamiento_paciente)
ALTER TABLE Tratamiento_paciente ADD CONSTRAINT Tratamiento_paciente_detalleconsulta FOREIGN KEY Tratamiento_paciente_detalleconsulta (detalleconsulta_id_detalleconsulta)
    REFERENCES detalleconsulta (id_detalleconsulta);

-- Reference: Usuario_TipoUsuario (table: Usuario)
ALTER TABLE Usuario ADD CONSTRAINT Usuario_TipoUsuario FOREIGN KEY Usuario_TipoUsuario (TipoUsuario_id_tipoUsuario)
    REFERENCES TipoUsuario (id_tipoUsuario);

-- Reference: detalleCompra_Proveedores (table: detalleCompra)
ALTER TABLE detalleCompra ADD CONSTRAINT detalleCompra_Proveedores FOREIGN KEY detalleCompra_Proveedores (Proveedores_id_proveedor)
    REFERENCES Proveedores (id_proveedor);

-- Reference: detalleCompra_productos (table: detalleCompra)
ALTER TABLE detalleCompra ADD CONSTRAINT detalleCompra_productos FOREIGN KEY detalleCompra_productos (productos_id_prodto)
    REFERENCES productos (id_prodto);

-- Reference: detalleconsulta_Consulta (table: detalleconsulta)
ALTER TABLE detalleconsulta ADD CONSTRAINT detalleconsulta_Consulta FOREIGN KEY detalleconsulta_Consulta (Consulta_id_consulta)
    REFERENCES Consulta (id_consulta);

-- Reference: detalleconsulta_extracciondiente (table: detalleconsulta)
ALTER TABLE detalleconsulta ADD CONSTRAINT detalleconsulta_extracciondiente FOREIGN KEY detalleconsulta_extracciondiente (extracciondiente_id_diente)
    REFERENCES extracciondiente (id_extraccion);

-- Reference: detalleconsulta_rellenodiente (table: detalleconsulta)
ALTER TABLE detalleconsulta ADD CONSTRAINT detalleconsulta_rellenodiente FOREIGN KEY detalleconsulta_rellenodiente (rellenodiente_id_diente)
    REFERENCES rellenodiente (id_relleno);

-- Reference: extracciondiente_diente (table: extracciondiente)
ALTER TABLE extracciondiente ADD CONSTRAINT extracciondiente_diente FOREIGN KEY extracciondiente_diente (diente_id_diente)
    REFERENCES diente (id_diente);

-- Reference: pagoEquipo_Equipo (table: pagoEquipo)
ALTER TABLE pagoEquipo ADD CONSTRAINT pagoEquipo_Equipo FOREIGN KEY pagoEquipo_Equipo (Equipo_id_equipo)
    REFERENCES Equipo (id_equipo);

-- Reference: pagoReparacion_ReparacionClinica (table: pagoReparacion)
ALTER TABLE pagoReparacion ADD CONSTRAINT pagoReparacion_ReparacionClinica FOREIGN KEY pagoReparacion_ReparacionClinica (ReparacionClinica_id_raparaClinica)
    REFERENCES ReparacionClinica (id_raparaClinica);

-- Reference: plan_trata_ortodon_Cefalometria (table: plan_trata_ortodon)
ALTER TABLE plan_trata_ortodon ADD CONSTRAINT plan_trata_ortodon_Cefalometria FOREIGN KEY plan_trata_ortodon_Cefalometria (Cefalometria_id_cefalometria)
    REFERENCES Cefalometria (id_cefalometria);

-- Reference: plan_trata_ortodon_Consulta (table: plan_trata_ortodon)
ALTER TABLE plan_trata_ortodon ADD CONSTRAINT plan_trata_ortodon_Consulta FOREIGN KEY plan_trata_ortodon_Consulta (Consulta_id_consulta)
    REFERENCES Consulta (id_consulta);

-- Reference: rellenodiente_diente (table: rellenodiente)
ALTER TABLE rellenodiente ADD CONSTRAINT rellenodiente_diente FOREIGN KEY rellenodiente_diente (diente_id_diente)
    REFERENCES diente (id_diente);

-- End of file.

