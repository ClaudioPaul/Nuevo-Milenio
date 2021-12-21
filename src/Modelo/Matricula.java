/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class Matricula {
    private int codigo;
    private int idAlumno;
    private String ColegioP;
    private String TipoColegio;
    private String GradoCulminado;
    private String GradoCursar;
    private int CarpetaRecuperacion;
    private String EspecificacionCR;
    private int DocumentosPendientes;
    private int pago;

    public Matricula() {
    }

    public Matricula(int codigo, int idAlumno, String ColegioP, String TipoColegio, String GradoCulminado, String GradoCursar, int CarpetaRecuperacion, String EspecificacionCR, int DocumentosPendientes, int pago) {
        this.codigo = codigo;
        this.idAlumno = idAlumno;
        this.ColegioP = ColegioP;
        this.TipoColegio = TipoColegio;
        this.GradoCulminado = GradoCulminado;
        this.GradoCursar = GradoCursar;
        this.CarpetaRecuperacion = CarpetaRecuperacion;
        this.EspecificacionCR = EspecificacionCR;
        this.DocumentosPendientes = DocumentosPendientes;
        this.pago = pago;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getColegioP() {
        return ColegioP;
    }

    public void setColegioP(String ColegioP) {
        this.ColegioP = ColegioP;
    }

    public String getTipoColegio() {
        return TipoColegio;
    }

    public void setTipoColegio(String TipoColegio) {
        this.TipoColegio = TipoColegio;
    }

    public String getGradoCulminado() {
        return GradoCulminado;
    }

    public void setGradoCulminado(String GradoCulminado) {
        this.GradoCulminado = GradoCulminado;
    }

    public String getGradoCursar() {
        return GradoCursar;
    }

    public void setGradoCursar(String GradoCursar) {
        this.GradoCursar = GradoCursar;
    }

    public int getCarpetaRecuperacion() {
        return CarpetaRecuperacion;
    }

    public void setCarpetaRecuperacion(int CarpetaRecuperacion) {
        this.CarpetaRecuperacion = CarpetaRecuperacion;
    }

    public String getEspecificacionCR() {
        return EspecificacionCR;
    }

    public void setEspecificacionCR(String EspecificacionCR) {
        this.EspecificacionCR = EspecificacionCR;
    }

    public int getDocumentosPendientes() {
        return DocumentosPendientes;
    }

    public void setDocumentosPendientes(int DocumentosPendientes) {
        this.DocumentosPendientes = DocumentosPendientes;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
    
    
}
