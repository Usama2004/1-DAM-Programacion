package com.mycompany.ejercicio24;

import java.util.*;

/**
 *
 * @author oussama
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        
        
        int edad1, edad2;
        boolean es_mayorDeEdad1;
        boolean es_mayorDeEdad2;
        final int MEDAD = 18;
        boolean edad1esmayor;
        
        System.out.println("¿Cúal es la edad de tu amigo Marcos?: ");
        edad1=new Scanner(System.in).nextInt();
        System.out.println("¿Cúal es la edad de tu amigo Dani?: ");
        edad2=new Scanner(System.in).nextInt();
        
        es_mayorDeEdad1 = edad1 >= MEDAD;
        System.out.println("¿Marcos es mayor de edad?: "+es_mayorDeEdad1);
        es_mayorDeEdad2 = edad2 >= MEDAD;
        System.out.println("¿Dani es mayor de edad?: "+es_mayorDeEdad2);
        
        
        edad1esmayor = edad1==edad2;
        
        System.out.println("¿Marcos es mayor que Dani?: "+edad1esmayor);
        
    }
}
