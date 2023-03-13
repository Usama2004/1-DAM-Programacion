package com.mycompany.ejercicio46;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Ejercicio46 {

    public static void main(String[] args) {
        
        // Sin terminar

        System.out.println("Escribe el año en el que has nacido:");
        int AñoNacimiento=new Scanner(System.in).nextInt();
        System.out.println("Eres hombre o mujer:");
        String genero=new Scanner(System.in).nextLine();
        System.out.println("¿Cuál es tu altura en metros?:");
        double altura=new Scanner(System.in).nextDouble();
        System.out.println("¿Cuál es tu peso en Kg?:");
        int peso=new Scanner(System.in).nextInt();
        
        int edad= 2022 - AñoNacimiento;
        boolean hombre= true;
        boolean mujer= false;
        
        if(genero == hombre){
            int F_Card_Max_Men = 220-edad;
            System.out.println("La frecuencia cardiaca del hombre es de "+F_Card_Max_Men);
        }else if(genero == mujer){
            int F_Card_Max_Women = 226-edad;
            System.out.println("La frecuencia cardiaca de la mujer es de "+F_Card_Max_Women);
        }
        
        }
        
    }
