/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_delmerizaguirre_progra2;

/**
 *
 * @author Owner
 */
public class Soldado {
    

    private String Name;
    private int Cuenta;
    private String ID;
    private int Edad;
    private int resistencia;
    private String Ejercito;
    private String nivel;
    private String tipo;
    private String[] Arma;

    public Soldado(String Apodo, int Cuenta, String ID, int Edad, int resistencia, String nivel, String tipo, String[] Arma, String Ejercito) {
        this.Name = Apodo;
        this.Cuenta = Cuenta;
        this.ID = ID;
        this.Edad = Edad;
        this.resistencia = resistencia;
        this.nivel = nivel;
        this.tipo = tipo;
        this.Arma = Arma;
        this.Ejercito = Ejercito;

    }


    public void setApodo(String Name) {
        this.Name = Name;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.Cuenta = NumeroCuenta;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setnivel(String GradoAcademico) {
        this.nivel = GradoAcademico;
    }

    public void setArma(String[] Arma) {
        this.Arma = Arma;
    }

    public String getName() {
        return Name;
    }

    public int getCuenta() {
        return Cuenta;
    }

    public int getEdad() {
        return Edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getnivel() {
        return nivel;
    }

    public Object[] getArma() {
        return Arma;
    }
    
    
    
}
