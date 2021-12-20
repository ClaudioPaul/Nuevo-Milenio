/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AlumnoDao;
import Modelo.ApoderadoDao;
import Vista.FrmAlumno;
import Vista.FrmRegistroApoderado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource() == apoderado.btnSiguiente){
            apoderado.dispose();
            FrmAlumno alumno = new FrmAlumno();
            AlumnoDao aDao  =new AlumnoDao();
            ControladorAlumno conA = new ControladorAlumno(alumno, aDao);
            alumno.setVisible(true);
        }
        
    }
    
}
