package com.mycompany.ejercicio13;
import java.util.*;

/**
 *
 * @author oussama
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        
        // Introducimos las variables
        
        int segundos;
        int minutos;
        int horas;
         
        // Entrada de datos
        
        System.out.println("Introduce los segundos:");
        segundos=new Scanner(System.in).nextInt();
        
        System.out.println("Introduce los minutos:");
        minutos=new Scanner(System.in).nextInt();
        
        System.out.println("Introduce las horas:");
        horas=new Scanner("System.in").nextInt();
        
        // Operaciones
        
        segundos=segundos + (minutos * 60) + (horas * 3600);
        System.out.println("El número total de segundos es de "+segundos);
        
       
    }
}
