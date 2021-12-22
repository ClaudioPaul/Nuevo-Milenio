/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MatriculaDao;
import Vista.FrmRegistroFinal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorMatricula implements ActionListener{
    
    FrmRegistroFinal rfinal = new FrmRegistroFinal();
    MatriculaDao matriculaD = new MatriculaDao();

    public ControladorMatricula(FrmRegistroFinal rfinal, MatriculaDao matriculaD) {
        this.rfinal = rfinal;
        this.matriculaD = matriculaD;
        this.rfinal.btnCancelar.addActionListener(this);
        this.rfinal.btnSalir.addActionListener(this);
        this.rfinal.btnSiguiente.addActionListener(this);
        this.rfinal.btnbuscar.addActionListener(this);
        this.rfinal.btnImprimir.addActionListener(this);
    }
    
    public int BuscarAlumno(int dni){
        int numRegistros = matriculaD.BuscarAlumno(dni).size();
        return numRegistros;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == rfinal.btnSalir){
           rfinal.dispose();
        }
       
       if(ae.getSource() == rfinal.btnbuscar){
            if(rfinal.txtBuscar.getText().trim().length()!=0){
                int dni = Integer.parseInt(rfinal.txtBuscar.getText());
                if(BuscarAlumno(dni)>0){
                    JOptionPane.showMessageDialog(rfinal, "ENCONTRADO");
                    for(int i = 0; i<BuscarAlumno(dni); i++){
                        rfinal.txtAlumno.setText(String.valueOf(matriculaD.BuscarAlumno(dni).get(i).getIdAlumno()));
                    }
                }              
            }else{
                JOptionPane.showMessageDialog(rfinal, "POR FAVOR INGRESE EL DNI A BUSCAR");
            }
        }
       
       if(ae.getSource() == rfinal.btnSiguiente){
            int idAlumno = Integer.parseInt(rfinal.txtAlumno.getText());
            String colegioP = rfinal.txtColProc.getText();
            String TipoColegio = rfinal.cmdTipoColegio.getSelectedItem().toString();
            String Direccion = rfinal.txtDireccion.getText();
            String CodigoM = rfinal.txtCodigoModular.getText();
            String GradoCul = rfinal.txtGradiiCulminado.getText();
            String GradoCur = rfinal.txtGradoCursar.getText();
            
            int CarpetaR;
            int DPendiente;
            
            if(rfinal.txtCarpetaRecuperacion.isSelected()){
                CarpetaR = 1;
            }else{
                CarpetaR = 0;
            }
           
            
            String Especificacion = rfinal.txtEspecificacionCarpetaR.getText();
            
            if(rfinal.txtDocumentoPendiente.isSelected()){
                DPendiente = 1;
            }else{
                DPendiente = 0;
            }
            
            int Pago = Integer.parseInt(rfinal.cmdPago.getSelectedItem().toString());
            
            
            
            String rptaRegistro = matriculaD.Registrar(idAlumno, colegioP, CodigoM, Direccion, CodigoM, 
                    GradoCul, GradoCur, CarpetaR, Especificacion, DPendiente, Pago);
            
            if(rptaRegistro!=null){
                JOptionPane.showMessageDialog(null, rptaRegistro);

            }else{
                JOptionPane.showMessageDialog(null, "ERROR EN REGISTRAR");
            }
       }
       
       if(ae.getSource() == rfinal.btnImprimir){
           int dni = Integer.parseInt(rfinal.txtBuscar.getText());
            try {
                matriculaD.GenrerarReporte(dni);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorMatricula.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
    
}
