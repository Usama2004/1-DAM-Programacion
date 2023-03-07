package ejercicio28;
import java.util.*;
import java.net.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce un nombre de equipo de la red: ");
        String name = new Scanner(System.in).nextLine();
        
        try{
            InetAddress address = InetAddress.getByName(name);
            System.out.println("La IP de "+name+" es "+address.getHostAddress());
            
        }catch(UnknownHostException x){
            System.out.println(x.getMessage());
        }
       
    }

}
