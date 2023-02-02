package ejercicio13;
import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce tu nombre: ");
        String nombre1 = new Scanner(System.in).nextLine();
        
        String nombre2 = nombre1.toUpperCase();
        System.out.println("Nombre en mayuscula: "+nombre2);
        String nombre3 = nombre2.toLowerCase();
        System.out.println("El nombre en minuscula es: "+nombre3);
        
        int n_caracteres = nombre1.length();
        System.out.println("El número de caracteres es "+n_caracteres);
    }
    
}
