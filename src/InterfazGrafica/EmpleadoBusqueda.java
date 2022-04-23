/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica;

import com.mysql.jdbc.Statement;
import controlador.Conexion;
import controlador.Registro;
import static java.lang.String.valueOf;
import java.text.SimpleDateFormat;
import static java.time.chrono.IsoEra.CE;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;


/**
 *
 * @author alan
 */
public class EmpleadoBusqueda extends javax.swing.JFrame {

    private Object modelo;



    /**
     * Creates new form EmpleadoBusqueda
     */
    public EmpleadoBusqueda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cboTipoEmpleado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        BtnEmpleado = new javax.swing.JButton();
        btnHabitaciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RUT", "NOMBRE", "APELLIDO", "GENERO", "TELEFONO", "CORREO", "TIPO EMPLEADO"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        jLabel4.setText("Tipo de Empleado :");

        cboTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Administrador", "Empleado" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-cerrar-ventana-100.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        jLabel2.setText("Rut :");

        txtrut.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(cboTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addGap(324, 324, 324)
                        .addComponent(jButton4)
                        .addGap(86, 86, 86)
                        .addComponent(jButton5)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2))
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 850, 480));

        btnInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-casa-30.png"))); // NOI18N
        btnInicio.setText("  Inicio");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-grupo-de-usuario-30.png"))); // NOI18N
        btnCliente.setText("  Cliente");
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });

        BtnEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-hombre-de-negocios-30.png"))); // NOI18N
        BtnEmpleado.setText(" Empleado");
        BtnEmpleado.setMaximumSize(new java.awt.Dimension(113, 39));
        BtnEmpleado.setMinimumSize(new java.awt.Dimension(113, 39));
        BtnEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEmpleadoMouseClicked(evt);
            }
        });

        btnHabitaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-cama-30.png"))); // NOI18N
        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.setMaximumSize(new java.awt.Dimension(113, 39));
        btnHabitaciones.setMinimumSize(new java.awt.Dimension(113, 39));
        btnHabitaciones.setPreferredSize(new java.awt.Dimension(113, 39));
        btnHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHabitacionesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addComponent(btnHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(BtnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 584));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1569232392_954737_1569233531_noticia_normal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 980, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton6MouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        new ClienteFormulario().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClienteMouseClicked

    private void BtnEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmpleadoMouseClicked
        new EmpleadoFormulario().setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnEmpleadoMouseClicked

    private void btnHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMouseClicked
        new Habitaciones().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHabitacionesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rut;
        String nombre;
        String apellido;
        String genero;
        String telefono;
        String correo;
        String Empleado;
        Date fechaNacimiento;
        String direccion;
        List<Empleado> lista;

        Registro rg = new Registro();
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();

        modelo.setRowCount(0);

        String tipoEmpleado = cboTipoEmpleado.getSelectedItem().toString();

        if (tipoEmpleado.equals("Todas")) {
            lista = rg.buscarTodosEmpleado();
        } else {
            lista = rg.buscarTipoEmpleado(tipoEmpleado);
        }

        for (Empleado tmp : lista) {
            rut = tmp.getRut() + "-" + tmp.getDv();
            nombre = tmp.getNombre();
            apellido = tmp.getApellido();
            genero = tmp.getGenero();
            telefono = tmp.getTelefono();
            correo = tmp.getCorreo();
            tipoEmpleado = tmp.getTipoEmpleado();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date FechaNacimiento = tmp.getFechaNacimiento();
            direccion = tmp.getDireccion();

            modelo.addRow(new Object[]{rut, nombre, apellido, genero, telefono, correo, tipoEmpleado, FechaNacimiento, direccion});
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String rut;      
        try {
            rut =(txtrut.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El Nombre Ingresado No Es Valido", "Validación", JOptionPane.WARNING_MESSAGE);
            txtrut.requestFocus();
            return;
        }
        Registro rg = new Registro();
        if (rg.eliminarEmpleado(rut)) {
            JOptionPane.showMessageDialog(this, "Se eliminó el empleado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            txtrut.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No se eliminó el empleado, asegurese de escribir bien el rut ", "Error", JOptionPane.ERROR_MESSAGE);
        }                                 

        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed
    

    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EmpleadoBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EmpleadoBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EmpleadoBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EmpleadoBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EmpleadoBusqueda().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEmpleado;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnInicio;
    private javax.swing.JComboBox<String> cboTipoEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtrut;
    // End of variables declaration//GEN-END:variables
private void Limpiar() {
        txtrut.setText("");
    }
}
