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
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        txtNEmergencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTratamiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAntecedentes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtApellidopaterno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDni1 = new javax.swing.JTextField();
        txtApellidomaterno1 = new javax.swing.JTextField();
        cmdGrado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGurdar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jPanel4.setLayout(null);

        cmdGrado1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdGrado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", " " }));
        jPanel4.add(cmdGrado1);
        cmdGrado1.setBounds(30, 140, 180, 20);

        txtVacante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtVacante);
        txtVacante.setBounds(30, 200, 180, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("VACANTE:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(30, 180, 60, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("GRADO:");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(30, 120, 50, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIVEL:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(30, 60, 50, 15);

        cmdNivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "INICIAL", "PRIMARIA", "SECUNDARIA" }));
        jPanel4.add(cmdNivel);
        cmdNivel.setBounds(30, 80, 180, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 16 1.png"))); // NOI18N
        jPanel4.add(jLabel13);
        jLabel13.setBounds(0, 0, 246, 280);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(40, 90, 240, 280);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("NOMBRE DE CONTACTO");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(260, 220, 134, 15);

        txtContacto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoActionPerformed(evt);
            }
        });
        jPanel3.add(txtContacto);
        txtContacto.setBounds(260, 240, 200, 20);

        txtNEmergencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtNEmergencia);
        txtNEmergencia.setBounds(260, 190, 200, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("NUMERO DE EMERGENCIA");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(260, 170, 143, 15);

        txtTratamiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtTratamiento);
        txtTratamiento.setBounds(260, 140, 200, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("TRATAMIENTO");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(260, 120, 120, 15);

        txtAntecedentes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtAntecedentes);
        txtAntecedentes.setBounds(260, 90, 200, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("ANTECEDENTES DE SALUD");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(260, 70, 150, 15);
        jPanel3.add(dateNacimiento);
        dateNacimiento.setBounds(260, 40, 200, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("FECHA DE NACIMIENTO");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(260, 20, 131, 15);

        txtApellidopaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtApellidopaterno);
        txtApellidopaterno.setBounds(30, 140, 200, 20);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombre);
        txtNombre.setBounds(30, 90, 200, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("SEXO");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 220, 30, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("APELLIDO MATERNO");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 170, 115, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("APELLIDO PATERNO");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 120, 113, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRES");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 70, 62, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("DNI");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(30, 20, 20, 15);

        txtDni1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtDni1);
        txtDni1.setBounds(30, 40, 200, 20);

        txtApellidomaterno1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtApellidomaterno1);
        txtApellidomaterno1.setBounds(30, 190, 200, 20);

        cmdGrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "MASCULINO", "FEMENINO", " " }));
        jPanel3.add(cmdGrado);
        cmdGrado.setBounds(30, 240, 200, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(280, 90, 500, 280);

        jPanel2.setLayout(null);

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        jPanel2.add(btnNuevo);
        btnNuevo.setBounds(40, 40, 150, 30);

        btnGurdar.setBackground(new java.awt.Color(255, 255, 255));
        btnGurdar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGurdar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diskette_save_saveas_1514.png"))); // NOI18N
        btnGurdar.setText("GUARDAR");
        jPanel2.add(btnGurdar);
        btnGurdar.setBounds(40, 80, 150, 30);

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        jPanel2.add(btnEditar);
        btnEditar.setBounds(40, 120, 150, 30);

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_01_24x24-32.gif"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(40, 160, 150, 30);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recycle_recyclebin_full_delete_trash_1772.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(40, 200, 150, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 16 2.png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(0, 0, 225, 286);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(780, 90, 220, 280);

        btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        jPanel1.add(btnbuscar);
        btnbuscar.setBounds(880, 30, 120, 30);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(650, 40, 220, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 16.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 1040, 447);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
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
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGurdar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnbuscar;
    public javax.swing.JComboBox<String> cmdGrado;
    public javax.swing.JComboBox<String> cmdGrado1;
    public javax.swing.JComboBox<String> cmdNivel;
    public com.toedter.calendar.JDateChooser dateNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    public javax.swing.JTextField txtAntecedentes;
    public javax.swing.JTextField txtApellidomaterno1;
    public javax.swing.JTextField txtApellidopaterno;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtContacto;
    public javax.swing.JTextField txtDni1;
    public javax.swing.JTextField txtNEmergencia;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTratamiento;
    public javax.swing.JTextField txtVacante;
    // End of variables declaration//GEN-END:variables
}
