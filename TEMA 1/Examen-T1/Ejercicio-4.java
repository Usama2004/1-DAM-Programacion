package com.mycompany.examen04;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Examen04 {

    public static void main(String[] args) {
        System.out.println("¿Cual es la edad de la primera persona");
        int edad1=new Scanner(System.in).nextInt();
        System.out.println("¿Cuál es la edad de la segunda personaa?");
        int edad2=new Scanner(System.in).nextInt();
        
        boolean mayorDeEdad1 = edad1>=18;
        boolean mayorDeEdad2 = edad2>=18;
        
        System.out.println("¿Es mayor de edad la primera persona?: "+mayorDeEdad1);
        System.out.println("¿Es mayor de edad la segunda persona?: "+mayorDeEdad2);
        
        boolean prim_mayor_seg = edad1>edad2;
        System.out.println("¿La primera persona es mayor que la segunda?:"+prim_mayor_seg);
    }
}
