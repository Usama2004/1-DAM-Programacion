package ejercio09_t2;
import bpc.daw.objetos.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercio09_T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caja c1 = new Caja("Bienvenidos al instituto");
        c1.cerrarCaja();
        System.out.println("Mensaje: "+c1.getMensaje());
        
        //Esta abierta la caja
        
        c1.abrirCaja();
        System.out.println("Mensaje: "+c1.getMensaje());
        
        
        
        
        System.out.println("---------------------Otro metodo----------------------------");
        
        
       Caja c = new Caja("Bienvendido al instituto");
       String m = c.getMensaje();
       
       System.out.println("el mensaje es: "+m);
       
        c.abrirCaja();
        
         m = c.getMensaje();
       System.out.println("el mensaje es: "+m);
    }
    
}
