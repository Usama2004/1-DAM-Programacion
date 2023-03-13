package ejercicio4_persona;
import daw.persona.*;
import java.time.LocalDate;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio4_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate fecha = new LocalDate(2023,2,6);
        dni id = new dni("88899922Z");
        
        Persona p1 = new Persona("Oussama", id,3333.5, 4000, fecha);
       
    }

}
