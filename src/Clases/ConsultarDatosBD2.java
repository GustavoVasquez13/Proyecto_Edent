package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
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
       String[] titulos = {"NOMBRE","DESCRIPCION","TIPO","CANTIDAD","COSTO"};
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
       String[] titulos = {"NOMBRE","APELLIDO","USUARIO","CLAVE","CORREO"};
       String[] registros = new String[5];
       totalRegistros = 0;
       
       modelo = new DefaultTableModel(null,titulos);
       sSQL = "select * from usuario;";
       
       try{
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery(sSQL);
           while(rs.next()){
               registros[0] = rs.getString("nombre_usuario");
               registros[1] = rs.getString("apellido_usuario");
               registros[2] = rs.getString("usuario");
               registros[3] = rs.getString("clave");
               registros[4] = rs.getString("correo_usuario");
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
}
