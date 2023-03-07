package ejercicio45;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.of(2100, 2, 28);
        DayOfWeek dow = ld.getDayOfWeek();
        System.out.println(dow);
        
        
       
    }

}
