package ejercicio4_tema2;
import bpc.daw.mario.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio4_Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Luigi l1 = new Luigi(500,500);
       double distancia1 = l1.getDistanciaOrigen();
       
       Mario m1 = new Mario(550,500);
       double distancia2 = m1.getDistanciaOrigen();
       
        System.out.println("La distancia de Luigi con repecto a la esquina izquierda superior es: "+distancia1);
        System.out.println("La distancia de Luigi con repecto a la esquina izquierda superior es: "+distancia2);
    }
    
}
