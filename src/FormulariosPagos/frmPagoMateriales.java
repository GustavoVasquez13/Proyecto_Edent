package FormulariosPagos;

import Clases.ConsultarDatosBD2;
import Clases.IsertarDatosBD2;
import Clases.internalFrameImagen;
import Clases.validaciones;
import formularios.frmPrincipal;
import formularios.frmmateriales;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmPagoMateriales extends internalFrameImagen {
     private TableRowSorter trsFiltro;
     
    public frmPagoMateriales() {
        initComponents();
        setImagenw("img2.jpg");
        MostMaterial();
    }

    //metodo para mostrar los materiales en la tabla
    private void MostMaterial(){
        DefaultTableModel modelo;
        ConsultarDatosBD2 mostrarM = new ConsultarDatosBD2();
        modelo = mostrarM.mostrarM();
        this.jtMaterial.setModel(modelo);
    }
    
    //metodo para limpiar las cajas de texto
    private void limpiar(){
        this.txtNombre.setText("");
        this.txtDesc.setText("");
        this.txtTotalPago.setText("");
        this.jdFechaPago.setDate(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jdFechaPago = new com.toedter.calendar.JDateChooser();
        btnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAggMaterial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterial = new javax.swing.JTable();
        txtDesc = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTotalPago = new javax.swing.JFormattedTextField();
        txtBuscar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Fecha de pago");

        jdFechaPago.setDateFormatString("yyyy-MM-dd");

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

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Descripcion");

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

        btnAggMaterial.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnAggMaterial.setForeground(new java.awt.Color(0, 102, 153));
        btnAggMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btnAggMaterial.setText("Agregar Nuevo Material");
        btnAggMaterial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAggMaterial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAggMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggMaterialActionPerformed(evt);
            }
        });

        jtMaterial = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtMaterial.getTableHeader().setReorderingAllowed(false);
        jtMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMaterialMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtMaterialMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtMaterial);

        txtDesc.setEditable(false);

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

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Pagos de Materiales");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Total a pagar");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Buscar");

        txtNombre.setEditable(false);

        txtTotalPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPagoKeyTyped(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(279, 279, 279))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnRegistrar)
                .addGap(55, 55, 55)
                .addComponent(btnAggMaterial)
                .addGap(51, 51, 51)
                .addComponent(btnActualizar)
                .addGap(78, 78, 78)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCancelar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
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
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRegistrar)
                                .addComponent(btnAggMaterial)
                                .addComponent(btnActualizar)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(this.txtNombre.getText().length()!=0 && this.txtDesc.getText().length()!=0 && this.txtTotalPago.getText().length()!=0
                && this.jdFechaPago.getDate()!=null){
            String nombre = this.txtNombre.getText();
            String desc = this.txtDesc.getText();
            double totalPagar = Double.parseDouble(this.txtTotalPago.getText());
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
            String pasofecha = formatofecha.format(this.jdFechaPago.getDate());
            
            IsertarDatosBD2 insertPago = new IsertarDatosBD2();
            insertPago.insertPagoMaterial(nombre, desc, totalPagar, pasofecha);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA Y COMPLETE TODOS LOS CAMPOS");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAggMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggMaterialActionPerformed
        frmmateriales formM = new frmmateriales();
        frmPrincipal.Dpanel.add(formM);
        formM.show();
    }//GEN-LAST:event_btnAggMaterialActionPerformed

    private void jtMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMaterialMousePressed

    }//GEN-LAST:event_jtMaterialMousePressed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        MostMaterial();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtTotalPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPagoKeyTyped
        validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtTotalPagoKeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
         //mostrar dato buscado desde el textbox
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText().toUpperCase());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 0));
                jtMaterial.getSelectionModel().setSelectionInterval(0,0);
            }
        });
        trsFiltro = new TableRowSorter(jtMaterial.getModel());
        jtMaterial.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jtMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMaterialMouseClicked
            int fila = this.jtMaterial.getSelectedRow();
           String nombre = (String)this.jtMaterial.getValueAt(fila, 0);
           String desc = (String)this.jtMaterial.getValueAt(fila, 1);
           String costo = (String)this.jtMaterial.getValueAt(fila, 4);
           String cant = (String)this.jtMaterial.getValueAt(fila, 3);
           double tot = (Integer.valueOf(cant)*Double.valueOf(costo));
           
           this.txtNombre.setText(nombre);
           this.txtDesc.setText(desc);
           this.txtTotalPago.setText(String.valueOf(tot));
    }//GEN-LAST:event_jtMaterialMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAggMaterial;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFechaPago;
    private javax.swing.JTable jtMaterial;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTotalPago;
    // End of variables declaration//GEN-END:variables
}
