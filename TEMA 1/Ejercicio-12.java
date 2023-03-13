package com.mycompany.ejercicio12;
import java.util.*;


/**
 *
 * @author oussama
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        double precioNormal;
        double porcentajeRebaje;
        double descuentoAplicado;
        double precioFinal;
                
     // Entrada de datos 
     
     System.out.println("Introduce el precio normal del artículo:");
     precioNormal=new Scanner(System.in).nextDouble();
    
     System.out.println("Introduce el porcentaje que se va a aplicar:");
     porcentajeRebaje=new Scanner(System.in).nextDouble();
   
     
     //operaciones
     
     descuentoAplicado = (precioNormal * porcentajeRebaje)/100;
     precioFinal = precioNormal-descuentoAplicado;
     
     // Salida de datos
     
     System.out.println("El precio normal del artículo es de "+precioNormal+" euros");
     System.out.println("El porcentaje de rebaja es del "+porcentajeRebaje+" por ciento");
     System.out.println("El precio final del producto es de "+precioFinal+" euros");
    }
}
