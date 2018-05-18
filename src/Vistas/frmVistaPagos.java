package Vistas;

import Clases.ConsultarDatosBD2;
import Clases.internalFrameImagen;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVistaPagos extends internalFrameImagen {

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
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DEL EMPLEADO");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPagos = new javax.swing.JTable();
        cmbTipoPago = new javax.swing.JComboBox<>();

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

        cmbTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SERVICIOS BASICOS", "EMPLEADOS", "MATERIALES", "REPARACIONES", "EQUIPO" }));
        cmbTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(cmbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
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
        }
    }//GEN-LAST:event_cmbTipoPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPagos;
    // End of variables declaration//GEN-END:variables
}
