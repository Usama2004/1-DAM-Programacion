package ejercicio50;

import java.util.ArrayList;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList mensajes = new ArrayList();
        mensajes.add("hola");
        mensajes.add("me");
        mensajes.add("llamo");
        mensajes.add("Oussama");
        mensajes.add("EdDahabi");
        System.out.println("El tamanio de la lista es de "
                + mensajes.size());
        System.out.println("La tercera palabra es "+mensajes.get(2));
        System.out.println("Contenido de toString "+mensajes.toString());
        mensajes.remove(0);
        System.out.println("Ahora el tamanio de la lista es de "
                + mensajes.size());
        System.out.println("La tercera palabra es "+mensajes.get(2));
        System.out.println("Contenido de toString "+mensajes.toString());
    }

}
