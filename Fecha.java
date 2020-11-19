/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoo4;

/**
 *
 * @author alang, jacqueline
 */
class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha() {
    }
    /**
     * 
     * @param dia Dia de tipo entero
     * @param mes Mes de tipo entero
     * @param anio Anio de tipo entero
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * 
     * @return Dia Método getDia
     */
    public int getDia() {
        return dia;
    }
    /**
     * 
     * @param dia Método setDia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * 
     * @return Mes Método getMes
     */
    public int getMes() {
        return mes;
    }
    /**
     * 
     * @param mes Método setMes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * 
     * @return Anio Método getAnio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * 
     * @param anio Método setAnio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * 
     * @return String Método toString
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
}
