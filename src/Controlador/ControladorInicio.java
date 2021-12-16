/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FrmInicio;
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
       
    }
    
}
