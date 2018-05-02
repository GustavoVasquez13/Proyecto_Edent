package Clases;

import formularios.frmServBasicos;
import java.sql.Connection;
//import java.sql.Date;
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
            PreparedStatement pps = cn.prepareStatement("INSERT INTO tiposervicio(`nombre_servicio`,"
                    + "`proveedor_servicio`,`correo_provS`,`tel_provS`) VALUES(?,?,?,?);");
            pps.setString(1, servicio);
            pps.setString(2, proveedor);
            pps.setString(3, correo);
            pps.setString(4, telefono);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
    }
    //Este metodo nos permite ingresar nuevos usuarios
    public void insertUsuarioA(String nom,String apel,String us,String cont,String tip,String corre){
     try {
            PreparedStatement pst = cn.prepareStatement( "INSERT INTO usuario (`nombre_usuario`,`apellido_usuario`"
                    + ",`usuario`,`clave`,`TipoUsuario_id_tipoUsuario`,`correo_usuario`) "
                    + "VALUES(?,?,?,?,?,?);");
            pst.setString(1, nom);
            pst.setString(2, apel);
            pst.setString(3, us);
            pst.setString(4, cont);
            pst.setString(5, tip);
            pst.setString(6, corre);

             pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
     }
     //Este metodo es utilizado para insertar el tipo de usuario administrador el el primer inicio de sesion
    public void insertTipoU(String ti){
     try {
           PreparedStatement pst = cn.prepareStatement("INSERT INTO tipousuario (`tipo_usuario`) "
                + "VALUES(?);");
            pst.setString(1, ti);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");    
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
     }
    //Este medoto inserta un nuevo proveedor a la base de datos en el formulario frmProveedores 
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
            JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
    }
//este metodo inserta los productos en la base de datos en el formulario frmProducto
    public void insertProductos(String nombre,String descripcion){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO productos"
                    + "(`nombre_prodto`,`descripcion_prodto`) "
                    + "VALUES(?,?);");
            pps.setString(1, nombre);
            pps.setString(2, descripcion);
            pps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
    }   
    //metodo para insertar pacientes generales a la tabla pacienten se utiliza en el formulario ExpedienteGeneral
     public void insertarPaciente(String nombre, String apellido ,String direccion, String telefono,String edad,String tipo){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO pacienten(`nombre_pacte`,`apellido_pacte`,"
                    + "`direccion_pacte`,`tel_pacte`,`DientesPacte_id_diente`,`TipoPaciente_id_tipoPaciente`,`edad`)"
                    + "VALUES(?,?,?,?,?,?,?);");
            pps.setString(1, nombre);
            pps.setString(2, apellido);
            pps.setString(3, direccion);
            pps.setString(4, telefono);
            pps.setString(5, "1");
            pps.setString(6, tipo);
            pps.setString(7, edad);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
    }
   //metodo para insertar pacientes de ortodoncia a la tabla pacienten se utiliza en el formulario ExpedieneOrtodoncia
    public void insertarPacienteO(String nombre, String apellido ,String direccion, String telefono,String edad,String tipo){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO pacienten(`nombre_pacte`,`apellido_pacte`,"
                    + "`direccion_pacte`,`tel_pacte`,`DientesPacte_id_diente`,`TipoPaciente_id_tipoPaciente`,`edad`) "
                    + "VALUES(?,?,?,?,?,?,?);");
            pps.setString(1, nombre);
            pps.setString(2, apellido);
            pps.setString(3, direccion);
            pps.setString(4, telefono);
            pps.setString(5, "1");
            pps.setString(6, tipo);
            pps.setString(7, edad);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
    }  
    //metodo para insertar pacientes generales a la tabla consulta se utiliza en el formulario ExpedienteGeneral
    public void insertarPacienteGC(String motivoC, String fecha ,Double presupuesto, String HistoriaM,String HistoriaO,
                                     String ExamenC, String DXodontologico,String tipo){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO consulta(`motivo_consulta`,"
                    + "`fecha_consulta`,`PacienteN_id_pacienteN`,`Total_pagar`,`HistoriaM`,`HistoriaO`,"
                    + "`ExamenC`,`DXodon`) VALUES(?,?,?,?,?,?,?,?);");
            pps.setString(1, motivoC);
            pps.setString(2, fecha);
            pps.setString(3, tipo);
            pps.setDouble(4, presupuesto);
            pps.setString(5,HistoriaM );
            pps.setString(6, HistoriaO);
            pps.setString(7, ExamenC);
            pps.setString(8, DXodontologico);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
    }
   //metodo para insertar un pago de los servicios basicos
    public void insertPagoServicioBasic(String servicio,String proveedor,double costo,String fecha){
        try {
            PreparedStatement pps = cn.prepareStatement("insert into serviciobasico(`costo_servicio`,"
                    + "`fechaPago_servicio`,`TipoServicio_id_tipoServicio`) VALUES(?,?,"
                    + "(select id_tipoServicio from tiposervicio where nombre_servicio='"+servicio+""
                            + "' and proveedor_servicio='"+proveedor+"'));");
            pps.setDouble(1, costo);
            pps.setString(2, fecha);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            con.closeBd();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
    }
   //este metodo inserta los productos en la base de datos y es utilizado por el formulario frmComprarProductos
    public void insertComprasProduc(int idProd, double costo, int cantidad, String marca, 
            String fechaComp, int idProv){
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO  detallecompra"
                    + "(`productos_id_prodto`, `costo_prodto`, "
                    + "`cantidad_prodto`, `marca_producto`, `fecha_compra`, "
                    + "`Proveedores_id_proveedor`)"+ "VALUES(?,?,?,?,?,?);");
            pps.setInt(1, idProd);
            pps.setDouble(2, costo);
            pps.setInt(3, cantidad);
            pps.setString(4, marca);
            pps.setString(5, fechaComp);
            pps.setInt(6, idProv);
            pps.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
    }
       //este metodo ingresa nuevos tipos de pacientes a la BD
   public void insertarTipoPaciente(String tipo){
     try {
           PreparedStatement pst = cn.prepareStatement("INSERT INTO tipopaciente (`nombre_tipo`) "
                + "VALUES(?);");
            pst.setString(1, tipo);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");    
            con.closeBd();
        } catch (SQLException ex) {
            Logger.getLogger(frmServBasicos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas al Ingresar datos "+ex);
            con.closeBd();
        }
     }
}
