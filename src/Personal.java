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
public class Personal extends Personas{
    public String ocupacion;
    public String horario_trabajo;
    public double tiempo_trabajando;//semanas
    public double suelto;

    public Personal() {
        super();
    }

    public Personal(String ocupacion, String horario_trabajo, double tiempo_trabajando, double suelto) {
        this.ocupacion = ocupacion;
        this.horario_trabajo = horario_trabajo;
        this.tiempo_trabajando = tiempo_trabajando;
        this.suelto = suelto;
    }

    public Personal(String ocupacion, String horario_trabajo, double tiempo_trabajando, double suelto, String nombre, int edad, String id, String sexo, String estado_civil) {
        super(nombre, edad, id, sexo, estado_civil);
        this.ocupacion = ocupacion;
        this.horario_trabajo = horario_trabajo;
        this.tiempo_trabajando = tiempo_trabajando;
        this.suelto = suelto;
    }

    public Personal(String ocupacion, String horario_trabajo, double tiempo_trabajando, double suelto, String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
        this.ocupacion = ocupacion;
        this.horario_trabajo = horario_trabajo;
        this.tiempo_trabajando = tiempo_trabajando;
        this.suelto = suelto;
    }

   

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario_trabajo() {
        return horario_trabajo;
    }

    public void setHorario_trabajo(String horario_trabajo) {
        this.horario_trabajo = horario_trabajo;
    }

    public double getTiempo_trabajando() {
        return tiempo_trabajando;
    }

    public void setTiempo_trabajando(double tiempo_trabajando) {
        this.tiempo_trabajando = tiempo_trabajando;
    }

    public double getSuelto() {
        return suelto;
    }

    public void setSuelto(double suelto) {
        this.suelto = suelto;
    }

    @Override
    public String toString() {
        return "Personal{" + "ocupacion=" + ocupacion + ", horario_trabajo=" + horario_trabajo + ", tiempo_trabajando=" + tiempo_trabajando + ", suelto=" + suelto + '}';
    }
    
    
    
    
    
}
