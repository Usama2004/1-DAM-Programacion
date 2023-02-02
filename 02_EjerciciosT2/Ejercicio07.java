package ejercicio07_t2;
import bpc.daw.objetos.DepositoAgua;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio07_T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DepositoAgua da1 = new DepositoAgua(15,50);
        da1.dibujar();
        
        /* Porcentaje de ocupación del depósito
        50------100%
        15------X
        */
        
        double porcentaje = 15*100/50;
        System.out.println("El deposito esta ocupado un "+porcentaje+"%");
    }
    
}
