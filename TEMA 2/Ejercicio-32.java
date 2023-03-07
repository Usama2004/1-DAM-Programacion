package ejercicio32;
import bpc.daw.reproductor.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArchivoMP3 mp3 = new ArchivoMP3("C:/Users/oussama/OneDrive/Escritor"
                + "io/Asignaturas/Programación/Tema 3/LaJeepeta.mp3");
        
        Reproductor rep = new Reproductor(mp3, true, false );
        
        System.out.println("Nombre de la cancion: "+mp3.getTitulo());
        System.out.println("Nombre del autor: "+mp3.getAutor());
        System.out.println("Duracion de la cancion: "+mp3.getDuracion());
        
        /*Por lo visto no se muestra esta información ya que no se halla 
        existente entre los metadatos*/
        
        rep.play();
       
    }

}
