package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexionBD {
    public String db = "edent";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "";
    boolean BanderaConeccion = false;
    Connection link = null;
    
    public conexionBD()
    {  
    }
    //metodo para realizar la conexion a la base de datos
    public Connection conectar()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            
        }catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Problema al Conectar con la Base de Datos",
                "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        return link;
    }
    
    //metodo para cerrar la conexion a la base de datos
     public void closeBd()
        {
            if (BanderaConeccion)
            {
                try
                {
                    link.close();
                    BanderaConeccion = false;
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"Error al cerrar la conexion." + ex);
                }
            }
        }
}
