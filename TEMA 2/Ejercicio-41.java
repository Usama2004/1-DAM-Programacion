package ejercicio41;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double base = 0.38*4.93;
        double exp = -0.36;
        double specific_value = Math.pow(base, exp);
        System.out.println("El resultado sin redondear es "+specific_value);
        System.out.println("El resultado redondeado "
                + "es "+Math.round(specific_value));
       
    }

}
