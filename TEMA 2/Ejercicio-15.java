package ejercicio15;
import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave = "oussama";
        System.out.println("Debe estar en minuscula");
        System.out.println("Introduce la contrasenia: ");
        String password = new Scanner(System.in).nextLine();
        
        boolean comparacion = password.equals(clave);
        
        System.out.println("¿Son igulaes las claves?: "+comparacion);
        
        
    }
    
}
