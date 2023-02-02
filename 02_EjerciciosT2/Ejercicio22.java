package ejercicio22;
import bpc.daw.objetos.TarjetaCredito;
import java.util.Scanner;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TarjetaCredito tc = new TarjetaCredito(5000,1111);
        
        try{
            
            System.out.println("Introduce tu contrasenia: ");
             int contr = new Scanner(System.in).nextInt();
             int saldo = tc.getSaldo(contr);
             boolean retirar = tc.sacarDinero(2000, contr);
             int saldo2 = tc.getSaldo(contr);
            System.out.println("Tu saldo es de "+saldo+" euros");
            System.out.println("Has retirado 2000 euros");
            System.out.println("Ahora tu saldo es de "+saldo2+" euros");
            
        }catch(Exception e){
        
            System.out.println(e.getMessage());
            
        }
        
        
    }
    
}
