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
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class MatriculaDao {
    Conexion conexion = new Conexion();

    public MatriculaDao() {
        conexion = new Conexion();
    }
    
    public String Registrar(int idAlumno, String ColegioP, String tipoP, String direccion, String CodigoM, String GradoCul, 
            String GradoCur, int CarpetaRe, String EspecificacionCR, int Dprendientes, int pago){
        
        String rptaRegistro=null;

        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call RegistrarMatricula(?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, idAlumno);
            cs.setString(2, ColegioP);
            cs.setString(3, tipoP);
            cs.setString(4, direccion);
            cs.setString(5, CodigoM);
            cs.setString(6, GradoCul);
            cs.setString(7, GradoCur);
            cs.setInt(8, CarpetaRe);
            cs.setString(9, EspecificacionCR);
            cs.setInt(10, Dprendientes);
            cs.setInt(11, pago);

            int numFAfectadas = cs.executeUpdate();

            if(numFAfectadas>0){
                rptaRegistro= "MATRICULA REGISTRADA CON EXITO";
            }
        } catch (Exception e) {
        }
        return rptaRegistro;
    }
    
    public ArrayList<Alumnos> BuscarAlumno(int dni){
        ArrayList<Alumnos> listaAlumno =new ArrayList();
        Alumnos alumno;
        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call BuscarAlumno (?)}");
            cs.setInt(1, dni);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                alumno = new Alumnos();
                alumno.setIdAlumno(rs.getInt(1));
                listaAlumno.add(alumno);
                int numFAfectadas = cs.executeUpdate();
            }
        } catch (Exception e) {
            
        }
        return listaAlumno;
    }
    
    public void GenrerarReporte(int dni) throws ClassNotFoundException{
        try {
            Connection conn= conexion.getConexion();

        JasperReport reporte = null;
        String path = "src\\reportes\\Reporte.jasper";
        
        Map parametro  = new HashMap();
        parametro.put("AlumnoDni",dni);

        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
}
