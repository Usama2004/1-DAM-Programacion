package com.mycompany.ejercicio40;
import java.util.*;

/**
 *
 * @author oussama
 */
public class Ejercicio40 {

    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        int n1=new Scanner(System.in).nextInt();
        System.out.println("Introduce un número: ");
        int n2=new Scanner(System.in).nextInt();
        System.out.println("Introduce un número: ");
        int n3=new Scanner(System.in).nextInt();
        
        if(n1 == n2 && n2 == n3){
          System.out.println("Los tres números son iguales");

        }else if(n1>n2 && n1>n3){
        System.out.println("El número más grande es el "+n1);
        }else if(n2>n1 && n2>n3){
        System.out.println("El número más grande es el "+n2);
        }else{
        System.out.println("El número más grande es el "+n3);
        }
        }
    }

