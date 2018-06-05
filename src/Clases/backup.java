/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author marvi
 */
public class backup {
     String pas="";
    public static void Exportar(String ruta,String nom){
        try {
            String rut="\\xampp\\mysql\\bin\\mysqldump  -uroot  -B edent";
            Process p = 
            Runtime.getRuntime().exec(rut);

            InputStream is = p.getInputStream();
            FileOutputStream fos = new FileOutputStream(ruta+"\\"+nom+".sql");
            byte[] buffer = new byte[1000];

            int leido = is.read(buffer);
            while (leido > 0) {
               fos.write(buffer, 0, leido);
               leido = is.read(buffer);
            }
            
            fos.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN PROBLEMA AL EXPORTAR LA BASE DE DATOS "+e);
            //e.printStackTrace();
        }
    }
    
    public static void restaurar(String ruta) {
        try {
            String rut="\\xampp\\mysql\\bin\\mysql -uroot  edent";
            Process p = 
            Runtime.getRuntime().exec(rut);

            OutputStream os = p.getOutputStream();
            FileInputStream fis = new FileInputStream(ruta);
            byte[] buffer = new byte[1000];

            int leido = fis.read(buffer);
            while (leido > 0) {
               os.write(buffer, 0, leido);
               leido = fis.read(buffer);
            }

            os.flush();
            os.close();
            fis.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "OCURRIO UN PROBLEMA AL EXPORTAR LA BASE DE DATOS "+e);
            //e.printStackTrace();
        }
    }
}
