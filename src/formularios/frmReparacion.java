package formularios;

import Clases.ActualizarDatosBD;
import Clases.ConsultarDatosBD2;
import Clases.IsertarDatosBD2;
import Clases.internalFrameImagen;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmReparacion extends internalFrameImagen {
    private TableRowSorter trsFiltro;
    
    public frmReparacion() {
        initComponents();
        setImagenw("img2.jpg");
        MRepa();
    }

    //metodo para limpiar las cajas de texto
    private void limpiar(){
        this.txtRepa.setText("");
        this.txtDesc.setText("");
    }
    
    //metodo que muestra las reparaciones
    private void MRepa(){
        try{
            DefaultTableModel modelo;
            ConsultarDatosBD2 repa = new ConsultarDatosBD2();
            modelo = repa.mostRepa();
            this.jtRepa.setModel(modelo);
            this.btnEditar.setEnabled(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CARGAR DATOS A LA TABLA "+e);
        }
    }
    
    //metodo para consultar el codigo de reparacion
    private void codRep(String repar,String descrip){
        int cod;
        ConsultarDatosBD2 code = new ConsultarDatosBD2();
        cod = code.codRepa(repar, descrip);
        this.lblR.setText("Codigo");
        this.lblCod.setText(Integer.toString(cod));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRepa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtRepa = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblR = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel7.setText("Agregar Reparaciones de la clinica");

        jLabel1.setText("Reparacion");

        jLabel2.setText("Descripcion");

        jtRepa = new javax.swing.JTable(){
            public boolean isCellEditable(int fila, int columna){
                return false;
            }
        };
        jtRepa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtRepa.getTableHeader().setReorderingAllowed(false);
        jtRepa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtRepaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtRepa);

        jLabel3.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 102, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 102, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 102, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtRepa)
                                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRepa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnCerrar))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(this.txtRepa.getText().length()!=0 && this.txtDesc.getText().length()!=0){
            String reparacion = this.txtRepa.getText().toUpperCase();
            String desc = this.txtDesc.getText().toUpperCase();
            
            ConsultarDatosBD2 valRep = new ConsultarDatosBD2();
            if(valRep.codRepa(reparacion, desc)==0){
                IsertarDatosBD2 insertRepa = new IsertarDatosBD2();
                insertRepa.insertReparacion(reparacion, desc);

                limpiar();
                MRepa();
            }else{
               JOptionPane.showMessageDialog(null, "YA EXISTE UNA REPARACION SIMILAR"); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS CAMPOS");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jtRepaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRepaMousePressed
        if(evt.getClickCount() == 2){
            int fila = this.jtRepa.getSelectedRow();
            String repa = (String)this.jtRepa.getValueAt(fila, 0);
            String desc = (String)this.jtRepa.getValueAt(fila, 1);
            this.txtRepa.setText(repa);
            this.txtDesc.setText(desc);
            
            this.btnEditar.setEnabled(true);
            this.btnGuardar.setEnabled(false);
            codRep(repa,desc);
        }
    }//GEN-LAST:event_jtRepaMousePressed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(this.txtRepa.getText().length()!=0 && this.txtDesc.getText().length()!=0){
            String reparacion = this.txtRepa.getText().toUpperCase();
            String desc = this.txtDesc.getText().toUpperCase();
            int code = Integer.valueOf(this.lblCod.getText());
            
            ConsultarDatosBD2 valRep = new ConsultarDatosBD2();
            if(valRep.codRepa(reparacion, desc)==0){
                ActualizarDatosBD insertRepa = new ActualizarDatosBD();
                insertRepa.actuReparacion(reparacion, desc, code);

                limpiar();
                MRepa();
                
                this.btnGuardar.setEnabled(true);
                this.btnEditar.setEnabled(false);
                this.lblCod.setText("");
                this.lblR.setText("");
            }else{
               JOptionPane.showMessageDialog(null, "YA EXISTE UNA REPARACION SIMILAR"); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS CAMPOS");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        this.txtBuscar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtBuscar.getText().toUpperCase());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 0));
                jtRepa.getSelectionModel().setSelectionInterval(0, 0);
            }
        });
        trsFiltro = new TableRowSorter(jtRepa.getModel());
        jtRepa.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtRepa;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblR;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtRepa;
    // End of variables declaration//GEN-END:variables
}
