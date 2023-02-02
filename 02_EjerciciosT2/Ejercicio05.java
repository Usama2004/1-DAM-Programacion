package ejercicio5_tema2;
import bpc.daw.mario.Cañon;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio5_Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cañon c1, c2;
        
        c1 = new Cañon(500,500);
        c1.disparar(700, 500);
        c1.disparar(800, 500);
        int disparo1 = c1.getTotalDisparosRealizados();
        c2 = new Cañon(500,600);
        c2.disparar(700, 600);
        c2.disparar(800, 600);
        c2.disparar(900, 600);
        int disparo2 = c2.getTotalDisparosRealizados();
        
        System.out.println("El canion 1 ha disparado "+disparo1+" balas");
        System.out.println("El canion 1 ha disparado "+disparo2+" balas");
        
    }
    
}
