package formularios;

import Clases.ConsultarDatosBD;
import Clases.internalFrameImagen;
import Clases.InsertarDatosBD;
import Clases.validaciones;
import formulariosAyuda.frmayudaPP;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmCompraProducto extends internalFrameImagen {

    private TableRowSorter trsFiltrarProv;
    private TableRowSorter trsFiltrarProd;
    int codigoProv;
    int codigoProd;
    
    public frmCompraProducto() {
        initComponents();
        setImagenw("img2.jpg");        
        mostrarProv();
        mostrarProd();
    }
    
    //este metodo muestra los proveedores en el grid jtProv
    public void mostrarProv() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD funcion = new ConsultarDatosBD();
            modelo = funcion.mostrarProveedores();
            jtProv.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Proveedores");
        }
    }
    
    // Este metodo limpia los textbox del formulario
    public void limpiarTxt(){
        txtBuscarProv.setText("");
        txtBuscarProd.setText("");
        txtCosto.setText("");
        txtCantidad.setText("");
        txtProducto.setText("");
        txtProveedor.setText("");
        txtMarca.setText("");   
        fechaCompra.setDate(null);
    }
    
    //este metodo muestra los productos en el grid jtProd
    public void mostrarProd() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD funcion = new ConsultarDatosBD();
            modelo = funcion.mostrarProductos();
            jtProd.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Producto");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSelectProd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarProd = new javax.swing.JTextField();
        txtBuscarProv = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        btnSelectProve = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProv = new javax.swing.JTable();
        txtProveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProd = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        fechaCompra = new com.toedter.calendar.JDateChooser();
        btnActualizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setAutoscrolls(true);

        btnSelectProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSelectProd.setForeground(new java.awt.Color(0, 102, 153));
        btnSelectProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/producto_1.png"))); // NOI18N
        btnSelectProd.setText("Nuevo Producto");
        btnSelectProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSelectProd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSelectProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectProdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Costo:");

        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Cantidad:");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Comprar productos");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText(" Buscar Producto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Buscar Proveedor:");

        txtBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarProdKeyTyped(evt);
            }
        });

        txtBuscarProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarProvKeyTyped(evt);
            }
        });

        btnComprar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(0, 102, 153));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/compra.png"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComprar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnSelectProve.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSelectProve.setForeground(new java.awt.Color(0, 102, 153));
        btnSelectProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedor_.png"))); // NOI18N
        btnSelectProve.setText("Nuevo Proveedor");
        btnSelectProve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSelectProve.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSelectProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectProveActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Marca:");

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 102, 153));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jtProv = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        jtProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtProv.getTableHeader().setReorderingAllowed(false);
        jtProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProv);

        txtProveedor.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Proveedor seleccionado:");

        txtProducto.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText(" Producto seleccionado:");

        jtProd = new javax.swing.JTable(){     public boolean isCellEditable(int rowIndex, int colIndex){         return false;     } };
        jtProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtProd.getTableHeader().setReorderingAllowed(false);
        jtProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtProd);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Fecha de compra:");

        fechaCompra.setDateFormatString("yyy-MM-dd");

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 102, 153));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("Para seleccionar de click en un proveedor");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Para seleccionar de click en un producto");

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
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnComprar)
                                .addGap(59, 59, 59)
                                .addComponent(btnSelectProve)
                                .addGap(272, 272, 272))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSelectProd)
                                .addGap(76, 76, 76)))
                        .addComponent(btnActualizar)
                        .addGap(84, 84, 84)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(433, 433, 433)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel4)
                                    .addGap(4, 4, 4)
                                    .addComponent(txtBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(339, 339, 339))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)))
                                .addGap(2, 2, 2))))
                    .addComponent(fechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar)
                    .addComponent(btnSelectProve)
                    .addComponent(btnSelectProd)
                    .addComponent(btnActualizar)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectProdActionPerformed
     frmProducto formProd = new frmProducto();
     frmPrincipal.Dpanel.add(formProd);
     formProd.show();
    }//GEN-LAST:event_btnSelectProdActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if(txtProveedor.getText().length() !=0 && txtProducto.getText().length()!=0 
                && txtCosto.getText().length() !=0 && txtMarca.getText().length() !=0
                && txtCantidad.getText().length() !=0 && fechaCompra.getDate()!=null){
            int IdProd = codigoProd;
            double costo = Double.parseDouble(txtCosto.getText()); 
            int cantidad = Integer.parseInt(txtCantidad.getText());
            String marca = txtMarca.getText().toUpperCase();
            int IdProv = codigoProv;
            //convierto a tipo String la fecha
            String dia = Integer.toString(fechaCompra.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(fechaCompra.getCalendar().get(Calendar.MONTH) + 1);
            String year = Integer.toString(fechaCompra.getCalendar().get(Calendar.YEAR));
            String fechaA = (year + "-" + mes+ "-" + dia);
            String date = fechaA;
            InsertarDatosBD insertar = new InsertarDatosBD();
            insertar.insertComprasProduc(IdProd, costo, cantidad, marca, fechaA, IdProv);
            limpiarTxt();       
        }else{
            JOptionPane.showMessageDialog(null, "Debe Llenar todos los campos");
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnSelectProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectProveActionPerformed
       frmProveedores formProv= new frmProveedores();
       frmPrincipal.Dpanel.add(formProv);
       formProv.show();
    }//GEN-LAST:event_btnSelectProveActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    /*en este metodo de MouseClicked paso el nombre del contenido seleccionado del 
    grid JtProv al textbox y el id a una variable global*/
    private void jtProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProvMouseClicked
        int filaSelect = jtProv.getSelectedRow();
        String codigoProve = (String)jtProv.getValueAt(filaSelect, 0);
        codigoProv=Integer.parseInt(codigoProve);
        String nombreProv = (String)jtProv.getValueAt(filaSelect, 1);
        txtProveedor.setText(nombreProv);
        txtBuscarProv.setText("");
    }//GEN-LAST:event_jtProvMouseClicked

    /*en este metodo de MouseClicked paso el nombre del contenido seleccionado del 
    grid JtProd al textbox y el id a una variable global*/
    private void jtProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdMouseClicked
        int filaSelect = jtProd.getSelectedRow();
        String codigoProdu = (String)jtProd.getValueAt(filaSelect, 0);
        codigoProd = Integer.parseInt(codigoProdu);
        String nombreProd = (String)jtProd.getValueAt(filaSelect, 1);
        txtProducto.setText(nombreProd);
        txtBuscarProd.setText("");
    }//GEN-LAST:event_jtProdMouseClicked

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        validaciones val=new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtBuscarProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProvKeyTyped
        //muestra lo que queremos buscar desde el textbox
        txtBuscarProv.addKeyListener(new KeyAdapter()
        {
            public void keyReleased(final KeyEvent e){
                String cadenaProv = (txtBuscarProv.getText().toUpperCase());
                txtBuscarProv.setText(cadenaProv);
                repaint();
                trsFiltrarProv.setRowFilter(RowFilter.regexFilter(txtBuscarProv.getText(),1));
                jtProv.getSelectionModel().setSelectionInterval(0,1);
            }
        });
        trsFiltrarProv = new TableRowSorter(jtProv.getModel());
        jtProv.setRowSorter(trsFiltrarProv);
    }//GEN-LAST:event_txtBuscarProvKeyTyped

    private void txtBuscarProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProdKeyTyped
        //muestra lo que queremos buscar desde el textbox
        txtBuscarProd.addKeyListener(new KeyAdapter()
        {
            public void keyReleased(final KeyEvent e){
                String cadenaProv = (txtBuscarProd.getText().toUpperCase());
                txtBuscarProd.setText(cadenaProv);
                repaint();
                trsFiltrarProd.setRowFilter(RowFilter.regexFilter(txtBuscarProd.getText(),1));
                jtProd.getSelectionModel().setSelectionInterval(0,0);
            }
        });
        trsFiltrarProd = new TableRowSorter(jtProd.getModel());
        jtProd.setRowSorter(trsFiltrarProd);
    }//GEN-LAST:event_txtBuscarProdKeyTyped

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        mostrarProv();
        mostrarProd();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        frmayudaPP ayudaPP = new frmayudaPP();
        frmPrincipal.Dpanel.add(ayudaPP);
        ayudaPP.show();
    }//GEN-LAST:event_btnAyudaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnSelectProd;
    private javax.swing.JButton btnSelectProve;
    private com.toedter.calendar.JDateChooser fechaCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtProd;
    private javax.swing.JTable jtProv;
    private javax.swing.JTextField txtBuscarProd;
    private javax.swing.JTextField txtBuscarProv;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
