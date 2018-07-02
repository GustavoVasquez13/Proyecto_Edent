package formulariosAyuda;

import Clases.internalFrameImagen;
import java.awt.Color;

public class frmayudaPE extends internalFrameImagen{

    public frmayudaPE() {
        initComponents();
        setImagenw("fondo.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        lblErrores = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblCL1 = new javax.swing.JLabel();
        lblCL2 = new javax.swing.JLabel();
        lblCL4 = new javax.swing.JLabel();

        jLabel4.setText("jLabel2");

        setClosable(true);
        setIconifiable(true);

        lblReg.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblReg.setForeground(new java.awt.Color(255, 255, 255));
        lblReg.setText("Realizar una Busqueda en la Tabla");
        lblReg.setToolTipText("Click Para Ver la Descripcion del Caso");
        lblReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegMouseExited(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N

        lblEdit.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblEdit.setForeground(new java.awt.Color(255, 255, 255));
        lblEdit.setText("Registrar un Pago");
        lblEdit.setToolTipText("Click Para Ver la Descripcion del Caso");
        lblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditMouseExited(evt);
            }
        });

        lblErrores.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblErrores.setForeground(new java.awt.Color(255, 255, 255));
        lblErrores.setText("Posibles Problemas Presentados");
        lblErrores.setToolTipText("Click Para Ver la Descripcion del Caso");
        lblErrores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblErroresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblErroresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblErroresMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario de Ayuda");

        btnCancelar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 102, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cerrar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCL1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N

        lblCL2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N

        lblCL4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCancelar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblErrores)
                                .addGap(18, 18, 18)
                                .addComponent(lblCL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCL2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblReg))
                        .addGap(18, 18, 18)
                        .addComponent(lblCL1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCL1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCL2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCL4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegMouseClicked
        this.lblMensaje.setText("<html><body><p ALIGN=\"justify\">Para Realizar una <b>Busqueda</b> solo se debe de escribir en la <b>Caja de Texto</b> "
                + "el Registro que se desea Buscar</p></body></html>");
    }//GEN-LAST:event_lblRegMouseClicked

    private void lblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseClicked
        this.lblMensaje.setText("<html><body><p ALIGN=\"justify\">Para <b>Agregar un pago Nuevo </b>se debe seleccionar el Registro desde la "
                + "<b>Tabla de Datos</b> y luego dar <b>Click sobre el Registro seleccionado.</b> "
                + "Los datos se cargaran en las <b>Cajas de Texto</b> correspondientes. Luego llenar los campos con la informacion necesaria, "
                + "es obligatorio <b>Seleccionar un Registro de la Tabla</b> "
                + "para realizar exitosamente <b>El Pago</b>. <br><br>"
                + "Despues debe de dar <b>Click en el boton Registrar</b> y aparecera un mensaje "
                + "de confirmacion de que el <b>Pago se realizo Exitosamente.</b></p></body></html>");
    }//GEN-LAST:event_lblEditMouseClicked

    private void lblErroresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErroresMouseClicked
        this.lblMensaje.setText("<html><body><p ALIGN=\"justify\"><b>Problemas al Realizar los pagos</b> este tipo de problemas se puede presentar"
                + " cuando se ha perdido la <b>conexion con la base de datos,</b> causando que no se pueda realizar la operacion Solicitada.<br><br>"
                + "Para Solucionar este problema Porfavor Comuniquese con el <b>Administrador de Sistema.</b></p></body></html>");
    }//GEN-LAST:event_lblErroresMouseClicked

    private void lblRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegMouseEntered
        this.lblReg.setForeground(Color.blue);
        this.lblCL1.setText("Click Aqui");
    }//GEN-LAST:event_lblRegMouseEntered

    private void lblRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegMouseExited
        this.lblReg.setForeground(Color.black);
        this.lblCL1.setText("");
    }//GEN-LAST:event_lblRegMouseExited

    private void lblEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseEntered
        this.lblEdit.setForeground(Color.blue);
        this.lblCL2.setText("Click Aqui");
    }//GEN-LAST:event_lblEditMouseEntered

    private void lblEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseExited
        this.lblEdit.setForeground(Color.black);
         this.lblCL2.setText("");
    }//GEN-LAST:event_lblEditMouseExited

    private void lblErroresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErroresMouseEntered
        this.lblErrores.setForeground(Color.blue);
        this.lblCL4.setText("Click Aqui");
    }//GEN-LAST:event_lblErroresMouseEntered

    private void lblErroresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErroresMouseExited
        this.lblErrores.setForeground(Color.black);
        this.lblCL4.setText("");
    }//GEN-LAST:event_lblErroresMouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCL1;
    private javax.swing.JLabel lblCL2;
    private javax.swing.JLabel lblCL4;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblErrores;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblReg;
    // End of variables declaration//GEN-END:variables
}
