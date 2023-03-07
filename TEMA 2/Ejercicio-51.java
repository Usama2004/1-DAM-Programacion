package ejercicio51;

import java.util.HashSet;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet mensajes = new HashSet();
        mensajes.add("silla");
        mensajes.add("mesa");
        mensajes.add("ninio");
        mensajes.add("mesa");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("lapiz");
        
        System.out.println("El tamanio de la lista es de "+mensajes.size());
        System.out.println("Contenido toString: "+mensajes.toString());
        
       
    }

}
