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
    
    //metodo para modificar un empleado ya registrado
    public void actualizarEmpl(String nombre,String apellido,String direccion,String correo,
            String tel,String cargo,String dui,double sueldo,String pasofecha,String estado, int cod){
        try{
           PreparedStatement pst = cn.prepareStatement("update empleado set `nombre_empl`=?,`apellido_empl`=?,`direccion_empl`=?,`correo_empl`=?,`tel_empl`=?,"
                   + "`cargo_empl`=?,`sueldo_empl`=?,`fecha_inicio`=?,`dui_empl`=?,`estado_empl`=? where id_empleado='"+cod+"';");
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
            con.closeBd();
            JOptionPane.showMessageDialog(null, "SE MODIFICO EL REGISTRO CORRECTAMENTE");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN PROBLEMA AL ACTUALIZAR LOS DATOS DEL EMPLEADO");
            con.closeBd();
        }
    }
    
    //este metodo hace un cambio de estado en el empleado para ponerlo como inactivo 
    public void inactivarEmpl(String dui){
        try{
            PreparedStatement pst = cn.prepareStatement("update empleado set estado_empl='INACTIVO' where dui_empl='"+dui+"';");
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "EMPLEADO ELIMINADO CORRECTAMENTE");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN PROBLEMA AL ELIMINAR EL EMPLEADO "+e);
            con.closeBd();
        }
    }
    
    //metodo para actualizar materiales
    public void ActualizarMaterial(String nombre,String desc,String tipo,int cant,double costo,int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update materiales set `nombre_material`=?,"
                    + "`descripcion_material`=?,`tipo_material`=?,`cantidad`=?,`costo_material`=? where id_material='"+code+"';");
            pst.setString(1, nombre);
            pst.setString(2, desc);
            pst.setString(3, tipo);
            pst.setInt(4, cant);
            pst.setDouble(5, costo);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Se Modifico el registro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al Actualizar los datos de Servicio  "+ex);
            con.closeBd();
        }
    }
    
    //metodo para actualizar las reparaciones realizadas a la clinica
    public void actuReparacion(String repa,String desc, int cod){
       try{
            PreparedStatement pst = cn.prepareStatement("update reparacionclinica set tipo_reparacion=?,descrip_reparacion=? "
                    + "where id_raparaClinica='"+cod+"';");
            pst.setString(1, repa);
            pst.setString(2, desc);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos modifico Exitosamente");
            con.closeBd();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "PROBLEMAS AL INGRESAR LOS DATOS DE REPARACION "+e);
           con.closeBd();
       }
    }
    
    //metodo para actualizar equipo
    public void ActualizarEq(String eq,String desc,String tipo,int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update equipo set `tipo_equipo`=?,"
                    + "`descripcion_equipo`=?,`estado_equipo`=? where id_equipo='"+code+"';");
            pst.setString(1, eq);
            pst.setString(2, desc);
            pst.setString(3, tipo);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Se Modifico el registro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al Actualizar los datos de Servicio  "+ex);
            con.closeBd();
        }
    }
}
