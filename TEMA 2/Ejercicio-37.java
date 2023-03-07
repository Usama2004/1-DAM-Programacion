package ejercicio37;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Escribe un numero: ");
        int num = new Scanner(System.in).nextInt();
        
        System.out.println("");
        
        System.out.println("El numero "+num+" escrito en binario es "
                +Integer.toBinaryString(num));
        System.out.println("El numero "+num+" escrito en hexadecimal es "
                +Integer.toHexString(num));
    }

}
