package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarDatosBD {
    
    public Integer totalRegistros; // Obtener los registros
    private String sSQL = ""; //Sentencia SQL para almacenar consulta
    conexionBD con = new conexionBD();
    Connection cn = con.conectar();
    
    // este metodo muestra los datos de los servicios registrados en la tabla del formulario frmServBasico
    public DefaultTableModel mostrarServicios() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulos
                = {"SERVICIO","PROVEEDOR", "CORREO","TELEFONO"};
        String[] registros = new String[4];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulos);
        //consulta para mostrar los datos de la base de datos
        sSQL = "SELECT  `nombre_servicio`,`proveedor_servicio`, `correo_provS`, `tel_provS` FROM tiposervicio;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("nombre_servicio");
                registros[1] = rs.getString("proveedor_servicio");
                registros[2] = rs.getString("correo_provS");
                registros[3] = rs.getString("tel_provS");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Servicios");
            con.closeBd();
            return null;
        }
    }
    
    //se muestran los proveedores registrados en el formulario frmCompraProducto
    public DefaultTableModel mostrarProveedores() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulos
                = {"CODIGO","NOMBRE","DIRECCION", "CORREO","TELEFONO"};
        String[] registros = new String[5];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulos);
        //consulta para mostrar los datos de la base de datos
        sSQL = "SELECT * FROM proveedores;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_proveedor");
                registros[1] = rs.getString("nombre_prov");
                registros[2] = rs.getString("direccion_prov");
                registros[3] = rs.getString("correo_prov");
                registros[4] = rs.getString("tel_prov");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de proveedores");
            con.closeBd();
            return null;
        }
    }
    
    //muestra lo sproductos registrados en la tabla del form frmComprarProducto
    public DefaultTableModel mostrarProductos() {
        DefaultTableModel modelo;
        //Arreglo para crear los campos necesarios de la tabla donde se mostraran los datos
        String[] titulos
                = {"CODIGO","NOMBRE","DESCRIPCION"};
        String[] registros = new String[3];
        totalRegistros = 0;
        //se agregan los campos del arreglo al modelo de la tabla
        modelo = new DefaultTableModel(null, titulos);
        //consulta para mostrar los datos de la base de datos
        sSQL = "SELECT * FROM productos;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registros[0] = rs.getString("id_prodto");
                registros[1] = rs.getString("nombre_prodto");
                registros[2] = rs.getString("descripcion_prodto");
                
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            con.closeBd();
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Productos");
            con.closeBd();
            return null;
        }
    }
    
    //este metodo extrae el codigo del servicio para poder modificarlo en frmServicioBasico
    public int codServicio(String servicio, String proveedor){
        sSQL = "SELECT `id_tipoServicio` FROM `tiposervicio` WHERE `nombre_servicio`='"+servicio+"' and `proveedor_servicio`='"+proveedor+"';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while(rs.next()){
                int cod = rs.getInt("id_tipoServicio");
                return cod;
            }
            con.closeBd();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Problemas al consultar los datos de servicio");
            con.closeBd();
            return 0;
        }
        return 0;
    }
}
