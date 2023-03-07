package ejercicio24;
import java.io.*;
import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File archivo = new File("archivo2.0.txt");
        try{
            archivo.createNewFile();
        }catch(IOException x){
            System.out.println(x.getMessage());
        }
        
        System.out.println("Escribe una frase: ");
        String f1 = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe otra frase: ");
        String f2 = new Scanner(System.in).nextLine();
        
        try{
            PrintWriter doc = new PrintWriter("archivo2.0.txt");
            doc.println(f1);
            doc.println(f2);
            doc.close();
        }catch(FileNotFoundException x){
            System.out.println("ERROR: No se a conseguido encontrar el documento");
        }
       
    }

}
