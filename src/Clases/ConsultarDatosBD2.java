package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarDatosBD2 {
    public Integer totalRegistros; // Obtener los registros
    private String sSQL = ""; //Sentencia SQL para almacenar consulta
    conexionBD con = new conexionBD();
    Connection cn = con.conectar();
    
    //este metodo muestra en una tabla del formulario frmmateriales los datos de un material ingresado
    public DefaultTableModel mostrarM(){
       DefaultTableModel modelo;
       String[] titulos = {"NOMBRE","DESCRIPCION","TIPO","CANTIDAD","COSTO UNITARIO"};
       String[] registros = new String[5];
       totalRegistros = 0;
       
       modelo = new DefaultTableModel(null,titulos);
       sSQL = "select * from materiales;";
       
       try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
               registros[0] = rs.getString("nombre_material");
               registros[1] = rs.getString("descripcion_material");
               registros[2] = rs.getString("tipo_material");
               registros[3] = rs.getString("cantidad");
               registros[4] = rs.getString("costo_material");
               totalRegistros = totalRegistros + 1;
               modelo.addRow(registros);
           }
           con.closeBd();
           return modelo;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE MATERIALES");
           con.closeBd();
           return null;
       }
    }
    
    //este metodo muestra los ussuarios que tienen acceso al sistema
    public DefaultTableModel mostrarus(){
       DefaultTableModel modelo;
       String[] titulos = {"NOMBRE","APELLIDO","USUARIO","CORREO","TIPO USUARIO"};
       String[] registros = new String[5];
       totalRegistros = 0;
       
       modelo = new DefaultTableModel(null,titulos);
       sSQL = "select nombre_usuario,apellido_usuario,usuario,correo_usuario,tipo_usuario from usuario inner join tipousuario on TipoUsuario_id_tipoUsuario=id_tipoUsuario;";
       
       try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
               registros[0] = rs.getString("nombre_usuario");
               registros[1] = rs.getString("apellido_usuario");
               registros[2] = rs.getString("usuario");
               registros[3] = rs.getString("correo_usuario");
               registros[4] = rs.getString("tipo_usuario");
               totalRegistros = totalRegistros + 1;
               modelo.addRow(registros);
           }
           con.closeBd();
           return modelo;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE USUARIOS");
           con.closeBd();
           return null;
       }
    }
    
    //este metodo es para extraer el codigo de de materiales para usarse en la edicion del frmMateriales
    public int codMaterial(String nombre,String desc){
        try{
           sSQL = "select id_material from materiales where nombre_material='"+nombre+"' and descripcion_material='"+desc+"';"; 
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
               int cod = rs.getInt("id_material");
               return cod;
           }
           con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR EL CODIGO DE MATERIAL "+e);
            con.closeBd();
            return 0;
        }
        return 0;
    }
    
    //metodo para consultar las reparaciones realizadas
    public DefaultTableModel mostRepa(){
        DefaultTableModel modelo;
        String[] titulos = {"REPARACION","DESCRIPCION"};
        String[] registros = new String[2];
        modelo = new DefaultTableModel(null,titulos);
        
        try{
           sSQL = "select * from  reparacionclinica";
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           
           while(rs.next()){
               registros[0] = rs.getString("tipo_reparacion");
               registros[1] = rs.getString("descrip_reparacion");
               
               modelo.addRow(registros);
           }
           con.closeBd();
           return modelo;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE REPARACION "+e);
            con.closeBd();
            return null;
        }
    }
    
    //este metodo es para extraer el codigo de de materiales para usarse en la edicion del frmMateriales
    public int codRepa(String repa,String desc){
        try{
           sSQL = "select id_raparaClinica from reparacionclinica where tipo_reparacion='"+repa+"' and descrip_reparacion='"+desc+"';"; 
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
               int cod = rs.getInt("id_raparaClinica");
               return cod;
           }
           con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR EL CODIGO DE MATERIAL "+e);
            con.closeBd();
            return 0;
        }
        return 0;
    }
    
    //este metodo muestra en una tabla del formulario frmmateriales los datos de un material ingresado
    public DefaultTableModel mostrarE(){
       DefaultTableModel modelo;
       String[] titulos = {"EQUIPO","DESCRIPCION","ESTADO"};
       String[] registros = new String[3];

       modelo = new DefaultTableModel(null,titulos);
       sSQL = "select * from equipo;";
       
       try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
               registros[0] = rs.getString("tipo_equipo");
               registros[1] = rs.getString("descripcion_equipo");
               registros[2] = rs.getString("estado_equipo");

               modelo.addRow(registros);
           }
           con.closeBd();
           return modelo;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE MATERIALES");
           con.closeBd();
           return null;
       }
    }
    
    //este metodo es para extraer el codigo de de materiales para usarse en la edicion del frmMateriales
    public int codEquipo(String eq,String desc,String estado){
        try{
           sSQL = "select id_equipo from equipo where tipo_equipo='"+eq+"' and descripcion_equipo='"+desc+"' and estado_equipo='"+estado+"';"; 
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
               int cod = rs.getInt("id_equipo");
               return cod;
           }
           con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR EL CODIGO DE MATERIAL "+e);
            con.closeBd();
            return 0;
        }
        return 0;
    }
    
    public DefaultTableModel mostrarEmpleado(String estado){
        DefaultTableModel modelo;
        String [] titulo = {"NOMBRE","APELLIDO","DIRECCION","CORREO","TELEFONO","CARGO","SUELDO","DUI","INICIO","ESTADO"};
        String [] registros = new String[10];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null,titulo);
        
        sSQL = "SELECT * FROM `empleado` where `estado_empl`='"+estado+"';";
        try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
                registros[0] = rs.getString("nombre_empl");
                registros[1] = rs.getString("apellido_empl");
                registros[2] = rs.getString("direccion_empl");
                registros[3] = rs.getString("correo_empl");
                registros[4] = rs.getString("tel_empl");
                registros[5] = rs.getString("cargo_empl");
                registros[6] = rs.getString("sueldo_empl");
                registros[7] = rs.getString("dui_empl");
                registros[8] = rs.getString("fecha_inicio");
                registros[9] = rs.getString("estado_empl");
               totalRegistros = totalRegistros+1;
               modelo.addRow(registros);
           }
           con.closeBd();
           return modelo;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "problemas al consultar los datos del Empleado "+ex);
            con.closeBd();
            return null;
        }
    }
    
    //este metodo muestra en una tabla del formulario frmmateriales los datos de un material ingresado
    public DefaultTableModel mostrarPago(String tipo,String consulta,String tipoP,String costo,String fecha){
       DefaultTableModel modelo;
       String[] titulos = {tipo,"TOTAL PAGADO","FECHA DE PAGO"};
       String[] registros = new String[3];

       modelo = new DefaultTableModel(null,titulos);
//       sSQL = "select nombre_servicio,costo_servicio,fechaPago_servicio from serviciobasico " +
//                "inner join tiposervicio on TipoServicio_id_tipoServicio=id_tipoServicio;";
       
       try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(consulta);
           while(rs.next()){
               registros[0] = rs.getString(tipoP);
               registros[1] = rs.getString(costo);
               registros[2] = rs.getString(fecha);

               modelo.addRow(registros);
           }
           con.closeBd();
           return modelo;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE PAGOS");
           con.closeBd();
           return null;
       }
    }
    

    //este metodo extrae el codigo del servicio para poder modificarlo en frmServicioBasico
    public int codusuario(String nom, String ape,String correo){
        sSQL = "SELECT `id_usuario` FROM `usuario` WHERE `nombre_usuario`='"+nom+"' and `apellido_usuario`='"+ape+"' and `correo_usuario`='"+correo+"';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while(rs.next()){
                int cod = rs.getInt("id_usuario");
                return cod;
            }
            con.closeBd();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Problemas al consultar los datos de servicio");
            con.closeBd();
            return 0;
        }
        return 0;
    }
    
     // este metodo muestra los datos de los pacientes registrados en la tabla pacienten
    public DefaultTableModel mostrarPacientesConsulta() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulo
                = {"ID Consulta","Nombre","Apellido","Motivo Consulta", "Historia Medica","Historia Odontologica","Examen Clinico","DX Odontologico","Total a pagar"};
        String[] registros = new String[9];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulo);
        //consulta para mostrar los datos de la base de datos
        sSQL = "select id_consulta,nombre_pacte,apellido_pacte, motivo_consulta, HistoriaM, HistoriaO, ExamenC, DXodon, Total_pagar from pacienten " +
                "inner join consulta on pacienten.id_pacienteN = consulta.PacienteN_id_pacienteN where TipoPaciente_id_tipoPaciente = '1'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_consulta");
                registros[1] = rs.getString("nombre_pacte");
                registros[2] = rs.getString("apellido_pacte");
                registros[3] = rs.getString("motivo_consulta");
                registros[4] = rs.getString("HistoriaM");
                registros[5] = rs.getString("HistoriaO");
                registros[6] = rs.getString("ExamenC");
                registros[7] = rs.getString("DXodon");
                registros[8] = rs.getString("Total_pagar");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Paciente");
            con.closeBd();
            return null;
        }
    }
    
    // este metodo muestra los datos de los pacientes registrados en la tabla pacienten
    public DefaultTableModel mostrarPacientesConsultaO() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulo
                = {"ID Consulta","Nombre","Apellido","Motivo Consulta", "Historia Medica","Historia Odontologica","Examen Clinico","DX Odontologico"};
        String[] registros = new String[8];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulo);
        //consulta para mostrar los datos de la base de datos
        sSQL = "select id_consulta,nombre_pacte,apellido_pacte, motivo_consulta, HistoriaM, HistoriaO, ExamenC, DXodon from pacienten " +
                "inner join consulta on pacienten.id_pacienteN = consulta.PacienteN_id_pacienteN where TipoPaciente_id_tipoPaciente = '2'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_consulta");
                registros[1] = rs.getString("nombre_pacte");
                registros[2] = rs.getString("apellido_pacte");
                registros[3] = rs.getString("motivo_consulta");
                registros[4] = rs.getString("HistoriaM");
                registros[5] = rs.getString("HistoriaO");
                registros[6] = rs.getString("ExamenC");
                registros[7] = rs.getString("DXodon");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Paciente");
            con.closeBd();
            return null;
        }
    }
    
    
    // este metodo muestra los datos de los pacientes registrados en la tabla pacienten
    public DefaultTableModel mostrarPacientesConsultaOrtodoncia() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulo
                = {"ID Cefalometria","ID ortodoncia","Nombre","Apellido", "articular","impa","jarabak","facial"
                  ,"is","ii", "fhis","anb82", "anb80", "anb2", "pals", "pali","ptb", "speedleve","speemoderada"
                  ,"speesevera","dsd","clasim","entornod","bandas","tubos","otros","aparato","exodoncia","brakets"
                  ,"retenciones", "arcos", "md","f_facieles","f_intraorales","modelo_mx","modelo_md","rx_panoramica"
                  , "rx_cefalometrica","rx_incicivos","rx_rocabado"};
        String[] registros = new String[8];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulo);
        //consulta para mostrar los datos de la base de datos
        sSQL = "select id_consulta,nombre_pacte,apellido_pacte, motivo_consulta, HistoriaM, HistoriaO, ExamenC, DXodon from pacienten " +
                "inner join consulta on pacienten.id_pacienteN = consulta.PacienteN_id_pacienteN where TipoPaciente_id_tipoPaciente = '2'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_consulta");
                registros[1] = rs.getString("nombre_pacte");
                registros[2] = rs.getString("apellido_pacte");
                registros[3] = rs.getString("motivo_consulta");
                registros[4] = rs.getString("HistoriaM");
                registros[5] = rs.getString("HistoriaO");
                registros[6] = rs.getString("ExamenC");
                registros[7] = rs.getString("DXodon");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Paciente");
            con.closeBd();
            return null;
        }
    }
}
