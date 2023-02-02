package act.pkg3_tema.pkg2;
import bpc.daw.mario.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Act3_Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                
        //Apartado a)
        
        Seta s1 = new Seta(340,680);
        s1.andarHacia(0, 0);
        
        //Apartado b)
        
        Mario m1 = new Mario(300,300);
        m1.saltar();
        
        //Apartado c)
        
        Cañon c1 = new Cañon(500, 300);
        c1.disparar(300, 300);
        
        //Apartado d)
        
        Planta p1 = new Planta(100, 100);
        p1.comer(true);
        
        Planta p2 = new Planta(150, 100);
        p2.comer(true);
        
        Planta p3 = new Planta(200, 100);
        p3.comer(true);

        
    }
    
}
