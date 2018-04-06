package Clases;

import Formularios.frmServBasicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

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
     public void insertUsuarioA(String nom,String apel,String us,String con,String tip,String corre){
     try {
            PreparedStatement pst = cn.prepareStatement( "INSERT INTO usuario (`nombre_usuario`,`apellido_usuario`,`usuario`,`clave`,`TipoUsuario_id_tipoUsuario`,`correo_usuario`) "
            + "VALUES(?,?,?,?,?,?);");

        

            
            pst.setString(1, nom);
            pst.setString(2, apel);
            pst.setString(3, us);
            pst.setString(4, con);
            pst.setString(5, tip);
            pst.setString(6, corre);

             pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
        }
     }
     public void insertTipoU(String ti){
     try {
           PreparedStatement pst = cn.prepareStatement("INSERT INTO tipousuario (`tipo_usuario`) "
            + "VALUES(?);");

           

           
            pst.setString(1, ti);
               pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
        }
     }

     public void insertProveedor(String servicio,String direccion,String correo,String telefono){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO proveedores"
                    + "(`nombre_prov`,`direccion_prov`,`correo_prov`,`tel_prov`) "
                    + "VALUES(?,?,?,?);");
            pps.setString(1, servicio);
            pps.setString(2, direccion);
            pps.setString(3, correo);
            pps.setString(4, telefono);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
        }
    }    
    //este metodo inserta los productos en la base de datos
    public void insertProductos(String servicio,String descripcion){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO productos"
                    + "(`nombre_prodto`,`descripcion_prodto`) "
                    + "VALUES(?,?);");
            pps.setString(1, servicio);
            pps.setString(2, descripcion);
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
        }
    }
}
