package ejemplo.s.c;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class EjemploSC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce el numero de aciertos: ");
        int acertadas = new Scanner(System.in).nextInt(); 
        
        if(acertadas <= 10){
            switch(acertadas){
            case 0:
                int recompensa=0;
                System.out.println("Tu recompensa es de 0 puntos");
                break;
            case 1:
                recompensa=5;
                System.out.println("Tu recompensa es de 5 puntos");
                break;
            case 2:
                recompensa=10;
                System.out.println("Tu recompensa es de 10 puntos");
                break;
            case 3:
                recompensa=15;
                System.out.println("Tu recompensa es de 15 puntos");
                break;
            case 4:
                recompensa=20;
                System.out.println("Tu recompensa es de 20 puntos");
                break;
            case 5:
                recompensa=25;
                System.out.println("Tu recompensa es de 25 puntos");
                break;
            case 6:
                recompensa=30;
                System.out.println("Tu recompensa es de 30 puntos");
                break;
            case 7:
                recompensa=40;
                System.out.println("Tu recompensa es de 40 puntos");
                break;
            case 8:
                recompensa=50;
                System.out.println("Tu recompensa es de 50 puntos");
                break;
            case 9:
                recompensa=60;
                System.out.println("Tu recompensa es de 60 puntos");
                break;
            case 10:
                recompensa=100;
                System.out.println("Tu recompensa es de 100 puntos");
                break;
        }
        }else{
            System.out.println("El numero de preguntas acertadas que has puesto superan las establecidas en el juego");
        }

       
    }

}
