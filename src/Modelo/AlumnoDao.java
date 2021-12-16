/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class AlumnoDao {
    Conexion conexion = new Conexion();
    
    public AlumnoDao(){
        conexion = new Conexion();
    }
    
    public String Registrar(int dni, String nombres, String apellidoP, String apellidoM, 
            String sexo, String fechaNacimiento, String antecedentes, 
            String tratamiento, int numeroEmergencia, String contacto){
        
        String rptaRegistro=null;

        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call RegistrarAlumno(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, dni);
            cs.setString(2, nombres);
            cs.setString(3, apellidoP);
            cs.setString(4, apellidoM);
            cs.setString(5, sexo);
            cs.setString(6, fechaNacimiento);
            cs.setString(7, antecedentes);
            cs.setString(8, tratamiento);
            cs.setInt(9, numeroEmergencia);
            cs.setString(10, contacto);

            int numFAfectadas = cs.executeUpdate();

            if(numFAfectadas>0){
                rptaRegistro= "ALUMNO REGISTRADO CON EXITO";
            }
        } catch (Exception e) {
        }
        return rptaRegistro;
    }
}
