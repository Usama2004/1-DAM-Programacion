package com.mycompany.ejercicio20;

/**
 *
 * @author oussama
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        
        // Introducimos las variables
        
        int cap_camion1=3000;
        int viajes1=15;
        int cap_camion2=5000;
        int viajes2;
        int pesoArena;
        
        // Operaciones
        
        pesoArena = cap_camion1 * viajes1;
        
        viajes2 = pesoArena/cap_camion2;
        
        // Salida de datos
        
        System.out.println("El peso total de la arena a transportar es de "+pesoArena+" kg");
        System.out.println("Un camión de "+cap_camion2+" kg de capacida puede transportar la cantidad de arena total en "+viajes2+" viajes");
    }
}
