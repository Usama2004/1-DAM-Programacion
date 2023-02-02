package ejercicio20;
import java.util.*;
import java.io.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce la ruta: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File traspaso = new File(ruta);
        long num = traspaso.length();
        
        if(traspaso.isDirectory()){
        
            System.out.println("La ruta introducida corresponde a un directorio");
        
        }else{
        
            
            System.out.println("La ruta introducida corresponde a un archivo de "+num+" bytes");
            System.out.println("Deseas borrarlo?(si/no)");
            String borrar = new Scanner(System.in).nextLine();
            
            if(borrar.equals("si")){
               boolean conf = traspaso.delete();
                if(conf != false){
                    System.out.println("El archivo se a borrado correctamente");
                }else{
                    System.out.println("ERROR, no se ha podido borrar el archivo");
                }
            }else {
            
                System.out.println("Borrado cancelado");
                
            }
        
        }
        
    }
    
}
