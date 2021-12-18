/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.PadreDao;
import Vista.FrmRegistroMadre;
import Vista.FrmRegistroPadre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorPadre implements ActionListener{
    
    FrmRegistroPadre padre  = new FrmRegistroPadre();
    PadreDao padreD = new PadreDao();
    
    public ControladorPadre(FrmRegistroPadre padre, PadreDao padreD){
        this.padreD = padreD;
        this.padre = padre;
        this.padre.btnSiguiente.addActionListener(this);
        this.padre.btnSalir.addActionListener(this);
        this.padre.btnbuscar.addActionListener(this);
        this.padre.btnCancelar.addActionListener(this);
        this.padre.btnUsar.addActionListener(this);
    }
    
        
    public void limpiarTextos(){
        padre.txtTelefono.setText("");
        padre.txtTelefonoA.setText("");
        padre.txtNombre.setText("");
        padre.txtApellidopaterno.setText("");
        padre.txtApellidomaterno.setText("");
        padre.txtCorreoE.setText("");
        padre.txtDireccion.setText("");
        padre.txtApoderado.setSelected(false);
    }
    
    public void ActivarTextos(){
        
    }
    
    public void limpiarBuscar(){
        padre.txtBuscar.setText(null);
    }
   
    
    public void CursorBuscar(){
        padre.txtBuscar.requestFocus();
    }
    
    public void BloquearRegistrar(){
        padre.btnSiguiente.setEnabled(false);
    }
    
    public void ActivarRegistrar(){
        padre.btnSiguiente.setEnabled(true);
    }
    
    public void BloquearUsar(){
        padre.btnUsar.setEnabled(false);
    }
    
    public void ActivarUsar(){
        padre.btnUsar.setEnabled(true);
    }
    
    public int BuscarPadre(int dni){
        int numRegistros = padreD.BuscarPadres(dni).size();
        return numRegistros;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == padre.btnSalir){
            padre.dispose();
        }
        
        if(ae.getSource() == padre.btnbuscar){
            if(padre.txtBuscar.getText().trim().length()!=0){
                int dni = Integer.parseInt(padre.txtBuscar.getText());
                if(BuscarPadre(dni)>0){
                    JOptionPane.showMessageDialog(padre, "YA EXISTE UN REGISTRO");
                    for(int i = 0; i<BuscarPadre(dni); i++){
                        padre.txtCodigo.setText(String.valueOf(padreD.BuscarPadres(dni).get(i).getIdPadre()));
                        padre.txtNombre.setText(padreD.BuscarPadres(dni).get(i).getNombre());
                        padre.txtApellidopaterno.setText(padreD.BuscarPadres(dni).get(i).getApellidoP());
                        padre.txtApellidomaterno.setText(padreD.BuscarPadres(dni).get(i).getApellidoM());
                        padre.txtTelefono.setText(String.valueOf(padreD.BuscarPadres(dni).get(i).getTelefono()));
                        padre.txtTelefonoA.setText(String.valueOf(padreD.BuscarPadres(dni).get(i).getTelefonoReferencia()));
                        padre.txtDni.setText(String.valueOf(padreD.BuscarPadres(dni).get(i).getDni()));
                        padre.txtCorreoE.setText(padreD.BuscarPadres(dni).get(i).getCorreo());
                        padre.txtDireccion.setText(padreD.BuscarPadres(dni).get(i).getDirección());
                        
                        int ValidarA = padreD.BuscarPadres(dni).get(i).getValidarA();
                        int ValidarP = padreD.BuscarPadres(dni).get(i).getValidarP();
                            if(ValidarA==1){
                                padre.txtApoderado.setSelected(true);
                            }else{
                                padre.txtApoderado.setSelected(false);
                            }
                            if(ValidarP==1){
                                padre.txtPago.setSelected(true);
                            }else{
                                padre.txtPago.setSelected(false);
                            }
                    }
                    limpiarBuscar();
                    ActivarUsar();
                    BloquearRegistrar();
                } else{
                    padre.txtDni.setText(padre.txtBuscar.getText());
                    ActivarRegistrar();
                }                
            }else{
                JOptionPane.showMessageDialog(padre, "POR FAVOR INGRESE EL DNI A BUSCAR");
            }
        }
        
        if(ae.getSource() == padre.btnUsar){
            int dni = Integer.parseInt(padre.txtDni.getText());
            if(BuscarPadre(dni)>0){
                FrmRegistroMadre madre = new FrmRegistroMadre();
                ControladorMadre conm = new ControladorMadre(madre);
                madre.setVisible(true);
                for(int i = 0; i<BuscarPadre(dni); i++){
                    madre.txtCodigo.setText(String.valueOf(padreD.BuscarPadres(dni).get(i).getIdPadre()));
                }
                padre.dispose();
            }
        }
        
    }
    
}
