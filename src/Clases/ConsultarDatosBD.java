package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarDatosBD {
    
    public Integer totalRegistros; // Obtener los registros
    private String sSQL = ""; //Sentencia SQL para almacenar consulta
    conexionBD con = new conexionBD();
    Connection cn = con.conectar();
    
    // este metodo muestra los datos de los servicios registrados en la tabla del formulario frmServBasico
    public DefaultTableModel mostrarServicios() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulos
                = {"SERVICIO","PROVEEDOR", "CORREO","TELEFONO"};
        String[] registros = new String[4];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulos);
        //consulta para mostrar los datos de la base de datos
        sSQL = "SELECT  `nombre_servicio`,`proveedor_servicio`, `correo_provS`, `tel_provS` FROM tiposervicio;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("nombre_servicio");
                registros[1] = rs.getString("proveedor_servicio");
                registros[2] = rs.getString("correo_provS");
                registros[3] = rs.getString("tel_provS");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Servicios");
            con.closeBd();
            return null;
        }
    }
    
    //se muestran los proveedores registrados en el formulario frmCompraProducto
    public DefaultTableModel mostrarProveedores() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulos
                = {"CODIGO","NOMBRE","DIRECCION", "CORREO","TELEFONO"};
        String[] registros = new String[5];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulos);
        //consulta para mostrar los datos de la base de datos
        sSQL = "SELECT * FROM proveedores;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_proveedor");
                registros[1] = rs.getString("nombre_prov");
                registros[2] = rs.getString("direccion_prov");
                registros[3] = rs.getString("correo_prov");
                registros[4] = rs.getString("tel_prov");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de proveedores");
            con.closeBd();
            return null;
        }
    }
    
    //muestra lo sproductos registrados en la tabla del form frmComprarProducto
    public DefaultTableModel mostrarProductos() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulos
                = {"CODIGO","NOMBRE","DESCRIPCION"};
        String[] registros = new String[3];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulos);
        //consulta para mostrar los datos de la base de datos
        sSQL = "SELECT * FROM productos;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_prodto");
                registros[1] = rs.getString("nombre_prodto");
                registros[2] = rs.getString("descripcion_prodto");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Productos");
            con.closeBd();
            return null;
        }
    }
    
    //este metodo extrae el codigo del servicio para poder modificarlo en frmServicioBasico
    public int codServicio(String servicio, String proveedor){
        sSQL = "SELECT `id_tipoServicio` FROM `tiposervicio` WHERE `nombre_servicio`='"+servicio+"' and `proveedor_servicio`='"+proveedor+"';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while(rs.next()){
                int cod = rs.getInt("id_tipoServicio");
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
    
    // este metodo muestra los datos de los pacientes registrados en la tabla tipopaciente
    public DefaultTableModel mostrarTipoPaciente() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulo
                = {"Codigo","Tipo de Paciente"};
        String[] registros = new String[2];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulo);
        //consulta para mostrar los datos de la base de datos
        sSQL = "SELECT * FROM tipopaciente;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_tipoPaciente");
                registros[1] = rs.getString("nombre_tipo");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Tipos de Paciente");
            con.closeBd();
            return null;
        }
    }
    
    //este metodo valida qsi existe un servicio registrado en  la base de datos
    public boolean valExistServicio(String serv, String prov) {
        try{
            PreparedStatement pstm = cn.prepareStatement("SELECT `nombre_servicio`,`proveedor_servicio` FROM tiposervicio"
                    + " WHERE `nombre_servicio`='"+serv+"' and `proveedor_servicio`='"+prov+"';");
            ResultSet res = pstm.executeQuery();
            if(res.next()){
                  return true;
            } else{
            return false;
            }
            //con.closeBd();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            con.closeBd();
        }
        con.closeBd();
        return true;
    }
    
    //este metodo valida que ya exista un empleado registrado en la base de datos y es usado en el formulario de empleados
    public boolean valExistEmpleado(String dui){
        try{
            PreparedStatement pst2 = cn.prepareStatement("select dui_empl from empleado "
                    + "where `dui_empl`='"+dui+"';");

            ResultSet res2 = pst2.executeQuery();
            if(res2.next()){
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            con.closeBd();
        }
        con.closeBd();
        return true;
    }
    
    public DefaultTableModel mostrarEmpleado(){
        DefaultTableModel modelo;
        String [] titulo = {"NOMBRE","APELLIDO","CORREO","TELEFONO","DUI","CARGO"};
        String [] registros = new String[6];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null,titulo);
        sSQL = "SELECT `nombre_empl`,`apellido_empl`,`correo_empl`,`tel_empl`,`dui_empl`,`cargo_empl` FROM `empleado`;";
        try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
                //registros[0] = rs.getString("id_empleado");
                registros[0] = rs.getString("nombre_empl");
                registros[1] = rs.getString("apellido_empl");
                registros[2] = rs.getString("correo_empl");
                registros[3] = rs.getString("tel_empl");
                registros[4] = rs.getString("dui_empl");
                registros[5] = rs.getString("cargo_empl");
//                registros[7] = rs.getString("sueldo_empl");
//                registros[8] = rs.getString("fecha_inicio");
//                registros[9] = rs.getString("estado_empl");
               totalRegistros = totalRegistros+1;
               modelo.addRow(registros);
           }
           con.closeBd();
           return modelo;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "problemas al consultar los datos del Empleado");
            con.closeBd();
            return null;
        }
    }
    
     // este metodo muestra los datos de los pacientes registrados en la tabla pacienten
    public DefaultTableModel mostrarPacientes() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulo
                = {"Id","Nombre","Apellido","Direccion", "Telefono","Edad"};
        String[] registros = new String[6];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulo);
        //consulta para mostrar los datos de la base de datos
        sSQL = "SELECT * FROM pacienten ORDER BY `apellido_pacte` ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_pacienteN");
                registros[1] = rs.getString("nombre_pacte");
                registros[2] = rs.getString("apellido_pacte");
                registros[3] = rs.getString("direccion_pacte");
                registros[4] = rs.getString("tel_pacte");
                registros[5] = rs.getString("edad");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Tipos de Paciente");
            con.closeBd();
            return null;
        }
    }
 
}
