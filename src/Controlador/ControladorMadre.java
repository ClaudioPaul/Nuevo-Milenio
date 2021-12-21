/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ApoderadoDao;
import Modelo.MadreDao;
import Vista.FrmRegistroApoderado;
import Vista.FrmRegistroMadre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorMadre implements ActionListener{
    
    FrmRegistroMadre madre  = new FrmRegistroMadre();
    MadreDao madreD = new MadreDao();
    ApoderadoDao apoD = new ApoderadoDao();
    
    public ControladorMadre(FrmRegistroMadre madre, MadreDao madreD, ApoderadoDao apoD){
        this.madre = madre;
        this.madreD = madreD;
        this.apoD = apoD;
        this.madre.btnRegistrar.addActionListener(this);
        this.madre.btnSalir.addActionListener(this);
        this.madre.btnbuscar.addActionListener(this);
        this.madre.btnCancelar.addActionListener(this);
        this.madre.btnUsar.addActionListener(this);
        this.madre.btnSiguiente.addActionListener(this);
    }
    
    public void limpiarTextos(){
        madre.txtDni.setText("");
        madre.txtTelefono.setText("");
        madre.txtTelefonoA.setText("");
        madre.txtNombre.setText("");
        madre.txtApellidopaterno.setText("");
        madre.txtApellidomaterno.setText("");
        madre.txtCorreoE.setText("");
        madre.txtDireccion.setText("");
        madre.txtBuscar.setText("");
        madre.txtApoderado.setSelected(false);
        madre.txtPago.setSelected(false);
    }
    public int BuscarMadre(int dni){
        int numRegistros = madreD.BuscarMadres(dni).size();
        return numRegistros;
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == madre.btnSalir){
            madre.dispose();
        }
        
        if(ae.getSource() == madre.btnSiguiente){
            madre.dispose();
            FrmRegistroApoderado apoderado = new FrmRegistroApoderado();
            ApoderadoDao apoD  = new ApoderadoDao();
            ControladorApoderado conA = new ControladorApoderado(apoderado, apoD);
            apoderado.setVisible(true);
        }
        
        if(ae.getSource() == madre.btnbuscar){
            if(madre.txtBuscar.getText().trim().length()!=0){
                int dni = Integer.parseInt(madre.txtBuscar.getText());
                if(BuscarMadre(dni)>0){
                    JOptionPane.showMessageDialog(madre, "YA EXISTE UN REGISTRO");
                    for(int i = 0; i<BuscarMadre(dni); i++){
                        madre.txtCodigo.setText(String.valueOf(madreD.BuscarMadres(dni).get(i).getIdMadre()));
                        madre.txtNombre.setText(madreD.BuscarMadres(dni).get(i).getNombre());
                        madre.txtApellidopaterno.setText(madreD.BuscarMadres(dni).get(i).getApellidoP());
                        madre.txtApellidomaterno.setText(madreD.BuscarMadres(dni).get(i).getApellidoM());
                        madre.txtTelefono.setText(String.valueOf(madreD.BuscarMadres(dni).get(i).getTelefono()));
                        madre.txtTelefonoA.setText(String.valueOf(madreD.BuscarMadres(dni).get(i).getTelefonoReferencia()));
                        madre.txtDni.setText(String.valueOf(madreD.BuscarMadres(dni).get(i).getDni()));
                        madre.txtCorreoE.setText(madreD.BuscarMadres(dni).get(i).getCorreo());
                        madre.txtDireccion.setText(madreD.BuscarMadres(dni).get(i).getDirección());
                        
                        int ValidarA = madreD.BuscarMadres(dni).get(i).getValidarA();
                        int ValidarP = madreD.BuscarMadres(dni).get(i).getValidarP();
                            if(ValidarA==1){
                                madre.txtApoderado.setSelected(true);
                            }else{
                                madre.txtApoderado.setSelected(false);
                            }
                            if(ValidarP==1){
                                madre.txtPago.setSelected(true);
                            }else{
                                madre.txtPago.setSelected(false);
                            }
                    }
                } else{
                    madre.txtDni.setText(madre.txtBuscar.getText());
                }                
            }else{
                JOptionPane.showMessageDialog(madre, "POR FAVOR INGRESE EL DNI A BUSCAR");
            }
        }
        
        if(ae.getSource() == madre.btnRegistrar){
            String nombres = madre.txtNombre.getText();
            String apellidoP = madre.txtApellidopaterno.getText();
            String apellidoM = madre.txtApellidomaterno.getText();
            int Dni = Integer.parseInt(madre.txtDni.getText());
            int Telefono = Integer.parseInt(madre.txtTelefono.getText());
            int TelefonoR = Integer.parseInt(madre.txtTelefonoA.getText());
            String correo = madre.txtCorreoE.getText();
            String direccion = madre.txtDireccion.getText();
            
            int Apoderado;
            int Pago;
            
            if(madre.txtApoderado.isSelected()){
                Apoderado = 1;
            }else{
                Apoderado = 0;
            }
            
            if(madre.txtPago.isSelected()){
                Pago = 1;
            }else{
                Pago = 0;
            }
            
            String Parentezco = "MADRE";
            
            String rptaRegistro = madreD.Registrar(nombres, apellidoP, apellidoM, Dni, Telefono, TelefonoR, correo, direccion, Apoderado, Pago);
            
            String rptaRegistroA = null;
            
            if(Apoderado == 1){
                 rptaRegistroA = apoD.Registrar(nombres, apellidoP, apellidoM, Dni, Telefono, TelefonoR, correo, direccion, Parentezco, Pago);
            }
            
            if(rptaRegistro!=null){
                JOptionPane.showMessageDialog(null, rptaRegistro);
                if(rptaRegistroA !=null){
                   JOptionPane.showMessageDialog(null, rptaRegistroA);
                }
                limpiarTextos();
            }else{
                JOptionPane.showMessageDialog(null, "ERROR EN REGISTRAR");
            }
        }
        
        if(ae.getSource() == madre.btnCancelar){
            limpiarTextos();
        }
    }
    
}
