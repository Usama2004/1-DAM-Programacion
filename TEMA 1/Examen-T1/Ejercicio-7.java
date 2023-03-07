package com.mycompany.examen07;

/**
 *
 * @author oussama
 */
public class Examen07 {

    public static void main(String[] args) {
        
        String n1="123";
        String n2="69";
        
        int numero1= Integer.parseInt(n1);
        int numero2= Integer.parseInt(n2);
        
        int suma = numero1 + numero2;
        int producto = numero1 * numero2;
        int resta = numero1-numero2;
        double division = (numero1 * 1.0)/numero2;
        int resto = numero1%numero2;
        
        System.out.println("El valor de la suma es "+suma);
        System.out.println("El valor de la resta "+resta);
        System.out.println("El valor del producto es "+producto);
        System.out.println("El valor (cociente) de la divisio "+division);
        System.out.println("El valor del resto es "+resto);
        
        
    }
}
