package Clases;

import Formularios.frmServBasicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InsertarDatosBD {
    conexionBD con = new conexionBD();
    Connection cn = con.conectar();
    
    //este metodo ingresa los datos recopilados del formulario de servicios basicos en la BD
    public void insertServicioBasic(String servicio,String proveedor,String correo,String telefono){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO tiposervicio(`nombre_servicio`,`proveedor_servicio`,`correo_provS`,`tel_provS`) "
                    + "VALUES(?,?,?,?);");
            pps.setString(1, servicio);
            pps.setString(2, proveedor);
            pps.setString(3, correo);
            pps.setString(4, telefono);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
        }
    }
}
