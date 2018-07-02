
package formularios;

import Clases.ActualizarDatosBD;
import Clases.ConsultarDatosBD;
import Clases.ConsultarDatosBD2;
import Clases.funciones;
import Clases.conexionBD;
import Clases.internalFrameImagen;
import static formularios.frmPrincipal.Dpanel;
import formulariosAyuda.frmayudaSB;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
//import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import org.apache.commons.codec.digest.DigestUtils;

public class fr_nuevoUsuario extends internalFrameImagen {
    String[] arraytipo;
    funciones i=new funciones();
    private TableRowSorter trsFiltro;
    
    public fr_nuevoUsuario() {
        initComponents();
           setImagenw("fondo.jpg");
         mostrarusuario();
         
         consultar();
    }

    //este metodo extrae el codigo del servicio para poder ser modificado
    private void codusu(String nom, String ape,String correo){
        int cod;
        ConsultarDatosBD2 codServ = new ConsultarDatosBD2();
        cod = codServ.codusuario(nom, ape, correo);
        this.lblServicio.setText("Codigo");
        this.lblCod.setText(Integer.toString(cod));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre_persona = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtape = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtusu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcont = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        VOLVER = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jusu = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnModificarReg = new javax.swing.JButton();
        lblCod = new javax.swing.JLabel();
        lblServicio = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR NUEVO USUARIO");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE");

        txtNombre_persona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombre_personaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDO");

        txtape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapeKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUARIO");

        txtusu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");

        txtcont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TIPO");

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CORREO:");

        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcorreoKeyPressed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 51, 153));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        VOLVER.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VOLVER.setForeground(new java.awt.Color(0, 51, 153));
        VOLVER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        VOLVER.setText("CERRAR");
        VOLVER.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VOLVER.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });

        jusu = new javax.swing.JTable(){
            public boolean isCellEditable(int fila, int columna){
                return false;
            }
        };
        jusu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jusuMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jusu);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buscar");

        btnModificarReg.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnModificarReg.setForeground(new java.awt.Color(0, 51, 153));
        btnModificarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btnModificarReg.setText("Editar");
        btnModificarReg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarReg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegActionPerformed(evt);
            }
        });

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help (1).png"))); // NOI18N
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/addUse.png"))); // NOI18N
        jButton1.setText("NUEVO TIPO DE USUARIO");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnGuardar)
                .addGap(48, 48, 48)
                .addComponent(btnModificarReg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(VOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtNombre_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)
                                .addGap(57, 57, 57)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcont, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarReg)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(VOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void consultar()
    {
        conexionBD cnn=new conexionBD();
        Connection reg=cnn.conectar();
       try {
            Statement stmt = reg.createStatement();
            String query = "SELECT tipo_usuario, id_tipoUsuario FROM tipousuario;";

            ResultSet rs = stmt.executeQuery(query);
            arraytipo = new String[50];
            int i = 0;
            while(rs.next())
            {
                this.cbtipo.addItem(rs.getString(1));
                arraytipo[i] = rs.getString(2);
                i++;
            }
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Problema al Consultar los Datos de la Persona");
        }
    }
private void mostrarusuario() {
        try {
            DefaultTableModel modelo;
            ConsultarDatosBD2 Mostrarp = new ConsultarDatosBD2();
            modelo = Mostrarp.mostrarus();
            jusu.setModel(modelo);
            this.btnModificarReg.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE SERVICIOS");
        }
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nom = this.txtNombre_persona.getText().toUpperCase();
        String ape = this.txtape.getText().toUpperCase();
        String usu = this.txtusu.getText();
        String clav = DigestUtils.md5Hex(this.txtcont.getText());
        String correo=this.txtcorreo.getText();
        conexionBD cnn=new conexionBD();
        Connection reg=cnn.conectar();
        if(nom.equals("")||ape.equals("")||usu.equals("")||clav.equals("")){
            JOptionPane.showMessageDialog(null, "POR FAVOR LLENAR TODOS LOS CAMPOS");
        }else{
            i.verificausu(this.txtNombre_persona.getText().toUpperCase(),this.txtape.getText().toUpperCase(),txtusu.getText(),String.valueOf(DigestUtils.md5Hex(txtcont.getText())),arraytipo[this.cbtipo.getSelectedIndex()],this.txtcorreo.getText());

            this.txtNombre_persona.setText("");
            this.txtape.setText("");
            this.txtusu.setText("");
            this.txtcont.setText("");
            this.txtcorreo.setText("");
        }
        mostrarusuario();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        dispose();
    }//GEN-LAST:event_VOLVERActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // mostrar dato buscado desde el textbox
        this.txtBuscar.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                trsFiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText().toUpperCase(), 0));
                jusu.getSelectionModel().setSelectionInterval(0, 0);
            }
        });
        trsFiltro = new TableRowSorter(jusu.getModel());
        jusu.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jusuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jusuMousePressed
        if(evt.getClickCount()==2){
            int fila = this.jusu.getSelectedRow();
            String nom = (String)this.jusu.getValueAt(fila, 0);
            String ape = (String)this.jusu.getValueAt(fila, 1);
            String usu = (String)this.jusu.getValueAt(fila, 2);
            String correo = (String)this.jusu.getValueAt(fila, 3);

            this.txtNombre_persona.setText(nom);
            this.txtape.setText(ape);
            this.txtusu.setText(usu);
            this.txtcorreo.setText(correo);
            this.btnGuardar.setEnabled(false);
            this.btnModificarReg.setEnabled(true);
            
            codusu(nom,ape,correo);
        }
    }//GEN-LAST:event_jusuMousePressed

    private void btnModificarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRegActionPerformed
        if(this.txtNombre_persona.getText().length()!=0 && this.txtape.getText().length()!=0 && this.txtusu.getText().length()!=0
                && this.txtcont.getText().length()!=0 && this.txtcorreo.getText().length()!=0){
            String nom = this.txtNombre_persona.getText().toUpperCase();
            String ape = this.txtape.getText().toUpperCase();
            String usuario = this.txtusu.getText();
            String clav = DigestUtils.md5Hex(this.txtcont.getText());
            String correo = this.txtcorreo.getText();
            String tipo = this.cbtipo.getSelectedItem().toString();
            int cod = Integer.valueOf(this.lblCod.getText());

                ActualizarDatosBD actEq = new ActualizarDatosBD();
                actEq.ActualizarUsu(nom,ape,usuario,clav,correo,tipo,cod);
                mostrarusuario();
                
                this.txtNombre_persona.setText("");
                this.txtape.setText("");
                this.txtusu.setText("");
                this.txtcont.setText("");
                this.txtcorreo.setText("");

                this.btnGuardar.setEnabled(true);
                this.btnModificarReg.setEnabled(false);
                this.lblCod.setText("");
                this.lblServicio.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "DEBE LLENAR LOS CAMPOS REQUERIDOS");
        }
    }//GEN-LAST:event_btnModificarRegActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        frmayudaSB ayudaSB = new frmayudaSB();
        frmPrincipal.Dpanel.add(ayudaSB);
        ayudaSB.show();
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void txtNombre_personaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_personaKeyPressed
       txtNombre_persona.setBackground(Color.WHITE);
       txtNombre_persona.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
       if (evt.getKeyCode() == KeyEvent.VK_TAB){
           txtape.requestFocus();
           txtape.setBackground(Color.LIGHT_GRAY);
       }
    }//GEN-LAST:event_txtNombre_personaKeyPressed

    private void txtapeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapeKeyPressed
         txtape.setBackground(Color.WHITE);
       txtape.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
       if (evt.getKeyCode() == KeyEvent.VK_TAB){
           txtusu.requestFocus();
           txtusu.setBackground(Color.LIGHT_GRAY);
       }
    }//GEN-LAST:event_txtapeKeyPressed

    private void txtusuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuKeyPressed
          txtusu.setBackground(Color.WHITE);
       txtusu.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
       if (evt.getKeyCode() == KeyEvent.VK_TAB){
           txtcont.requestFocus();
           txtcont.setBackground(Color.LIGHT_GRAY);
       }
    }//GEN-LAST:event_txtusuKeyPressed

    private void txtcontKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontKeyPressed
             txtcont.setBackground(Color.WHITE);
       txtcont.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
       if (evt.getKeyCode() == KeyEvent.VK_TAB){
           txtcorreo.requestFocus();
           txtcorreo.setBackground(Color.LIGHT_GRAY);
       }
    }//GEN-LAST:event_txtcontKeyPressed

    private void txtcorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyPressed
       txtcorreo.setBackground(Color.WHITE);
       txtcorreo.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
    }//GEN-LAST:event_txtcorreoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
crearTipo formExGral = new crearTipo();
        Dpanel.add(formExGral);
        formExGral.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VOLVER;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificarReg;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jusu;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre_persona;
    private javax.swing.JTextField txtape;
    private javax.swing.JPasswordField txtcont;
    public static javax.swing.JTextField txtcorreo;
    public static javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
