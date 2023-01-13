package ejercicio3_t3;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio3_t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean repetir = true;
        
        while(repetir){
        
            int num = (int) (0 + (11 - 0)*Math.random());
            System.out.println(num);
            
            if(num==10){
                repetir = false;
            }
        
        }
       
    }

}
