package ejercicio34;
import java.io.*;
import bpc.daw.reproductor.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       try{
            PlayList pl = new PlayList("C:/Users/oussama/OneDrive/Esc"
                    + "ritorio/Asignaturas/Programación/NetBeansProjects/TE"
                    + "MA-2-EJERCICIOS/Ejercicio33/musica.txt");
            Reproductor rep = new Reproductor(pl, true, false);
            rep.play();
        }catch(IOException x){
            System.out.println(x.getMessage());
        }
        
    }

}
