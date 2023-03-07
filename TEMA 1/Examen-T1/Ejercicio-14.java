package com.mycompany.post_examen_1_14;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Post_Examen_1_14 {

    public static void main(String[] args) {
        
        System.out.println("Introduce introduce la cantidad en euros para desglosarla: ");
        int dinero =new Scanner(System.in).nextInt();
        
        int billetes500= dinero/500;
        int resto0=dinero%500;
        int billetes100= resto0/200;
        int resto1=resto0%100;
        int billetes50= resto1/50;
        int resto2=resto1%50;
        int billetes20= resto2/20;
        int resto3=resto2%20;
        int billetes10= resto3/10;
        int resto4=resto3%10;
        int monedas2= resto4/2;
        int resto5= resto4%2;
        int monedas1= resto5/1;
        
        System.out.println("Billetes de 500: "+billetes500);
        System.out.println("Billetes de 100: "+billetes100);
        System.out.println("Billetes de 50: "+billetes50);
        System.out.println("Billetes de 20: "+billetes20);
        System.out.println("Billetes de 10: "+billetes10);
        System.out.println("Monedas de 2 euros: "+monedas2);
        System.out.println("Monedas de 1 euro: "+monedas1);
        
        
        
    }
}
