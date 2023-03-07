package Ejercicio_36;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // a)
        
        System.out.println("La raiz cuadrada de 150 es "+Math.sqrt(150));
        
        // b)
        
        double potencia = Math.pow(2, 9);
        double div = potencia/Math.log(6);
        
        System.out.println("El resultado de la operacion es "+div);
        
        // c)
        
        System.out.println("El resultado del coseno de 0.16 radianes es "+Math.cos(0.16));
        
        // d)
        
        double conv = Math.toRadians(45);
        System.out.println("El seno de "+conv+" radianes es "+Math.sin(conv));
    }

}
