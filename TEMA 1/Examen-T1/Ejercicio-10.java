package com.mycompany.post_examen1_10;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Post_examen1_10 {

    public static void main(String[] args) {
        System.out.println("Escribe el primer número entero: ");
        int n1=new Scanner(System.in).nextInt();
        System.out.println("Escribe el segundo número entero: ");
        int n2=new Scanner(System.in).nextInt();
        System.out.println("Escribe el tercer número entero: ");
        int n3=new Scanner(System.in).nextInt();
        
        if(n1 == n2 && n2 == n3){
        System.out.println("Los tres números son iguales");
        }else if(n1 > n2 && n1 >n3){
        System.out.println("EL número mayor es: "+n1);
        }else if(n2 > n1 && n2 > n3){
        System.out.println("El número mayor es: "+n2);
        }else{
        System.out.println("El número mayor es: "+n3);
        }
    }
}
