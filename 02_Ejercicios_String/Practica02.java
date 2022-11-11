package practica02;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Practica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Hola me llamo Oussama y me gusta jugar al futbol  ";
        System.out.println("La frase con espacios tendria "+s1.length()+" caracteres");
        
        System.out.println("------------------------------------------");
        
        String s2 = s1.replaceAll("\\s+", "");
        System.out.println("La frase sin espacios tendria el siguiente aspecto: "+s2);
        
        System.out.println("La frase sin espacios tendria "+s2.length()+" caracteres");
    }
    
}
