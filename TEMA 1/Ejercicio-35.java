package com.mycompany.ejercicio35;

/**
 *
 * @author oussama
 */
public class Ejercicio35 {

    public static void main(String[] args) {
        
        // Este es el apartado a) del 35
        
        System.out.println("Si el programa pone true eso quiere decir que el balance a sido positivo o neutral, mientas que si pone false eso quiere decir que el balance a sido negativo");
        
        int ingresosEnero=15000;
        int gastosEnero=8000;
        
        boolean balance1= ingresosEnero >= gastosEnero;
        
       System.out.println("¿Cómo a sido el balance en enero? "+balance1);
       
        int ingresosFebrero=16000;
        int gastosFebrero=9000;
        
        boolean balance2= ingresosFebrero >= gastosFebrero;
        
       System.out.println("¿Cómo a sido el balance en febrero? "+balance2);
       
              
        int ingresosMarzo=10000;
        int gastosMarzo=11000;
        
        boolean balance3= ingresosMarzo >= gastosMarzo;
        
       System.out.println("¿Cómo a sido el balance en marzo? "+balance3);
       
              
        int ingresosAbril=9000;
        int gastosAbril=10000;
        
        boolean balance4= ingresosAbril >= gastosAbril;
        
       System.out.println("¿Cómo a sido el balance en abril? "+balance4);
       
              
        int ingresosMayo=12000;
        int gastosMayo=12000;
        
        boolean balance5= ingresosMayo >= gastosMayo;
        
       System.out.println("¿Cómo a sido el balance en mayo? "+balance5);
       
                     
        int ingresosJunio=13000;
        int gastosJunio=10000;
        
        boolean balance6= ingresosJunio >= gastosJunio;
        
       System.out.println("¿Cómo a sido el balance en junio? "+balance6);
       
                     
        int ingresosJulio=7000;
        int gastosJulio=9000;
        
        boolean balance7= ingresosJulio >= gastosJulio;
        
       System.out.println("¿Cómo a sido el balance en julio? "+balance7);
       
        int ingresosAgosto=6000;
        int gastosAgosto=8000;
        
        boolean balance8= ingresosAgosto >= gastosAgosto;
        
       System.out.println("¿Cómo a sido el balance en agosto? "+balance8);
       
        int ingresosSeptiembre=11000;
        int gastosSeptiembre=9000;
        
        boolean balance9= ingresosSeptiembre >= gastosSeptiembre;
        
       System.out.println("¿Cómo a sido el balance en septiembre? "+balance9);
       
        int ingresosOctubre=13000;
        int gastosOctubre=9000;
        
        boolean balance10= ingresosOctubre >= gastosOctubre;
        
       System.out.println("¿Cómo a sido el balance en octubre? "+balance10);
       
        int ingresosNoviembre=14000;
        int gastosNoviembre=12000;
        
        boolean balance11= ingresosNoviembre >= gastosNoviembre;
        
       System.out.println("¿Cómo a sido el balance en noviembre? "+balance11);
       
        int ingresosDiciembre=15000;
        int gastosDiciembre=14000;
        
        boolean balance12= ingresosDiciembre >= gastosDiciembre;
        
       System.out.println("¿Cómo a sido el balance en diciembre? "+balance12);
       
       // Este es el apartado b) del ejercicio 35
       
       double mediaIngresos = (ingresosEnero+ingresosFebrero+ingresosMarzo+ingresosAbril+ingresosMayo+ingresosJunio+ingresosJulio+ingresosAgosto+ingresosSeptiembre+ingresosOctubre+ingresosSeptiembre+ingresosOctubre+ingresosNoviembre+ingresosDiciembre)/12;
       
       System.out.println("La media de los ingresos es de "+mediaIngresos);
       
        double mediaGastos = (gastosEnero+gastosFebrero+gastosMarzo+gastosAbril+gastosMayo+gastosJunio+gastosJulio+gastosAgosto+gastosSeptiembre+gastosOctubre+gastosSeptiembre+gastosOctubre+gastosNoviembre+gastosDiciembre)/12;
       
        System.out.println("La media de los gastos es de "+mediaGastos);
        
        // Este es el apartado c) del ejercicio 35
        
        System.out.println("Si el programa pone true eso quiere decir que el balance a sido positivo o neutral, mientas que si pone false eso quiere decir que el balance a sido negativo");
        
        boolean balanceFinal = mediaIngresos >= mediaGastos;
        
        System.out.println("¿Cómo a sido el balance final? "+balanceFinal);
    }
}
