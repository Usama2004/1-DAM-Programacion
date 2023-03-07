package ejercicio33;
import bpc.daw.reproductor.*;
import java.io.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArchivoMP3 mp3_1 = new ArchivoMP3("C:/Users/oussama/OneDrive/Esc"
                + "ritorio/Asignaturas/Programación/Tema 3/Youv.mp3");
        ArchivoMP3 mp3_2 = new ArchivoMP3("C:/Users/oussama/OneDrive/Escrit"
                + "orio/Asignaturas/Programación/Tema 3/Obscurite.mp3");
        ArchivoMP3 mp3_3 = new ArchivoMP3("C:/Users/oussama/OneDrive/Escrito"
                + "rio/Asignaturas/Programación/Tema 3/DAKITI.mp3");
        
        PlayList pl = new PlayList();
        pl.añadir(mp3_1);
        pl.añadir(mp3_2);
        pl.añadir(mp3_3);
        
        pl.setTitulo("-PlayList-");
        
        File lista = new File("musica.txt");
        
        try{
            lista.createNewFile();
            pl.guardar("musica.txt");
            Reproductor rep = new Reproductor(pl, true, false);
            rep.play();
        }catch(IOException x){
            System.out.println(x.getMessage());
        }
        
    }

}
