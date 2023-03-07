package com.mycompany.examen09;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Examen09 {

    public static void main(String[] args) {
        System.out.println("Escribe un número comprendido entre el 10 y el 56:");
        double numero=new Scanner(System.in).nextDouble();
        
        if(numero>=10 && numero<=56){
            System.out.println("Es correcto");
        }else{
            System.out.println("No es correcto");
        }
    }
}
