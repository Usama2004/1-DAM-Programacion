package com.mycompany.ejercicio42;
import java.util.*;
/**
 *
 * @author oussama
 */
public class EJercicio42 {

    public static void main(String[] args) {
       
        
        System.out.println("Introduce tu nota:");
        double nota=new Scanner(System.in).nextDouble();
        
        if(nota<5.0){
            System.out.println("Tu calificación es un suspenso");
        }else if(nota>5.0 && nota<6.0){
            System.out.println("Tu calificación es un suficiente");
        }else if(nota>6.0 && nota<7.0){
            System.out.println("Tu calificación es un bien");
        }else if(nota>7.0 && nota<9.0){
            System.out.println("Tu calificación es un notable");
        }else if(nota>9.0 && nota<10.0){
            System.out.println("Tu calificación es un sobresaliente");
        }else{
            System.out.println("Tu nota es de matrícula");
        }
    }
}
