package ejercicio1_dni;
import daw.persona.dni;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio1_DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        dni a = new dni(22222222,'Z');
        
        System.out.println(a.toString());
        System.out.println("Letra: "+a.getLetter());
        System.out.println(a.toString());
        
        
        dni b = new dni("33333333Z");
        System.out.println("Numero: "+b.getNum());
        System.out.println("Letra: "+b.getLetter());
        System.out.println(b.toString());
        
       
    }

}
