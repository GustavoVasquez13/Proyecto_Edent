package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ActualizarDatosBD {
    conexionBD con = new conexionBD();
    Connection cn = con.conectar();
    
    //metodo para actualizar los servicios registrados
    public void actualizarDatosServicios(String servicio, String proveedor, String correo, String tel, int cod){
        try{
            PreparedStatement pst = cn.prepareStatement("update tiposervicio set `nombre_servicio`=?,"
                    + "`proveedor_servicio`=?,`correo_provS`=?,`tel_provS`=? where id_tipoServicio='"+cod+"';");
            pst.setString(1, servicio);
            pst.setString(2, proveedor);
            pst.setString(3, correo);
            pst.setString(4, tel);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Se Modifico el registro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al Actualizar los datos de Servicio  "+ex);
            con.closeBd();
        }
    }
    
    //este metodo solo actualiza el correo y el telefono de los servicios basicos
    public void actualizarSB(String correo,String tel, int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update tiposervicio set `correo_provS`=?, `tel_provS`=? "
                    + "where id_tipoServicio='"+code+"';");
            pst.setString(1, correo);
            pst.setString(2, tel);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "SE MODIFICO EL REGISTRO CORRECTAMENTE");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN PROBLEMA AL ACTUALIZAR LOS DATOS DE SERVICIO "+e);
            con.closeBd();
        }
    }
}
