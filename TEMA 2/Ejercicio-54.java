package ejercicio54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List lista = new ArrayList();
        lista.add("coche");
        lista.add("avion");
        lista.add("camion");
        lista.add("moto");
        lista.add("bicicleta");
        lista.add("monopatin");
        lista.add("patinete");
        lista.add("barco");
        lista.add("jet");
        lista.add("yate");
        System.out.println("Contenido del toString: "+lista.toString());
        Collections.sort(lista);
        System.out.println("Contenido del toString: "+lista.toString());
    }

}
