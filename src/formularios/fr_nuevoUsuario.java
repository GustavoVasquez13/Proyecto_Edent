
package formularios;

import Clases.ConsultarDatosBD2;
import Clases.funciones;
import Clases.conexionBD;
import Clases.internalFrameImagen;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.digest.DigestUtils;

public class fr_nuevoUsuario extends internalFrameImagen {
String[] arraytipo;
funciones i=new funciones();
    
    public fr_nuevoUsuario() {
        initComponents();
         setImagenw("img2.jpg"); 
         mostrarusuario();
         
         consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre_persona = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtusu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcont = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        VOLVER = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jusu = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR NUEVO USUARIO");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDO");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUARIO");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TIPO");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CORREO:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setText("GUARDAR");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        VOLVER.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VOLVER.setForeground(new java.awt.Color(0, 102, 204));
        VOLVER.setText("INICIO");
        VOLVER.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VOLVER.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });

        jusu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jusu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcorreo)
                            .addComponent(cbtipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtusu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtape, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre_persona, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcont, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VOLVER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void consultar()
    {
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
                this.cbtipo.addItem(rs.getString(1));
                arraytipo[i] = rs.getString(2);
                i++;
            }
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de la Persona");
        }
    }
private void mostrarusuario() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD2 Mostrarp = new ConsultarDatosBD2();
            modelo = Mostrarp.mostrarus();
            jusu.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE SERVICIOS");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nom = this.txtNombre_persona.getText().toUpperCase();
        String ape = this.txtape.getText().toUpperCase();
        String usu = this.txtusu.getText();
        String clav = DigestUtils.md5Hex(this.txtcont.getText());
        String correo=this.txtcorreo.getText();
        conexionBD cnn=new conexionBD();
        Connection reg=cnn.conectar();
        if(nom.equals("")||ape.equals("")||usu.equals("")||clav.equals("")){
            JOptionPane.showMessageDialog(null, "POR FAVOR LLENAR TODOS LOS CAMPOS");
        }else{
            i.verificausu(this.txtNombre_persona.getText().toUpperCase(),this.txtape.getText().toUpperCase(),txtusu.getText(),String.valueOf(DigestUtils.md5Hex(txtcont.getText())),arraytipo[this.cbtipo.getSelectedIndex()],this.txtcorreo.getText());

            this.txtNombre_persona.setText("");
            this.txtape.setText("");
            this.txtusu.setText("");
            this.txtcont.setText("");
            this.txtcorreo.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        dispose();
    }//GEN-LAST:event_VOLVERActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VOLVER;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jusu;
    private javax.swing.JTextField txtNombre_persona;
    private javax.swing.JTextField txtape;
    private javax.swing.JPasswordField txtcont;
    public static javax.swing.JTextField txtcorreo;
    public static javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
