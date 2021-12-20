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
public class PadreDao {
    Conexion conexion = new Conexion();
    
    public PadreDao(){
        conexion = new Conexion();
    }
    
    public ArrayList<Padre> BuscarPadres(int dni){
        ArrayList<Padre> listaPadres =new ArrayList();
        Padre padre;
        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call BuscarPadre (?)}");
            cs.setInt(1, dni);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                padre = new Padre();
                padre.setIdPadre(rs.getInt(1));
                padre.setNombre(rs.getString(2));
                padre.setApellidoP(rs.getString(3));
                padre.setApellidoM(rs.getString(4));
                padre.setDni(rs.getInt(5));
                padre.setTelefono(rs.getInt(6));
                padre.setTelefonoReferencia(rs.getInt(7));
                padre.setCorreo(rs.getString(8));
                padre.setDirección(rs.getString(9));
                padre.setValidarA(rs.getInt(10));
                padre.setValidarP(rs.getInt(11));
                listaPadres.add(padre);
                int numFAfectadas = cs.executeUpdate();
            }
        } catch (Exception e) {
            
        }
        return listaPadres;
    }
    
    public String Registrar(String nombre, String apellidoP, String apellidoM, int dni, int telefono, 
            int telefonoR, String correo, String Direccion, int apoderado, int pago){
        
        String rptaRegistro=null;

        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call RegistrarPadre(?,?,?,?,?,?,?,?,?,?)}");
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
                rptaRegistro= "PADRE REGISTRADO CON EXITO";
            }
        } catch (Exception e) {
        }
        return rptaRegistro;
    }
}
