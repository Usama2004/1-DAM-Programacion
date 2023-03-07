package ejercicio40;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Runtime runtime = Runtime.getRuntime();
       
        System.out.println("El numero de procesadores del ordenador "
                + "es "+runtime.availableProcessors());
        
        System.out.println("La cantidad de memoria total asociada al "
                + "proceso de Java por el SO es de "+runtime.totalMemory());
    }

}
