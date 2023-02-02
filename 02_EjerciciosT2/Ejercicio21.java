package ejercicio21;
import java.io.*;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce la ruta de un directorio: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File traspaso = new File(ruta);
        
        if (traspaso.isDirectory()){
            
            File[] cont = traspaso.listFiles();
            System.out.println("Los archivos y directorios que tiene este directorio son: "+Arrays.toString(cont));
            
        }else{
        
            System.out.println("ERROR, la ruta que has introducido no corresponde a la de un directorio");
            
        }
        
    }
    
}
