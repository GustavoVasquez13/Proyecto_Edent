/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariosMenu;

import Clases.internalFrameImagen;
import formularios.ExpedienteGeneral;
import formularios.ExpedienteO;
import formularios.ExpedienteOrtodoncia;
import formularios.consulta;
import static formularios.frmPrincipal.Dpanel;

/**
 *
 * @author ricar
 */
public class menuexpediente extends internalFrameImagen {

    /**
     * Creates new form menuexpediente
     */
    public menuexpediente() {
        initComponents();
         setImagenw("img2.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btneditarpg = new javax.swing.JButton();
        btneditarpg2 = new javax.swing.JButton();
        btneditarpg4 = new javax.swing.JButton();
        btneditarpg1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Modulo Expedientes");

        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/genera.png"))); // NOI18N
        jButton1.setText("Agregar Paciente General");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 102, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/consulta.png"))); // NOI18N
        jButton2.setText("Consulta Paciente General");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btneditarpg.setForeground(new java.awt.Color(0, 102, 153));
        btneditarpg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btneditarpg.setText("Editar Paciente General");
        btneditarpg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditarpg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditarpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarpgActionPerformed(evt);
            }
        });

        btneditarpg2.setForeground(new java.awt.Color(0, 102, 153));
        btneditarpg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/orto.png"))); // NOI18N
        btneditarpg2.setText("Agregar Paciente Ortodoncia");
        btneditarpg2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditarpg2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditarpg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarpg2ActionPerformed(evt);
            }
        });

        btneditarpg4.setForeground(new java.awt.Color(0, 102, 153));
        btneditarpg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/consulta.png"))); // NOI18N
        btneditarpg4.setText("Especificaciones Tratamiento Ortodoncia");
        btneditarpg4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditarpg4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditarpg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarpg4ActionPerformed(evt);
            }
        });

        btneditarpg1.setForeground(new java.awt.Color(0, 102, 153));
        btneditarpg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btneditarpg1.setText("Editar Paciente Ortodoncia");
        btneditarpg1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditarpg1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditarpg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarpg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btneditarpg)
                        .addGap(18, 18, 18)
                        .addComponent(btneditarpg2)
                        .addGap(18, 18, 18)
                        .addComponent(btneditarpg4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btneditarpg1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btneditarpg)
                    .addComponent(btneditarpg2)
                    .addComponent(btneditarpg4)
                    .addComponent(btneditarpg1))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ExpedienteGeneral formExGral = new ExpedienteGeneral();
       Dpanel.add(formExGral);
        formExGral.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         consulta formExGral = new consulta();
       Dpanel.add(formExGral);
        formExGral.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btneditarpgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarpgActionPerformed
        ExpedienteGeneral formExGral = new ExpedienteGeneral();
       Dpanel.add(formExGral);
        formExGral.show();
        this.dispose();
    }//GEN-LAST:event_btneditarpgActionPerformed

    private void btneditarpg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarpg2ActionPerformed
       ExpedienteOrtodoncia formExGral = new ExpedienteOrtodoncia();
       Dpanel.add(formExGral);
        formExGral.show();
        this.dispose();
    }//GEN-LAST:event_btneditarpg2ActionPerformed

    private void btneditarpg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarpg4ActionPerformed
         ExpedienteO formExGral = new ExpedienteO();
       Dpanel.add(formExGral);
        formExGral.show();
        this.dispose();
    }//GEN-LAST:event_btneditarpg4ActionPerformed

    private void btneditarpg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarpg1ActionPerformed
       ExpedienteOrtodoncia formExGral = new ExpedienteOrtodoncia();
       Dpanel.add(formExGral);
        formExGral.show();
        this.dispose();
    }//GEN-LAST:event_btneditarpg1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditarpg;
    private javax.swing.JButton btneditarpg1;
    private javax.swing.JButton btneditarpg2;
    private javax.swing.JButton btneditarpg4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
