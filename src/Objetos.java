/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;

/**
 *
 * @author RALC
 */
public class Objetos {
    private String color;
    private String descripcion;
    private String marca;
    private int tamano;
    private int calidad;
    private double precio;
    private Personas dueño;

    public Objetos() {
    }

    public Objetos(String color, String descripcion, String marca, int tamano, int calidad, double precio, Personas dueño) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamano = tamano;
        this.calidad = calidad;
        this.precio = precio;
        this.dueño = dueño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Personas getDueño() {
        return dueño;
    }

    public void setDueño(Personas dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Objetos{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", tamano=" + tamano + ", calidad=" + calidad + ", precio=" + precio + ", due\u00f1o=" + dueño + '}';
    }

    
    
    
    
    
}
