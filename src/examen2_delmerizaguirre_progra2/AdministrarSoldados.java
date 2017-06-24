/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_delmerizaguirre_progra2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class AdministrarSoldados implements Serializable{
    
    private ArrayList listaSoldados = new ArrayList();
    private File archivo = null;

    public AdministrarSoldados(String path) {
        archivo = new File(path);
    }

    public ArrayList getListaSoldados() {
        return listaSoldados;
    }

    public void setListaSoldados(ArrayList listaSoldados) {
        this.listaSoldados = listaSoldados;
    }
    
    
    public void CargarArchivo(){
        try {
            listaSoldados = new ArrayList();
        Object temp;
        
        if(archivo.exists()){
            FileInputStream entrada
                    = new FileInputStream(archivo);
            ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
            try {
                while((temp = objeto.readObject()) != null){ 
                    listaSoldados.add(temp);
                }
            } catch (EOFException e) {
                //Encontro el final del archivo
            }
            objeto.close();
            entrada.close();
            
        }
        } catch (Exception e) {
        }
        
        
        
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object t : listaSoldados) {
                bw.writeObject(t);
              
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
        
    }
    
    
    
}
