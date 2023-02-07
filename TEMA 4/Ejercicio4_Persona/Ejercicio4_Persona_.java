package ejercicio4_persona_;
import daw.persona.Persona;
import daw.persona.dni;
import java.time.LocalDate;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio4_Persona_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        dni id = new dni("33344422Z");
        LocalDate date = LocalDate.of(2023, 2, 6);
        
        Persona p1 = new Persona("Oussama", id, 3300.4, date);
        Persona p2 = new Persona("Oussama",
                id.getNum(), id.getLetter(), 2000.4, date);
        Persona p3 = new Persona("Oussama", id);
        Persona p4 = new Persona("Oussama", id.getNum(),
                id.getLetter());
        
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("DNI: "+p1.getDni());
        System.out.println("Sueldo: "+p1.getSueldo());
        System.out.println("Fexha de Nacimiento: "+ p1.getFechaNac());
        
        p1.setSueldo(2333.5);
        System.out.println("Variación del sueldo: "+p1.getSueldo());
        
    }

}