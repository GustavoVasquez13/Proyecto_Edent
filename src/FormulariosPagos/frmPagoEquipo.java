package FormulariosPagos;

import Clases.ConsultarDatosBD2;
import Clases.IsertarDatosBD2;
import Clases.internalFrameImagen;
import Clases.validaciones;
import formularios.frmEquipo;
import formularios.frmPrincipal;
import formulariosAyuda.frmayudaPE;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmPagoEquipo extends internalFrameImagen {
    TableRowSorter trsFiltro;
    
    public frmPagoEquipo() {
        initComponents();
        setImagenw("img2.jpg");
        mosEquipo();
    }

    //metodo para llenar la tabla con los materiales
    private void mosEquipo(){
        try{
            DefaultTableModel modelo;
            ConsultarDatosBD2 mostrarEq = new ConsultarDatosBD2();
            modelo = mostrarEq.mostrarE();
            this.jtEq.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DEL MATERIAL");
        }
    }
    
    //metodo para limpiar las cajas de texto
    private void limpiar(){
        this.txtEquipo.setText("");
        this.txtDesc.setText("");
        this.txtEstado.setText("");
        this.txtTotalPago.setText("");
        this.jdFechaPago.setDate(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEquipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtTotalPago = new javax.swing.JFormattedTextField();
        btnAggEq = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEq = new javax.swing.JTable();
        jdFechaPago = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnAyuda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        btnActualizar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 102, 153));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar Tabla");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Buscar");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Pagos de Equipo");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Fecha de pago");

        txtEquipo.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Total a pagar");

        btnCancelar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 102, 153));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtTotalPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPagoKeyTyped(evt);
            }
        });

        btnAggEq.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnAggEq.setForeground(new java.awt.Color(0, 102, 153));
        btnAggEq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btnAggEq.setText("Agregar Nuevo Equipo");
        btnAggEq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAggEq.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAggEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggEqActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jtEq = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtEq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtEq.getTableHeader().setReorderingAllowed(false);
        jtEq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEqMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtEqMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtEq);

        jdFechaPago.setDateFormatString("yyyy-MM-dd");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Equipo");

        txtDesc.setEditable(false);

        btnRegistrar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 102, 153));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pago.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Estado");

        txtEstado.setEditable(false);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help (1).png"))); // NOI18N
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(15, 15, 15)
                                        .addComponent(jdFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(148, 148, 148)))
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnAggEq)
                .addGap(41, 41, 41)
                .addComponent(btnActualizar)
                .addGap(65, 65, 65)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAggEq)
                    .addComponent(btnActualizar))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        mosEquipo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtTotalPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPagoKeyTyped
        validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtTotalPagoKeyTyped

    private void btnAggEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggEqActionPerformed
        frmEquipo eq = new frmEquipo();
        frmPrincipal.Dpanel.add(eq);
        eq.show();
    }//GEN-LAST:event_btnAggEqActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        txtBuscar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = txtBuscar.getText().toUpperCase();
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 0));
                jtEq.getSelectionModel().setSelectionInterval(0,0);
            }
        });
        trsFiltro = new TableRowSorter(jtEq.getModel());
        jtEq.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jtEqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEqMouseClicked
        int fila = this.jtEq.getSelectedRow();
        String eq = (String)this.jtEq.getValueAt(fila, 0);
        String desc = (String)this.jtEq.getValueAt(fila, 1);
        String estado = (String)this.jtEq.getValueAt(fila, 2);
        this.txtEquipo.setText(eq);
        this.txtDesc.setText(desc);
        this.txtEstado.setText(estado);
    }//GEN-LAST:event_jtEqMouseClicked

    private void jtEqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEqMousePressed

    }//GEN-LAST:event_jtEqMousePressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(this.txtEquipo.getText().length()!=0 && this.txtDesc.getText().length()!=0 && this.txtTotalPago.getText().length()!=0
            && this.jdFechaPago.getDate()!=null){
            String eq = this.txtEquipo.getText();
            String desc = this.txtDesc.getText();
            String estado = this.txtEstado.getText();
            double totalPagar = Double.parseDouble(this.txtTotalPago.getText());
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
            String pasofecha = formatofecha.format(this.jdFechaPago.getDate());

            IsertarDatosBD2 insertPago = new IsertarDatosBD2();
            insertPago.insertPagoEq(eq, desc,estado, totalPagar, pasofecha);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA Y COMPLETE TODOS LOS CAMPOS");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        frmayudaPE ayudaPE = new frmayudaPE();
        frmPrincipal.Dpanel.add(ayudaPE);
        ayudaPE.show();
    }//GEN-LAST:event_btnAyudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAggEq;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFechaPago;
    private javax.swing.JTable jtEq;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtEquipo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JFormattedTextField txtTotalPago;
    // End of variables declaration//GEN-END:variables
}
