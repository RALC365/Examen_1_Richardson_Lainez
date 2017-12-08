/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_richardson_lainez;

import java.awt.Color;

/**
 *
 * @author RALC
 */
public class Zapatos extends Objetos{
    public String talla;
    public String tipo_suela;
    public int confort; //1-10

    public Zapatos(String talla, String tipo_suela, int confort) {
        this.talla = talla;
        this.tipo_suela = tipo_suela;
        this.confort = confort;
    }

    public Zapatos(String talla, String tipo_suela, int confort, String color, String descripcion, String marca, int tamano, int calidad, double precio, Personas dueño) {
        super(color, descripcion, marca, tamano, calidad, precio, dueño);
        this.talla = talla;
        this.tipo_suela = tipo_suela;
        this.confort = confort;
    }

    

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo_suela() {
        return tipo_suela;
    }

    public void setTipo_suela(String tipo_suela) {
        this.tipo_suela = tipo_suela;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", tipo_suela=" + tipo_suela + ", confort=" + confort + '}';
    }

        
}
