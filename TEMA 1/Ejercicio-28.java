package com.mycompany.ejercicio28;

import java.util.*;

/**
 *
 * @author oussama
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        
        System.out.println("¿Eres un adulto?: ");
        boolean adulto=new Scanner(System.in).nextBoolean();
        System.out.println("¿El niño/a va acompañado?: ");
        boolean acompañado=new Scanner(System.in).nextBoolean();
        
        boolean abrirPuerta = adulto || acompañado;
        
        System.out.println("¿Se abre la puerta?: "+abrirPuerta);
    }
}
