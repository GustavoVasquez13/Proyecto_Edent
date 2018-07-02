package Vistas;
import Clases.ActualizarDatosBD;
import Clases.ConsultarDatosBD;
import Clases.ConsultarDatosBD2;
import Clases.internalFrameImagen;
import formularios.frmEmpleados;
import formularios.frmPrincipal;
import formulariosAyuda.frmayudaVP;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmVistaEmpleado extends internalFrameImagen {
    private TableRowSorter trsFiltro;
    
    public frmVistaEmpleado() {
        initComponents();
        setImagenw("fondo.jpg");
        mostrarEmpl();
    }

    //este metodo muestra en la tabla los empleados registrados
    private void mostrarEmpl(){
        try{
            String estado = this.cmbEstado.getSelectedItem().toString();
            DefaultTableModel modelo;
            ConsultarDatosBD2 mosEmpl = new ConsultarDatosBD2();
            modelo = mosEmpl.mostrarEmpleado(estado);
            jtEmpleados.setModel(modelo);
            if(this.cmbEstado.getSelectedItem().toString()=="INACTIVO"){
                this.btnEliminar.setEnabled(false);
                this.btnActivar.setEnabled(true);
            }else{
                this.btnEliminar.setEnabled(true);
                this.btnActivar.setEnabled(false);
         }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DEL EMPLEADO");
        }
    }
    
    //metodo para actualizar a activo e inactivo
    private void EliminarR(String estado){
       if(this.jtEmpleados.getSelectedRowCount()!=0){
            if(JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE MOVER EL REGISTRO")==JOptionPane.OK_OPTION){
                int fila = this.jtEmpleados.getSelectedRow(); 
                String dui = (String)this.jtEmpleados.getValueAt(fila, 7);
                ActualizarDatosBD insertEmpleado = new ActualizarDatosBD();
                insertEmpleado.inactivarEmpl(dui,estado);
                mostrarEmpl();
            }
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA");
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleados = new javax.swing.JTable();
        btnAggNS = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnActivar = new javax.swing.JButton();
        btnAyuda2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empleados");

        jtEmpleados = new javax.swing.JTable(){
            public boolean isCellEditable(int fila, int columna){
                return false;
            }
        };
        jtEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtEmpleados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtEmpleados);

        btnAggNS.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnAggNS.setForeground(new java.awt.Color(0, 102, 153));
        btnAggNS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btnAggNS.setText("Agregar Nuevo Empleado");
        btnAggNS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAggNS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAggNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggNSActionPerformed(evt);
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

        btnEliminar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 102, 153));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/recycle-bin-full-3-ConvertImage.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecione el tipo de Vista");

        btnActivar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnActivar.setForeground(new java.awt.Color(0, 102, 153));
        btnActivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/addUse.png"))); // NOI18N
        btnActivar.setText("Activar");
        btnActivar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActivar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        btnAyuda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help (1).png"))); // NOI18N
        btnAyuda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyuda2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAggNS)
                                .addGap(67, 67, 67)
                                .addComponent(btnEliminar)
                                .addGap(63, 63, 63)
                                .addComponent(btnActivar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 48, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addComponent(btnAyuda2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnAyuda2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAggNS)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActivar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAggNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggNSActionPerformed
        frmEmpleados formEmp = new frmEmpleados();
        frmPrincipal.Dpanel.add(formEmp);
        formEmp.show();
    }//GEN-LAST:event_btnAggNSActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String estado = "INACTIVO";
        EliminarR(estado);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // mostrar dato buscado desde el textbox
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText().toUpperCase());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 0));
                jtEmpleados.getSelectionModel().setSelectionInterval(0,0);
            }
        });
        trsFiltro = new TableRowSorter(jtEmpleados.getModel());
        jtEmpleados.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
         mostrarEmpl();
         if(this.cmbEstado.getSelectedItem().toString()=="INACTIVO"){
             this.btnEliminar.setEnabled(false);
             this.btnActivar.setEnabled(true);
         }else{
             this.btnEliminar.setEnabled(true);
              this.btnActivar.setEnabled(false);
         }
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        String estado = "ACTIVO";
        EliminarR(estado);
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnAyuda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyuda2ActionPerformed
        frmayudaVP ayudaVP = new frmayudaVP();
        frmPrincipal.Dpanel.add(ayudaVP);
        ayudaVP.show();
    }//GEN-LAST:event_btnAyuda2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnAggNS;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnAyuda1;
    private javax.swing.JButton btnAyuda2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEmpleados;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
