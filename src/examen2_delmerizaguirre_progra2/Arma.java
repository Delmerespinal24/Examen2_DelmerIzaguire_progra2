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
public class Arma {
    String nombre;
    int PoderFuego;

    public Arma(String nombre, int PoderFuego) {
        this.nombre = nombre;
        this.PoderFuego = PoderFuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoderFuego() {
        return PoderFuego;
    }

    public void setPoderFuego(int PoderFuego) {
        this.PoderFuego = PoderFuego;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
