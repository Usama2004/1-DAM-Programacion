package ejercicio2_caja;
import daw.objeto.Caja;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio2_Caja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caja c1 = new Caja();
        Caja c2 = new Caja("Hola Mundo");
        Caja c3 = new Caja(true, "Hola Mundo");
        
        System.out.println("Contructor 3: "+c3.toString());
       
    }

}
