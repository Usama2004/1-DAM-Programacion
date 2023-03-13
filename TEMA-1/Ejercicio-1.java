package com.mycompany.actpdf1;

import java.util.*;

/**
 *
 * @author oussama
 */
public class ActPDF1 {

    public static void main(String[] args) {
        
        // Introducimos las variables
        
        double numero1;
        double numero2;
        double multiplicacion;
        
        
        // Entrada de datos
        
        System.out.println("Escribe un número: ");
        numero1=new Scanner(System.in).nextDouble();
        
        System.out.println("Escribe otro número: ");
        numero2=new Scanner(System.in).nextDouble();
        
        // Operaciones 
        
        multiplicacion = numero1 * numero2;
        
      System.out.println("Si el primer número es el "+numero1+" y el segundo el "+numero2+" el valor de su multiplicación sería de "+multiplicacion);  
    }
}
