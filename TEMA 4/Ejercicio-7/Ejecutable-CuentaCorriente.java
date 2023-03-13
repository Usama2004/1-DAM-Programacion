package ejercicio7_cuentacorriente;
import daw.persona.CuentaCorriente;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio7_CuentaCorriente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CuentaCorriente cc1 = new CuentaCorriente();
        CuentaCorriente cc2 = new CuentaCorriente(2222,2000);
        
        cc2.añadirDinero(200);
        
        System.out.println(cc1);
        
    }

}
