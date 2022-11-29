package ejercicio29;
import java.util.*;
import bpc.daw.objetos.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Apartado a)
        
        System.out.println("Introduce un numero: ");
        int num = new Scanner(System.in).nextInt();
        
        // Si letras en vez de números saltara InputMismatchException
        
        // Apartado b)
        
        System.out.println("Argumento 1: "+ args[0]);
        System.out.println("Argumento 2: "+ args[1]);
        
        // Si no hay argumantos saltará el ArrayIndexOutOfBoundsException
        
        // Apartado c
        
        Caja caja = null;
        caja.abrirCaja();
        System.out.println("El mensaje de la caja es: "+caja.getMensaje().length());
        
        // Si la caja no tiene ningun mensaje y además se quiere saber la longitus salta el NullPointerException
        
       
    }

}
