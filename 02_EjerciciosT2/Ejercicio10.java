package ejercicio.pkg10_t2;
import bpc.daw.objetos.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio10_T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caja c1 = new Caja("Este es un mensaje dentro de una caja");
        c1.abrirCaja();
        System.out.println("Mensaje: "+c1.getMensaje());
        c1.cambiarMensaje("Este es el mensaje cambiado");
        System.out.println("Mnesaje: "+c1.getMensaje());
    }
    
}
