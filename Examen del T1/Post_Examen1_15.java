package com.mycompany.post_examen1_15;

/**
 *
 * @author oussama
 */
public class Post_Examen1_15 {

    public static void main(String[] args) {
        boolean x=true;
        boolean y=false;
        boolean z=true;
        
        boolean valorFinal1 = x || y || x && !z && !y;
        System.out.println("El valor final de la primera operación es: "+valorFinal1);
        
        boolean valorFinal2 = (x || !y) && (!x || z);
        System.out.println("El valor final de la segunda operación es: "+valorFinal2);
        
        boolean valorFinal3 = !x || !y || z && x && !y;
        System.out.println("El valor de la tercera operación es: "+valorFinal3);
    }
}
