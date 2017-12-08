/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_richardson_lainez;

import java.util.ArrayList;

/**
 *
 * @author RALC
 */
public class Familiares extends Personas{
    private String rol;
    private String trabajo;
    private int altura;
    private int peso;
    private ArrayList <Objetos> objetos;

    public Familiares() {
    }

    public Familiares(String rol, String trabajo, int altura, int peso) {
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public Familiares(String rol, String trabajo, int altura, int peso, String nombre, int edad, String id, String sexo, String estado_civil) {
        super(nombre, edad, id, sexo, estado_civil);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public Familiares(String rol, String trabajo, int altura, int peso, String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<Objetos> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<Objetos> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return "Familiares{" + "rol=" + rol + ", trabajo=" + trabajo + ", altura=" + altura + ", peso=" + peso + ", objetos=" + objetos + '}';
    }
    
    
}
