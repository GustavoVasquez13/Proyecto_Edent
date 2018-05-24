package formularios;

import Clases.ActualizarDatosBD;
import Clases.ConsultarDatosBD;
import Clases.ConsultarDatosBD2;
import Clases.IsertarDatosBD2;
import Clases.conexionBD;
import Clases.internalFrameImagen;
import Clases.validaciones;
import formulariosAyuda.frmayudaSB;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmEmpleados extends internalFrameImagen {
    private TableRowSorter trsFiltro;
    public frmEmpleados() {
        initComponents();
        setImagenw("img2.jpg");
        mostrarEmpl();
    }

    //este metodo muestra en la tabla los empleados registrados
    private void mostrarEmpl(){
        try{
            DefaultTableModel modelo;
            ConsultarDatosBD mosEmpl = new ConsultarDatosBD();
            modelo = mosEmpl.mostrarEmpleado();
            jtEmpleados.setModel(modelo);
            this.btnModificar.setEnabled(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DEL EMPLEADO");
        }
    }
    
    //este metodo limppia los controles jtexfield despues de guardar un registro
    private void limpiar(){
        this.txtNombreEmp.setText("");
        this.txtApellidoEmp.setText("");
        this.txtDireccionEmp.setText("");
        this.txtDuiEmp.setText("");
        this.txtCorreoEmp.setText("");
        this.txtTelEmp.setText("");
        this.txtCargoEmp.setText("");
        this.txtSueldoEmp.setText("");
        this.jdFechaInicio.setDate(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoEmp = new javax.swing.JTextField();
        txtNombreEmp = new javax.swing.JTextField();
        txtDireccionEmp = new javax.swing.JTextField();
        txtCorreoEmp = new javax.swing.JTextField();
        txtTelEmp = new javax.swing.JTextField();
        txtCargoEmp = new javax.swing.JTextField();
        txtSueldoEmp = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jdFechaInicio = new com.toedter.calendar.JDateChooser();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleados = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        lblCod = new javax.swing.JLabel();
        lblCod2 = new javax.swing.JLabel();
        txtDuiEmp = new javax.swing.JFormattedTextField();
        lblFormato = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Registro de Empleados");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("No. DUI");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("No. Telefono");

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Cargo");

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Sueldo Menssual");

        txtApellidoEmp.setFocusCycleRoot(true);
        txtApellidoEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEmpKeyTyped(evt);
            }
        });

        txtNombreEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpKeyTyped(evt);
            }
        });

        txtTelEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelEmpKeyTyped(evt);
            }
        });

        txtSueldoEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoEmpKeyTyped(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 102, 153));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guarda los datos del empleado en la base de datos");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("Fecha de Inicio");

        jdFechaInicio.setDateFormatString("yyyy-MM-dd");

        btnCerrar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 102, 153));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jtEmpleados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
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
        jtEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtEmpleadosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtEmpleados);

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 102, 153));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btnModificar.setText("Editar");
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        try {
            txtDuiEmp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDuiEmp.setToolTipText("########-#");
        txtDuiEmp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDuiEmpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDuiEmpFocusLost(evt);
            }
        });
        txtDuiEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDuiEmpMouseClicked(evt);
            }
        });

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help (1).png"))); // NOI18N
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(txtSueldoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txtCargoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtTelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtCorreoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtApellidoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtDireccionEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(jdFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDuiEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreEmp)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCod2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(243, 243, 243)))
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addGap(94, 94, 94)
                .addComponent(btnModificar)
                .addGap(101, 101, 101)
                .addComponent(btnCerrar)
                .addGap(510, 510, 510))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombreEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCod2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))
                            .addComponent(txtApellidoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4))
                            .addComponent(txtDireccionEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDuiEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(lblFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6))
                            .addComponent(txtCorreoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7))
                            .addComponent(txtTelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8))
                            .addComponent(txtCargoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9))
                            .addComponent(txtSueldoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel10))
                            .addComponent(jdFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(this.txtNombreEmp.getText().length()!=0 && this.txtApellidoEmp.getText().length()!=0 && this.txtDireccionEmp.getText().length()!=0 && 
                this.txtCargoEmp.getText().length()!=0 && this.txtDuiEmp.getText().length()!=0 && this.txtSueldoEmp.getText().length()!=0 && jdFechaInicio.getDate()!=null){
        
            String nombre = this.txtNombreEmp.getText().toUpperCase();
            String apellido = this.txtApellidoEmp.getText().toUpperCase();
            String direccion = this.txtDireccionEmp.getText().toUpperCase();
            String correo = this.txtCorreoEmp.getText();
            String tel = this.txtTelEmp.getText();
            String cargo = this.txtCargoEmp.getText().toUpperCase();
            String dui = this.txtDuiEmp.getText();
            double sueldo = Double.valueOf(this.txtSueldoEmp.getText());
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
            String pasofecha = (formatofecha.format(jdFechaInicio.getDate()));
            String estado = "ACTIVO";

            ConsultarDatosBD val = new ConsultarDatosBD();
            if(val.valExistEmpleado(dui)!=true){
                IsertarDatosBD2 insertEmpleado = new IsertarDatosBD2();
                insertEmpleado.insertDatosEmpleado(nombre,apellido,direccion,correo,tel,cargo,dui,sueldo,pasofecha,estado);
                mostrarEmpl();
                limpiar();
                
            }else{
                JOptionPane.showMessageDialog(null, "YA EXISTE UN EMPLEADO REGISTRADO CON CON EL MISMO NUMERO DE DUI");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR TODOS LOS CAMPOS");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTelEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelEmpKeyTyped
       validaciones val = new validaciones();
       val.validarNum(evt);
    }//GEN-LAST:event_txtTelEmpKeyTyped

    private void txtSueldoEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoEmpKeyTyped
        validaciones val = new validaciones();
        val.validarNum(evt);
    }//GEN-LAST:event_txtSueldoEmpKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

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

    private void txtNombreEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpKeyTyped
        validaciones val= new validaciones ();
        val.validarCaracter(evt);
    }//GEN-LAST:event_txtNombreEmpKeyTyped

    private void txtApellidoEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEmpKeyTyped
        validaciones val = new validaciones();
        val.validarCaracter(evt);
    }//GEN-LAST:event_txtApellidoEmpKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
        if(this.txtNombreEmp.getText().length()!=0 && this.txtApellidoEmp.getText().length()!=0 && this.txtDireccionEmp.getText().length()!=0 && 
                this.txtCargoEmp.getText().length()!=0 && this.txtDuiEmp.getText().length()!=0 && this.txtSueldoEmp.getText().length()!=0 && jdFechaInicio.getDate()!=null){
        
            String nombre = this.txtNombreEmp.getText().toUpperCase();
            String apellido = this.txtApellidoEmp.getText().toUpperCase();
            String direccion = this.txtDireccionEmp.getText().toUpperCase();
            String correo = this.txtCorreoEmp.getText();
            String tel = this.txtTelEmp.getText();
            String cargo = this.txtCargoEmp.getText().toUpperCase();
            String dui = this.txtDuiEmp.getText();
            double sueldo = Double.valueOf(this.txtSueldoEmp.getText());
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
            String pasofecha = (formatofecha.format(jdFechaInicio.getDate()));
            String estado = "ACTIVO";
            int cod = Integer.valueOf(this.lblCod2.getText());
            
            ActualizarDatosBD insertEmpleado = new ActualizarDatosBD();
            insertEmpleado.actualizarEmpl(nombre,apellido,direccion,correo,tel,cargo,dui,sueldo,pasofecha,estado,cod);
            mostrarEmpl();
            limpiar();
            this.btnGuardar.setEnabled(true);
            this.btnModificar.setEnabled(false);
            this.lblCod.setText("");
            this.lblCod2.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR TODOS LOS CAMPOS");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jtEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmpleadosMousePressed

        String sSQL = "";
        conexionBD con = new conexionBD();
        Connection cn = con.conectar();
        if(evt.getClickCount()==2){
            if(this.jtEmpleados.getSelectedRowCount()!=0){
                int filaSelecciona = this.jtEmpleados.getSelectedRow(); 
                String dui = (String)this.jtEmpleados.getValueAt(filaSelecciona, 4);
                sSQL =  "select * from `empleado` where `dui_empl`='"+dui+"';";
                try{
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sSQL);
                    while(rs.next()){
                        this.lblCod.setText("CODIGO ");
                        this.lblCod2.setText(rs.getString("id_empleado"));
                        this.txtNombreEmp.setText(rs.getString("nombre_empl"));
                        this.txtApellidoEmp.setText(rs.getString("apellido_empl"));
                        this.txtDireccionEmp.setText(rs.getString("direccion_empl"));
                        this.txtDuiEmp.setText(rs.getString("dui_empl"));
                        this.txtCorreoEmp.setText(rs.getString("correo_empl"));
                        this.txtTelEmp.setText(rs.getString("tel_empl"));
                        this.txtCargoEmp.setText(rs.getString("cargo_empl"));
                        this.txtSueldoEmp.setText(rs.getString("sueldo_empl"));
                        this.jdFechaInicio.setDate(Date.valueOf(rs.getString("fecha_inicio")));
                    }
                    con.closeBd();
                    this.btnModificar.setEnabled(true);
                    this.btnGuardar.setEnabled(false);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "PROBLEMAS AL CONSULTAR LOS DATOS DE MATERIALES");
                    con.closeBd();
                }
            }else{
                JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE LA TABLA");
            }
        }
    }//GEN-LAST:event_jtEmpleadosMousePressed

    private void txtDuiEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDuiEmpMouseClicked
 
    }//GEN-LAST:event_txtDuiEmpMouseClicked

    private void txtDuiEmpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuiEmpFocusGained
        lblFormato.setText("FORMATO: 00000000-0");
    }//GEN-LAST:event_txtDuiEmpFocusGained

    private void txtDuiEmpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuiEmpFocusLost
        lblFormato.setText("");
    }//GEN-LAST:event_txtDuiEmpFocusLost

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        frmayudaSB ayudaSB = new frmayudaSB();
        frmPrincipal.Dpanel.add(ayudaSB);
        ayudaSB.show();
    }//GEN-LAST:event_btnAyudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private com.toedter.calendar.JDateChooser jdFechaInicio;
    private javax.swing.JTable jtEmpleados;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCod2;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JTextField txtApellidoEmp;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCargoEmp;
    private javax.swing.JTextField txtCorreoEmp;
    private javax.swing.JTextField txtDireccionEmp;
    private javax.swing.JFormattedTextField txtDuiEmp;
    private javax.swing.JTextField txtNombreEmp;
    private javax.swing.JTextField txtSueldoEmp;
    private javax.swing.JTextField txtTelEmp;
    // End of variables declaration//GEN-END:variables
}
