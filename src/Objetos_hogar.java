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
public class Objetos_hogar extends Objetos{
    public int tiempo_vida;
    public String area_casa;
    public String instrucciones_armado;
    public String fecha_compra;

    public Objetos_hogar(int tiempo_vida, String area_casa, String instrucciones_armado, String fecha_compra) {
        this.tiempo_vida = tiempo_vida;
        this.area_casa = area_casa;
        this.instrucciones_armado = instrucciones_armado;
        this.fecha_compra = fecha_compra;
    }

    public Objetos_hogar(int tiempo_vida, String area_casa, String instrucciones_armado, String fecha_compra, String color, String descripcion, String marca, int tamano, int calidad, double precio, Personas dueño) {
        super(color, descripcion, marca, tamano, calidad, precio, dueño);
        this.tiempo_vida = tiempo_vida;
        this.area_casa = area_casa;
        this.instrucciones_armado = instrucciones_armado;
        this.fecha_compra = fecha_compra;
    }

    public int getTiempo_vida() {
        return tiempo_vida;
    }

    public void setTiempo_vida(int tiempo_vida) {
        this.tiempo_vida = tiempo_vida;
    }

    

    public String getArea_casa() {
        return area_casa;
    }

    public void setArea_casa(String area_casa) {
        this.area_casa = area_casa;
    }

    public String getInstrucciones_armado() {
        return instrucciones_armado;
    }

    public void setInstrucciones_armado(String instrucciones_armado) {
        this.instrucciones_armado = instrucciones_armado;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Override
    public String toString() {
        return "Objetos_hogar{" + "tiempo_vida=" + tiempo_vida + ", area_casa=" + area_casa + ", instrucciones_armado=" + instrucciones_armado + ", fecha_compra=" + fecha_compra + '}';
    }

    
}
