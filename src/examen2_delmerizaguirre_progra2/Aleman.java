
package examen2_delmerizaguirre_progra2;

import java.io.Serializable;

/**
 *
 * @author Owner
 */
public class Aleman implements Serializable{
    private String alias;
    private String casta;
    private int Edad;
    private int resistencia;
    private Arma arma;

    public Aleman() {
        super();
    }

    public Aleman(String alias, String casta, int Edad, int resistencia, Arma arma) {
        this.alias = alias;
        this.casta = casta;
        this.Edad = Edad;
        this.resistencia = resistencia;
        this.arma = arma;
    }
    
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
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
        return alias;
    }
    
    
}
