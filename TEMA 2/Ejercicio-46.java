package ejercicio46;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numero = (int) (0 + (10 - 0)*Math.random());
        int num_mil = numero * 1000;
        Instant i1 = Instant.ofEpochMilli(0);
        try{
            Thread.sleep(num_mil);
        }catch(InterruptedException x){
            System.out.println(x.getMessage());
         
        }
        Instant i2 = Instant.ofEpochMilli(num_mil);
        Duration d1 = Duration.between(i1, i2);
        System.out.println("El programa a estado pausado durante "+d1.getSeconds()+
                " segundos");
    }
        
        
    }
