package examen_t2_3_ejercicio1;
import bpc.daw.objetos.*;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Examen_T2_3_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcadorBaloncesto mb = new MarcadorBaloncesto("Local Squad",
                "Squad Visitante");
        System.out.println("Marcador automatico entre los equipos, local:"
                + mb.getNombreLocal()+"; visitante: "+mb.getNombreVisitante());
        System.out.println("Pulse la tecla 'P' para visualizar el "
                + "marcador actual");
        System.out.println("Pulse la tecla 'S' para visualizar el marcador "
                + "final y terminar el partido");
        System.out.println("Marque la canasta de la forma: ");
        System.out.println("1) Indique el equipo anotador: pulsa la letra L "
                + "(local) o V (visitante) + INTRO");
        System.out.println("2) Marque la puntuacion anotada por dicho equipo: "
                + "(entero 1,2 o 3) + INTRO");
        System.out.println("Las letras se pueden escribir tanto en mayuscula "
                + "como en minuscula");
        
        boolean repetir = true;
        while(repetir){
            
            System.out.println("Indique el equipo anotador (L|V), "
                    + "S(salir), P(puntos actuales): ");
            char respuesta = new Scanner(System.in).next().charAt(0);
            
            if(respuesta=='L' || respuesta=='l'){
                
                System.out.println("Indica la puntuacion: ");
                int punt = new Scanner(System.in).nextInt();
                if(punt==1){
                    mb.anotarCanasta('L', 1);
                }else if (punt==2){
                    mb.anotarCanasta('L', 2);
                }else if (punt==3){
                    mb.anotarCanasta('L', 3);
                }else{
                    System.out.println("El numero que has introducido no"
                            + " es correcto");
                }
            }else if(respuesta=='V' || respuesta=='v'){
                System.out.println("Indica la puntuacion: ");
                int punt = new Scanner(System.in).nextInt();
                if(punt==1){
                    mb.anotarCanasta('V', 1);
                }else if (punt==2){
                    mb.anotarCanasta('V', 2);
                }else if (punt==3){
                    mb.anotarCanasta('V', 3);
                }else{
                    System.out.println("El numero que has introducido no"
                            + " es correcto");
                }
            }else if(respuesta=='P' || respuesta=='p'){
                System.out.println(mb.toString());
                System.out.println("En este momento, va ganando el equipo "
                        + "e: "+mb.getNombreEquipoGanador());
            }else if(respuesta=='S' || respuesta=='s'){
                System.out.println("Has pulsado salir del marcador.");
                System.out.println("Fin del partido, marcad"
                        + "or final: "+mb.toString());
                repetir = false;
            }
        }
       
    }

}
