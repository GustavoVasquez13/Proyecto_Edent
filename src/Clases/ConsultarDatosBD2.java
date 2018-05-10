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
}
