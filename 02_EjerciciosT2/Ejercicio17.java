package ejercicio17;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu dominio: ");
        String dominio = new Scanner(System.in).nextLine();
        
        if (dominio.endsWith(".com") || dominio.endsWith(".es")){
            
            System.out.println("Tu correo es: "+nombre+"@"+dominio);
            
        }else{
            System.out.println("El dominio es incorrecto");
        }
        
    }
    
}
