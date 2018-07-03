package formularios;

import Clases.ConsultarDatosBD;
import Clases.InsertarDatosBD;
import Clases.internalFrameImagen;
import Clases.validaciones;
import formulariosAyuda.frmayudaPE;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmPagoServBasicos extends internalFrameImagen {
    private TableRowSorter trsFiltro;

    public frmPagoServBasicos() {
        initComponents();
            setImagenw("fondo.jpg");
        mostrarServ();
    }
    
    // este metodo muestra en la tabla todos los servicios basicos que estan registrados y es llamado en el load del form
    //tiene instancia con la clase ConsultarDatosBD y el metodo mostrarServicios()
    private void mostrarServ() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD MostrarSB = new ConsultarDatosBD();
            modelo = MostrarSB.mostrarServicios();
            jtServ.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Servicios Basicos");
        }
    }
    
    // este metodo limpia las cajas de texto con un valor vacio y se utiliza en el boton registrar
    private void limpiarTxt(){
        txtServicio.setText("");
        txtProveedor.setText("");
        txtTotalPago.setText("");
        fechaPago.setDate(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalPago = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        fechaPago = new com.toedter.calendar.JDateChooser();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtServ = new javax.swing.JTable();
        txtServicio = new javax.swing.JTextField();
        btnAggNS = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnAyuda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagos de Servicios Basicos");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Servicio");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Proveedor");

        txtProveedor.setEditable(false);
        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProveedorKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total a pagar");

        txtTotalPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalPagoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPagoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de pago");

        fechaPago.setDateFormatString("yyyy-MM-dd");

        btnRegistrar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 51, 153));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pago.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

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

        jtServ = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtServ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtServ.getTableHeader().setReorderingAllowed(false);
        jtServ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtServMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtServ);

        txtServicio.setEditable(false);
        txtServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtServicioKeyPressed(evt);
            }
        });

        btnAggNS.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnAggNS.setForeground(new java.awt.Color(0, 51, 153));
        btnAggNS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btnAggNS.setText("Agregar Nuevo Servicio");
        btnAggNS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAggNS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAggNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggNSActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 51, 153));
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
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

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
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(fechaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(13, 13, 13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(14, 14, 14)
                                        .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(189, 189, 189)))
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnRegistrar)
                .addGap(60, 60, 60)
                .addComponent(btnAggNS)
                .addGap(41, 41, 41)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(69, 69, 69))
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
                        .addGap(30, 30, 30)
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addComponent(btnAggNS)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(this.txtServicio.getText().length()!=0 && this.txtProveedor.getText().length()!=0 && this.txtTotalPago.getText().length()!=0 
                && this.fechaPago.getDate()!=null){
            String servicio = this.txtServicio.getText();
            String proveedor = this.txtProveedor.getText();
            double totalPagar = Double.parseDouble(this.txtTotalPago.getText());
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
            String pasofecha = (formatofecha.format(fechaPago.getDate()));
 
            InsertarDatosBD insertDatos = new InsertarDatosBD();
            insertDatos.insertPagoServicioBasic(servicio, proveedor, totalPagar, pasofecha);
            limpiarTxt();
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA Y COMPLETE TODOS LOS CAMPOS");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jtServMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtServMousePressed
        if(evt.getClickCount()==1){
           if (jtServ.getSelectedRowCount() != 0)
            {
                int filaSelect = jtServ.getSelectedRow();
                String serv = (String)jtServ.getValueAt(filaSelect, 0);
                String prov = (String)jtServ.getValueAt(filaSelect, 1);
                this.txtServicio.setText(serv);
                this.txtProveedor.setText(prov);
            }else{
                JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA");
            }
        }
    }//GEN-LAST:event_jtServMousePressed

    private void btnAggNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggNSActionPerformed
        frmServBasicos formSB = new frmServBasicos();
        frmPrincipal.Dpanel.add(formSB);
        formSB.show();
    }//GEN-LAST:event_btnAggNSActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        mostrarServ();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // mostrar dato buscado desde el textbox
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText().toUpperCase());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 0));
                jtServ.getSelectionModel().setSelectionInterval(0,0);
            }
        });
        trsFiltro = new TableRowSorter(jtServ.getModel());
        jtServ.setRowSorter(trsFiltro); 
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtTotalPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPagoKeyTyped
        validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtTotalPagoKeyTyped

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        frmayudaPE ayudaPE = new frmayudaPE();
        frmPrincipal.Dpanel.add(ayudaPE);
        ayudaPE.show();
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void txtServicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServicioKeyPressed
        txtServicio.setBackground(Color.WHITE);
        txtServicio.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB){
            txtProveedor.requestFocus();
            txtProveedor.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtServicioKeyPressed

    private void txtProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyPressed
        txtProveedor.setBackground(Color.WHITE);
        txtProveedor.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB){
            txtTotalPago.requestFocus();
            txtTotalPago.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtProveedorKeyPressed

    private void txtTotalPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPagoKeyPressed
        txtTotalPago.setBackground(Color.WHITE);
        txtTotalPago.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
    }//GEN-LAST:event_txtTotalPagoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAggNS;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser fechaPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtServ;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JFormattedTextField txtTotalPago;
    // End of variables declaration//GEN-END:variables
}
