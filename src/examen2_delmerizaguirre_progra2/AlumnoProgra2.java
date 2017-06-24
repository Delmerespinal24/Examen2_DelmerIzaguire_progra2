/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_delmerizaguirre_progra2;

import java.io.Serializable;

/**
 *
 * @author Owner
 */
public class AlumnoProgra2 implements Serializable{
    
    private String Apodo;
    private String GradoAcademico;
    private int Edad;
    private int NumeroCuenta;
    private int resistencia;
    private Arma arma;

    public AlumnoProgra2() {
        super();
    }

    
    
    public AlumnoProgra2(String Apodo, String GradoAcademico, int Edad, int NumeroCuenta, int resistencia, Arma arma) {
        this.Apodo = Apodo;
        this.GradoAcademico = GradoAcademico;
        this.Edad = Edad;
        this.NumeroCuenta = NumeroCuenta;
        this.resistencia = resistencia;
        this.arma = arma;
    }

    
    
    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getGradoAcademico() {
        return GradoAcademico;
    }

    public void setGradoAcademico(String GradoAcademico) {
        this.GradoAcademico = GradoAcademico;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
        setResistencia(Edad*8);
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return Apodo;
    }
    
    
    
}
