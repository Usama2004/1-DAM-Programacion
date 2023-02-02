package ejercicio14;
import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escribe una frase: ");
        String frase = new Scanner(System.in).nextLine();
        
       char Letra_del_medio = frase.charAt(frase.length()/2);
        System.out.println("La letra qe esta justo en el medio es la "+Letra_del_medio);
    }
    
}
