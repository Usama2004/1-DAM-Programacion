package practica09;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Practica09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escribe una palabra: ");
        String palabra1 = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe otra palabra");
        String palabra2 = new Scanner(System.in).nextLine();
        
        boolean validacion = palabra1.equals(palabra2);
        System.out.println("Son iguales: "+validacion);
        
        
    }
    
}
