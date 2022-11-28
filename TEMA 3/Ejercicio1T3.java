package ejercicio1.t3;
import java.util.*;
import bpc.daw.reproductor.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio1T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] cancion = {"Youv", "Obscurite", "La Jeepeta", "Ja M'apelle", "DAKITI"};
        
        System.out.println("1 - Youv");
        System.out.println("2 - Obscurite");
        System.out.println("3 - La Jeepeta");
        System.out.println("4 - Ja M'apelle");
        System.out.println("5 - DAKITI");
        
        
        System.out.println("Introduce el numero que corresponda a la cancion que tu quieres reproducir: ");
        int eleccion = new Scanner(System.in).nextInt();
        
        ArchivoMP3 mp3 = null;
        
        
        if(eleccion <=4){
            switch(eleccion){
            case 0:
                System.out.println("Estas reproduciendo "+cancion[0]);
                mp3 = new ArchivoMP3("C:/Users/oussama/OneDrive/Escritorio/Asignaturas/Programación/Tema 3/Youv.mp3");
                break;
            case 1:
                System.out.println("Estas reproduciendo "+cancion[1]);
                mp3 = new ArchivoMP3("C:/Users/oussama/OneDrive/Escritorio/Asignaturas/Programación/Tema 3/Obscurite.mp3");
                break;
            case 2:
                System.out.println("Estas reproduciendo "+cancion[2]);
                mp3 = new ArchivoMP3("C:/Users/oussama/OneDrive/Escritorio/Asignaturas/Programación/Tema 3/LaJeepeta.mp3");
                break;
            case 3:
                System.out.println("Estas reproduciendo "+cancion[3]);
                mp3 = new ArchivoMP3("C:/Users/oussama/OneDrive/Escritorio/Asignaturas/Programación/Tema 3/JeMapelle.mp3");
                break;
            case 4:
                System.out.println("Estas reproduciendo "+cancion[4]);
                mp3 = new ArchivoMP3("C:/Users/oussama/OneDrive/Escritorio/Asignaturas/Programación/Tema 3/DAKITI.mp3");
                break;
        }
        
       
    }else{
            System.out.println("ERROR: el numero no debe ser mayor que 5");
    }
        
        
    Reproductor rep = new Reproductor(mp3, false, false);
    rep.play();
    }
    
}
