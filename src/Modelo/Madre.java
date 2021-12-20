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
public class Madre {
    private int idMadre;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private int Dni;
    private int Telefono;
    private int TelefonoReferencia;
    private String Correo;
    private String dirección;
    private int ValidarA;
    private int ValidarP;

    public Madre() {
    }

    public Madre(int idMadre, String Nombre, String ApellidoP, String ApellidoM, int Dni, int Telefono, int TelefonoReferencia, String Correo, String dirección, int ValidarA, int ValidarP) {
        this.idMadre = idMadre;
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Dni = Dni;
        this.Telefono = Telefono;
        this.TelefonoReferencia = TelefonoReferencia;
        this.Correo = Correo;
        this.dirección = dirección;
        this.ValidarA = ValidarA;
        this.ValidarP = ValidarP;
    }

    public int getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(int idMadre) {
        this.idMadre = idMadre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getTelefonoReferencia() {
        return TelefonoReferencia;
    }

    public void setTelefonoReferencia(int TelefonoReferencia) {
        this.TelefonoReferencia = TelefonoReferencia;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getValidarA() {
        return ValidarA;
    }

    public void setValidarA(int ValidarA) {
        this.ValidarA = ValidarA;
    }

    public int getValidarP() {
        return ValidarP;
    }

    public void setValidarP(int ValidarP) {
        this.ValidarP = ValidarP;
    }
    
    
}
