/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoo4;

/**
 * Esta clase imprime los perimetros de la persona: nombre, apellido, fNacimiento
 * @author alang, jacqueline
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona() {
    }
    /**
     * 
     * @param nombre Nombre de tipo String
     * @param apellido Apellido de tipo String
     * @param fNacimiento FNacimiento de tipo Fecha
     */
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @param nombre Nombre de tipo String
     * @param apellido Apellido de tipo String
     * @param dia Dia de tipo entero
     * @param mes Mes de tipo entero
     * @param anio Anio de tipo entero
     */
    public Persona(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = new Fecha(29,1,2000);
    }
    /**
     * 
     * @return Nombre método get nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre Método set cateto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Apellido método get apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * 
     * @param apellido Método set apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * 
     * @return FNacimiento método get fNacimiento
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * 
     * @param fNacimiento Método set fnacimiento
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @return String Método toString
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
}