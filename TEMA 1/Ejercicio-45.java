package com.mycompany.ejercicio45;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Ejercicio45 {

    public static void main(String[] args) {
        
        // Sin terminar
        
        System.out.println("Introduce el número del lado uno");
        double lado1=new Scanner(System.in).nextDouble();
        System.out.println("Introduce el número del lado dos");
        double lado2=new Scanner(System.in).nextDouble();
        System.out.println("Introduce el número del lado tres");
        double lado3=new Scanner(System.in).nextDouble();
        System.out.println("Introduce el número del angulo");
        double angulo=new Scanner(System.in).nextDouble();
        
        if((lado1==lado2) && (lado2 != lado3) || (lado2 == lado3) && angulo<90 && (lado3 != lado1) && angulo<90 || (lado1 == lado3) && (lado3 !=lado1) && angulo<90){
            System.out.println("Introduce el número del angulo");
            double angulo=new Scanner(System.in).nextDouble();
        
        }
    }
}
