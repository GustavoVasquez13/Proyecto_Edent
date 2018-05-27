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
    public void inactivarEmpl(String dui,String estado){
        try{
            PreparedStatement pst = cn.prepareStatement("update empleado set estado_empl='"+estado+"' where dui_empl='"+dui+"';");
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "EMPLEADO MOVIDO CORRECTAMENTE");
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
    
    //metodo para actualoizar productos
    public void ActualizarProd(String nomb,String desc, int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update productos set `nombre_prodto`=?,"
                    + "`descripcion_prodto`=? where id_prodto='"+code+"';");
            pst.setString(1, nomb);
            pst.setString(2, desc);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Producto actiualizado correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar los datos del producto  "+ex);
            con.closeBd();
        }
    }
    
    //metodo para actualoizar proveedores
    public void ActualizarProvee(String nomb,String direc, String correo, String tel, int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update proveedores set `nombre_prov`=?,"
                    + "`direccion_prov`=?, `correo_prov`=?,`tel_prov`=?  where id_proveedor='"+code+"';");
            pst.setString(1, nomb);
            pst.setString(2, direc);
            pst.setString(3, correo);
            pst.setString(4, tel);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Proveedor actiualizado correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar los datos del proveedor  "+ex);
            con.closeBd();
        }
    }
    
    //metodo para actualizar equipo
    public void ActualizarPacienteG(String nombre,String apellido,String direccion,String telefono,String edad,int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update pacienten set `nombre_pacte`=?,"
                    + "`apellido_pacte`=?,`direccion_pacte`=?,`tel_pacte`=?,`edad`=? where id_pacienteN='"+code+"';");
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, direccion);
            pst.setString(4, telefono);
            pst.setString(5, edad);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Se Modifico el registro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al Actualizar los datos de Servicio  "+ex);
            con.closeBd();
        }
    }
    
    //metodo para actualizar equipo
    public void ActualizarUsu(String nom,String ape,String usuario,String clav,String correo,String tipo,int cod){
        try{
            PreparedStatement pst = cn.prepareStatement("update usuario set `nombre_usuario`=?,"
                    + "`apellido_usuario`=?,`usuario`=?,`clave`=?,`correo_usuario`=?,TipoUsuario_id_tipoUsuario=(select id_tipoUsuario from tipousuario where tipo_usuario='"+tipo+"')"
                    + " where id_usuario='"+cod+"';");
            pst.setString(1, nom);
            pst.setString(2, ape);
            pst.setString(3, usuario);
            pst.setString(4, clav);
            pst.setString(5, correo);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Se Modifico el registro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al Actualizar los datos de usuario  "+ex);
            con.closeBd();
        }
    }
    
    //metodo para actualizar equipo
    public void ActualizarConsultaPG(String motivo_consulta,String Total_pagar,String HistoriaM,String HistoriaO,String ExamenC,String DXodon,int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update consulta set `motivo_consulta`=?,"
                    + "`Total_pagar`=?,`HistoriaM`=?,`HistoriaO`=?,`ExamenC`=?,`DXodon`=?  where id_consulta='"+code+"';");
            pst.setString(1, motivo_consulta);
            pst.setString(2, Total_pagar);
            pst.setString(3, HistoriaM);
            pst.setString(4, HistoriaO);
            pst.setString(5, ExamenC);
            pst.setString(6, DXodon);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Se Modifico el registro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al Actualizar los datos de Servicio  "+ex);
            con.closeBd();
        }
    }
    
     //metodo para actualizar equipo
    public void ActualizarConsultaPO(String motivo_consulta,String HistoriaM,String HistoriaO,String ExamenC,String DXodon,int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update consulta set `motivo_consulta`=?,"
                    + "`HistoriaM`=?,`HistoriaO`=?,`ExamenC`=?,`DXodon`=?  where id_consulta='"+code+"';");
            pst.setString(1, motivo_consulta);
            pst.setString(2, HistoriaM);
            pst.setString(3, HistoriaO);
            pst.setString(4, ExamenC);
            pst.setString(5, DXodon);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Se Modifico el registro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al Actualizar los datos de Servicio  "+ex);
            con.closeBd();
        }
    }
    
     //metodo para actualizar equipo
    public void ActualizarCefalometria(String articular,String goniaco,String impa,String jarabak,String facial,
           String is,String ii,String fhis,String anb82,String anb80, String anb2,String pals,String pali,
           String ptb,String dsd,String clasim,String entornod,int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update cefalometria set `articular`=?,"
                    + "`goniaco`=?,`impa`=?,`jarabak`=?,`facial`=?, `is`=?,"
                    + "`ii`=?,`fhis`=?,`anb82`=?,`anb80`=?, `anb2`=?,`pals`=?,`pali`=?,`ptb`=?, `dsd`=?,"
                    + "`clasim`=?, `entornod`=? where id_cefalometria='"+code+"';");
            pst.setString(1, articular);
            pst.setString(2, goniaco);
            pst.setString(3, impa);
            pst.setString(4, jarabak);
            pst.setString(5, facial);
            pst.setString(6, is);
            pst.setString(7, ii);
            pst.setString(8, fhis);
            pst.setString(9, anb82);
            pst.setString(10, anb80);
            pst.setString(11, anb2);
            pst.setString(12, pals);
            pst.setString(13, pali);
            pst.setString(14, ptb);
            pst.setString(15, dsd);
            pst.setString(16, clasim);
            pst.setString(17, entornod);

            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Se Modifico el registro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al Actualizar los datos de Servicio  "+ex);
            con.closeBd();
        }
    }
    
     //metodo para actualizar equipo
    public void ActualizarPlanTrata(String bandas,String tubos,String otros,String aparato,String exodoncia,
            String brackets,String retenciones,String arcos,String md,String rx_rocabado,int code){
        try{
            PreparedStatement pst = cn.prepareStatement("update plan_trata_ortodon set `bandas`=?,"
                    + "`tubos`=?,`otros`=?,`aparato`=?,`exodoncia`=?, `brackets`=?,"
                    + "`retenciones`=?,`arcos`=?,`md`=?,`rx_rocabado`=?  where id_ortodoncia='"+code+"';");
            pst.setString(1, bandas);
            pst.setString(2, tubos);
            pst.setString(3, otros);
            pst.setString(4, aparato);
            pst.setString(5, exodoncia);
            pst.setString(6, brackets);
            pst.setString(7, retenciones);
            pst.setString(8, arcos);
            pst.setString(9, md);
            pst.setString(10, rx_rocabado);
            pst.executeUpdate();
            con.closeBd();
            JOptionPane.showMessageDialog(null, "Se Modifico el registro correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al Actualizar los datos de Servicio  "+ex);
            con.closeBd();
        }
    }
}
