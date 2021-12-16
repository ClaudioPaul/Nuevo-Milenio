/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FrmRegistroMadre;
import Vista.FrmRegistroPadre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorPadre implements ActionListener{
    
    FrmRegistroPadre padre  = new FrmRegistroPadre();
    
    public ControladorPadre(FrmRegistroPadre padre ){
        this.padre = padre;
        this.padre.btnSiguiente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == padre.btnSiguiente){
            padre.dispose();
            FrmRegistroMadre madre = new FrmRegistroMadre();
            ControladorMadre conm = new ControladorMadre(madre);
            madre.setVisible(true);
        }
    }
    
}
