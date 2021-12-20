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
public class ValidarVacantesDao {
    
    Conexion conexion = new Conexion();
    
    public ValidarVacantesDao(){
        conexion = new Conexion();
    }
    
    
    public ArrayList<ValidarVacantes> ValidarVacante(int Nivel, String Grado, int Seccion){
        ArrayList<ValidarVacantes> vacantes =new ArrayList();
        ValidarVacantes vacante;
        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call VerificarVacantes (?,?,?)}");
            cs.setInt(1, Nivel);
            cs.setString(2, Grado);
            cs.setInt(3, Seccion);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                vacante = new ValidarVacantes();
                vacante.setCantidad(rs.getInt(3));
                vacante.setMatriculados(rs.getInt(6));
                vacantes.add(vacante);
                int numFAfectadas = cs.executeUpdate();
            }
        } catch (Exception e) {
            
        }
        return vacantes;
    }
}
