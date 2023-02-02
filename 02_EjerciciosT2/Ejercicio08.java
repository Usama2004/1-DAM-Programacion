package ejercicio08_t2;
import bpc.daw.objetos.DepositoAgua;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio08_T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DepositoAgua da1 = new DepositoAgua(15,20);
        System.out.println("Deposito 1 antes de las modificacioenes");
        da1.dibujar();
        da1.retirarLitro();
        da1.retirarLitro();
        da1.retirarLitro();
        da1.retirarLitro();
        da1.retirarLitro();
        System.out.println("Deposito 1 despues de las de las modificacioenes");
        da1.dibujar();
        DepositoAgua da2 = new DepositoAgua(5,20);
        System.out.println("Deposito 2 antes de las modificacioenes");
        da2.dibujar();
        da2.añadirLitro();
        da2.añadirLitro();
        da2.añadirLitro();
        da2.añadirLitro();
        da2.añadirLitro();
        System.out.println("Deposito 2 despues de las modificacioenes");
        da2.dibujar();
        
    }
    
}
