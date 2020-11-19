/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoo4;

/**
 * Esta clase calcula el perimetro 
 * y area de un triangulo a partir 
 * de dos catetos, dos angulos y una hipotenusa
 * @author alang, jacqueline
 */
public class Triangulo {
    
    private float cateto1;
    private float cateto2;
    private float angulo1;
    private float angulo2;
    private float hipotenusa;

    public Triangulo() {
    }

    /** 
     * 
     * @param cateto1 Cateto A de tipo real.
     * @param cateto2 CAteto B de tipo real.
     */
    public Triangulo(float cateto1, float cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        hipotenusa();
        angulos();
    }
    /**
     * 
     * @return  Cateto1 Método get cateto 1
     */
    public float getCateto1() {
        return cateto1;
    }
    /**
     * 
     * @param cateto1 Método set cateto1
     */
    public void setCateto1(float cateto1) {
        this.cateto1 = cateto1;
    }
    /**
     * 
     * @return Cateto2 Método get cateto2
     */
    public float getCateto2() {
        return cateto2;
    }
    /**
     * 
     * @param cateto2 Método setCateto2
     */
    public void setCateto2(float cateto2) {
        this.cateto2 = cateto2;
    }
    /**
     * 
     * @return Angulo 1 Método get angulo1
     */
    public float getAngulo1() {
        return angulo1;
    }
    /**
     * 
     * @param angulo1 Método set angulo1
     */
    public void setAngulo1(float angulo1) {
        this.angulo1 = angulo1;
    }
    /**
     * 
     * @return Angulo 2 Método get angulo 2
     */
    public float getAngulo2() {
        return angulo2;
    }
    /**
     * 
     * @param angulo2 Método set angulo 2
     */
    public void setAngulo2(float angulo2) {
        this.angulo2 = angulo2;
    }
    /**
     * 
     * @return Hipotenusa Método get hipotenusa
     */
    public float getHipotenusa() {
        return hipotenusa;
    }
    /**
     * 
     * @param hipotenusa Método set hipotenusa
     */
    public void setHipotenusa(float hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    /**
     * 
     * @return String Método toString
     */
    @Override
    public String toString() {
        return "triangulo{" + "cateto1=" + cateto1 + ", cateto2=" + cateto2 + ", angulo1=" + angulo1 + ", angulo2=" + angulo2 + ", hipotenusa=" + hipotenusa + '}';
    }
    
    private void hipotenusa(){
        this.hipotenusa=(float) Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
    }

    private void angulos(){
         this.angulo1= (float)Math.toDegrees(Math.atan(cateto2/cateto1));
         
         this.angulo2= 180-90-angulo1;
    }
    /**
     * 
     * @return area, Método que calcula el area
     */
    public float area(){
        return cateto1*cateto2/2;
    }
    /**
     * 
     * @return perimetro, Método que calcula el perimetro
     */
    public float perimetro(){
        return cateto1+cateto2+hipotenusa;
    }
    
    
}
