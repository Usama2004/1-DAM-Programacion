package com.mycompany.ejercicio36;

/**
 *
 * @author oussama
 */
public class Ejercicio36 {

    public static void main(String[] args) {
        
        //Apartado a) del ejercicio 36
        
        System.out.println("Si el programa pone true eso quiere decir que el balance a sido positivo o neutral (De todos modos cuando sea neutral se aclarara con una nota), mientas que si pone false eso quiere decir que el balance a sido negativo");
        System.out.println("Cuando se dice primer mes, segundo mes....Nos estamos refiriendo a los meses del año, es decir el primer mes corresponde a Enero, el segundo mes corresponde a febrero y asi consecutivamente");
        
        int[] ingresosPorMes={15000, 16000, 10000, 9000, 12000, 13000, 7000, 6000, 11000, 13000, 14000, 15000};
        int[] gastosPorMes={8000, 9000, 11000, 10000, 12000, 10000, 9000, 8000, 9000, 9000, 12000,14000};
        
        boolean balance1= ingresosPorMes[0] >= gastosPorMes[0];
        System.out.println("¿Cómo a sido el balance en el primer mes? "+balance1);
        
         boolean balance2= ingresosPorMes[1] >= gastosPorMes[1];
        System.out.println("¿Cómo a sido el balance en el segundo mes? "+balance2);
        
         boolean balance3= ingresosPorMes[2] >= gastosPorMes[2];
        System.out.println("¿Cómo a sido el balance en el tercer mes? "+balance3);
        
         boolean balance4= ingresosPorMes[3] >= gastosPorMes[3];
        System.out.println("¿Cómo a sido el balance en el cuarto mes? "+balance4);
        
         boolean balance5= ingresosPorMes[4] >= gastosPorMes[4];
        System.out.println("¿Cómo a sido el balance en el quinto mes? "+balance5+" (en este caso el balance es neutral ni se  gana ni se pierde)");
        
         boolean balance6= ingresosPorMes[5] >= gastosPorMes[5];
        System.out.println("¿Cómo a sido el balance en el sexto mes? "+balance6);
        
         boolean balance7= ingresosPorMes[6] >= gastosPorMes[6];
        System.out.println("¿Cómo a sido el balance en el septimo mes? "+balance7);
        
         boolean balance8= ingresosPorMes[7] >= gastosPorMes[7];
        System.out.println("¿Cómo a sido el balance en el octavo mes? "+balance8);
        
         boolean balance9= ingresosPorMes[8] >= gastosPorMes[8];
        System.out.println("¿Cómo a sido el balance en el noveno mes? "+balance9);
        
         boolean balance10= ingresosPorMes[9] >= gastosPorMes[9];
        System.out.println("¿Cómo a sido el balance en el decimo mes? "+balance10);
        
         boolean balance11= ingresosPorMes[10] >= gastosPorMes[10];
        System.out.println("¿Cómo a sido el balance en el onceavo mes? "+balance11);
        
         boolean balance12= ingresosPorMes[11] >= gastosPorMes[11];
        System.out.println("¿Cómo a sido el balance en el doceavo mes? "+balance12);
        
        // Apartado b) del ejercicio 36
        
        double mediaIngresos = (ingresosPorMes[0]+ingresosPorMes[1]+ingresosPorMes[2]+ingresosPorMes[3]+ingresosPorMes[4]+ingresosPorMes[5]+ingresosPorMes[6]+ingresosPorMes[7]+ingresosPorMes[8]+ingresosPorMes[9]+ingresosPorMes[10]+ingresosPorMes[11])/12;
        System.out.println("La media de ingresos es de "+mediaIngresos);
        
        double mediaGastos = (gastosPorMes[0]+gastosPorMes[1]+gastosPorMes[2]+gastosPorMes[3]+gastosPorMes[4]+gastosPorMes[5]+gastosPorMes[6]+gastosPorMes[7]+gastosPorMes[8]+gastosPorMes[9]+gastosPorMes[10]+gastosPorMes[11])/12;
        System.out.println("La media de ingresos es de "+mediaGastos);
        
        // Apartado c) del ejercicio 36
        
        System.out.println("Si el programa pone true eso quiere decir que el balance a sido positivo o neutral (De todos modos cuando sea neutral se aclarara con una nota), mientas que si pone false eso quiere decir que el balance a sido negativo");

        
        boolean balanceFinal = mediaIngresos >= mediaGastos;
        System.out.println("¿Cómo a sido el balance final? "+balanceFinal);
    }   
}
