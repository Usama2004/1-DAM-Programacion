package com.mycompany.ejercicio41;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Ejercicio41 {

    public static void main(String[] args) {
        System.out.println("Escribe  un número que este entre 10 y 56");
        int numero=new Scanner(System.in).nextInt();
        
        if(numero>=10 && numero<=56){
        System.out.println("Es correcto");
        }else{
        System.out.println("No es correcto");
        }
        
    }
}
