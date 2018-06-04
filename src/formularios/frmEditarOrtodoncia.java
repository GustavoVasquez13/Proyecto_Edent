package formularios;


import Clases.ConsultarDatosBD2;
import Clases.internalFrameImagen;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;

public class frmEditarOrtodoncia extends internalFrameImagen {
 private TableRowSorter trsFiltro;
    
    public frmEditarOrtodoncia() {
        initComponents();
        setImagenw("img2.jpg");
        mostrarpacientes();
    }
private void mostrarpacientes() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD2 Mostrarp = new ConsultarDatosBD2();
            modelo = Mostrarp.mostrarPacientesConsultaOrtodoncia();
            jtPacientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE SERVICIOS");
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
        jLabel1 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Vista de Pacientes de Odontologia General a Editar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Buscar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 85, -1, 26));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 84, 185, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 132, 1333, 192));

        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Nombre del paciente Seleccionado:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 92, -1, -1));
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 176, 30));

        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Apellido del paciente Seleccionado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, -1, -1));
        getContentPane().add(lblapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 80, 176, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        //  se utiliza para filtrar los datos mostrados en el jtable
        this.txtBuscar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText().toUpperCase(), 2));
                jtPacientes.getSelectionModel().setSelectionInterval(0, 0);
            }
        });
        trsFiltro = new TableRowSorter(jtPacientes.getModel());
        jtPacientes.setRowSorter(trsFiltro);

    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jtPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacientesMousePressed
        if(evt.getClickCount() == 1){
            int fila = jtPacientes.getSelectedRow();
            String nombre, apellido;
            nombre = jtPacientes.getValueAt(fila, 2).toString();
            apellido = jtPacientes.getValueAt(fila, 3).toString();
            
            frmEditarOrtodoncia.lblnombre.setText(nombre);
            frmEditarOrtodoncia.lblapellido.setText(apellido);
        }
        
        if(evt.getClickCount()==2){
            int fila =jtPacientes.getSelectedRow();
            String nombre, idconsulta,idortoncia,apellido,articular,goniaco,impa,jarabak,facial,is,ii;
            String fhis,anb82,anb80,anb2,pals,pali,ptb,dsd,clasim,entornod;
            String bandas,tubos,otros,aparato,exodoncia,brackets,retenciones,arcos,md,rocabado;
            nombre=jtPacientes.getValueAt(fila, 2).toString();
            apellido=jtPacientes.getValueAt(fila,3).toString();
            idconsulta=jtPacientes.getValueAt(fila, 0).toString();
            idortoncia=jtPacientes.getValueAt(fila, 1).toString();
            articular = jtPacientes.getValueAt(fila,4).toString();
            goniaco = jtPacientes.getValueAt(fila,5).toString();
            impa = jtPacientes.getValueAt(fila,6).toString();
            jarabak = jtPacientes.getValueAt(fila, 7).toString();
            facial = jtPacientes.getValueAt(fila,8).toString();
            is=jtPacientes.getValueAt(fila, 9).toString();
            ii=jtPacientes.getValueAt(fila,10).toString();
            fhis=jtPacientes.getValueAt(fila, 11).toString();
            anb82=jtPacientes.getValueAt(fila, 12).toString();
            anb80 = jtPacientes.getValueAt(fila,13).toString();
            anb2 = jtPacientes.getValueAt(fila,14).toString();
            pals = jtPacientes.getValueAt(fila,15).toString();
            pali = jtPacientes.getValueAt(fila,16).toString();
            ptb=jtPacientes.getValueAt(fila, 17).toString();
            dsd=jtPacientes.getValueAt(fila,21).toString();
            clasim=jtPacientes.getValueAt(fila, 22).toString();
            entornod=jtPacientes.getValueAt(fila, 23).toString();
            bandas = jtPacientes.getValueAt(fila,24).toString();
            tubos = jtPacientes.getValueAt(fila,25).toString();
            otros = jtPacientes.getValueAt(fila,26).toString();
            aparato = jtPacientes.getValueAt(fila,27).toString();
            exodoncia=jtPacientes.getValueAt(fila, 28).toString();
            brackets=jtPacientes.getValueAt(fila,29).toString();
            retenciones=jtPacientes.getValueAt(fila, 30).toString();
            arcos=jtPacientes.getValueAt(fila, 31).toString();
            md = jtPacientes.getValueAt(fila,32).toString();
            rocabado = jtPacientes.getValueAt(fila,39).toString();
       
            


            ExpedienteO.lbnombre.setText(nombre);
            ExpedienteO.lbapellido.setText(apellido);
            ExpedienteO.lbidcefa.setText(idconsulta );
            ExpedienteO.lbidplan.setText(idortoncia);
            ExpedienteO.txtanguloA1.setText(articular);
            ExpedienteO.txtanguloG1.setText(goniaco);
            ExpedienteO.txtIMPA1.setText(impa);
            ExpedienteO.txtJa1.setText(jarabak);
            ExpedienteO.txtEJE.setText(facial);
            ExpedienteO.txtIS.setText(is);
            ExpedienteO.txtII.setText(ii);
            ExpedienteO.txtFHIS.setText(fhis);
            ExpedienteO.txtANB82.setText(anb82);
            ExpedienteO.txtANB80.setText(anb80);
            ExpedienteO.txtANB2.setText(anb2);
            ExpedienteO.txtPALS.setText(pals);
            ExpedienteO.txtPALI.setText(pali);
            ExpedienteO.txtPTB.setText(ptb);
            ExpedienteO.txtDSD.setText(dsd);
            ExpedienteO.txtmaxilares.setText(clasim);
            ExpedienteO.txtEntornoD.setText(entornod);
            ExpedienteO.txtbandas.setText(bandas);
            ExpedienteO.txttubos.setText(tubos);
            ExpedienteO.txtotros.setText(otros);
            ExpedienteO.txtAparato.setText(aparato);
            ExpedienteO.txtexodoncia.setText(exodoncia);
            ExpedienteO.txtBrakets.setText(brackets);
            ExpedienteO.txtRetenciones.setText(retenciones);
            ExpedienteO.txtsecuencia.setText(arcos);
            ExpedienteO.txtMD.setText(md);
            ExpedienteO.txtrocabado.setText(rocabado);
//            ExpedienteO.txtPALS.setText(pals);
            
            this.dispose();
ExpedienteO.txtanguloA1.setEnabled(true);
            ExpedienteO.txtanguloG1.setEnabled(true);
            ExpedienteO.txtIMPA1.setEnabled(true);
            ExpedienteO.txtJa1.setEnabled(true);
            ExpedienteO.txtEJE.setEnabled(true);
            ExpedienteO.txtIS.setEnabled(true);
            ExpedienteO.txtII.setEnabled(true);
            ExpedienteO.txtFHIS.setEnabled(true);
            ExpedienteO.txtANB82.setEnabled(true);
            ExpedienteO.txtANB80.setEnabled(true);
            ExpedienteO.txtANB2.setEnabled(true);
            ExpedienteO.txtPALS.setEnabled(true);
            ExpedienteO.txtPALI.setEnabled(true);
            ExpedienteO.txtPTB.setEnabled(true);
            ExpedienteO.txtDSD.setEnabled(true);
            ExpedienteO.txtmaxilares.setEnabled(true);
            ExpedienteO.txtEntornoD.setEnabled(true);
            ExpedienteO.txtbandas.setEnabled(true);
            ExpedienteO.txttubos.setEnabled(true);
            ExpedienteO.txtotros.setEnabled(true);
            ExpedienteO.txtAparato.setEnabled(true);
            ExpedienteO.txtexodoncia.setEnabled(true);
            ExpedienteO.txtBrakets.setEnabled(true);
            ExpedienteO.txtRetenciones.setEnabled(true);
            ExpedienteO.txtsecuencia.setEnabled(true);
            ExpedienteO.txtMD.setEnabled(true);
            ExpedienteO.txtrocabado.setEnabled(true);
            ExpedienteO.jButton1.setEnabled(false);
            ExpedienteO.btnguardar.setEnabled(false);
            ExpedienteO.btneditar.setEnabled(true);
            ExpedienteO.btnpaciente.setEnabled(false);
        
        }
        
        

        
   
    }//GEN-LAST:event_jtPacientesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPacientes;
    public static javax.swing.JLabel lblapellido;
    public static javax.swing.JLabel lblnombre;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
