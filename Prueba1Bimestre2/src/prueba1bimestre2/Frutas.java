/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1bimestre2;

public class Frutas {
     private String nombreFruta;
    private String codigo;
    private String precio;

    public Frutas(String nombreFruta, String codigo, String precio) {
        this.nombreFruta = nombreFruta;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombreFruta() {
        return nombreFruta;
    }

    public void setNombreFruta(String nombreFruta) {
        this.nombreFruta = nombreFruta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombreFruta + "" + codigo + "" + precio +"";
    }
    
    

}
