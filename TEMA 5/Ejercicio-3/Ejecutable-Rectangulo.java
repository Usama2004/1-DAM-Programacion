package ejercicio_03;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(5,5);
        
        r1.setBase(6);
        r1.setAltura(6);
        
        System.out.println("La base es de "+r1.getBase());
        System.out.println("La altura es de "+r1.getAltura()+"\n");
        
        System.out.println("El resultado del area es "+r1.getArea());
       
    }

}
