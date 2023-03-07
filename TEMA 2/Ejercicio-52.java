package ejercicio52;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map matricula_color = new HashMap();
        Color red = new Color(255,0,0);
        Color yellow = new Color(255, 255, 0);
        Color green = new Color(0,255,0);
        
        matricula_color.put("12535ABC", red);
        matricula_color.put("98525KWX", yellow);
        matricula_color.put("17632MSE", green);
        matricula_color.put("85321ABC", yellow);
        System.out.println("");
        System.out.println("El tamanio del Map es de "+matricula_color.size());
        System.out.println("Contenido de toString: "+matricula_color.toString());
        
        System.out.println("Introduce el num de matricula:");
        String matr = new Scanner(System.in).nextLine();
        String letra_mayus = matr.toUpperCase();
        switch (letra_mayus) {
            case "12535ABC":
                System.out.println("El color del coche es rojo");
                break;
            case "98525KWX":
                System.out.println("El color del coche es amarrillo");
                break;
            case "17632MSE":
                System.out.println("El color del coche es verde");
                break;
            case "85321ABC":
                System.out.println("El color del coche es amarrillo");
                break;
            default:
                System.out.println("No existe esa matricula");
                break;
        }
    }

}
