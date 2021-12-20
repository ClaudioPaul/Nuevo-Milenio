/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class MadreDao {
    Conexion coneccion = new Conexion();
    
    public MadreDao(){
        coneccion= new Conexion();
    }
    
    public ArrayList<Madre> BuscarMadres(int dni){
        ArrayList<Madre> listaMadres =new ArrayList();
        Madre Madre;
        try {
            Connection accesoBD = coneccion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call BuscarMadre (?)}");
            cs.setInt(1, dni);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Madre = new Madre();
                Madre.setIdMadre(rs.getInt(1));
                Madre.setNombre(rs.getString(2));
                Madre.setApellidoP(rs.getString(3));
                Madre.setApellidoM(rs.getString(4));
                Madre.setDni(rs.getInt(5));
                Madre.setTelefono(rs.getInt(6));
                Madre.setTelefonoReferencia(rs.getInt(7));
                Madre.setCorreo(rs.getString(8));
                Madre.setDirección(rs.getString(9));
                Madre.setValidarA(rs.getInt(10));
                Madre.setValidarP(rs.getInt(11));
                listaMadres.add(Madre);
                int numFAfectadas = cs.executeUpdate();
            }
        } catch (Exception e) {
            
        }
        return listaMadres;
    }
    
    public String Registrar(String nombre, String apellidoP, String apellidoM, int dni, int telefono, 
            int telefonoR, String correo, String Direccion, int apoderado, int pago){
        
        String rptaRegistro=null;

        try {
            Connection accesoBD = coneccion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call RegistrarMadre(?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, nombre);
            cs.setString(2, apellidoP);
            cs.setString(3, apellidoM);
            cs.setInt(4, dni);
            cs.setInt(5, telefono);
            cs.setInt(6, telefonoR);
            cs.setString(7, correo);
            cs.setString(8, Direccion);
            cs.setInt(9, apoderado);
            cs.setInt(10, pago);

            int numFAfectadas = cs.executeUpdate();

            if(numFAfectadas>0){
                rptaRegistro= "MADRE REGISTRADO CON EXITO";
            }
        } catch (Exception e) {
        }
        return rptaRegistro;
    }
}
