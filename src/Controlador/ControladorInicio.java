/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.PadreDao;
import Vista.FrmInicio;
import Vista.FrmRegistroPadre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorInicio implements ActionListener{
    
    FrmInicio inicio = new FrmInicio();
    
    public ControladorInicio(FrmInicio inicio){
        this.inicio = inicio;
        this.inicio.btnAlumnos.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == inicio.btnAlumnos){
           FrmRegistroPadre padre = new FrmRegistroPadre();
           PadreDao padreD = new PadreDao();
           ControladorPadre conP = new ControladorPadre(padre, padreD);
           conP.CursorBuscar();
           conP.CursorBuscar();
           conP.BloquearRegistrar();
           conP.BloquearUsar();
           padre.setVisible(true);
       }
    }
    
}
