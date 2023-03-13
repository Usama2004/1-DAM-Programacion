package com.mycompany.ejercicio29;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        
        
        System.out.println("¿Cuál es el porcentaje(%) de tinta de la impresora?: ");
        int porcentaje_tinta=new Scanner(System.in).nextInt();
        System.out.println("¿Cuántos folios hay en la impresora?: ");
        int folios_impresora=new Scanner(System.in).nextInt();
        System.out.println("¿Cuántos folios vas a necesitar?: ");
        int folios_necesarios=new Scanner(System.in).nextInt();
        System.out.println("¿Laa impresora esta encendida?: ");
        boolean on_off=new Scanner(System.in).nextBoolean();
        
        boolean imprimir = porcentaje_tinta > 0 && folios_impresora > folios_necesarios && on_off;
        
        System.out.println("¿La impresora imprimira el proyecto que se le pida?: "+imprimir);
    }
}
