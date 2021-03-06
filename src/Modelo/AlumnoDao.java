/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
    
    public String Registrar(String nombres, String apellidoP, String apellidoM, int dni,
            String sexo, String fechaNacimiento, int edad, String antecedentes, 
            String tratamiento, String viveCon, int numeroEmergencia, String contacto, String Parentezco, int padre, int madre, int apoderado){
        
        String rptaRegistro=null;

        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call RegistrarAlumno(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, nombres);
            cs.setString(2, apellidoP);
            cs.setString(3, apellidoM);
            cs.setInt(4, dni);
            cs.setString(5, sexo);
            cs.setString(6, fechaNacimiento);
            cs.setInt(7, edad);
            cs.setString(8, antecedentes);
            cs.setString(9, tratamiento);
            cs.setString(10, viveCon);
            cs.setInt(11, numeroEmergencia);
            cs.setString(12, contacto);
            cs.setString(13, Parentezco);
            cs.setInt(14, padre);
            cs.setInt(15, madre);
            cs.setInt(16, apoderado);

            int numFAfectadas = cs.executeUpdate();

            if(numFAfectadas>0){
                rptaRegistro= "ALUMNO REGISTRADO CON EXITO";
            }
        } catch (Exception e) {
        }
        return rptaRegistro;
    }
}
