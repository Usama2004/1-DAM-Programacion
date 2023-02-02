package act_2_tema2;
import bpc.daw.mario.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class ACT_2_TEMA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     //Apartado a)
     
     Mario m1, m2 = null;
     m1 = new Mario(100,0);
     m2 = new Mario(640,320);
     
     //Apartado b)
     
     Seta s1 = null;
     s1 = new Seta(0,0);
     
     //Apartado c)
     
     Cañon c1 = null;
     c1 = new Cañon(100,320);
     
     //Apartado d)
     
     Planta p1, p2, p3 = null;
     
     p1 = new Planta(400,500);
     p2 = new Planta(450,500);
     p3 = new Planta(500,500);
     
     //Apartado e)
     
     Luigi l1 = null;
     Mario m1_1 = null;
     
     l1 = new Luigi(200,0);
     m1_1 = new Mario(250,0);
       
    }
    
}
