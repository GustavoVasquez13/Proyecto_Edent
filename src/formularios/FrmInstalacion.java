package formularios;

import Clases.InsertarDatosBD;
import Clases.conexionBD;
import Clases.funciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public final class FrmInstalacion extends javax.swing.JFrame {
String[] arraytipo;
funciones v=new funciones();
InsertarDatosBD i=new InsertarDatosBD();
    public FrmInstalacion() {
      
        initComponents();
         consultar();
        inhabilitar();
        setLocation(87, 110);
    }

    public void inhabilitar() {
        txtCod_persona.setVisible(false);
        txtNombre_persona.setEnabled(false);
        txtape.setEnabled(false);
        txtcorreo.setEnabled(false);
        txtcont.setEnabled(false);
        tipo.setEnabled(false);
          txtusua.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
        txtCod_persona.setText("");
        txtNombre_persona.setText("");
        txtape.setText("");
        txtcorreo.setText("");
        txtcont.setText("");
    }

    public void habilitar() {
        txtNombre_persona.setEnabled(true);
        txtape.setEnabled(true);
        txtcorreo.setEnabled(true);
        txtcont.setEnabled(true);
        tipo.setEnabled(true);
        txtusua.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(false);
        txtCod_persona.setText("");
        txtNombre_persona.setText("");
        txtape.setText("");
        txtcorreo.setText("");
        txtcont.setText("");
        consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCod_persona = new javax.swing.JTextField();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre_persona = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtusua = new javax.swing.JTextField();
        txtcont = new javax.swing.JPasswordField();

        txtCod_persona.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clases/img2.jpg"))); // NOI18N
        panel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel2MouseDragged(evt);
            }
        });
        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel2MousePressed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 153));
        jLabel19.setText("Primera Sesion del Sistema ");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText(" Nombre:");

        txtNombre_persona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre_persona.setText(" ");
        txtNombre_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_personaActionPerformed(evt);
            }
        });
        txtNombre_persona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_personaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Apellido:");

        txtape.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtape.setText("    ");
        txtape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Usuario:");

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("contraseña:");

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Tipo acceso:");

        tipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("Correo:");

        txtcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(36, 33, 33));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 102, 204));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo_use.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(36, 33, 33));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 102, 204));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/addUse.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtusua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtape)
                                    .addComponent(txtNombre_persona)))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcorreo)
                                            .addComponent(tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtusua)
                                            .addComponent(txtcont))))))
                        .addGap(47, 47, 47))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addGap(33, 33, 33)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed

    }//GEN-LAST:event_tipoActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        txtcorreo.transferFocus();
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapeActionPerformed
        txtape.transferFocus();
    }//GEN-LAST:event_txtapeActionPerformed

    private void txtNombre_personaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_personaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            // JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtNombre_personaKeyTyped

    private void txtNombre_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_personaActionPerformed

    }//GEN-LAST:event_txtNombre_personaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

 habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNombre_persona.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre");
            txtNombre_persona.requestFocus();
            return;
        }

        if (txtcorreo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar Login");
            txtcorreo.requestFocus();
            return;
        }

        if (txtcont.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Contraseña");
            txtcont.requestFocus();
            return;
        }

        

        i.insertUsuarioA(this.txtNombre_persona.getText().toUpperCase(),this.txtape.getText().toUpperCase(),txtusua.getText(),String.valueOf(DigestUtils.md5Hex(txtcont.getText())),arraytipo[this.tipo.getSelectedIndex()],this.txtcorreo.getText());
        dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtusuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuaActionPerformed

    private void panel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_panel2MouseDragged

    private void panel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panel2MousePressed
 private void consultar(){
        conexionBD cnn=new conexionBD();
        Connection reg=cnn.conectar();
       try {
            
            Statement stmt = reg.createStatement();
          
            String query = "SELECT tipo_usuario, id_tipoUsuario FROM tipousuario;";
           
          
            ResultSet rs = stmt.executeQuery(query);
           
            
            arraytipo = new String[50];
            int i = 0;
            while(rs.next())
            {
                this.tipo.addItem(rs.getString(1));
                arraytipo[i] = rs.getString(2);
                i++;
            }
        } catch (SQLException ex) { 
        }
       
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInstalacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInstalacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInstalacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInstalacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInstalacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.edisoncor.gui.panel.Panel panel2;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JTextField txtCod_persona;
    private javax.swing.JTextField txtNombre_persona;
    private javax.swing.JTextField txtape;
    private javax.swing.JPasswordField txtcont;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtusua;
    // End of variables declaration//GEN-END:variables
}
