package com.mycompany.ejercicio39;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Ejercicio39 {

    public static void main(String[] args) {
       
        System.out.println("Introduce un número entero:");
        int n1=new Scanner(System.in).nextInt();
        System.out.println("Introduce otro número entero:");
        int n2=new Scanner(System.in).nextInt();
        
        if(n1<n2){
            System.out.println("El primer número es menor que el segundo");
        }else{
            if(n1>n2){
            System.out.println("El primer número es mayor que el segundo");
            }else{
            System.out.println("Los dos números son iguales");
            }
        }
        

    }
}
