package ejercicio4_t3;
import java.util.Scanner;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio4_t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        boolean repetir = true;
        while(repetir){
        
            System.out.println("Eres mayor de edad?: ");
            String respuesta = new Scanner(System.in).nextLine();
            
            if(respuesta.equals("Si") || respuesta.equals("si")){
            
                System.out.println("El usuario es mayor de edad");
                repetir = false;
            }else if(respuesta.equals("N"
                    + "o") || respuesta.equals("no")){
            
                System.out.println("El usuario es menor de edad");
                repetir = false;
            }else{
                System.out.println("No te entiendo");
            }
        
        }
        
    }

}
