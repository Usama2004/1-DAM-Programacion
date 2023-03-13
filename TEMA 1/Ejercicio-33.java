package com.mycompany.ejercicio33;

/**
 *
 * @author oussama
 */
public class Ejercicio33 {

    public static void main(String[] args) {
        
        // Investigar que hay que hacer para que la suma de las tres incognitas(Aprobados, Suspensos y los que no se han presentado) de 26 (número total de alumnos de la clase)
        
        int alumnosClase=26;
        
        
        int aprobados = (alumnosClase * 66)/100;
        double suspensos = (alumnosClase * 19.5)/100;
        double noPresentadoPorcent = 100 - (66+19.5);
        double noPresentado = (alumnosClase * noPresentadoPorcent)/100;
        
        int suspensos1 = (int)suspensos;
        int noPresentado1 = (int)noPresentado;
        
        System.out.println("Han aprobado "+aprobados+" alumnos");
        System.out.println("Han suspendido "+suspensos1+" alumnos");
        System.out.println("No se han presentado "+noPresentado1+" alumnos");
        
    }
}