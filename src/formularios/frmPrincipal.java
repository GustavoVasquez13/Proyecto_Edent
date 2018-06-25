package formularios;

import Clases.ImagenFondo;

import Crear_Reportes.reporte_general;
import Crear_Reportes.reporte_ortodoncia;
import FormulariosPagos.abonoPacientes;
import FormulariosPagos.frmPagoEmpleado;
import FormulariosPagos.frmPagoEquipo;
import FormulariosPagos.frmPagoMateriales;
import FormulariosPagos.frmPagoReparacion;
import Vistas.frmVistaEmpleado;
import Vistas.frmVistaPagos;
import backupBD.fr_backup;
import formulariosMenu.menuAdmin;
import formulariosMenu.menuadministracion;
import formulariosMenu.menucontabilidad;
import formulariosMenu.menuexpediente;
import formulariosMenu.menuproveedores;
import formulariosMenu.menureportes;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class frmPrincipal extends javax.swing.JFrame implements  Runnable {
 String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    public frmPrincipal() {
        initComponents();
//        this.btnexpediente.setOpaque (false); 
//       this.btnexpediente.setContentAreaFilled(false);
//        this.btnexpediente.setBorderPainted(false);
         this.lbltitulo.setOpaque (false); 
//       this.lbltitulo.setContentAreaFilled(false);
//        this.lbltitulo.setBorderPainted(false);
        this.setTitle("E-DENT");
        h1 = new Thread(this);
        h1.start();
        Dpanel.setBorder(new ImagenFondo());
        this.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dpanel = new javax.swing.JDesktopPane();
        lbhora = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        btnexpediente = new javax.swing.JButton();
        btnproveedores = new javax.swing.JButton();
        txtconta = new javax.swing.JButton();
        lbltitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        back = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        Dpanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                DpanelComponentResized(evt);
            }
        });

        lbhora.setBackground(new java.awt.Color(0, 0, 0));
        lbhora.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        lbhora.setForeground(new java.awt.Color(255, 255, 255));
        lbhora.setText("hora de sistema");

        lblapellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblapellidos.setText("jLabel4");

        lblnombres.setForeground(new java.awt.Color(255, 255, 255));
        lblnombres.setText("jLabel3");

        lblacceso.setForeground(new java.awt.Color(255, 255, 255));
        lblacceso.setText("jLabel5");

        btnexpediente.setBackground(new java.awt.Color(255, 255, 255));
        btnexpediente.setForeground(new java.awt.Color(0, 102, 153));
        btnexpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/expedientes.png"))); // NOI18N
        btnexpediente.setText("Expedientes");
        btnexpediente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnexpediente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnexpediente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnexpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexpedienteActionPerformed(evt);
            }
        });

        btnproveedores.setBackground(new java.awt.Color(255, 255, 255));
        btnproveedores.setForeground(new java.awt.Color(0, 102, 153));
        btnproveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedores.jpg"))); // NOI18N
        btnproveedores.setText("Proveedores");
        btnproveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnproveedores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproveedoresActionPerformed(evt);
            }
        });

        btnadministracion.setBackground(new java.awt.Color(255, 255, 255));
        btnadministracion.setForeground(new java.awt.Color(0, 102, 153));
        btnadministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/admin.png"))); // NOI18N
        btnadministracion.setText("Administracion");
        btnadministracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnadministracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnadministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadministracionActionPerformed(evt);
            }
        });

        txtconta.setBackground(new java.awt.Color(255, 255, 255));
        txtconta.setForeground(new java.awt.Color(0, 102, 153));
        txtconta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/conta.png"))); // NOI18N
        txtconta.setText("Contabilidad");
        txtconta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtconta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontaActionPerformed(evt);
            }
        });

        txtreportes.setBackground(new java.awt.Color(255, 255, 255));
        txtreportes.setForeground(new java.awt.Color(0, 102, 153));
        txtreportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reportes.jpg"))); // NOI18N
        txtreportes.setText("Reportes");
        txtreportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtreportes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        txtreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreportesActionPerformed(evt);
            }
        });

        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo.jpeg"))); // NOI18N
        lbltitulo.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Smiling By Dr. Canizalez");

        Dpanel.setLayer(lbhora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(lblapellidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(lblnombres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(lblacceso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(btnexpediente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(btnproveedores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(btnadministracion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(txtconta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(txtreportes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(lbltitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Dpanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DpanelLayout = new javax.swing.GroupLayout(Dpanel);
        Dpanel.setLayout(DpanelLayout);
        DpanelLayout.setHorizontalGroup(
            DpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltitulo)
                .addGap(216, 216, 216))
            .addGroup(DpanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lblapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448)
                .addComponent(lbhora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(DpanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(DpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtconta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnadministracion, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(btnproveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexpediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtreportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        DpanelLayout.setVerticalGroup(
            DpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DpanelLayout.createSequentialGroup()
                .addComponent(lbltitulo)
                .addGap(48, 48, 48)
                .addComponent(btnexpediente)
                .addGap(14, 14, 14)
                .addGroup(DpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnproveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnadministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconta)
                .addGap(10, 10, 10)
                .addComponent(txtreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(DpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbhora)))
        );

        getContentPane().add(Dpanel);

        jMenu1.setForeground(new java.awt.Color(0, 102, 153));
        jMenu1.setText("Agregar");

        jMenuItem1.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem1.setText("Tipo de Servicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem9.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem9.setText("Nuevo Empleado");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem12.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem12.setText("Materiales");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem15.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem15.setText("Reparaciones de clinica");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem17.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem17.setText("Equipo");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem17);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 102, 153));
        jMenu2.setText("Pagos");

        jMenuItem2.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem2.setText("Servicios Basicos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem13.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem13.setText("Empleados");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem14.setText("Materiales");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem16.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem16.setText("Reparaciones");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuItem18.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem18.setText("Equipo");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem18);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(0, 102, 153));
        jMenu3.setText("Expediente");

        jMenuItem3.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem3.setText("Expediente General");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem5.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem5.setText("Expediente Ortodoncia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem8.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem8.setText("Insertar Tipo de Paciente");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem11.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem11.setText("Vista de pacientes Ortodoncia");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem21.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem21.setText("Agregar consulta Paciente General");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem21);

        jMenuItem23.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem23.setText("Vista Paciente Odontologia General");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem23);

        jMenuItem24.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem24.setText("Tratamiento Ortodoncia");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem24);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(0, 102, 153));
        jMenu4.setText("Comprar Productos");

        jMenuItem4.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem4.setText("Comprar Productos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem6.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem6.setText("Agregar Proveedor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem7.setText("Agregar Producto");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        Admin.setForeground(new java.awt.Color(0, 102, 153));
        Admin.setText("Administrar");

        jMenuItem10.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem10.setText("Nuevo usuario");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem10);

        jMenuItem19.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem19.setText("Vista Empleados");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem19);

        jMenuItem20.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem20.setText("Vista Pagos");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem20);

        back.setForeground(new java.awt.Color(0, 102, 153));
        back.setText("Backup");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        Admin.add(back);

        jMenuItem25.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem25.setText("Reporte expediente general");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem25);

        jMenuItem26.setForeground(new java.awt.Color(0, 102, 153));
        jMenuItem26.setText("Reporte expediente ortodoncia");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        Admin.add(jMenuItem26);

        jMenuBar1.add(Admin);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            lbhora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
 public void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
    //Atravez del evento del MenuItem se crea un objeto del formulario Interno para mostrar
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmServBasicos formSB = new frmServBasicos();
        Dpanel.add(formSB);
        formSB.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       frmPagoServBasicos formPSB = new frmPagoServBasicos();
       Dpanel.add(formPSB);
        formPSB.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // Llama al formulario Comprar Productos
        frmCompraProducto formComprarProd = new frmCompraProducto();
       Dpanel.add(formComprarProd);
        formComprarProd.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        frmProveedores formProv = new frmProveedores();
       Dpanel.add(formProv);
       formProv.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        frmProducto formProd = new frmProducto();
       Dpanel.add(formProd);
       formProd.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        frmEmpleados formEmpl = new frmEmpleados();
        Dpanel.add(formEmpl);
        formEmpl.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        fr_nuevoUsuario formusu = new fr_nuevoUsuario();
        Dpanel.add(formusu);
        formusu.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        frmmateriales mater = new frmmateriales();
        Dpanel.add(mater);
        mater.show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        frmPagoEmpleado PEmp = new frmPagoEmpleado();
        Dpanel.add(PEmp);
        PEmp.show();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
       frmPagoMateriales PMaterial = new frmPagoMateriales();
       Dpanel.add(PMaterial);
       PMaterial.show();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        frmReparacion rep = new frmReparacion();
        Dpanel.add(rep);
        rep.show();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        frmPagoReparacion repa = new frmPagoReparacion();
        Dpanel.add(repa);
        repa.show();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        frmEquipo eq = new frmEquipo();
        Dpanel.add(eq);
        eq.show();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        frmPagoEquipo Peq = new frmPagoEquipo();
        Dpanel.add(Peq);
        Peq.show();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        frmVistaEmpleado Emp = new frmVistaEmpleado();
        Dpanel.add(Emp);
        Emp.show();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        frmVistaPagos pago = new frmVistaPagos();
        Dpanel.add(pago);
        pago.show();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        fr_backup fr=new fr_backup();
        Dpanel.add(fr);
        fr.show();
    }//GEN-LAST:event_backActionPerformed

    private void DpanelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DpanelComponentResized
      
    }//GEN-LAST:event_DpanelComponentResized

    private void btnexpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexpedienteActionPerformed
         menuexpediente formExGral = new menuexpediente();
       Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_btnexpedienteActionPerformed

    private void btnproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproveedoresActionPerformed
        menuproveedores formExGral = new menuproveedores();
       Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_btnproveedoresActionPerformed

    private void txtcontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontaActionPerformed
         menucontabilidad formExGral = new menucontabilidad();
       Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_txtcontaActionPerformed

    private void btnadministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadministracionActionPerformed
       menuAdmin formExGral = new menuAdmin();
       Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_btnadministracionActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
      reporte_general form = new  reporte_general();
       Dpanel.add(form);
        form.show();  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        reporte_ortodoncia form = new  reporte_ortodoncia();
       Dpanel.add(form);
        form.show(); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void txtreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreportesActionPerformed
       menureportes form = new  menureportes();
       Dpanel.add(form);
        form.show();
    }//GEN-LAST:event_txtreportesActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        ExpedienteO formExGral = new ExpedienteO();
        Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        frmEditarPG formExGral = new frmEditarPG();
        Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        consulta fr=new consulta();
        Dpanel.add(fr);
        fr.show();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        frmvistapacientes formEmpl = new frmvistapacientes();
        Dpanel.add(formEmpl);
        formEmpl.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        frmInsertarTipoPaciente formProd = new frmInsertarTipoPaciente();
        Dpanel.add(formProd);
        formProd.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ExpedienteOrtodoncia formExGral = new ExpedienteOrtodoncia();
        Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ExpedienteGeneral formExGral = new ExpedienteGeneral();
        Dpanel.add(formExGral);
        formExGral.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JMenu Admin = new javax.swing.JMenu();
    public static javax.swing.JDesktopPane Dpanel;
    private javax.swing.JMenuItem back;
    public static final javax.swing.JButton btnadministracion = new javax.swing.JButton();
    private javax.swing.JButton btnexpediente;
    private javax.swing.JButton btnproveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lbhora;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblapellidos;
    public static javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JButton txtconta;
    public static final javax.swing.JButton txtreportes = new javax.swing.JButton();
    // End of variables declaration//GEN-END:variables
}
