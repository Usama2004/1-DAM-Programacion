package ejercicio11_t2;
import bpc.daw.objetos.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio11_T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caja c1 = new Caja("Ese coche es rojo");
        c1.abrirCaja();
        System.out.println("Mensaje Caja 1: "+c1.getMensaje());
        Caja c2 = new Caja("El coche esta sin gasolina");
        c2.abrirCaja();
        System.out.println("Mensaje Caja 2: "+c2.getMensaje());
        
        System.out.println("Intercambio de mensajes");
        
        System.out.println("Mensaje Caja 1: "+c2.getMensaje());
        System.out.println("Mensaje Caja 2: "+c1.getMensaje());
    }
    
}
