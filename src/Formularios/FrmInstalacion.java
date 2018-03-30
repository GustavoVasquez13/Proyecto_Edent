package formularios;

import Clases.conexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.commons.codec.digest.DigestUtils;

public final class FrmInstalacion extends javax.swing.JFrame {
String[] arraytipo;
    public FrmInstalacion() {
      
        initComponents();
                 consultar();
        inhabilitar();
    }

    public void inhabilitar() {
        txtCod_persona.setVisible(false);
        txtNombre_persona.setEnabled(false);
        txtape.setEnabled(false);
        txtcorreo.setEnabled(false);
        txtcont.setEnabled(false);
        tipo.setEnabled(false);
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
        pnlcontainer = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtNombre_persona = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcont = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtusua = new javax.swing.JTextField();

        txtCod_persona.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlcontainer.setBackground(new java.awt.Color(0, 0, 0));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Primera Sesion del Sistema ");

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

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Nombre :");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");

        txtape.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtape.setText("    ");
        txtape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuario");

        txtcorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("contraseña");

        txtcont.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo acceso :");

        tipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(36, 33, 33));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 102, 204));
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
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Correo:");

        txtusua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlcontainerLayout = new javax.swing.GroupLayout(pnlcontainer);
        pnlcontainer.setLayout(pnlcontainerLayout);
        pnlcontainerLayout.setHorizontalGroup(
            pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlcontainerLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlcontainerLayout.createSequentialGroup()
                        .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlcontainerLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlcontainerLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtusua, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlcontainerLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlcontainerLayout.createSequentialGroup()
                                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtcont)
                                    .addComponent(tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlcontainerLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(86, 86, 86))
                    .addGroup(pnlcontainerLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        pnlcontainerLayout.setVerticalGroup(
            pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcontainerLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtusua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlcontainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlcontainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlcontainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed

    }//GEN-LAST:event_tipoActionPerformed

    private void txtcontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontActionPerformed
        txtcont.transferFocus();
    }//GEN-LAST:event_txtcontActionPerformed

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

        conexionBD cnn=new conexionBD();
        Connection reg=cnn.conectar();

        try {
            String query = "INSERT INTO usuario (nombre_usuario,apellido_usuario,usuario,clave,TipoUsuario_id_tipoUsuario,correo_usuario) "
            + "VALUES(?,?,?,?,?,?);";

            Statement stmt = reg.createStatement() ;

            PreparedStatement pst  = reg.prepareStatement(query);
            pst.setString(1, this.txtNombre_persona.getText().toUpperCase());
            pst.setString(2, this.txtape.getText().toUpperCase());
            pst.setString(3, txtusua.getText());
            pst.setString(4, String.valueOf(DigestUtils.md5Hex(txtcont.getText())));
            pst.setString(5, arraytipo[this.tipo.getSelectedIndex()]);
            pst.setString(6, this.txtcorreo.getText());

            int n=pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "usuario almacenado");

        } catch (SQLException ex) {

        }
        dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtusuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuaActionPerformed
 private void consultar(){
        conexionBD cnn=new conexionBD();
        Connection reg=cnn.conectar();
       try {
            
            Statement stmt = reg.createStatement();
          
            String query = "SELECT tipo_usuario, id_tipoUsuario FROM tipousuario;";
           
          
            ResultSet rs = stmt.executeQuery(query);
           
            
            arraytipo = new String[10];
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
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JPanel pnlcontainer;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JTextField txtCod_persona;
    private javax.swing.JTextField txtNombre_persona;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtcont;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtusua;
    // End of variables declaration//GEN-END:variables
}
