package ejercicio2_caja;
import daw.objeto.Caja;

/**
 *
 * 
 */
public class Ejercicio2_Caja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caja c1 = new Caja();
        Caja c2 = new Caja("Hola Mundo 1");
        Caja c3 = new Caja(true, "Hola Mundo 2");
        
        String var1 = c1.getMensaje();
        String var2 = c2.getMensaje();
        String var3 = c3.getMensaje();
        
        System.out.println("");
        
        boolean v1 = c1.getEstado();
        boolean v2 = c2.getEstado();
        boolean v3 = c3.getEstado();
        
        System.out.println("");
        
        System.out.println("El primer constructor imprime "+var1);
        System.out.println("Esta abierta la primera caja: "+v1);
        
        System.out.println("");
        
        System.out.println("El segundo constructor imprime "+var2);
        System.out.println("Esta abierta la segunda caja: "+v2);
        
        System.out.println("");
        
        System.out.println("El tercer constructor imprime "+var3);
        System.out.println("Esta abierta la tercera caja: "+v3);
        
        System.out.println("");
        
        c3.setMensaje("Programa Modificado");
        String var3_0 = c3.getMensaje();
        System.out.println(var3_0);
        
        
        
       
    }

}
