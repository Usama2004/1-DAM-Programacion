package ejercicio12_12;
import bpc.daw.objetos.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio12_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      MarcadorBaloncesto mb = new MarcadorBaloncesto("Estudiantes","CB Granada");
      mb.anotarCanasta('L', 2);
      mb.anotarCanasta('V', 3);
      mb.anotarCanasta('L', 2);
      mb.anotarCanasta('V', 2);
      mb.anotarCanasta('V', 3);
      mb.anotarCanasta('L', 1);
      mb.anotarCanasta('L', 1);
      mb.anotarCanasta('V', 2);
        System.out.println(mb.toString()+"");
        
        System.out.println("El equipo ganador es el "+mb.getNombreEquipoGanador());
        System.out.println("El equipo perdedor es el "+mb.getNombreEquipoPerdedor());
      
    }
    
}
