package ejercicio25;
import java.util.*;
import java.io.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File doc = new File("C:/Users/oussama/OneDrive/Escritorio/Asignaturas/Programación/NetBeansProjects/TEMA-2-EJERCICIOS/Ejercicio24/archivo2.0.txt");
        
        try{
            Scanner imp = new Scanner(doc);
            System.out.println(imp.nextLine());
            System.out.println(imp.nextLine());
        }catch(FileNotFoundException x){
            System.out.println(x.getMessage());
        }
    }

}
