/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AlumnoDao;
import Vista.FrmAlumno;
import Vista.FrmRegistroFinal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorAlumno implements ActionListener{
    
    FrmAlumno alumno = new FrmAlumno();
    AlumnoDao aDao = new AlumnoDao();
    
    public ControladorAlumno(FrmAlumno alumno, AlumnoDao aDao){
        this.alumno = alumno;
        this.aDao = aDao;
        this.alumno.btnGurdar.addActionListener(this);
        this.alumno.btnNuevo.addActionListener(this);
        this.alumno.btnCancelar.addActionListener(this);
        this.alumno.btnEditar.addActionListener(this);
        this.alumno.btnEliminar.addActionListener(this);
        this.alumno.btnbuscar.addActionListener(this);
        this.alumno.btnSalir.addActionListener(this);
        this.alumno.btnContinual.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == alumno.btnGurdar){
            
            int dni = Integer.parseInt(alumno.txtDni.getText());
            String nombres = alumno.txtNombre.getText();
            String apellidoP = alumno.txtApellidopaterno.getText();
            String apellidoM = alumno.txtApellidomaterno.getText();
            String sexo = alumno.cmdSexo.getSelectedItem().toString();
            
            // FECHA DE INGRESO
               int año = alumno.dateNacimiento.getCalendar().get(Calendar.YEAR);
               int mes = alumno.dateNacimiento.getCalendar().get(Calendar.MONTH) + 1;
               int dia = alumno.dateNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
              
             String fechaNacimiento =(año+"-"+mes+"-"+dia);
            
            String antecedentes = alumno.txtAntecedentes.getText();
            String tratamiento = alumno.txtTratamiento.getText();
            int numeroEmergencia = Integer.parseInt(alumno.txtNEmergencia.getText());
            String Contacto = alumno.txtContacto.getText();
            
            String rptaRegistro = aDao.Registrar(dni, nombres, apellidoP, apellidoM, sexo, 
                    fechaNacimiento, antecedentes, tratamiento, numeroEmergencia, Contacto);
            
            if(rptaRegistro!=null){
                JOptionPane.showMessageDialog(null, rptaRegistro);
            }else{
                JOptionPane.showMessageDialog(null, "ERROR EN REGISTRAR");
            }
        }
        if(ae.getSource() == alumno.btnSalir){
            alumno.dispose();
        }
        
        if(ae.getSource() == alumno.btnContinual){
            FrmRegistroFinal r = new FrmRegistroFinal();
            r.setVisible(true);
        }
        
    }
    
}
