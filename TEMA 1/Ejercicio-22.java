package com.mycompany.ejercicio22;

/**
 *
 * @author oussama
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        
        int numpreguntas=30;
        int total=10;
        
        double valorPindiv = (1.0 * total)/numpreguntas;
        double notaAlumno = (22 * valorPindiv) - (valorPindiv * 2);
        
        System.out.println("Si el almuno contesta 22 de 30 bien y falla 6 y no contesta 2 su nota será un "+notaAlumno);
    }
}
