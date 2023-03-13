package com.mycompany.actpdf2;

import java.util.*;

/**
 *
 * @author oussama
 */
public class ActPDF2 {

    public static void main(String[] args) {
        
        //Introducimos las variables
        
        double euros;
        double pesetas;
        
        // Entrada de datos 
        
        System.out.println("Introduce un número de euros:");
        euros=new Scanner(System.in).nextDouble();
        
        // Operaciones 
        
        pesetas = euros * 166.386;
        
        System.out.println("El número de euros que has introducido es "+euros);
        System.out.println(euros+ "euros equivalen a "+pesetas+" pesetas");
    }
}
