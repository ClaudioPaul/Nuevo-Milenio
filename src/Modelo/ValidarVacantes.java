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
public class ValidarVacantes {
    private int codigo;
    private int Cantidad;
    private int Matriculados;

    public ValidarVacantes() {
    }

    public ValidarVacantes(int codigo, int Cantidad, int Matriculados) {
        this.codigo = codigo;
        this.Cantidad = Cantidad;
        this.Matriculados = Matriculados;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getMatriculados() {
        return Matriculados;
    }

    public void setMatriculados(int Matriculados) {
        this.Matriculados = Matriculados;
    }

    
    
    
}
