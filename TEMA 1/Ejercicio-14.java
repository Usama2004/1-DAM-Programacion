package com.mycompany.ejercicio14;
import java.util.*;

/**
 *
 * @author oussama
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        
        // Introducimos las variables
        
        double euros;
        double dolares;
        double libras;
        double yens;
        double pesetas;
        
        // Entrada de datos
        
        System.out.println("Introduce un número de euros:");
        euros=new Scanner(System.in).nextDouble();
        
        // Operaciones
        
        dolares = euros * 1.42;
        libras = euros * 0.8713;
        yens = euros * 113.86;
        pesetas = euros * 166.386;
        
        // Salida de datos
        
        System.out.println("El número de euros que has introducido es "+euros);
        System.out.println(euros+" euros equivalen a "+dolares+" dolares");
        System.out.println(euros+" euros equivalen a "+libras+" libras");
        System.out.println(euros+" euros equivalen a "+yens+" yens");
        System.out.println(euros+" euros equivalen a "+pesetas+" pesetas");
                
    }
}
