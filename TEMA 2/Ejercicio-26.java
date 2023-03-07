package ejercicio26;
import java.util.*;
import java.io.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce el numero de segundos que "
                + "quieres pausar el programa");
        int s = new Scanner(System.in).nextInt();
        
        long ms = s * 1000;
        
        try{
            Thread.sleep(ms);
        }catch(InterruptedException x){
            System.out.println(x.getMessage());
        }
        
        System.out.println("Programa finalizado");
       
    }

}
