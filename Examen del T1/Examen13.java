package com.mycompany.post_examen1_13;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Post_Examen1_13 {

    public static void main(String[] args) {
        
        final double pi=3.1416;
        
        System.out.println("Introduce el valor del radio: ");
        double radio=new Scanner(System.in).nextDouble();
        
        double area = pi * Math.pow(radio, 2);
        System.out.println("¿Cuál es el área del circulo?: "+area);
    }
}
