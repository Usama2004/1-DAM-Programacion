package com.mycompany.ejercicio17;

/**
 *
 * @author oussama
 */
public class Ejercicio17 {

    public static void main(String[] args) {
       
        // Introducimos las variables
        
        int variablex=0; 
        double base=(variablex/2), exponente=3;
        double base2=variablex, exponente2=2;
        
        // operaciones 
        
        double resultado = (3 * Math.pow(base, exponente))/(Math.pow(base2, exponente2) + (variablex) + 3);
        
        // Salida de datos
        
        System.out.println("El valor de la variable x es "+variablex);
        System.out.println("El resultado de la función cuando x vale 0 es "+resultado);
        
        variablex=1; // Asignación
        
        System.out.println("El valor de la variable x es "+variablex);
        System.out.println("El resultado de la función cuando x vale 1 es "+resultado);
        
        variablex=-2; // Asignación
        
        System.out.println("El valor de la variable x es "+variablex);
        System.out.println("El resultado de la función cuando x vale -2 es "+resultado);
        
    }
}
