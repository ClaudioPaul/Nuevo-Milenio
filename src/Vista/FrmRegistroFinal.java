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
public class FrmRegistroFinal extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistroPadre
     */
    public FrmRegistroFinal() {
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
        txtBuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtAlumno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtColProc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtCodigoModular = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGradiiCulminado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGradoCursar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEspecificacionCarpetaR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCarpetaRecuperacion = new javax.swing.JCheckBox();
        cmdTipoColegio = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtDocumentoPendiente = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        cmdPago = new javax.swing.JComboBox<>();
        btnImprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(640, 120, 350, 30);

        btnbuscar.setBackground(new java.awt.Color(79, 59, 185));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        jPanel1.add(btnbuscar);
        btnbuscar.setBounds(480, 120, 150, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185), 2));
        jPanel3.setLayout(null);

        txtAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtAlumno);
        txtAlumno.setBounds(30, 40, 200, 24);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("ALUMNO:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(30, 20, 60, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("COLEGIO DE PROCEDENCIA:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 80, 180, 17);

        txtColProc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtColProc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        txtColProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColProcActionPerformed(evt);
            }
        });
        jPanel3.add(txtColProc);
        txtColProc.setBounds(30, 100, 200, 24);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("TIPO DE COLÉDGIO:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 140, 130, 15);

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtDireccion);
        txtDireccion.setBounds(30, 220, 200, 24);

        txtCodigoModular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigoModular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtCodigoModular);
        txtCodigoModular.setBounds(260, 40, 200, 24);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("CÓDIGO MODULAR:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(260, 20, 130, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("GRADO CULMINADO:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(260, 80, 150, 17);

        txtGradiiCulminado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGradiiCulminado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        txtGradiiCulminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradiiCulminadoActionPerformed(evt);
            }
        });
        jPanel3.add(txtGradiiCulminado);
        txtGradiiCulminado.setBounds(260, 100, 200, 24);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("GRADO A CURSAR:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(260, 140, 160, 15);

        txtGradoCursar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGradoCursar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtGradoCursar);
        txtGradoCursar.setBounds(260, 160, 200, 24);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ESPECIFICACION DE LA CR:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(480, 80, 190, 15);

        txtEspecificacionCarpetaR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEspecificacionCarpetaR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185)));
        jPanel3.add(txtEspecificacionCarpetaR);
        txtEspecificacionCarpetaR.setBounds(480, 100, 200, 24);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("DIRECCION:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 200, 130, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("CARPETA DE RECUPERACIÓN:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(480, 20, 180, 15);

        txtCarpetaRecuperacion.setBackground(new java.awt.Color(255, 255, 255));
        txtCarpetaRecuperacion.setText("SI");
        jPanel3.add(txtCarpetaRecuperacion);
        txtCarpetaRecuperacion.setBounds(480, 40, 40, 23);

        cmdTipoColegio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdTipoColegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "PRIVADO", "PÚBLICO", " " }));
        cmdTipoColegio.setBorder(null);
        jPanel3.add(cmdTipoColegio);
        cmdTipoColegio.setBounds(30, 160, 200, 24);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("DOCUMENTO PENDIENTE:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(480, 140, 180, 15);

        txtDocumentoPendiente.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumentoPendiente.setText("SI");
        jPanel3.add(txtDocumentoPendiente);
        txtDocumentoPendiente.setBounds(480, 160, 40, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("PAGO MATRÍCULA:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(480, 200, 190, 15);

        cmdPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "130", "150", "50" }));
        cmdPago.setBorder(null);
        jPanel3.add(cmdPago);
        cmdPago.setBounds(480, 220, 200, 24);

        btnImprimir.setBackground(new java.awt.Color(174, 174, 174));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnImprimir.setText("REPORTE");
        jPanel3.add(btnImprimir);
        btnImprimir.setBounds(250, 260, 210, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(50, 170, 700, 300);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 59, 185), 2));
        jPanel2.setLayout(null);

        btnSiguiente.setBackground(new java.awt.Color(79, 59, 185));
        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("REGISTRAR");
        jPanel2.add(btnSiguiente);
        btnSiguiente.setBounds(10, 50, 210, 30);

        btnCancelar.setBackground(new java.awt.Color(174, 174, 174));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_01_24x24-32.gif"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(10, 190, 210, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(760, 170, 230, 300);

        jPanel4.setBackground(new java.awt.Color(79, 59, 185));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("REGISTRO FINAL");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(370, 10, 160, 20);

        btnSalir.setBackground(new java.awt.Color(204, 0, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        jPanel4.add(btnSalir);
        btnSalir.setBounds(900, 0, 60, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(40, 30, 960, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtColProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColProcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColProcActionPerformed

    private void txtGradiiCulminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradiiCulminadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGradiiCulminadoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnSiguiente;
    public javax.swing.JButton btnbuscar;
    public javax.swing.JComboBox<String> cmdPago;
    public javax.swing.JComboBox<String> cmdTipoColegio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField txtAlumno;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JCheckBox txtCarpetaRecuperacion;
    public javax.swing.JTextField txtCodigoModular;
    public javax.swing.JTextField txtColProc;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JCheckBox txtDocumentoPendiente;
    public javax.swing.JTextField txtEspecificacionCarpetaR;
    public javax.swing.JTextField txtGradiiCulminado;
    public javax.swing.JTextField txtGradoCursar;
    // End of variables declaration//GEN-END:variables
}
