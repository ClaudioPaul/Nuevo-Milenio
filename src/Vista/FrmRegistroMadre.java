/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Clauidio
 */
public class FrmRegistroMadre extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistroPadre
     */
    public FrmRegistroMadre() {
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
        jPanel3 = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidopaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidomaterno = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefonoA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreoE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmdApoderado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtDni);
        txtDni.setBounds(30, 40, 200, 24);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("DNI:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(30, 20, 24, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRES:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 70, 62, 17);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombre);
        txtNombre.setBounds(30, 90, 200, 24);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("APELLIDO PATERNO:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 120, 117, 15);

        txtApellidopaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidopaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtApellidopaterno);
        txtApellidopaterno.setBounds(30, 140, 200, 24);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("APODERADO:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(140, 230, 75, 15);

        txtApellidomaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidomaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtApellidomaterno);
        txtApellidomaterno.setBounds(30, 190, 200, 24);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtTelefono);
        txtTelefono.setBounds(260, 40, 200, 24);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("TELÉFONO:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(260, 20, 80, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("TELÉFONO ADICIONAL:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(260, 70, 140, 17);

        txtTelefonoA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefonoA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefonoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoAActionPerformed(evt);
            }
        });
        jPanel3.add(txtTelefonoA);
        txtTelefonoA.setBounds(260, 90, 200, 24);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("CORREO ELECTRÓNICO:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(260, 120, 150, 15);

        txtCorreoE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreoE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtCorreoE);
        txtCorreoE.setBounds(260, 140, 200, 24);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("DIRECCIÓN:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(260, 170, 65, 15);

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtDireccion);
        txtDireccion.setBounds(260, 190, 200, 24);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("APELLIDO MATERNO:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 170, 119, 15);

        cmdApoderado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdApoderado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SI", "NO", " " }));
        cmdApoderado.setBorder(null);
        jPanel3.add(cmdApoderado);
        cmdApoderado.setBounds(140, 250, 200, 24);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(150, 70, 490, 300);

        jPanel2.setLayout(null);

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        jPanel2.add(btnNuevo);
        btnNuevo.setBounds(80, 70, 150, 30);

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        jPanel2.add(btnEditar);
        btnEditar.setBounds(80, 110, 150, 30);

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_01_24x24-32.gif"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(80, 150, 150, 30);

        jButton1.setBackground(new java.awt.Color(37, 113, 169));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGUIENTE");
        jPanel2.add(jButton1);
        jButton1.setBounds(0, 270, 310, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 16 3.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 310, 309);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(640, 70, 310, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Group 16.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1042, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoAActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistroMadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroMadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroMadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroMadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroMadre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JComboBox<String> cmdApoderado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    public javax.swing.JTextField txtApellidomaterno;
    public javax.swing.JTextField txtApellidopaterno;
    public javax.swing.JTextField txtCorreoE;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtTelefonoA;
    // End of variables declaration//GEN-END:variables
}