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
public class ApoderadoDao {
    Conexion conexion = new Conexion();

    public ApoderadoDao() {
        conexion = new Conexion();
    }
    
    
    public String Registrar(String nombre, String apellidoP, String apellidoM, int dni, int telefono, 
            int telefonoR, String correo, String Direccion, String Parentezco, int pago){
        
        String rptaRegistro=null;

        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call RegistrarApoderado(?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, nombre);
            cs.setString(2, apellidoP);
            cs.setString(3, apellidoM);
            cs.setInt(4, dni);
            cs.setInt(5, telefono);
            cs.setInt(6, telefonoR);
            cs.setString(7, correo);
            cs.setString(8, Direccion);
            cs.setString(9, Parentezco);
            cs.setInt(10, pago);

            int numFAfectadas = cs.executeUpdate();

            if(numFAfectadas>0){
                rptaRegistro= "APODERADO REGISTRADO CON EXITO";
            }
        } catch (Exception e) {
        }
        return rptaRegistro;
    }
    
    public ArrayList<Apoderado> BuscarApoderado(int dni){
        ArrayList<Apoderado> listaApoderado =new ArrayList();
        Apoderado apoderado;
        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call BuscarApoderado (?)}");
            cs.setInt(1, dni);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                apoderado = new Apoderado();
                apoderado.setIdApoderado(rs.getInt(1));
                listaApoderado.add(apoderado);
                int numFAfectadas = cs.executeUpdate();
            }
        } catch (Exception e) {
            
        }
        return listaApoderado;
    }
    
}
