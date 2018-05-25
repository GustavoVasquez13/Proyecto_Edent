package formularios;


import Clases.ConsultarDatosBD2;
import Clases.internalFrameImagen;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;

public class frmEditarPO extends internalFrameImagen {
 private TableRowSorter trsFiltro;
    
    public frmEditarPO() {
        initComponents();
        setImagenw("img2.jpg");
        mostrarpacientes();
    }
private void mostrarpacientes() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD2 Mostrarp = new ConsultarDatosBD2();
            modelo = Mostrarp.mostrarPacientesConsultaO();
            jtPacientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE SERVICIOS");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("Vista de Pacientes de Odontologia General a Editar");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel6)
                            .addGap(12, 12, 12)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
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
            String nombre, dx,motivoC,historiaM;
            String historiaO,examenC,id,apellido;
            nombre=jtPacientes.getValueAt(fila, 1).toString();
            apellido=jtPacientes.getValueAt(fila,2).toString();
            dx=jtPacientes.getValueAt(fila, 7).toString();
            id=jtPacientes.getValueAt(fila, 0).toString();
            motivoC = jtPacientes.getValueAt(fila,3).toString();
            historiaM = jtPacientes.getValueAt(fila,4).toString();
            historiaO = jtPacientes.getValueAt(fila,5).toString();
            examenC = jtPacientes.getValueAt(fila,6).toString();
            


            ExpedienteOrtodoncia.txtnombre.setText(nombre);
            ExpedienteOrtodoncia.txtapellido.setText(apellido);
            ExpedienteOrtodoncia.lblid.setText(id);
            ExpedienteOrtodoncia.txtDX.setText(dx);
            ExpedienteOrtodoncia.txtMotivoC.setText(motivoC);
            ExpedienteOrtodoncia.txtHistoriaM.setText(historiaM);
            ExpedienteOrtodoncia.txtHistoriaO.setText(historiaO);
            ExpedienteOrtodoncia.txtExamenC.setText(examenC);
            this.dispose();
             ExpedienteOrtodoncia.btneditar.setEnabled(true);
        
        }
        
        
        ExpedienteOrtodoncia.fecha.setEnabled(false);
        ExpedienteOrtodoncia.txtedad.setEnabled(false);
        ExpedienteOrtodoncia.txttelefono.setEnabled(false);
        ExpedienteOrtodoncia.txtnombre.setEnabled(false);
        ExpedienteOrtodoncia.txtapellido.setEnabled(false);
        ExpedienteOrtodoncia.txtdireccion.setEnabled(false);
        ExpedienteOrtodoncia.btneditar.setEnabled(true);
        ExpedienteOrtodoncia.btnbuscaredicion.setEnabled(false);
        ExpedienteOrtodoncia.btnGuardar.setEnabled(false);
        ExpedienteOrtodoncia.txtMotivoC.setEnabled(true);
        ExpedienteOrtodoncia.txtHistoriaO.setEnabled(true);
        ExpedienteOrtodoncia.txtHistoriaM.setEnabled(true);
        ExpedienteOrtodoncia.txtExamenC.setEnabled(true);
        ExpedienteOrtodoncia.txtDX.setEnabled(true);
        
   
    }//GEN-LAST:event_jtPacientesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}