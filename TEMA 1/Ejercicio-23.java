package com.mycompany.ejercicio23;

import java.util.*;

/**
 *
 * @author oussama
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        
        double n1, n2, n3;
        double media;
        boolean esta_aprobado;
        final double APROBADO=5.0;

        System.out.println("Introduce la nota del primer examen: ");
        n1=new Scanner(System.in).nextDouble();
        System.out.println("Introduce la nota del segundo examen: ");
        n2=new Scanner(System.in).nextDouble();
        System.out.println("Introduce la nota del tercer examen: ");
        n3=new Scanner(System.in).nextDouble();  
        
        media = (n1 + n2 + n3)/3;
        esta_aprobado = media >=APROBADO;
        
        System.out.println("¿El alumno esta aprobado?: "+esta_aprobado);
        
    }
    
}
