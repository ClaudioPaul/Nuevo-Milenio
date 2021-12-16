/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FrmRegistroApoderado;
import Vista.FrmRegistroMadre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorMadre implements ActionListener{
    
    FrmRegistroMadre madre  = new FrmRegistroMadre();
    
    public ControladorMadre(FrmRegistroMadre madre ){
        this.madre = madre;
        this.madre.btnSiguiente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == madre.btnSiguiente){
            madre.dispose();
            FrmRegistroApoderado apoderado = new FrmRegistroApoderado();
            apoderado.setVisible(true);
        }
    }
    
}
