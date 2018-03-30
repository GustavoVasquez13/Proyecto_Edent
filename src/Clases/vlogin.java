package Clases;


import formularios.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class vlogin {
   private conexionBD mysql = new conexionBD(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    private String sSQL = ""; //Sentencia SQL para almacenar consulta
    private String sSQL2 = "";
    public Integer totalRegistros; // Obtener los registros

    public DefaultTableModel login(String login,String password) {
        DefaultTableModel modelo;

        String[] titulos = {"id_usuario", "nombre_usuario", "apellido_usuario", "usuario","clsve","TipoUsuario_id_tipoUsuario","correo_usuario"};
        String[] registro = new String[9];

        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL =  sSQL = "SELECT usuario.id_usuario,usuario.nombre_usuario,usuario.apellido_usuario,usuario.usuario,usuario.clave,tipousuario.tipo_usuario,usuario.correo_usuario "
               + "FROM usuario "
               + "INNER JOIN tipousuario ON usuario.TipoUsuario_id_tipoUsuario = tipousuario.id_tipoUsuario "
                +"  where usuario.usuario ='" +login +"' "
                +" and usuario.clave ='" + password + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_usuario");
                registro[1] = rs.getString("nombre_usuario");
                registro[2] = rs.getString("apellido_usuario");
                registro[3] = rs.getString("usuario");
                
                registro[4] = rs.getString("clave");
                registro[5] = rs.getString("tipousuario.tipo_usuario");
                registro[6] = rs.getString("correo_usuario");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public int ContarUsuarios (){
      sSQL ="select count(*)AS cantidadUsuarios from usuario";
        
        try {
            int codigo_venta =0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          while (rs.next()) {
            codigo_venta = rs.getInt("cantidadUsuarios");
            }
          return codigo_venta;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }

    public int verificarLogin (){
        String login = FR_nuevoUsuario.txtusu.getText();
        sSQL ="SELECT COUNT(login) AS login FROM usuario WHERE login = "+login;
        
        try {
            int loginResultante=0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          while (rs.next()) {
            loginResultante = rs.getInt("login");
            }
          return loginResultante;
        } catch (Exception e) {
            return 0;
        }
    }
}
