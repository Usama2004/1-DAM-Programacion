package com.mycompany.ejercicio21;

/**
 *
 * @author oussama
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        
        // Introducimos las variables
        
        int teoria=40;
        int problemas=60;
        int num_teoria=8;
        int num_problemas=4;
        int total=10;
                
        // Operaciones 
        
        double teoriatotal = (1.0 * (total * teoria))/100;
        double problemastotal = (1.0 * (total * problemas))/100;
        double teoriaindiv = teoriatotal/num_teoria;
        double problemasindiv = problemastotal/num_problemas;
        double notaAlumno = (teoriaindiv * 6) + (problemasindiv * 1);
        
   
        System.out.println("Si el alumno acertó 6 de 8 preguntas de teoría y 1 de 4 problemas entonces su nota será un "+notaAlumno);
    }
}
