package ejercicio19;
import java.io.*;
import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File a = new File(ruta);
        
        long num1 = a.length();
        double num2 = (num1*1.0)/1000000;
        
        System.out.println("Tiene "+num1+" bytes o lo que vendria a ser lo mismo "+num2+" de megabytes");
        
    }
    
}
