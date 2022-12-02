package ejercicio35;
import bpc.daw.reproductor.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // a)
        
        ArchivoMP3 mp1 = new ArchivoMP3("C:/Users/oussama/OneDrive/Esc"
                + "ritorio/Asignaturas/Programación/Tema 3/Youv.mp3");
        
        ArchivoMP3 mp2 = new ArchivoMP3("C:/Users/oussama/OneDrive/Esc"
                + "ritorio/Asignaturas/Programación/Tema 3/Youv.mp3");
       
        System.out.println(mp1==mp2);
        // Cuando se ejecuta el programa da false
        
        System.out.println(mp1.equals(mp2));
        // Cuando se ejecuta el programa da true
        
        System.out.println(mp1.hashCode());
        System.out.println(mp2.hashCode());
        // Los dos hashcodes son iguales
        
        // b)
        
        Reproductor rep = new Reproductor(mp1, true, true);
        System.out.println(rep.toString());
        /* Aparece su representación 
        textual bpc.daw.reproductor.Reproductor@6f496d9f */
        
        // c)
        
        ArchivoMP3 mp3 = new ArchivoMP3("C:/Users/oussama/OneDrive/Esc"
                + "ritorio/Asignaturas/Programación/Tema 3/LaJeepeta.mp3");
        System.out.println(mp3);
        /* Aparece null. No. No tienen el mismo formato de salida ya que la 
        clase de ArchivoMP3 tiene reprogramado el toString*/
    }

}
