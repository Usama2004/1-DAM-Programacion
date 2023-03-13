package com.mycompany.ejercicio31;
import java.util.*;
/**
 *
 * @author oussama
 */
public class Ejercicio31 {

    public static void main(String[] args) {
        
        final int HORAS_LM=128;
        final int HORAS_REDES=192;
        final int HORAS_HARDWARE=96;
        
        // Apartado a) del ejercicio 31
        
        int horas_faltadas1 = (HORAS_LM * 20)/100;
        int horas_faltadas2 = (HORAS_REDES * 20)/100;
        int horas_faltadas3 = (HORAS_HARDWARE * 20)/100;
        
        System.out.println("Para no perder el derecho a la evaluación continua en LM no se debe tener más de "+horas_faltadas1+" faltas");
        System.out.println("Para no perder el derecho a la evaluación continua en Redes no se debe tener más de "+horas_faltadas2+" faltas");
        System.out.println("Para no perder el derecho a la evaluación continua en Hardware no se debe tener más de "+horas_faltadas3+" faltas");
        
        // Apartado b) del ejercicio 31
        
        System.out.println("¿Cuántas faltas tienes en Redes?: ");
        int redes=new Scanner(System.in).nextInt();
        
        boolean EvaluacionCont = redes <= horas_faltadas2 && redes < 192;
        
       System.out.println("¿El alumno tiene derecho a la evaluación continua? "+EvaluacionCont); 
    }
}
