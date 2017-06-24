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
public class Ruso implements Serializable{
    
    private String Nombre;
    private String ID;
    private int Edad;
    private int resistencia;
    private String rango;
    private Arma arma;

    public Ruso() {
        super();
    }
    
    
    public Ruso(String Nombre, String ID, int Edad, int resistencia, String rango, Arma arma) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Edad = Edad;
        this.resistencia = resistencia;
        this.rango = rango;
        this.arma = arma;
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
        setResistencia(Edad*8);
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return Nombre;
    }

    
}
