package com.mycompany.ejercicio43;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Ejercicio43 {

    public static void main(String[] args) {
        
        System.out.println("El ejercicio se hara tomando como moneda de referencia el euro");
        
        
        System.out.println("¿Cuál es el precio del producto?");
        double precio=new Scanner(System.in).nextDouble();
        
       System.out.println("¿Cuál es la cantidad de dinero que da el cliente?");
       double dinero_cliente=new Scanner(System.in).nextDouble();
       
       if(dinero_cliente>precio){
           double elCambio = dinero_cliente-precio;
            System.out.println("El dependiente le tiene que devolver al cliente "+elCambio+" euros");   
       }else if(precio>dinero_cliente){
            double dineroQFalta = precio-dinero_cliente;
            System.out.println("El cliente le tiene que dar al dependiente "+dineroQFalta+" euros más");
       }else{
            System.out.println("El cliente le a dado al dependiente el dinero justo");
       }
    }
}
