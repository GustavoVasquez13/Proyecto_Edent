package formularios;

import Clases.ConsultarDatosBD;
import Clases.InsertarDatosBD;
import Clases.conexionBD;
import Clases.internalFrameImagen;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmPagoServBasicos extends internalFrameImagen {
//String[] arraytipo;
ArrayList arraytipo = new ArrayList();
    public frmPagoServBasicos() {
        initComponents();
        //setImagenw("img2.jpg");
        //consultar();
        //consu();
        mostrarServ();
    }
    
    public void mostrarServ() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD funcion = new ConsultarDatosBD();
            modelo = funcion.mostrarServicios();
            jtServ.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de Prestamo");
        }
    }
private void consultar()
    {
        conexionBD cnn=new conexionBD();
        Connection reg=cnn.conectar();
       try {
            Statement stmt = reg.createStatement();
            String query = "SELECT `id_tipoServicio`,`nombre_servicio`,`proveedor_servicio` FROM `tiposervicio`;";

            ResultSet rs = stmt.executeQuery(query);
            //arraytipo = new String[10];
            int i = 0;
            while(rs.next())
            {
                String cod=rs.getString(1);
                String servicio=rs.getString(2);
                String prov=rs.getString(3);
                //this.cmbServicio.addItem(servicio);
                //arraytipo.add(rs.getString(2));
                //txtProveedor.setText(rs.getString(2));
                i++;
            }
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de la Persona");
        }
    }
    private void consu()
    {
        conexionBD cnn=new conexionBD();
        Connection reg=cnn.conectar();
        //String s = cmbServicio.getSelectedItem().toString();
        //jLabel2.setText(s);
       try {
            Statement stmt = reg.createStatement();
            String query = "SELECT `id_tipoServicio`,`nombre_servicio`,`proveedor_servicio` FROM `tiposervicio` WHERE `nombre_servicio`='+s+';";

            ResultSet rs = stmt.executeQuery(query);
            //arraytipo = new String[10];
            int i = 0;
            while(rs.next())
            {
                String cod=rs.getString(1);
                String servicio=rs.getString(2);
                String prov=rs.getString(3);
                //this.cmbServicio.addItem(servicio);
                //arraytipo.add(rs.getString(2));
                txtProveedor.setText(prov);
                i++;
            }
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de la Persona");
        }
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

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Pagos de Servicios Basicos");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Servicio");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Proveedor");

        txtProveedor.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Total a pagar");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Fecha de pago");

        fechaPago.setDateFormatString("yyyy-MM-dd");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

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
        jtServ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtServMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtServ);

        txtServicio.setEditable(false);

        btnAggNS.setText("Agregar Nuevo Servicio");
        btnAggNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggNSActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar Tabla");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)
                                .addComponent(fechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnRegistrar)
                                .addGap(73, 73, 73)
                                .addComponent(btnCancelar)
                                .addGap(49, 49, 49)
                                .addComponent(btnAggNS)
                                .addGap(41, 41, 41)
                                .addComponent(btnActualizar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnAggNS)
                        .addComponent(btnActualizar)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(this.txtServicio.getText().length()!=0 && this.txtProveedor.getText().length()!=0){
            String servicio = this.txtServicio.getText();
            String proveedor = this.txtProveedor.getText();
            double totalPagar = Double.parseDouble(this.txtTotalPago.getText());
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
            String pasofecha = (formatofecha.format(fechaPago.getDate()));
            //Date fecha = Date.valueOf(this.fechaPago.getDate());
            
            InsertarDatosBD insertDatos = new InsertarDatosBD();
            insertDatos.insertPagoServicioBasic(servicio, proveedor, totalPagar, pasofecha);
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA");
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
        }
        else
        {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAggNS;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser fechaPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtServ;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JFormattedTextField txtTotalPago;
    // End of variables declaration//GEN-END:variables
}
