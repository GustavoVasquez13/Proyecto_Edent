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

/**
 *
 * @author marvi
 */
public class backup {
     String pas="";
    public static void Exportar(String ruta,String nom){
        String rut="\\wamp64\\bin\\mysql\\mysql5.7.21\\bin\\mysqldump --opt -uroot  -B edent";
        try {
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
            e.printStackTrace();
        }
    }
    
    public static void restaurar(String ruta) {
        String rut="\\wamp64\\bin\\mysql\\mysql5.7.21\\bin\\mysql -uroot  edent";
        try {
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
            e.printStackTrace();
        }
}
}
