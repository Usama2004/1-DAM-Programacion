package practica08;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Practica08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        
        System.out.println("Introduce tis apellidos: ");
        String apellidos = new Scanner(System.in).nextLine();
        
        char inicial = nombre.toUpperCase().charAt(0);
        
        
        System.out.println("RESULTADO FINAL: "+apellidos.concat(","+inicial));
        
        
    }
    
}
