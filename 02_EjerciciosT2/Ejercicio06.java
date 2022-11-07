package ejercicio6_tema2;
import java.util.*;
import bpc.daw.mario.Mario;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio6_Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escrbe la coordenada x: ");
        int coordenadaX = new Scanner(System.in).nextInt();
        System.out.println("Escrbe la coordenada y: ");
        int coordenadaY = new Scanner(System.in).nextInt();
        
        Mario m1 = new Mario(coordenadaX, coordenadaY);
    }
    
}
