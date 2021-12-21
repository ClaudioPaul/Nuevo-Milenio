/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ApoderadoDao;
import Modelo.MadreDao;
import Modelo.PadreDao;
import Modelo.ValidarVacantesDao;
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
    ApoderadoDao apoD = new ApoderadoDao();
    ValidarVacantesDao valD  = new ValidarVacantesDao();
    
    public ControladorPadre(FrmRegistroPadre padre, PadreDao padreD, ValidarVacantesDao valD, ApoderadoDao apoD){
        this.padreD = padreD;
        this.padre = padre;
        this.valD = valD;
        this.apoD = apoD;
        this.padre.btnRegistrar.addActionListener(this);
        this.padre.btnSalir.addActionListener(this);
        this.padre.btnbuscar.addActionListener(this);
        this.padre.btnCancelar.addActionListener(this);
        this.padre.btnUsar.addActionListener(this);
        this.padre.cmdNivel.addActionListener(this);
        this.padre.cmdGrado1.addActionListener(this);
        this.padre.cmdSeccion.addActionListener(this);
        this.padre.btnSiguiente.addActionListener(this);
    }
    
        
    public void limpiarTextos(){
        padre.txtBuscar.setText("");
        padre.txtDni.setText("");
        padre.txtTelefono.setText("");
        padre.txtTelefonoA.setText("");
        padre.txtNombre.setText("");
        padre.txtApellidopaterno.setText("");
        padre.txtApellidomaterno.setText("");
        padre.txtCorreoE.setText("");
        padre.txtDireccion.setText("");
        padre.txtApoderado.setSelected(false);
        padre.txtPago.setSelected(false);
    }
    
    public void BloquearPadre(){
        padre.txtBuscar.setEnabled(false);
        padre.txtDni.setEnabled(false);
        padre.txtTelefono.setEnabled(false);
        padre.txtTelefonoA.setEnabled(false);
        padre.txtVacante.setEnabled(false);
        padre.txtNombre.setEnabled(false);
        padre.txtApellidopaterno.setEnabled(false);
        padre.txtApellidomaterno.setEnabled(false);
        padre.txtCorreoE.setEnabled(false);
        padre.txtDireccion.setEnabled(false);
        padre.txtApoderado.setEnabled(false);
        padre.txtPago.setEnabled(false);
        padre.btnCancelar.setEnabled(false);
        padre.btnRegistrar.setEnabled(false);
        padre.btnUsar.setEnabled(false);
        padre.btnSiguiente.setEnabled(false);
        padre.btnbuscar.setEnabled(false);
    }
    
    public void DesbloquearPadre(){
        padre.txtBuscar.setEnabled(true);
        padre.txtDni.setEnabled(true);
        padre.txtTelefono.setEnabled(true);
        padre.txtTelefonoA.setEnabled(true);
        padre.txtVacante.setEnabled(true);
        padre.txtNombre.setEnabled(true);
        padre.txtApellidopaterno.setEnabled(true);
        padre.txtApellidomaterno.setEnabled(true);
        padre.txtCorreoE.setEnabled(true);
        padre.txtDireccion.setEnabled(true);
        padre.txtApoderado.setEnabled(true);
        padre.txtPago.setEnabled(true);
        padre.btnCancelar.setEnabled(true);
        padre.btnRegistrar.setEnabled(true);
        padre.btnUsar.setEnabled(true);
        padre.btnSiguiente.setEnabled(true);
        padre.btnbuscar.setEnabled(true);
    }
   
    
    public int BuscarPadre(int dni){
        int numRegistros = padreD.BuscarPadres(dni).size();
        return numRegistros;
    }
    
    public void LlenarSeccionU(){
        LimpiarSeccionAB();
        LimpiarSeccionU();
        padre.cmdSeccion.addItem("U");
    }
    
    public void LimpiarSeccionU(){
        padre.cmdSeccion.removeItem("U");
    }
    
    public void LlenarSeccionAB(){
        LimpiarSeccionU();
        LimpiarSeccionAB();
        padre.cmdSeccion.addItem("A");
        padre.cmdSeccion.addItem("B");
    }
    
    public void LimpiarSeccionAB(){
        padre.cmdSeccion.removeItem("A");
        padre.cmdSeccion.removeItem("B");
    }

    public void LlenarInicial(){
        LimpiarPrimaria();
        LimpiarSecundaria();
        LimpiarInicial();
        padre.cmdGrado1.addItem("3 AÑOS");
        padre.cmdGrado1.addItem("4 AÑOS");
        padre.cmdGrado1.addItem("5 AÑOS");
    }
    
    public void LimpiarInicial(){
        padre.txtVacante.setText("");
        padre.cmdGrado1.removeItem("3 AÑOS");
        padre.cmdGrado1.removeItem("4 AÑOS");
        padre.cmdGrado1.removeItem("5 AÑOS");
    }
    
    public void LlenarPrimaria(){
        LimpiarPrimaria();
        LimpiarSecundaria();
        LimpiarInicial();
        padre.cmdGrado1.addItem("PRIMERO");
        padre.cmdGrado1.addItem("SEGUNDO");
        padre.cmdGrado1.addItem("TERCERO");
        padre.cmdGrado1.addItem("CUARTO");
        padre.cmdGrado1.addItem("QUINTO");
        padre.cmdGrado1.addItem("SEXTO");
    }
    
    public void LimpiarPrimaria(){
        padre.txtVacante.setText("");
        padre.cmdGrado1.removeItem("PRIMERO");
        padre.cmdGrado1.removeItem("SEGUNDO");
        padre.cmdGrado1.removeItem("TERCERO");
        padre.cmdGrado1.removeItem("CUARTO");
        padre.cmdGrado1.removeItem("QUINTO");
        padre.cmdGrado1.removeItem("SEXTO");
    }
    
    public void LlenarSeundaria(){
        LimpiarPrimaria();
        LimpiarSecundaria();
        LimpiarInicial();
        padre.cmdGrado1.addItem("PRIMERO");
        padre.cmdGrado1.addItem("SEGUNDO");
        padre.cmdGrado1.addItem("TERCERO");
        padre.cmdGrado1.addItem("CUARTO");
        padre.cmdGrado1.addItem("QUINTO");
    }
    
    public void LimpiarSecundaria(){
        padre.txtVacante.setText("");
        padre.cmdGrado1.removeItem("PRIMERO");
        padre.cmdGrado1.removeItem("SEGUNDO");
        padre.cmdGrado1.removeItem("TERCERO");
        padre.cmdGrado1.removeItem("CUARTO");
        padre.cmdGrado1.removeItem("QUINTO");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == padre.btnSalir){
            padre.dispose();
        }
        
        if(ae.getSource() == padre.cmdNivel){
            String nivel = padre.cmdNivel.getSelectedItem().toString();
            switch(nivel){
                case "INICIAL":
                        LlenarInicial();
                    break;
                case "PRIMARIA":
                        LlenarPrimaria();
                        
                    break;
                case "SECUNDARIA":
                        LlenarSeundaria();
                    break;
                default: 
                    LimpiarInicial();
                    LimpiarPrimaria();
                    LimpiarSecundaria();          
            }
        }
        
        if(ae.getSource() == padre.cmdGrado1){
            String nivel = padre.cmdNivel.getSelectedItem().toString();
            String grado = padre.cmdGrado1.getSelectedItem().toString();
            switch(grado){
                case "3 AÑOS":
                        if(nivel.equals("INICIAL")){
                            LlenarSeccionU();
                        }
                    break;
                case "4 AÑOS":
                        if(nivel.equals("INICIAL")){
                            LlenarSeccionAB();
                        }                       
                    break;
                case "5 AÑOS":
                        if(nivel.equals("INICIAL")){
                            LlenarSeccionAB();
                        }                       
                    break;
                case "PRIMERO":
                        if(nivel.equals("PRIMARIA")){
                            LlenarSeccionAB();
                        }
                        if(nivel.equals("SECUNDARIA")){
                            LlenarSeccionAB();
                        }
                    break;
                case "SEGUNDO":
                        if(nivel.equals("PRIMARIA")){
                            LlenarSeccionAB();
                        }else if(nivel.equals("SECUNDARIA")){
                            LlenarSeccionU();
                        }
                    break;
                case "TERCERO":
                        if(nivel.equals("PRIMARIA")){
                            LlenarSeccionAB();
                        }else if(nivel.equals("SECUNDARIA")){
                            LlenarSeccionU();
                        }
                    break;
                case "CUARTO":
                        if(nivel.equals("PRIMARIA")){
                            LlenarSeccionAB();
                        }else if(nivel.equals("SECUNDARIA")){
                            LlenarSeccionU();
                        }
                    break;
                case "QUINTO":
                        if(nivel.equals("PRIMARIA")){
                            LlenarSeccionAB();
                        }else if(nivel.equals("SECUNDARIA")){
                            LlenarSeccionU();
                        }
                    break;
                case "SEXTO":
                        if(nivel.equals("PRIMARIA")){
                            LlenarSeccionAB();
                        }
                    break;
                default: 
                    LimpiarSeccionAB();
                    LimpiarSeccionU();
            }
        }
        
        
        if(ae.getSource() == padre.cmdSeccion){
            
            String nivel = padre.cmdNivel.getSelectedItem().toString();
            String grado = padre.cmdGrado1.getSelectedItem().toString();
            String seccion = padre.cmdSeccion.getSelectedItem().toString();
                        
            int niveles = 0;
            if(nivel.equals("INICIAL")){
                niveles = 1;
            }else if(nivel.equals("PRIMARIA")){
                niveles = 2;
            }else if(nivel.equals("SECUNDARIA")){
                niveles = 3;
            }
                        
            int secciones = 0;
            if(seccion.equals("U")){
                secciones = 1;
            }else if(seccion.equals("A")){
                secciones = 2;
            }else if(seccion.equals("B")){
                secciones = 3;
            }
                        
            int numRegistros = valD.ValidarVacante(niveles,grado,secciones).size();                        
            if(numRegistros>0){
                for(int i = 0; i<numRegistros; i++){
                    int Cantidad = valD.ValidarVacante(niveles, grado, secciones).get(i).getCantidad();
                    int Matriculados = valD.ValidarVacante(niveles, grado, secciones).get(i).getMatriculados();
                    int Vacantes = Cantidad - Matriculados;
                    padre.txtVacante.setText(String.valueOf(Vacantes));
                    if(Vacantes > 0){
                        JOptionPane.showMessageDialog(padre, "SI EXISTEN VACANTES");
                        DesbloquearPadre();
                    }else{
                        JOptionPane.showMessageDialog(padre, "NO EXISTEN VACANTES");
                    }
                } 
            }
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
                } else{
                    padre.txtDni.setText(padre.txtBuscar.getText());
                }                
            }else{
                JOptionPane.showMessageDialog(padre, "POR FAVOR INGRESE EL DNI A BUSCAR");
            }
        }
        
        if(ae.getSource() == padre.btnRegistrar){
            String nombres = padre.txtNombre.getText();
            String apellidoP = padre.txtApellidopaterno.getText();
            String apellidoM = padre.txtApellidomaterno.getText();
            int Dni = Integer.parseInt(padre.txtDni.getText());
            int Telefono = Integer.parseInt(padre.txtTelefono.getText());
            int TelefonoR = Integer.parseInt(padre.txtTelefonoA.getText());
            String correo = padre.txtCorreoE.getText();
            String direccion = padre.txtDireccion.getText();
            
            int Apoderado;
            int Pago;
            
            if(padre.txtApoderado.isSelected()){
                Apoderado = 1;
            }else{
                Apoderado = 0;
            }
            
            if(padre.txtPago.isSelected()){
                Pago = 1;
            }else{
                Pago = 0;
            }
            
            String Parentezco = "PADRE";
            
            String rptaRegistro = padreD.Registrar(nombres, apellidoP, apellidoM, Dni, Telefono, TelefonoR, correo, direccion, Apoderado, Pago);
            
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
        
        if(ae.getSource() == padre.btnCancelar){
            limpiarTextos();
        }
        
        if(ae.getSource() == padre.btnSiguiente){
            FrmRegistroMadre madre = new FrmRegistroMadre();
            MadreDao madreD = new MadreDao();
            ControladorMadre conM = new ControladorMadre(madre, madreD,apoD);
            padre.dispose();
            madre.setVisible(true); 
        }
        
    }
}
