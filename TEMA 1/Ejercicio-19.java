package com.mycompany.ejercicio19;

/**
 *
 * @author oussama
 */
public class Ejercicio19 {

    public static void main(String[] args) {
       
        // Introducimos las variables
        
        int pagaFija€=200;
        int pagaPorAlumno€=15;
        int eurosPorEstudiante=100;
        
        // Operaciones
        
        int gananciasProfe = pagaFija€ + (pagaPorAlumno€ * 30);
        
        // Salida de datos
        
        System.out.println("El profesor tiene unas ganacias de "+gananciasProfe+" euros por mes");
        
        int gananciasAcademia = eurosPorEstudiante * 30;
        
        System.out.println("La academia tendria unas ganancias de "+gananciasAcademia+" euros por mes");
        
    }
}
