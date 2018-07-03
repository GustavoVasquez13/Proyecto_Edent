
package formularios;

import Clases.ConsultarDatosBD;
import Clases.internalFrameImagen;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class frmvistapacientes extends internalFrameImagen{
 private TableRowSorter trsFiltro;
   
    public frmvistapacientes() {
        initComponents();
        setImagenw("fondo.jpg");
        mostrarpacientes();
        
    }
    // este metodo muestra en la tabla todos los pacientes registrados 
    //tiene instancia con la clase ConsultarDatosBD y el metodo mostrarpacientes()
    private void mostrarpacientes() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD Mostrarp = new ConsultarDatosBD();
            modelo = Mostrarp.mostrarPacientes();
            jtPacientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE PACIENTES");
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        lblcodigo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vista de Pacientes Ortodoncia");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jtPacientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtPacientes.getTableHeader().setReorderingAllowed(false);
        jtPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtPacientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtPacientes);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 102, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Salir");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblcodigo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo.setText("codigo");

        lblnombre.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblcodigo)
                        .addGap(52, 52, 52)
                        .addComponent(lblnombre)
                        .addGap(94, 94, 94)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(272, 272, 272))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        //  se utiliza para filtrar los datos mostrados en el jtable
        this.txtBuscar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText().toUpperCase(), 1));
                jtPacientes.getSelectionModel().setSelectionInterval(0, 0);
            }
        });
        trsFiltro = new TableRowSorter(jtPacientes.getModel());
        jtPacientes.setRowSorter(trsFiltro);
        
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jtPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacientesMousePressed
            if(evt.getClickCount()==2){
            int fila =jtPacientes.getSelectedRow();
            String nombre;
            String apellido,tel,edad,direc,idtipo,id;
            
            nombre=jtPacientes.getValueAt(fila, 1).toString(); 
            apellido=jtPacientes.getValueAt(fila, 2).toString();
            direc=jtPacientes.getValueAt(fila, 3).toString();
            tel=jtPacientes.getValueAt(fila, 4).toString();
            edad=jtPacientes.getValueAt(fila, 5).toString();
            idtipo = jtPacientes.getValueAt(fila, 6).toString();
            id= jtPacientes.getValueAt(fila, 0).toString();
            ExpedienteOrtodoncia.txttelefono.setText(tel);
            ExpedienteOrtodoncia.txtedad.setText(edad);
            ExpedienteOrtodoncia.txtdireccion.setText(direc);
            ExpedienteOrtodoncia.txtnombre.setText(nombre);
            ExpedienteOrtodoncia.txtapellido.setText(apellido);
            ExpedienteOrtodoncia.txttip.setText(id);
            ExpedienteOrtodoncia.txttip2.setText(idtipo);
            
            
            this.dispose();
        }        
        ExpedienteOrtodoncia.txtMotivoC.setEnabled(true);
        ExpedienteOrtodoncia.btneditar.setEnabled(false);
        ExpedienteOrtodoncia.btnbuscaredicion.setEnabled(false);
        ExpedienteOrtodoncia.btnGuardar.setEnabled(true);
        ExpedienteOrtodoncia.txtHistoriaO.setEnabled(true);
        ExpedienteOrtodoncia.txtHistoriaM.setEnabled(true);
        ExpedienteOrtodoncia.txtExamenC.setEnabled(true);
        ExpedienteOrtodoncia.txtDX.setEnabled(true);
        ExpedienteOrtodoncia.jfecha.setEnabled(true);
       //  ExpedienteOrtodoncia.btndientes.setEnabled(true);
        ExpedienteOrtodoncia.txtMotivoC.setBackground(Color.LIGHT_GRAY);
        

    }//GEN-LAST:event_jtPacientesMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
