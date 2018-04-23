package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class IsertarDatosBD2 {
    conexionBD con = new conexionBD();
    Connection cn = con.conectar();
    
    //este metodo inserta los datos de los empleados recividos del form empleados
    public void insertDatosEmpleado(String nombre,String apellido,String direccion,String correo,
            String tel,String cargo,String dui,double sueldo,String pasofecha,String estado){
        try{
            PreparedStatement pst = cn.prepareStatement("insert into empleado(`nombre_empl`,`apellido_empl`,`direccion_empl`,`correo_empl`,`tel_empl`,"
                    + "`cargo_empl`,`sueldo_empl`,`fecha_inicio`,`dui_empl`,`estado_empl`) values(?,?,?,?,?,?,?,?,?,?);");
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, direccion);
            pst.setString(4, correo);
            pst.setString(5, tel);
            pst.setString(6, cargo);
            pst.setDouble(7, sueldo);
            pst.setString(8, pasofecha);
            pst.setString(9, dui);
            pst.setString(10, estado);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar los Datos del empleado");
            con.closeBd();
        }
    }
}
