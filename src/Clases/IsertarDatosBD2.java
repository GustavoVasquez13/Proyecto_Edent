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
    
    //metodo para ingresar el pago de un empleado
    public void insertPagoEmple(String nombre,String dui,double costo,String fecha){
        try{
            PreparedStatement pps = cn.prepareStatement("insert into  pagoempleado(`sueldo_empl`,"
                    + "`fechaPago_empl`,`Empleado_id_empleado`) VALUES(?,?,"
                    + "(select id_empleado from  empleado where nombre_empl='"+nombre+"' and dui_empl='"+dui+"'));");
            pps.setDouble(1, costo);
            pps.setString(2, fecha);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS DEL EMPLEADO GUARDADOS CORRECTAMENTE");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL REALIZAR EL PAGO DEL EMPLEADO "+e);
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
    
    //metodo para ingresar los material que se compran en la clinica
    public void insertMaterial(String nombre, String desc, String tipo, int cantidad, double costo){
        try{
            PreparedStatement pps = cn.prepareStatement("insert into materiales(`nombre_material`,`descripcion_material`,`tipo_material`,`cantidad`,"
                    + "`costo_material`) values(?,?,?,?,?)");
            pps.setString(1, nombre);
            pps.setString(2, desc);
            pps.setString(3, tipo);
            pps.setInt(4, cantidad);
            pps.setDouble(5, costo);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas al ingresar los datos "+e);
            con.closeBd();
        }
    }
    
    //metodo para insertar el pago de materiales comprados para el uso de la clinica
    public void insertPagoMaterial(String nombre,String desc,double costo, String fecha){
      try{
            PreparedStatement pps = cn.prepareStatement("insert into pagomateriales(`costo_material`,"
                    + "`fechaPago_material`,`Materiales_id_material`) VALUES(?,?,"
                    + "(select id_material from   materiales where nombre_material='"+nombre+"' and descripcion_material='"+desc+"'));");
            pps.setDouble(1, costo);
            pps.setString(2, fecha);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS DEL MATERIAL GUARDADOS CORRECTAMENTE");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL REALIZAR EL PAGO DEL EMPLEADO "+e);
            con.closeBd();
        }  
    }
    
    public void insertor(String articular,String goniaco,String impa,String jarabak,String facial,String is,String ii,String fhis,String anb82,String anb80,
                        String anb2,String pals,String pali,String ptb,int speeleve,int speemoderada,int speesvera,String dsd,String clasim,
                        String entornod,String Consulta_id_consulta){
        try{
            PreparedStatement pps = cn.prepareStatement("insert into cefalometria(`articular`,`goniaco`,`impa`,`jarabak`,"
                    + "`facial`,`is`,`ii`,`fhis`,`anb82`,`anb80`,`anb2`,`pals`,`pali`,`ptb`,`speeleve`,`speemoderada`,`speesvera`,`dsd`,`clasim`,"
                    + "`entornod`,`Consulta_id_consulta`) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1, articular);
            pps.setString(2, goniaco);
            pps.setString(3, impa);
            pps.setString(4, jarabak);
            pps.setString(5, facial);
            pps.setString(6, is);
            pps.setString(7, ii);
            pps.setString(8, fhis);
            pps.setString(9, anb82);
            pps.setString(10, anb80);
            pps.setString(11, anb2);
            pps.setString(12, pals);
            pps.setString(13, pali);
            pps.setString(14, ptb);
            pps.setInt(15, speeleve);
            pps.setInt(16, speemoderada);
            pps.setInt(17, speesvera);
            pps.setString(18, dsd);
            pps.setString(19, clasim);
            pps.setString(20, entornod);
            pps.setString(21, Consulta_id_consulta);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas al ingresar los datos "+e);
            con.closeBd();
        }
    }
    
    //metodo para insertar las reparaciones realizadas a la clinica
    public void insertReparacion(String repa,String desc){
       try{
            PreparedStatement pst = cn.prepareStatement("insert into  reparacionclinica(tipo_reparacion,descrip_reparacion) values(?,?);");
            pst.setString(1, repa);
            pst.setString(2, desc);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS EXITOSAMENTE");
            con.closeBd();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "PROBLEMAS AL INGRESAR LOS DATOS DE REPARACION "+e);
           con.closeBd();
       }
    }
    
    //metodo para insertar el pago de reparaciones para la clinica
    public void insertPagoRepa(String rep,String desc,double costo, String fecha){
      try{
            PreparedStatement pps = cn.prepareStatement("insert into pagoreparacion(`costo_repa`,"
                    + "`fechaPago_repa`,`ReparacionClinica_id_raparaClinica`) VALUES(?,?,"
                    + "(select id_raparaClinica from reparacionclinica where tipo_reparacion='"+rep+"' and descrip_reparacion='"+desc+"'));");
            pps.setDouble(1, costo);
            pps.setString(2, fecha);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "PAGO DE REPARACION GUARDADOS CORRECTAMENTE");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL REALIZAR EL PAGO DEL REPARACIONES "+e);
            con.closeBd();
        }  
    }
    
    //metodo para ingresar los equipos que se compran en la clinica
    public void insertEquipo(String equi, String desc, String estado){
        try{
            PreparedStatement pps = cn.prepareStatement("insert into equipo(`tipo_equipo`,`descripcion_equipo`,`estado_equipo`) values(?,?,?)");
            pps.setString(1, equi);
            pps.setString(2, desc);
            pps.setString(3, estado);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas al ingresar los datos "+e);
            con.closeBd();
        }
    }
    
    //metodo para insertar el pago de equipo para la clinica
    public void insertPagoEq(String eq,String desc,String estado,double costo, String fecha){
      try{
            PreparedStatement pps = cn.prepareStatement("insert into  pagoequipo(`costo_equipo`,"
                    + "`fechaPago_equuipo`,`Equipo_id_equipo`) VALUES(?,?,"
                    + "(select id_equipo from equipo where tipo_equipo='"+eq+"' and descripcion_equipo='"+desc+"' and estado_equipo='"+estado+"'));");
            pps.setDouble(1, costo);
            pps.setString(2, fecha);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "PAGO DE EQUIPO GUARDADOS CORRECTAMENTE");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL REALIZAR EL PAGO DEL EQUIPO "+e);
            con.closeBd();
        }  
    }
    public void insertDiente(String id,String dient,String poc, String fecha,String descri){
      try{
            PreparedStatement pps = cn.prepareStatement("INSERT INTO `diente` (`nombre_diente`, `ubicacion_diente`, `descripcion_diente`,`fecha`, `PacienteN_id_pacienteN`)"
                    +  "VALUES(?,?,?,?,?)");
            pps.setString(1, dient);
            pps.setString(2, poc);
            pps.setString(3, descri);
            pps.setString(4, fecha);
            pps.setString(5, id);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DIENTE GUARDADO");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL GUARDAR "+e);
            con.closeBd();
        }  
    }
    
     public void insertartrata(String bandas,String tubos,String otros,String aparato,String exodoncia,String brackets,String retenciones,String arcos,String md,int f_faciales,
                        int f_intraorales,int modelo_mx,int modelo_md,int rx_panoramica,int rx_cefalometrica,int rx_incicivos,String rx_rocabado,String Consulta_id_consulta){
        try{
            PreparedStatement pps = cn.prepareStatement("insert into plan_trata_ortodon(`bandas`,`tubos`,`otros`,`aparato`,"
                    + "`exodoncia`,`brackets`,`retenciones`,`arcos`,`md`,`f_faciales`,`f_intraorales`,`modelo_mx`,`modelo_md`,`rx_panoramica`,`rx_cefalometrica`,`rx_incicivos`,`rx_rocabado`,`Consulta_id_consulta`) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1, bandas);
            pps.setString(2, tubos);
            pps.setString(3, otros);
            pps.setString(4, aparato);
            pps.setString(5, exodoncia);
            pps.setString(6, brackets);
            pps.setString(7, retenciones);
            pps.setString(8, arcos);
            pps.setString(9, md);
            pps.setInt(10, f_faciales);
            pps.setInt(11, f_intraorales);
            pps.setInt(12, modelo_mx);
            pps.setInt(13, modelo_md);
            pps.setInt(14, rx_panoramica);
            pps.setInt(15, rx_cefalometrica);
            pps.setInt(16, rx_incicivos);
            pps.setString(17, rx_rocabado);
            pps.setString(18, Consulta_id_consulta);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente1");
            con.closeBd();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas al ingresar los datos "+e);
            con.closeBd();
        }
    }
    
}
