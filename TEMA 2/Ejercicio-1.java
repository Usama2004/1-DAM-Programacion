package ejercio1.tema.pkg2;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercio1Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("El objeto en cuestión es un ordenador");
        
        System.out.println("Primera orden: escribir");
        System.out.println("Segunda orden: llamar");
        System.out.println("Tercera orden: jugar");
        
        System.out.println("¿Que marca de ordenador tienes?");
        System.out.println("Escribe tu respuesta: ");
        String respuesta1 =new Scanner(System.in).nextLine();
        System.out.println("La marca del ordenadr es "+respuesta1);
        
        System.out.println("¿Cuantas gigas de almacenamiento tiene?");
        System.out.println("Escribe tu respuesta: ");
        int respuesta2 =new Scanner(System.in).nextInt();
        System.out.println("El ordenador tiene "+respuesta2+" gigas");
        
        System.out.println("¿Cuantas pulgadas tiene la pantalla?");
        System.out.println("Escribe tu respuesta: ");
        String respuesta3 =new Scanner(System.in).nextLine();
        System.out.println("El ordenador tiene "+respuesta3+" pulgadas");
    }
    
}
