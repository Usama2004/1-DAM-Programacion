package ejercicio18;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce tu dirrecion de correo: ");
        String correo = new Scanner(System.in).nextLine();
        
        int aroba = correo.indexOf("@");
        
        if (aroba != -1){
        
            String n_usuario = correo.substring(0, aroba);
            String dominio = correo.substring(aroba+1);
            System.out.println("Tu nombre de usuario: "+n_usuario);
            System.out.println("Tu dominio es: "+dominio);
        
        }else{
        
            System.out.println("No hemos conseguido reconocer el dominio");
            
        }
        
    }
    
}
