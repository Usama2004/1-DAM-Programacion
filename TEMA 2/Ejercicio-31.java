package ejercicio31;
import bpc.daw.musica.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cancion c = new Cancion("Cancion");
        
        NotaMusical n1 = new NotaMusical(0,2);
        NotaMusical n2 = new NotaMusical(0,2);
        NotaMusical n3 = new NotaMusical(4,2);
        NotaMusical n4 = new NotaMusical(4,2);
        NotaMusical n5 = new NotaMusical(5,2);
        NotaMusical n6 = new NotaMusical(5,2);
        NotaMusical n7 = new NotaMusical(4,1);
        NotaMusical n8 = new NotaMusical(3,3);
        NotaMusical n9 = new NotaMusical(3,2);
        NotaMusical n10 = new NotaMusical(2,3);
        NotaMusical n11 = new NotaMusical(2,2);
        NotaMusical n12 = new NotaMusical(1,2);
        NotaMusical n13 = new NotaMusical(2,2);
        NotaMusical n14 = new NotaMusical(3,2);
        NotaMusical n15 = new NotaMusical(1,2);
        NotaMusical n16 = new NotaMusical(0,2);
        
        c.añadir(n1);
        c.añadir(n2);
        c.añadir(n3);
        c.añadir(n4);
        c.añadir(n5);
        c.añadir(n6);
        c.añadir(n7);
        c.añadir(n8);
        c.añadir(n9);
        c.añadir(n10);
        c.añadir(n11);
        c.añadir(n12);
        c.añadir(n13);
        c.añadir(n14);
        c.añadir(n15);
        c.añadir(n16);
        
        // Notas tocadas en el Piano
        
        Piano p = new Piano();
        p.reproducir(c);
        
        // Notas tocadas en el Piano
        
        Guitarra g = new Guitarra();
        g.reproducir(c);
        
        
       
    }

}
