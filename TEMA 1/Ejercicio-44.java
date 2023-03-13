package com.mycompany.ejercicio44;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Ejercicio44 {

    public static void main(String[] args) {
        
        System.out.println("Introduce un número entero: ");
        int numero=new Scanner(System.in).nextInt();
        
        if(numero%2==0){ 
            System.out.println("El "+numero+" es un número par");
        }else{
            System.out.println("El "+numero+" es un número impar");
        }
    }   
}
