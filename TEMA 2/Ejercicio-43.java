package ejercicio43;
import java.text.*;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double operacion = 4 * Math.atan(1);
        
        NumberFormat pi = NumberFormat.getInstance();
        
        pi.setMaximumFractionDigits(4);
        
        System.out.println("El valor de pi es "+pi.format(operacion));
    }

}
