/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class FrmAlumno extends javax.swing.JFrame {

    /**
     * Creates new form FrmAlumno
     */
    public FrmAlumno() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cmdGrado1 = new javax.swing.JComboBox<>();
        txtVacante = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmdNivel = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        txtNEmergencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTratamiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAntecedentes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellidopaterno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellidomaterno = new javax.swing.JTextField();
        cmdSexo = new javax.swing.JComboBox<>();
        dateNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGurdar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnContinual = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185), 2));
        jPanel4.setLayout(null);

        cmdGrado1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdGrado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", " " }));
        cmdGrado1.setBorder(null);
        jPanel4.add(cmdGrado1);
        cmdGrado1.setBounds(10, 140, 180, 24);

        txtVacante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVacante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel4.add(txtVacante);
        txtVacante.setBounds(10, 200, 180, 24);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("VACANTE:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(10, 180, 60, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("GRADO:");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(10, 120, 50, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NIVEL:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 60, 50, 15);

        cmdNivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "INICIAL", "PRIMARIA", "SECUNDARIA" }));
        cmdNivel.setBorder(null);
        jPanel4.add(cmdNivel);
        cmdNivel.setBounds(10, 80, 180, 24);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 130, 210, 280);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185), 2));
        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("NOMBRE DE CONTACTO:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(260, 225, 170, 15);

        txtContacto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContacto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        txtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoActionPerformed(evt);
            }
        });
        jPanel3.add(txtContacto);
        txtContacto.setBounds(260, 240, 200, 24);

        txtNEmergencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNEmergencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtNEmergencia);
        txtNEmergencia.setBounds(260, 190, 200, 24);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("NUMERO DE EMERGENCIA:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(260, 175, 160, 15);

        txtTratamiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTratamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtTratamiento);
        txtTratamiento.setBounds(260, 140, 200, 24);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("TRATAMIENTO:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(260, 125, 140, 15);

        txtAntecedentes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAntecedentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtAntecedentes);
        txtAntecedentes.setBounds(260, 90, 200, 24);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ANTECEDENTES DE SALUD:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(260, 75, 190, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("FECHA DE NACIMIENTO:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(260, 25, 150, 15);

        txtApellidopaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidopaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtApellidopaterno);
        txtApellidopaterno.setBounds(30, 140, 200, 24);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombre);
        txtNombre.setBounds(30, 90, 200, 24);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SEXO:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 225, 50, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("APELLIDO MATERNO:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 175, 140, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("APELLIDO PATERNO:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 125, 130, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRES:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 75, 80, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("DNI:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(30, 25, 40, 15);

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtDni);
        txtDni.setBounds(30, 40, 200, 24);

        txtApellidomaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidomaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtApellidomaterno);
        txtApellidomaterno.setBounds(30, 190, 200, 24);

        cmdSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "MASCULINO", "FEMENINO", " " }));
        cmdSexo.setBorder(null);
        jPanel3.add(cmdSexo);
        cmdSexo.setBounds(30, 240, 200, 24);
        jPanel3.add(dateNacimiento);
        dateNacimiento.setBounds(260, 40, 200, 24);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(250, 130, 500, 280);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185), 2));
        jPanel2.setLayout(null);

        btnNuevo.setBackground(new java.awt.Color(174, 174, 174));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        jPanel2.add(btnNuevo);
        btnNuevo.setBounds(40, 20, 150, 30);

        btnGurdar.setBackground(new java.awt.Color(79, 59, 185));
        btnGurdar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGurdar.setForeground(new java.awt.Color(255, 255, 255));
        btnGurdar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diskette_save_saveas_1514.png"))); // NOI18N
        btnGurdar.setText("GUARDAR");
        jPanel2.add(btnGurdar);
        btnGurdar.setBounds(40, 60, 150, 30);

        btnEditar.setBackground(new java.awt.Color(174, 174, 174));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        jPanel2.add(btnEditar);
        btnEditar.setBounds(40, 100, 150, 30);

        btnCancelar.setBackground(new java.awt.Color(174, 174, 174));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_01_24x24-32.gif"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(40, 140, 150, 30);

        btnEliminar.setBackground(new java.awt.Color(174, 174, 174));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recycle_recyclebin_full_delete_trash_1772.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(40, 180, 150, 30);

        btnContinual.setBackground(new java.awt.Color(174, 174, 174));
        btnContinual.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnContinual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diskette_save_saveas_1514.png"))); // NOI18N
        btnContinual.setText("CONTINUAR");
        jPanel2.add(btnContinual);
        btnContinual.setBounds(40, 220, 150, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(760, 130, 220, 280);

        btnbuscar.setBackground(new java.awt.Color(79, 59, 185));
        btnbuscar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        jPanel1.add(btnbuscar);
        btnbuscar.setBounds(660, 80, 120, 30);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(790, 80, 190, 30);

        jPanel5.setBackground(new java.awt.Color(79, 59, 185));
        jPanel5.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DATOS DEL ALUMNO");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(370, 10, 180, 20);

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        jPanel5.add(btnSalir);
        btnSalir.setBounds(910, 0, 60, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(30, 30, 970, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnContinual;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGurdar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnbuscar;
    public javax.swing.JComboBox<String> cmdGrado1;
    public javax.swing.JComboBox<String> cmdNivel;
    public javax.swing.JComboBox<String> cmdSexo;
    public com.toedter.calendar.JDateChooser dateNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField txtAntecedentes;
    public javax.swing.JTextField txtApellidomaterno;
    public javax.swing.JTextField txtApellidopaterno;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtContacto;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNEmergencia;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTratamiento;
    public javax.swing.JTextField txtVacante;
    // End of variables declaration//GEN-END:variables
}
