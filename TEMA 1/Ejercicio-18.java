package com.mycompany.ejercicio18;

/**
 *
 * @author oussama
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        
        // Introducimos las variables
        
        int eurosPorHora=7;
        int horasSemanales1=2;
        int horasSemanales2=3;
        
        // Operaciones
        
        int totaleuros = ((horasSemanales1 * 4) + (horasSemanales2 * 4)) * eurosPorHora;
        
        // Salida de datos
        
        System.out.println("Ganará "+totaleuros+" euros al mes impartiendo clase");
        
        totaleuros = 900; // Asignación
        
        // Operaciones 
        
        double horasalmes = (1.0 * totaleuros)/eurosPorHora;
        
        System.out.println("Tendrá que dar "+horasalmes+" horas al mes para ganar "+totaleuros+" euros");
        
    }
}
