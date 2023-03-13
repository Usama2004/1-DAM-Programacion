package com.mycompany.ejercicio26;

import java.util.*;

/**
 *
 * @author oussama
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        
        final int APROBADO = 5;

        boolean esta_Aprobado;
        
        System.out.println("Introduce tu nota final: ");
        double notaFinal=new Scanner(System.in).nextDouble();
  
        
        esta_Aprobado = notaFinal>=APROBADO;
        
        System.out.println("¿Pasa con exito la prueba?: "+esta_Aprobado);
        
        
    }
}
