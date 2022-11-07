package com.mycompany.ejercicio03;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        System.out.println("Escribe un número de horas");
        int horas=new Scanner(System.in).nextInt();
        System.out.println("Escribe un número de minutos");
        int minutos=new Scanner(System.in).nextInt();
        System.out.println("Escribe un número de segundos");
        int segundos=new Scanner(System.in).nextInt();
        
        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
        
        System.out.println(horas+" horas, "+minutos+" minutos y "+segundos+" segundos equivalen en total a "+totalSegundos +" segundos");
    }
}
