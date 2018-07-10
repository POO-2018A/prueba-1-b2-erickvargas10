/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1bimestre2;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private String cedula;
    private String frutaElegida;
    
    private ArrayList<Frutas> frutas;

    public Cliente(String nombre, String cedula, String frutaElegida, ArrayList<Frutas> frutas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.frutaElegida = frutaElegida;
        this.frutas = frutas;
    }

    Cliente(String nombre, String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Cliente(String nombre, String cedula, String fruta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Frutas> getFrutas() {
        return frutas;
    }

    public void setFrutas(ArrayList<Frutas> frutas) {
        this.frutas = frutas;
    }

    public String getFrutaElegida() {
        return frutaElegida;
    }

    public void setFrutaElegida(String frutaElegida) {
        this.frutaElegida = frutaElegida;
    }

    
     
    
      @Override
    public String toString() {
        return frutaElegida ;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.frutaElegida, other.frutaElegida)) {
            return false;
        }
        return true;
    }
    
    
}
