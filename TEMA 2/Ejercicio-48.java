package ejercicio48;
import bpc.daw.objetos.MarcadorMejorado;
import static bpc.daw.objetos.MarcadorMejorado.CANASTA_LOCAL;
import static bpc.daw.objetos.MarcadorMejorado.CANASTA_VISITANTE;
import static bpc.daw.objetos.MarcadorMejorado.NORMAL;
import static bpc.daw.objetos.MarcadorMejorado.TIRO_LIBRE;
import static bpc.daw.objetos.MarcadorMejorado.TRIPLE;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MarcadorMejorado mm = new MarcadorMejorado("Estudiantes", "CB Granada");
        
        mm.anotarCanasta(CANASTA_LOCAL, NORMAL);
        mm.anotarCanasta(CANASTA_VISITANTE, TRIPLE);
        mm.anotarCanasta(CANASTA_LOCAL, NORMAL);
        mm.anotarCanasta(CANASTA_VISITANTE, NORMAL);
        mm.anotarCanasta(CANASTA_VISITANTE, TRIPLE);
        mm.anotarCanasta(CANASTA_LOCAL, TIRO_LIBRE);
        mm.anotarCanasta(CANASTA_LOCAL, TIRO_LIBRE);
        mm.anotarCanasta(CANASTA_VISITANTE, NORMAL);
        
        System.out.println("Equipo local: "+mm.getNombreLocal());
        System.out.println("Equipo visitante: "+mm.getNombreVisitante());
        System.out.println("");
        System.out.println("Puntos del equipo local: "+mm.getPuntosLocal());
        System.out.println("Puntos del equipo visitante: "+mm.getPuntosVisitante());
        System.out.println("");
        System.out.println("Equipo ganador: "+mm.getNombreEquipoGanador());
        System.out.println("Equipo perdedor: "+mm.getNombreEquipoPerdedor());
    }

}
