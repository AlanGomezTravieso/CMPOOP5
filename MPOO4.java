/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpoo4;

/**
 * Esta es la clase principal
 * @author alang, jacqueline
 */
public class MPOO4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir1 = new Circulo();
        cir1.setRadio(3.4f);
        System.out.println("radio circ1 ="+cir1.getRadio());
        
        Circulo cir2 = new Circulo(6.0f);
        System.out.println("radio circ2 ="+cir2.getRadio());
        cir2.setRadio(9.0f);
        System.out.println("radio circ2 ="+cir2.getRadio());
        cir2.setRadio(77.0f);
        System.out.println("radio circ2 ="+cir2.getRadio());
        
        System.out.println("perimetro cir1 = "+cir1.perimetro());
        
        System.out.println("Info. de circulo 1"+cir1.toString());
        
        System.out.println("1***********************");
        
        Persona amigo = new Persona();
        System.out.println("Info. amigo"+ amigo.toString());
        amigo.setNombre("Juan");
        amigo.setApellido("Ramirez");
        amigo.setfNacimiento(new Fecha(29,1,2000));
        
        System.out.println("Info amigo "+amigo.toString());
        System.out.println("Info amigo"+amigo);
        
        System.out.println("2***********************");
        
        Persona persona = new Persona("Jose","Rodriguez",4,8,1990);
        System.out.println("info persona" + persona);
        
        System.out.println("3***********************");
        
        Triangulo triangulo=new Triangulo(12,8);
        System.out.println("info triangulo= "+triangulo);
        
    }
    
}
