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
        
        // Miarar si esta bien
        
        Caja c1 = new Caja("Ese coche es rojo");
        c1.abrirCaja();
        System.out.println("Mensaje Caja 1: "+c1.getMensaje());
        Caja c2 = new Caja("El coche esta sin gasolina");
        c2.abrirCaja();
        System.out.println("Mensaje Caja 2: "+c2.getMensaje());
        
        System.out.println("Intercambio de mensajes");
        
        System.out.println("Mensaje Caja 1: "+c2.getMensaje());
        System.out.println("Mensaje Caja 2: "+c1.getMensaje());
        
        
        System.out.println("----------------------------------Otro método mucho mejor y más técnico-----------------------------------------");
        
        
        
        Caja c3 = new Caja("Ese coche es rojo");
        Caja c4 = new Caja("El coche esta sin gasolina");
       
       c3.abrirCaja();
       c4.abrirCaja();
       
       String m1 = c3.getMensaje();
       String m2 = c4.getMensaje();
       System.out.println("el mensaje de la caja 1 es: "+m1);
       System.out.println("el mensaje de la caja 2 es: "+m2);
       
       
       boolean cambio1 =c3.cambiarMensaje(m2);
       boolean cambio2 =c4.cambiarMensaje(m1);
               
        m1 = c3.getMensaje();
        m2 = c4.getMensaje();
        
       System.out.println("el mensaje de la caja 1 es: "+m1);
       System.out.println("el mensaje de la caja 2 es: "+m2);
    }
    
}
