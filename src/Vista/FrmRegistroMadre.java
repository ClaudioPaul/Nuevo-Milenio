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
        txtCodigo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApoderado = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        txtPago = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnEditarM = new javax.swing.JButton();
        btnCancelarM = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnRegistrarM = new javax.swing.JButton();
        btnUsarM = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185), 2));
        jPanel3.setLayout(null);

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtDni);
        txtDni.setBounds(30, 40, 200, 24);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("DNI:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(30, 20, 40, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRES:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 70, 80, 17);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombre);
        txtNombre.setBounds(30, 90, 200, 24);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("APELLIDO PATERNO:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 120, 130, 15);

        txtApellidopaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidopaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtApellidopaterno);
        txtApellidopaterno.setBounds(30, 140, 200, 24);

        txtApellidomaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidomaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtApellidomaterno);
        txtApellidomaterno.setBounds(30, 190, 200, 24);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtTelefono);
        txtTelefono.setBounds(260, 40, 200, 24);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("TELÉFONO:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(260, 20, 100, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("TELÉFONO ADICIONAL:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(260, 70, 160, 17);

        txtTelefonoA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefonoA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        txtTelefonoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoAActionPerformed(evt);
            }
        });
        jPanel3.add(txtTelefonoA);
        txtTelefonoA.setBounds(260, 90, 200, 24);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CORREO ELECTRÓNICO:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(260, 120, 170, 15);

        txtCorreoE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreoE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtCorreoE);
        txtCorreoE.setBounds(260, 140, 200, 24);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("DIRECCIÓN:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(260, 170, 80, 15);

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtDireccion);
        txtDireccion.setBounds(260, 190, 200, 24);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("APELLIDO MATERNO:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 170, 130, 15);
        jPanel3.add(txtCodigo);
        txtCodigo.setBounds(30, 250, 50, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("APODERADO:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 240, 100, 15);

        txtApoderado.setBackground(new java.awt.Color(255, 255, 255));
        txtApoderado.setText("SI");
        jPanel3.add(txtApoderado);
        txtApoderado.setBounds(120, 230, 40, 25);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("RESPONSABLE DE PAGO:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(260, 240, 160, 15);

        txtPago.setBackground(new java.awt.Color(255, 255, 255));
        txtPago.setText("SI");
        jPanel3.add(txtPago);
        txtPago.setBounds(420, 230, 40, 25);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(110, 170, 490, 300);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185), 2));
        jPanel2.setLayout(null);

        btnEditarM.setBackground(new java.awt.Color(174, 174, 174));
        btnEditarM.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEditarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnEditarM.setText("EDITAR");
        jPanel2.add(btnEditarM);
        btnEditarM.setBounds(70, 110, 170, 30);

        btnCancelarM.setBackground(new java.awt.Color(174, 174, 174));
        btnCancelarM.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCancelarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_01_24x24-32.gif"))); // NOI18N
        btnCancelarM.setText("CANCELAR");
        jPanel2.add(btnCancelarM);
        btnCancelarM.setBounds(70, 150, 170, 30);

        btnSiguiente.setBackground(new java.awt.Color(174, 174, 174));
        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSiguiente.setText("SIGUIENTE");
        jPanel2.add(btnSiguiente);
        btnSiguiente.setBounds(70, 230, 170, 30);

        btnRegistrarM.setBackground(new java.awt.Color(79, 59, 185));
        btnRegistrarM.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnRegistrarM.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarM.setText("REGISTRAR");
        jPanel2.add(btnRegistrarM);
        btnRegistrarM.setBounds(70, 70, 170, 30);

        btnUsarM.setBackground(new java.awt.Color(174, 174, 174));
        btnUsarM.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnUsarM.setText("USAR DATOS");
        jPanel2.add(btnUsarM);
        btnUsarM.setBounds(70, 190, 170, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(610, 170, 310, 300);

        jPanel4.setBackground(new java.awt.Color(79, 59, 185));
        jPanel4.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DATOS DE LA MADRE");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(370, 10, 180, 20);

        btnSalir.setBackground(new java.awt.Color(204, 0, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        jPanel4.add(btnSalir);
        btnSalir.setBounds(900, 0, 60, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(40, 30, 960, 40);

        btnbuscar.setBackground(new java.awt.Color(79, 59, 185));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        jPanel1.add(btnbuscar);
        btnbuscar.setBounds(510, 120, 120, 30);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(640, 120, 280, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoAActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
    public javax.swing.JButton btnCancelarM;
    public javax.swing.JButton btnEditarM;
    public javax.swing.JButton btnRegistrarM;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnSiguiente;
    public javax.swing.JButton btnUsarM;
    public javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    public javax.swing.JTextField txtApellidomaterno;
    public javax.swing.JTextField txtApellidopaterno;
    public javax.swing.JCheckBox txtApoderado;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JLabel txtCodigo;
    public javax.swing.JTextField txtCorreoE;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JCheckBox txtPago;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtTelefonoA;
    // End of variables declaration//GEN-END:variables
}
