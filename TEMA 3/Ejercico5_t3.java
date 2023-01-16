package ejercico5_t3;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercico5_t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean repetir = true;
        int cazadas = 0;
        
        System.out.println("Cuantas piezas se pueden cazar hoy?");
        int num = new Scanner(System.in).nextInt();
        
        while(repetir){
        
            System.out.println("Introduzca el numero de piezas cazadas: ");
            int piezas = new Scanner(System.in).nextInt();
            
            cazadas = cazadas + piezas;
            
            if(cazadas<=num){
                System.out.println("Usted lleva cazadas "+cazadas+" d"
                        + "e "+num+" posibles");
            }else{
                System.out.println("El numero max de piezas ha sido excedido");
                repetir = false;
            }
            
        }
       
    }

}

    
