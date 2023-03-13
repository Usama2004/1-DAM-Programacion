package ejercico5_t3;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercico5_t3 {

    public static void main(String[] args) {
        
        /*Según el reglamento de la federación de caza, un cazador no puede cazar más
piezas de las que se permiten en un día. Queremos hacer un programa que nos lleve la cuenta
de piezas cazadas e indique cuando se ha excedido el límite. Para ello primero se leerá por
teclado el límite del día y a continuación los valores de las piezas cazadas en el orden que se
obtienen. El programa imprimirá un mensaje en el momento en que el límite haya sido
excedido. Después de que cada pieza ha sido registrada, el programa mostrará el número total
de piezas que se llevan hasta ese momento cazadas.*/
        
        boolean repetir = true;
        int cazadas = 0;
        int piezas = 0;
        
        System.out.println("Cuantas piezas se pueden cazar hoy?");
        int num = new Scanner(System.in).nextInt();
        
        while(repetir){
        
            System.out.println("Introduzca el numero de piezas cazadas: ");
            piezas = new Scanner(System.in).nextInt();
            
            cazadas += piezas; //Otro método-> cazadas = cazadas + piezas
            /*Con esta operación lo que conseguimos es que una vez que se 
            ejecuta el bucle while, la siguiente vez que se ejecute va a empezar 
            por el numero que anteriormente hemos introducido. En este caso la
            varaible que se encarga de hacer es esto es "cazadas" que basicamente 
            almacena el número que hemos introducido anteriormente y ya cuando 
            introducimos es siguiente se le suma automáticamente*/
            if(cazadas<=num){
                System.out.println("Usted lleva cazadas "+cazadas+" d"
                        + "e "+num+" posibles");
            }else{
                System.out.println("El numero max de piezas ha sido excedido");
                repetir = false;
            }
            
        }
       
    }

}

    
