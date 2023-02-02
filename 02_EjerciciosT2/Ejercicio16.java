package ejercicio16;
import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escribe una frase: ");
        String frase1 = new Scanner(System.in).nextLine();
        System.out.println("Escribe otra frase: ");
        String frase2 = new Scanner(System.in).nextLine();
        boolean t12= frase1.contains(frase2);
        System.out.println("¿Hay texto de la frase 2 en la frase 1?: "+t12);
        
    }
    
}
