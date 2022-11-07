package com.mycompany.examen02;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Examen02 {

    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("*                                *");
        System.out.println("*       Oussama Ed Dahabi        *");
        System.out.println("*                                *");
        System.out.println("**********************************");
        
        System.out.println("¿Cuál es tu nombre?");
        String nombre=new Scanner(System.in).nextLine();
        System.out.println("Su nombre es "+nombre);
        System.out.println("¿Cuál es tu edad?");
        int edad=new Scanner(System.in).nextInt();
        System.out.println("Tiene "+edad+" años");
        System.out.println("¿Cuánto mides?");
        double altura=new Scanner(System.in).nextDouble();
        System.out.println("Mide "+altura+" metros");
        System.out.println("¿Estas casado?");
        boolean casado=new Scanner(System.in).nextBoolean();
        System.out.println("¿Casado? "+casado);
        System.out.println("¿Cuantos km hay de aqui a tu casa?");
        short distancia=new Scanner(System.in).nextShort();
        System.out.println("Hay "+distancia+" km de distancia");
    }
}
