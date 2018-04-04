/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Formularios.ad;
import Formularios.frmPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author marvi
 */
public class funciones {
    public String usu="edent.recuperacion@gmail.com";
    public String contra="h123456h";

 public void SendMail(String c,String m) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
 
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(usu, contra);
                    }
                });
 
        try {
 
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usu));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(c));
            message.setSubject("recuperacion de contraseña");
            message.setText(m);
 
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Su mensaje ha sido enviado");
 
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
 
 private boolean presionoRecu = false;

 conexionBD cc = new conexionBD();
Connection cn = cc.conectar();

    public void verificaCorreo(String correo) {
        try {
            String sql = "SELECT * FROM usuario WHERE correo_usuario = '" + correo + "'";
            String sql1= "update  usuario set  clave=? "
                    + "where id_usuario=?";
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String code = RandomStringUtils.randomAlphanumeric(8);
            String user = null;
            String pass = code;
            String id=null;
            String cor=null;
            if (rs.next()) {
                
                id=rs.getString(1);
                user = rs.getString(4);
                cor=rs.getString(7);
               try {           
            PreparedStatement pst=cn.prepareStatement(sql1);
            pst.setString(1,DigestUtils.md5Hex(pass));                   
            pst.setString(2,id);
            
            int n=pst.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
           
        }

                String user1 = "USUARIO: " + user, pass1 = "CONTRASEÑA: " + pass;

                if (JOptionPane.showConfirmDialog(null, "SU USUARIO Y CONTRASEÑA \n\n"
                         +"FUERON ENVIADOS A SU CORREO"+ "\n\n¿SI PARA CONTINUAR?", "CÓDIGO DE RECUPERACIÓN", JOptionPane.YES_NO_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
                    String men= "SU USUARIO Y CONTRASEÑA SON:\n\n"
                         +"USUARIO: " + user + "\nCONTRASEÑA: "+pass;
                    SendMail(cor,men);
                    
                } else {
                  
                }
            } else {
                
               
                presionoRecu = false;
                JOptionPane.showMessageDialog(null, "EL CÓDIGO INGRESADO NO ES VÁLIDO,\nINGRESE UN CÓDIGO DE RECUPERACIÓN\n"
                        + "VÁLIDO O CONTACTE AL ADMINISTRADOR DEL SISTEMA.", "¡ERROR AL RECUPERAR!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            
        }
    }
    public void ContarUsuarios() {

        vlogin funcion = new vlogin();
   
      
        int cantidadUsuarios = funcion.ContarUsuarios();
        if (cantidadUsuarios == 0) {
             ad fr=new ad();
                fr.toFront();
                fr.setVisible(true);
            
            JOptionPane.showMessageDialog(null, "DEBE CREAR EL ADMINISTRADOR DEL SISTEMA");
             formularios.FrmInstalacion form = new formularios.FrmInstalacion();
            form.setResizable(false);
            form.toFront();
            form.setVisible(true);
            //form.setLocationRelativeTo();
        }//cierre
    }
}
