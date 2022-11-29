package ejercicio27;
import java.util.*;
import java.net.*;
import java.io.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Escribe una direccion IP: ");
        String ip = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe el tiempo de timeout "
            + "(en milisegundos): ");
        int ms = new Scanner(System.in).nextInt();
        
        try{
        
            InetAddress address = InetAddress.getByName(ip);
            boolean alcanzable = address.isReachable(ms);
            System.out.println("Haciendo ping a "+ip+"..."+alcanzable);
            
        }catch(UnknownHostException x){
            
            System.out.println(x.getMessage());
            
        }catch(IOException y){
            
            System.out.println(y.getMessage());
        }
        
    }

}
