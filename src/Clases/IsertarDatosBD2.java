package Clases;

import formularios.frmServBasicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
      //metodo para insertar pacientes de ortodoncia a la tabla consulta se utiliza en el formulario ExpedienteOrtodoncia
    public void insertarPacienteOC(String motivoC, String fecha , String HistoriaM,String HistoriaO,
                                     String ExamenC, String DXodontologico,String tipo){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO consulta(`motivo_consulta`,"
                    + "`fecha_consulta`,`PacienteN_id_pacienteN`,`HistoriaM`,`HistoriaO`,"
                    + "`ExamenC`,`DXodon`) VALUES(?,?,?,?,?,?,?);");
            pps.setString(1, motivoC);
            pps.setString(2, fecha);
            pps.setString(3, tipo);
            pps.setString(4,HistoriaM );
            pps.setString(5, HistoriaO);
            pps.setString(6, ExamenC);
            pps.setString(7, DXodontologico);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
    }
}
