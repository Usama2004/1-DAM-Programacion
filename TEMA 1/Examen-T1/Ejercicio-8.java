package com.mycompany.examen08;

/**
 *
 * @author oussama
 */
public class Examen08 {

    public static void main(String[] args) {
        char[] vocales = {'a', 'b' ,'c', 'd', 'e'};
        
        double[] decimales = {1.1, 2.1, 3.3, 4.2, 5.5};
        
        String[] lenguajes = {"java", "kotlin", "javascript", "python"};
        
        System.out.println("La ultima vocal es la "+vocales[4]);
        System.out.println("El ultimo número decimal es el "+decimales[4]);
        System.out.println("El ultimo lenguaje de programación es "+lenguajes[3]);
        
        lenguajes[0]="Cobol";
        System.out.println("El primer lenguaje de programación de la lista "+lenguajes[0]);
        
        
    }
}
