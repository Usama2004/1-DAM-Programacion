package com.mycompany.post_examen1_12;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Post_Examen1_12 {

    public static void main(String[] args) {
        System.out.println("Introduce tu edad: ");
        int edad=new Scanner(System.in).nextInt();
        
        
        
        boolean mayorEdad = edad>=18?true:false;
        System.out.println("Es mayor de edad: "+mayorEdad);
        
        
    }
}
