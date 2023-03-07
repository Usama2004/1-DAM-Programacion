package ejercicio53;

import java.awt.Color;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Map matricula_color = new TreeMap();
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
        
        /*Los TreeMaps en Java se ordenan automáticamente. De manera 
        predeterminada, se ordenará según el orden natural de las claves. Un
        HashMap, almacena pares clave / valor en una tabla hash, y
        los elementos no están ordenados de ninguna manera.*/
    }

}
