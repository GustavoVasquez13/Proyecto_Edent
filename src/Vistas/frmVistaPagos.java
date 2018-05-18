package Vistas;

import Clases.ConsultarDatosBD2;
import Clases.internalFrameImagen;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmVistaPagos extends internalFrameImagen {
    private TableRowSorter trsFiltro;
    
    public frmVistaPagos() {
        initComponents();
        setImagenw("img2.jpg");
        //mostrarPago("SERVICIO");
    }

    private void mostrarPago(String tipo,String consulta,String tipoP,String costo,String fecha){
        try{
            //String estado = this.cmbEstado.getSelectedItem().toString();
            DefaultTableModel modelo;
            ConsultarDatosBD2 mosEmpl = new ConsultarDatosBD2();
            modelo = mosEmpl.mostrarPago(tipo,consulta,tipoP,costo,fecha);
            jtPagos.setModel(modelo);
            Totalizar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DEL EMPLEADO");
        }
    }
    
    //metodo para calcular el total
    private void Totalizar(){
        double t = 0;
        double p = 0;
        if(this.jtPagos.getRowCount()!=0){
            for (int i = 0; i < this.jtPagos.getRowCount(); i++) {
                p = Double.parseDouble(this.jtPagos.getValueAt(i, 1).toString());
                t=t+p;
            }
            this.txtTotal.setText(String.valueOf(t));
        }else{
        //Sin Acciones
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPagos = new javax.swing.JTable();
        cmbTipoPago = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtTotal = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Pagos Realizados");

        jtPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtPagos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtPagos);

        cmbTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SERVICIOS BASICOS", "EMPLEADOS", "MATERIALES", "REPARACIONES", "EQUIPO" }));
        cmbTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoPagoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Seleccione el tipo de Vista");

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

        txtTotal.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Total Pagado");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoPagoActionPerformed
        if(this.cmbTipoPago.getSelectedItem().toString()=="SERVICIOS BASICOS"){
            String serv = "SERVICIO";
            String Servicio="nombre_servicio";
            String costo="costo_servicio";
            String fecha="fechaPago_servicio";
            String sSQL = "select nombre_servicio,costo_servicio,fechaPago_servicio from serviciobasico " +
                "inner join tiposervicio on TipoServicio_id_tipoServicio=id_tipoServicio;";
            mostrarPago(serv,sSQL,Servicio,costo,fecha);
        }else if(this.cmbTipoPago.getSelectedItem().toString()=="MATERIALES"){
            String mater = "MATERIAL";
            String material="nombre_material";
            String costo="pagomateriales.costo_material";
            String fecha="fechaPago_material";
            String sSQL = "select nombre_material,pagomateriales.costo_material,fechaPago_material from pagomateriales\n" +
                            "inner join  materiales on Materiales_id_material=id_material;";
            mostrarPago(mater,sSQL,material,costo,fecha);
        }else if(this.cmbTipoPago.getSelectedItem().toString()=="EMPLEADOS"){
            String emple = "EMPLEADO";
            String emplea="nombre_empl";
            String costo="pagoempleado.sueldo_empl";
            String fecha="fechaPago_empl";
            String sSQL = "select nombre_empl,apellido_empl,pagoempleado.sueldo_empl,fechaPago_empl from pagoempleado\n" +
                            "inner join empleado on Empleado_id_empleado=id_empleado;";
            mostrarPago(emple,sSQL,emplea,costo,fecha);
        }else if(this.cmbTipoPago.getSelectedItem().toString()=="REPARACIONES"){
            String repa = "REPARACION";
            String emplea="tipo_reparacion";
            String costo="costo_repa";
            String fecha="fechaPago_repa";
            String sSQL = "select tipo_reparacion,costo_repa,fechaPago_repa from pagoreparacion\n" +
                            "inner join reparacionclinica on ReparacionClinica_id_raparaClinica=id_raparaClinica;";
            mostrarPago(repa,sSQL,emplea,costo,fecha);
        }else if(this.cmbTipoPago.getSelectedItem().toString()=="EQUIPO"){
            String eq = "EQUIPO";
            String equipo="tipo_equipo";
            String costo="costo_equipo";
            String fecha="fechaPago_equuipo";
            String sSQL = "select tipo_equipo,costo_equipo,fechaPago_equuipo from pagoequipo\n" +
                            "inner join  equipo on Equipo_id_equipo=id_equipo;";
            mostrarPago(eq,sSQL,equipo,costo,fecha);
        }
    }//GEN-LAST:event_cmbTipoPagoActionPerformed

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
                jtPagos.getSelectionModel().setSelectionInterval(0,0);
            }
        });
        trsFiltro = new TableRowSorter(jtPagos.getModel());
        jtPagos.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbTipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPagos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
