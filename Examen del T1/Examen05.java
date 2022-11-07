package com.mycompany.examen05;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Examen05 {

    public static void main(String[] args) {
        System.out.println("Escribe un número entero");
        int numero=new Scanner(System.in).nextInt();
        System.out.println("El numero que es has escrito es "+numero);
        
        numero +=5;
        System.out.println(numero+" es el valor actual tras aplicar el operador de incremento");
        
        numero -=4;
        System.out.println(numero+" es el valor actual tras aplicar el operador de decremento");
        
        numero ++;
        System.out.println(numero+" es el valor actual tras aplicar el operador de incremento unitario");
        
        numero --;
        System.out.println(numero+" es el valor actual tras aplicar el operador de decremento unitario");
    }
}
