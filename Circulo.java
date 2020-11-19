/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoo4;

/**
 * Esta clase calcula el area y el perimetro de un circulo a partir de un radio
 * @author alang, jacqueline
 */
public class Circulo {
    
    static double PI = Math.PI;
    private float radio;
    
    public Circulo(){
    }
    /**
     * 
     * @param radio Radio de tipo float
     */
    public Circulo(float radio) {
        this.radio = radio;
    }
    /**
     * 
     * @return radio Método setRadio
     */
    public float getRadio() {
        return radio;
    }
    /**
     * 
     * @param radio Método set radio
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    /**
     * 
     * @return Cadena Método toString
     */
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    /**
     * 
     * @return perimetro Método que calcula el perimetro de un circulo
     */
    public float perimetro(){
        return (float) (2*PI*radio);
    }
    /**
     * 
     * @return Area Método que calcula el area de un circulo
     */
    public float area(){
        return (float)PI*radio*radio;
    }
}
