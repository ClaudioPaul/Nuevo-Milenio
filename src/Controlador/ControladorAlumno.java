/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AlumnoDao;
import Modelo.ApoderadoDao;
import Modelo.MadreDao;
import Modelo.MatriculaDao;
import Modelo.PadreDao;
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
    ApoderadoDao apoD = new ApoderadoDao();
    PadreDao pDao = new PadreDao();
    MadreDao mDao = new MadreDao();
    
    public ControladorAlumno(FrmAlumno alumno, AlumnoDao aDao, ApoderadoDao apoD, PadreDao pDao, MadreDao mDao){
        this.alumno = alumno;
        this.aDao = aDao;
        this.apoD = apoD;
        this.pDao = pDao;
        this.mDao = mDao;
        this.alumno.btnGurdar.addActionListener(this);
        this.alumno.btnCancelar.addActionListener(this);
        this.alumno.btnSalir.addActionListener(this);
        this.alumno.btnContinual.addActionListener(this);
        this.alumno.btnbuscarApoderado.addActionListener(this);
        this.alumno.btnbuscarPadre.addActionListener(this);
        this.alumno.btnbuscarMadre.addActionListener(this);
    }
    
    public int BuscarPadre(int dni){
        int numRegistros = pDao.BuscarPadres(dni).size();
        return numRegistros;
    }
    
    public int BuscarMadre(int dni){
        int numRegistros = mDao.BuscarMadres(dni).size();
        return numRegistros;
    }
    
    public int BuscarApoderado(int dni){
        int numRegistros = apoD.BuscarApoderado(dni).size();
        return numRegistros;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == alumno.btnbuscarPadre){
            if(alumno.txtBuscarPadre.getText().trim().length()!=0){
                int dni = Integer.parseInt(alumno.txtBuscarPadre.getText());
                if(BuscarPadre(dni)>0){
                    for(int i = 0; i<BuscarPadre(dni); i++){
                        alumno.txtCpadre.setText(String.valueOf(pDao.BuscarPadres(dni).get(i).getIdPadre()));
                    }
                }         
            }else{
                JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE EL DNI DEL PADRE A BUSCAR");
            }
        }
        
        if(ae.getSource() == alumno.btnbuscarMadre){
            if(alumno.txtBuscarMadre.getText().trim().length()!=0){
                int dni = Integer.parseInt(alumno.txtBuscarMadre.getText());
                if(BuscarMadre(dni)>0){
                    for(int i = 0; i<BuscarMadre(dni); i++){
                        alumno.txtCmadre.setText(String.valueOf(mDao.BuscarMadres(dni).get(i).getIdMadre()));
                    }
                }         
            }else{
                JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE EL DNI DE LA MADRE A BUSCAR");
            }
        }
        
        if(ae.getSource() == alumno.btnbuscarApoderado){
            if(alumno.txtBuscarApoderado.getText().trim().length()!=0){
                int dni = Integer.parseInt(alumno.txtBuscarApoderado.getText());
                if(BuscarApoderado(dni)>0){
                    for(int i = 0; i<BuscarApoderado(dni); i++){
                        alumno.txtCapoderado.setText(String.valueOf(apoD.BuscarApoderado(dni).get(i).getIdApoderado()));
                    }
                }         
            }else{
                JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE EL DNI DEL APODERADO A BUSCAR");
            }
        }
        
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
             
             
            int edad = Integer.parseInt(alumno.txtEdad.getText());
            
            String antecedentes = alumno.txtAntecedentes.getText();
            String tratamiento = alumno.txtTratamiento.getText();
            String viveCon = alumno.txtViveCon.getText();
            int numeroEmergencia = Integer.parseInt(alumno.txtNEmergencia.getText());
            String Contacto = alumno.txtContacto.getText();
            String Parentezco = alumno.txtParentezco.getText();
            
            int Padre = Integer.parseInt(alumno.txtCpadre.getText());
            int Madre = Integer.parseInt(alumno.txtCmadre.getText());
            int Apoderado = Integer.parseInt(alumno.txtCapoderado.getText());
            
            String rptaRegistro = aDao.Registrar(nombres, apellidoP, apellidoM, dni, sexo, fechaNacimiento, edad, 
                    antecedentes, tratamiento, viveCon, numeroEmergencia, Contacto, Parentezco, Padre, Madre, Apoderado);
            
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
            MatriculaDao mDao = new MatriculaDao();
            ControladorMatricula conM= new ControladorMatricula(r, mDao);
            alumno.dispose();
            r.setVisible(true);
        }
        
    }
    
}
