package ejercicio44;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate LD = LocalDate.now();
        
        DateTimeFormatter DTF1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println("La fecha actual es "+LD.format(DTF1));
        
        DateTimeFormatter DTF2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println("La fecha actual es "+LD.format(DTF2));
        System.out.println("");
        System.out.println("--Otro metodo--");
        System.out.println("");
        System.out.println(LD.getDayOfMonth() + "/" + LD.getMonthValue() + "/" + LD.getYear());
        System.out.println(LD.getDayOfMonth() + "-" + LD.getMonthValue() + "-" + LD.getYear());
    }

}
