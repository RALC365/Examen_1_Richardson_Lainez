/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_richardson_lainez;

/**
 *
 * @author RALC
 */
public class Ropa extends Objetos{
    private String talla;
    private String material;
    private String pais_elaboracion;

    public Ropa() {
        super();
    }

    public Ropa(String talla, String material, String pais_elaboracion) {
        this.talla = talla;
        this.material = material;
        this.pais_elaboracion = pais_elaboracion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais_elaboracion() {
        return pais_elaboracion;
    }

    public void setPais_elaboracion(String pais_elaboracion) {
        this.pais_elaboracion = pais_elaboracion;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", material=" + material + ", pais_elaboracion=" + pais_elaboracion + '}';
    }
    
    
}
