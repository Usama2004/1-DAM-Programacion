package com.mycompany.ejercicio27;

import java.util.*;

/**
 *
 * @author oussama
 */
public class Ejercicio27 {

    public static void main(String[] args) {
        
        // Introducimos las variables
        
        final int M_DE_EDAD=18;
        final int M_DE_60=60;
        int edad;
        
        boolean descuento;
        
        
        System.out.println("¿Cuál es tu edad: ");
        edad=new Scanner(System.in).nextInt();
        
        descuento = edad < M_DE_EDAD || edad >= M_DE_60;
        
        System.out.println("¿Se aplica el descuento?: "+descuento);
        
        
    }
}
