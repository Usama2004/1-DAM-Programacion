package ejercicio3_marcador;
import daw.marcador.MarcadorBaloncesto;
import java.time.LocalDate;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio3_Marcador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate hora = LocalDate.now();
        
        MarcadorBaloncesto m1 = new MarcadorBaloncesto("Granada",
                "Malaga");
        MarcadorBaloncesto m2 = new MarcadorBaloncesto("Granada",
                "Malaga", hora);
        MarcadorBaloncesto m3 = new MarcadorBaloncesto("Granada", 45,
                "Malaga", 15, hora);
        
        
        int punt1 = m3.getPuntos('v');
        System.out.println("La puntuacion del equipo es: "+punt1);
        
        System.out.println("");
        
        m3.añadirCanasta('v', 3);
        int punt2 = m3.getPuntos('v');
        
        System.out.println("La puntuacion del equipo es: "+punt2);
        
    }

}
