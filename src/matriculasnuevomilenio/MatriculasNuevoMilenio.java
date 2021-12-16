/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriculasnuevomilenio;

import Controlador.ControladorInicio;
import Vista.FrmAlumno;
import Vista.FrmInicio;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class MatriculasNuevoMilenio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmInicio inicio = new FrmInicio();
        ControladorInicio conI = new ControladorInicio(inicio);
        inicio.setVisible(true);
    }
    
    
}
