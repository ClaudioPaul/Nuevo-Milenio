/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AlumnoDao;
import Modelo.ApoderadoDao;
import Modelo.MadreDao;
import Modelo.PadreDao;
import Vista.FrmAlumno;
import Vista.FrmRegistroApoderado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorApoderado implements ActionListener{
    FrmRegistroApoderado apoderado = new FrmRegistroApoderado();
    ApoderadoDao apoD = new ApoderadoDao();
    
    public ControladorApoderado(FrmRegistroApoderado apoderado, ApoderadoDao apoD){
            this.apoderado = apoderado;
            this.apoD = apoD;
            this.apoderado.btnRegistrar.addActionListener(this);
            this.apoderado.btnSalir.addActionListener(this);
            this.apoderado.btnCancelar.addActionListener(this);
            this.apoderado.btnUsar.addActionListener(this);
            this.apoderado.btnSiguiente.addActionListener(this);
            this.apoderado.btnbuscar.addActionListener(this);
    }
    
    public void limpiarTextos(){
        apoderado.txtDni.setText("");
        apoderado.txtTelefono.setText("");
        apoderado.txtTelefonoA.setText("");
        apoderado.txtNombre.setText("");
        apoderado.txtApellidopaterno.setText("");
        apoderado.txtApellidomaterno.setText("");
        apoderado.txtCorreoE.setText("");
        apoderado.txtDireccion.setText("");
        apoderado.txtParentesco.setText("");
        apoderado.txtPago.setSelected(false);
    }
    
    public int BuscarApoderado(int dni){
        int numRegistros = apoD.BuscarApoderado(dni).size();
        return numRegistros;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == apoderado.btnSiguiente){
            apoderado.dispose();
            FrmAlumno alumno = new FrmAlumno();
            AlumnoDao aDao  =new AlumnoDao();
            ApoderadoDao apoD = new ApoderadoDao();
            PadreDao pDao = new PadreDao();
            MadreDao mDao = new MadreDao();
            ControladorAlumno conA = new ControladorAlumno(alumno, aDao, apoD, pDao, mDao);
            alumno.setVisible(true);
        }
         
        if(ae.getSource() == apoderado.btnRegistrar){
            String nombres = apoderado.txtNombre.getText();
            String apellidoP = apoderado.txtApellidopaterno.getText();
            String apellidoM = apoderado.txtApellidomaterno.getText();
            int Dni = Integer.parseInt(apoderado.txtDni.getText());
            int Telefono = Integer.parseInt(apoderado.txtTelefono.getText());
            int TelefonoR = Integer.parseInt(apoderado.txtTelefonoA.getText());
            String correo = apoderado.txtCorreoE.getText();
            String direccion = apoderado.txtDireccion.getText();
            String parentezco = apoderado.txtParentesco.getText();
            
            int Apoderado;
            int Pago;
            
            
            if(apoderado.txtPago.isSelected()){
                Pago = 1;
            }else{
                Pago = 0;
            }
            
            String rptaRegistro = apoD.Registrar(nombres, apellidoP, apellidoM, Dni, Telefono, TelefonoR, correo, direccion, parentezco, Pago);
            
            if(rptaRegistro!=null){
                JOptionPane.showMessageDialog(null, rptaRegistro);
                
                limpiarTextos();
            }else{
                JOptionPane.showMessageDialog(null, "ERROR EN REGISTRAR");
            }
            
            
        }
         
         if(ae.getSource() == apoderado.btnCancelar){
             limpiarTextos();
         }
        
    }
    
}
