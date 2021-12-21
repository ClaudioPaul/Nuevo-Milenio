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
public class Alumnos {
    private int idAlumno;
    private int dni;
    private String nombres;
    private String apellidoP;
    private String apellidoM;
    private String sexo;
    private String fechaNacimiento;
    private String antecedentes;
    private String tratamiento;
    private String viveCon;
    private int numeroEmergencia;
    private String contacto;
    private String parentezco;
    private int Padre;
    private int Madre;
    private int Apoderado;

    public Alumnos() {
    }

    public Alumnos(int idAlumno, int dni, String nombres, String apellidoP, String apellidoM, String sexo, String fechaNacimiento, String antecedentes, String tratamiento, String viveCon, int numeroEmergencia, String contacto, String parentezco, int Padre, int Madre, int Apoderado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.antecedentes = antecedentes;
        this.tratamiento = tratamiento;
        this.viveCon = viveCon;
        this.numeroEmergencia = numeroEmergencia;
        this.contacto = contacto;
        this.parentezco = parentezco;
        this.Padre = Padre;
        this.Madre = Madre;
        this.Apoderado = Apoderado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getViveCon() {
        return viveCon;
    }

    public void setViveCon(String viveCon) {
        this.viveCon = viveCon;
    }

    public int getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(int numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    public int getPadre() {
        return Padre;
    }

    public void setPadre(int Padre) {
        this.Padre = Padre;
    }

    public int getMadre() {
        return Madre;
    }

    public void setMadre(int Madre) {
        this.Madre = Madre;
    }

    public int getApoderado() {
        return Apoderado;
    }

    public void setApoderado(int Apoderado) {
        this.Apoderado = Apoderado;
    }

    
    
}
