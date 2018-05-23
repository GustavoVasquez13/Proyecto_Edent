/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Clases.InsertarDatosBD;
import Clases.IsertarDatosBD2;
import Clases.internalFrameImagen;
import Clases.validaciones;
import static formularios.frmPrincipal.Dpanel;
import java.util.Calendar;
import javax.swing.JOptionPane;




public class ExpedienteOrtodoncia extends internalFrameImagen {


    public ExpedienteOrtodoncia() {
        initComponents(); 
        
        
        setImagenw("img2.jpg");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel82 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lbledad = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lbldireccion1 = new javax.swing.JLabel();
        txtdirección = new javax.swing.JTextField();
        lblnombre1 = new javax.swing.JLabel();
        txtMotivoC = new javax.swing.JTextField();
        lblnombre2 = new javax.swing.JLabel();
        txtHistoriaM = new javax.swing.JTextField();
        lblnombre3 = new javax.swing.JLabel();
        txtHistoriaO = new javax.swing.JTextField();
        lblnombre4 = new javax.swing.JLabel();
        txtExamenC = new javax.swing.JTextField();
        lblnombre5 = new javax.swing.JLabel();
        txtDX = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        lblnombre40 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        btnsalir = new javax.swing.JButton();
        btnsiguiente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel82.setText("Expediente Ortodoncia");
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 280, 30));

        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lbltelefono.setText("Telefono:");
        getContentPane().add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 99, -1));

        lbledad.setText("Edad:");
        getContentPane().add(lbledad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 99, -1));

        lblnombre.setText("Nombre: ");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 190, -1));

        lbldireccion1.setText("Dirección: ");
        getContentPane().add(lbldireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 50, 10));

        txtdirección.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdirecciónActionPerformed(evt);
            }
        });
        getContentPane().add(txtdirección, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 500, 20));

        lblnombre1.setText("Motivo de la Consulta: ");
        getContentPane().add(lblnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        getContentPane().add(txtMotivoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 380, -1));

        lblnombre2.setText("Historia Medica:");
        getContentPane().add(lblnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 80, -1));
        getContentPane().add(txtHistoriaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 500, 20));

        lblnombre3.setText("Historia Odontologica:");
        getContentPane().add(lblnombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        getContentPane().add(txtHistoriaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 500, 30));

        lblnombre4.setText("Examen Clinico:");
        getContentPane().add(lblnombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 80, -1));

        txtExamenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExamenCActionPerformed(evt);
            }
        });
        getContentPane().add(txtExamenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 380, -1));

        lblnombre5.setText("DX Odontologico:");
        getContentPane().add(lblnombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 90, -1));

        txtDX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDXActionPerformed(evt);
            }
        });
        getContentPane().add(txtDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 500, 20));

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 60, 70));

        fecha.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, -1));

        lblnombre40.setText("Apellido:");
        getContentPane().add(lblnombre40, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 190, -1));

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 60, 70));

        btnsiguiente.setText("siguiente");
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        jButton1.setText("Elegir paciente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, -1));

        txttip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipActionPerformed(evt);
            }
        });
        getContentPane().add(txttip, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 0, 10));

        txttip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttip2ActionPerformed(evt);
            }
        });
        getContentPane().add(txttip2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 0, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdirecciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdirecciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdirecciónActionPerformed
     //metodo para limpiar los jtextfield despues de cada click al boton guardar
    public void limpiarTxt(){
        txtnombre.setText("");
        txtapellido.setText("");
        txtdirección.setText("");
        txttelefono.setText("");
        txtedad.setText("");
        txtMotivoC.setText("");
        txtHistoriaM.setText("");
        txtHistoriaO.setText("");
        txtExamenC.setText("");
        txtDX.setText("");
    }
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
     if (this.txtnombre.getText().length() == 0 || this.txtapellido.getText().length() == 0|| this.txtedad.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Debe elegir un paciente");
            }else{
          String tip=this.txttip.getText();
      String motivo = this.txtMotivoC.getText().toUpperCase();
      String historiam = this.txtHistoriaM.getText().toUpperCase();
      String historiao = this.txtHistoriaO.getText().toUpperCase();
      String examen = this.txtExamenC.getText().toUpperCase();
      String dx = this.txtDX.getText().toUpperCase();
      String tip2=this.txttip2.getText();
      // se crean variables para almacenar en ellas el dia mes y año que se obtienen del control jcalendar
      String dia = Integer.toString(fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
      String mes = Integer.toString(fecha.getCalendar().get(Calendar.MONTH) + 1);
      String year = Integer.toString(fecha.getCalendar().get(Calendar.YEAR));
      String fechaA = (year + "-" + mes+ "-" + dia);
      String date = fechaA; 
      //se crea un objeto de la clase Insertar Datos, en este objeto se almacenaran y enviaran 
      //a la clase los parametros obtenidos por los jtextfield
      IsertarDatosBD2 insertar2 = new IsertarDatosBD2();
      insertar2.insertarPacienteOC(motivo, date, historiam, historiao, examen, dx,tip);
      //se manda a llamar el metodo para limpiar los jtextfield despues de cada click en el boton guardar
      limpiarTxt();  
     }
     
     
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtDXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDXActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        validaciones val = new validaciones();
        val.validarCaracter(evt);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        validaciones val = new validaciones();
        val.validarCaracter(evt);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
       validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtedadKeyTyped

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
       ExpedienteO formExGral = new ExpedienteO();
       Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmvistapacientes formProd = new frmvistapacientes();
        Dpanel.add(formProd);
        formProd.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipActionPerformed

    private void txtExamenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExamenCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExamenCActionPerformed

    private void txttip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttip2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsiguiente;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel lbldireccion1;
    private javax.swing.JLabel lbledad;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnombre2;
    private javax.swing.JLabel lblnombre3;
    private javax.swing.JLabel lblnombre4;
    private javax.swing.JLabel lblnombre40;
    private javax.swing.JLabel lblnombre5;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtDX;
    private javax.swing.JTextField txtExamenC;
    private javax.swing.JTextField txtHistoriaM;
    private javax.swing.JTextField txtHistoriaO;
    private javax.swing.JTextField txtMotivoC;
    public static javax.swing.JTextField txtapellido;
    public static javax.swing.JTextField txtdirección;
    public static javax.swing.JTextField txtedad;
    public static javax.swing.JTextField txtnombre;
    public static final javax.swing.JTextField txttelefono = new javax.swing.JTextField();
    public static final javax.swing.JTextField txttip = new javax.swing.JTextField();
    public static final javax.swing.JTextField txttip2 = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
