package formularios;

import Clases.ActualizarDatosBD;
import Clases.InsertarDatosBD;
import Clases.internalFrameImagen;
import Clases.validaciones;
import static formularios.frmPrincipal.Dpanel;
import formulariosAyuda.frmayudaEG;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class ExpedienteGeneral extends internalFrameImagen {

    public ExpedienteGeneral() {
        initComponents();
       setImagenw("fondo.jpg");
       btcon.setVisible(false);
        ExpedienteGeneral.fecha.setEnabled(false);
        ExpedienteGeneral.txtedad.setEnabled(false);
        ExpedienteGeneral.txttelefono.setEnabled(false);
        ExpedienteGeneral.txtnombre.setEnabled(false);
        ExpedienteGeneral.txtapellido.setEnabled(false);
        ExpedienteGeneral.txtdireccion.setEnabled(false);
        ExpedienteGeneral.btneditar.setEnabled(false);
        ExpedienteGeneral.btnbuscaredicion.setEnabled(true);
        ExpedienteGeneral.btnGuardar.setEnabled(false);
       
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lbledad = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        fecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        lbtipo = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btcon = new javax.swing.JButton();
        btnbuscaredicion = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbtipoo = new javax.swing.JLabel();
        lblid1 = new javax.swing.JLabel();
        ayuda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setVisible(false);

        lbltitulo.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setText("Expediente Paciente Odontologia General");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha:");

        lbltelefono.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbltelefono.setForeground(new java.awt.Color(255, 255, 255));
        lbltelefono.setText("Telefono:");

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        lbledad.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbledad.setForeground(new java.awt.Color(255, 255, 255));
        lbledad.setText("Edad:");

        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtedadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        lblnombre.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("Nombre: ");

        lbldireccion.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbldireccion.setForeground(new java.awt.Color(255, 255, 255));
        lbldireccion.setText("Dirección: ");

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdireccionKeyPressed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 102, 153));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        fecha.setDateFormatString("yyyy-MM-dd");
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elegir tp.png"))); // NOI18N
        jButton1.setText("Elegir tipo de paciente");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txttip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipActionPerformed(evt);
            }
        });

        lbtipo.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbtipo.setForeground(new java.awt.Color(255, 255, 255));
        lbtipo.setText("el tipo de paciente Seleccionado es:");

        btnsalir.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(0, 102, 153));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setToolTipText("");
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btcon.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btcon.setForeground(new java.awt.Color(0, 102, 153));
        btcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/consulta.png"))); // NOI18N
        btcon.setText("Agregar consulta");
        btcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btcon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconActionPerformed(evt);
            }
        });

        btnbuscaredicion.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnbuscaredicion.setForeground(new java.awt.Color(0, 102, 153));
        btnbuscaredicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar edicion.png"))); // NOI18N
        btnbuscaredicion.setText("Buscar para editar");
        btnbuscaredicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscaredicion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscaredicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaredicionActionPerformed(evt);
            }
        });

        btneditar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btneditar.setForeground(new java.awt.Color(0, 102, 153));
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btneditar.setText("Editar");
        btneditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        lblid.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblid.setForeground(new java.awt.Color(0, 102, 153));
        lblid.setText("...");
        lblid.setAutoscrolls(true);

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Para realizar una consulta elija el tipo de paciente:");

        lbtipoo.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lbtipoo.setForeground(new java.awt.Color(255, 255, 255));
        lbtipoo.setText("..");

        lblid1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        lblid1.setForeground(new java.awt.Color(255, 255, 255));
        lblid1.setText("ID paciente:");
        lblid1.setAutoscrolls(true);

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help (1).png"))); // NOI18N
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)
                        .addGap(114, 114, 114)
                        .addComponent(lbtipo)
                        .addGap(6, 6, 6)
                        .addComponent(lbtipoo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(lbltelefono)
                        .addGap(10, 10, 10)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(lbledad)
                        .addGap(32, 32, 32)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblid1)
                        .addGap(18, 18, 18)
                        .addComponent(lblid))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblnombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbldireccion)
                        .addGap(10, 10, 10)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btcon)
                        .addGap(10, 10, 10)
                        .addComponent(btnbuscaredicion)
                        .addGap(6, 6, 6)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(347, 347, 347)
                            .addComponent(txttip, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(277, 277, 277)
                            .addComponent(lbltitulo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lbtipo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lbtipoo))))
                    .addComponent(ayuda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttip, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbltelefono))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbledad))
                            .addComponent(lblid1)
                            .addComponent(lblid)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblnombre))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbldireccion))
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btcon)
                    .addComponent(btnbuscaredicion)
                    .addComponent(btneditar)
                    .addComponent(btnGuardar)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //metodo para limpiar los jtextfield despues de cada click al boton guardar
    public void limpiarTxt(){
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtedad.setText("");
        lblid.setText("");
        
       
    }
  
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.txtnombre.getText().length() == 0 || this.txtapellido.getText().length() == 0|| this.txtedad.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Debe complementar los campos requeridos");
            }else{
             // se crean variables para guardar en ellas los datos recibidos de los jtextfield
      String nombre = this.txtnombre.getText().toUpperCase();
      String apellido = this.txtapellido.getText().toUpperCase();
      String direccion = this.txtdireccion.getText().toUpperCase();
      String telefono = this.txttelefono.getText().toUpperCase();
      String edad = this.txtedad.getText();
      String tip=this.txttip.getText();
    
      //se crea un objeto de la clase Insertar Datos, en este objeto se almacenaran y enviaran 
      //a la clase los parametros obtenidos por los jtextfield
      String dia = Integer.toString(fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
      String mes = Integer.toString(fecha.getCalendar().get(Calendar.MONTH) + 1);
      String year = Integer.toString(fecha.getCalendar().get(Calendar.YEAR));
      String fechaA = (year + "-" + mes+ "-" + dia);
      String date = fechaA; 
      InsertarDatosBD insertar = new InsertarDatosBD();
      insertar.insertarPaciente(nombre, apellido, direccion, telefono, edad,tip,date);
      // se crean variables para guardar en ellas los datos recibidos de los jtextfield
      limpiarTxt();
      btcon.setVisible(true);
       ExpedienteGeneral.fecha.setEnabled(false);
        ExpedienteGeneral.txtedad.setEnabled(false);
        ExpedienteGeneral.txttelefono.setEnabled(false);
        ExpedienteGeneral.txtnombre.setEnabled(false);
        ExpedienteGeneral.txtapellido.setEnabled(false);
        ExpedienteGeneral.txtdireccion.setEnabled(false);
        ExpedienteGeneral.btneditar.setEnabled(false);
        ExpedienteGeneral.btnbuscaredicion.setEnabled(true);
        ExpedienteGeneral.btnGuardar.setEnabled(false);
        ExpedienteGeneral.jButton1.setEnabled(true);
      
        }
       
  
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
      //se crea un objeto de la clase validaciones para luego validar en el evento KeyTyped del jtextfield 
      //que no se introduzcan numeros
        validaciones val = new validaciones();
        val.validarCaracter(evt);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       frmInsertarTipoPaciente formProd = new frmInsertarTipoPaciente();
       Dpanel.add(formProd);
       formProd.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        limpiarTxt();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
         validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtedadKeyTyped

    private void txttipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipActionPerformed

    private void btconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconActionPerformed
consulta fr=new consulta();
 Dpanel.add(fr);
        fr.show();        // TODO add your handling code here:
    }//GEN-LAST:event_btconActionPerformed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        
        txttelefono.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtedad.requestFocus();
            this.txtedad.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
          this.fecha.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
              java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txttelefono.requestFocus();
            this.txttelefono.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_fechaKeyPressed

    private void txtedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyPressed
         this.txtedad.setBackground(Color.white); 
        txtedad.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtnombre.requestFocus();
            this.txtnombre.setBackground(Color.LIGHT_GRAY);
           
        }
    }//GEN-LAST:event_txtedadKeyPressed

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
              this.txtapellido.setBackground(Color.white);
        txtapellido.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtdireccion.requestFocus();
            this.txtdireccion.setBackground(Color.LIGHT_GRAY);
          
        }
    }//GEN-LAST:event_txtapellidoKeyPressed

    private void btnbuscaredicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaredicionActionPerformed
       frmEditarPG formProd = new frmEditarPG();
       Dpanel.add(formProd);
       formProd.show();        
    }//GEN-LAST:event_btnbuscaredicionActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
      if(this.txtnombre.getText().length()!=0 && this.txtapellido.getText().length()!=0 && this.txtedad.getText().length()!=0 
              && this.txttelefono.getText().length()!=0 && this.txtdireccion.getText().length()!=0 ) {
          String nombre = this.txtnombre.getText().toUpperCase();
          String apellido = this.txtapellido.getText().toUpperCase();
          String edad = this.txtedad.getText().toUpperCase();
          String telefono = this.txttelefono.getText().toUpperCase();
          String direccion = this.txtdireccion.getText().toUpperCase();
          int code = Integer.valueOf(this.lblid.getText());
          
          ActualizarDatosBD actpaciente = new ActualizarDatosBD();
          
          actpaciente.ActualizarPacienteG(nombre, apellido, direccion, telefono, edad, code);
          }else{
          JOptionPane.showMessageDialog(null, "DEBE DE LLENAR TODOS LOS CAMPOS");
      }
      limpiarTxt();
        ExpedienteGeneral.fecha.setEnabled(false);
        ExpedienteGeneral.txtedad.setEnabled(false);
        ExpedienteGeneral.txttelefono.setEnabled(false);
        ExpedienteGeneral.txtnombre.setEnabled(false);
        ExpedienteGeneral.txtapellido.setEnabled(false);
        ExpedienteGeneral.txtdireccion.setEnabled(false);
        ExpedienteGeneral.btneditar.setEnabled(false);
        ExpedienteGeneral.btnbuscaredicion.setEnabled(true);
        ExpedienteGeneral.btnGuardar.setEnabled(false);
        ExpedienteGeneral.jButton1.setEnabled(true);
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
     this.txtnombre.setBackground(Color.white);
        txtnombre.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtapellido.requestFocus();
            this.txtapellido.setBackground(Color.LIGHT_GRAY);
          
        }
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtdireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyPressed
        this.txtdireccion.setBackground(Color.white);
    }//GEN-LAST:event_txtdireccionKeyPressed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
      validaciones val = new validaciones();
        val.validarCaracter(evt);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        frmayudaEG ayudaPE = new frmayudaEG();
        frmPrincipal.Dpanel.add(ayudaPE);
        ayudaPE.show();
    }//GEN-LAST:event_ayudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    private javax.swing.JButton btcon;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnbuscaredicion;
    public static javax.swing.JButton btneditar;
    private javax.swing.JButton btnsalir;
    public static com.toedter.calendar.JDateChooser fecha;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbledad;
    public static javax.swing.JLabel lblid;
    public static javax.swing.JLabel lblid1;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltitulo;
    public static javax.swing.JLabel lbtipo;
    public static javax.swing.JLabel lbtipoo;
    public static javax.swing.JTextField txtapellido;
    public static javax.swing.JTextField txtdireccion;
    public static javax.swing.JTextField txtedad;
    public static final javax.swing.JTextField txtnombre = new javax.swing.JTextField();
    public static javax.swing.JTextField txttelefono;
    public static final javax.swing.JTextField txttip = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
