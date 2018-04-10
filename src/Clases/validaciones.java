package Clases;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class validaciones {
    
    //metodo para verificar que no se ingrecen letras en un campo al momento de precionar un tecla
   public void validarNum(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              Toolkit.getDefaultToolkit().beep();
              evt.consume(); 
              JOptionPane.showMessageDialog(null,"INGRESE SOLO NUMEROS"); 
          } 
    } 
}
