package ejercicio_47;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio_47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Introduce la ruta del archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File archivo = new File(ruta);
        
        Desktop abrir = Desktop.getDesktop();
        if(archivo.exists()){
            try{
                abrir.open(archivo);
            }catch(IOException x){
            System.out.println(x.getMessage());
            }
        }else{
            System.out.println("No se a encontrado el archivo");
        }
        }
        
        
    }

