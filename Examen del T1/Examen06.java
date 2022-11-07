package com.mycompany.examen06;

/**
 *
 * @author oussama
 */
public class Examen06 {

    public static void main(String[] args) {
        
        char caracter0= 90;
        char caracter1=100;
        char caracter2=80;
        char caracter3=50;
        char caracter4=110;
        
        System.out.println("El numero 90 representa el caracter "+caracter0);
        System.out.println("EL número 100 representa el caracter "+caracter1);
        System.out.println("El numero 80 representa el caracter "+caracter2);
        System.out.println("El numero 50 representa el caracter "+caracter3);
        System.out.println("El numero 110 representa el caracter "+caracter4);
        
        
        // conversiones explicitas
        
        long numero = 100;
        int numero1 = (int)numero;
        
        short numero2 = (short)numero1;
        
        byte numero3 = (byte)numero2;
        
        System.out.println("El número "+numero3+" esta guardado en una varible tipo byte");
        
    }
}
