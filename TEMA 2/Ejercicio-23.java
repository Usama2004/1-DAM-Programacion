package ejercicio23;
import bpc.daw.objetos.TarjetaCredito;
import java.util.Scanner;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TarjetaCredito tc = new TarjetaCredito(1000,2222);
        System.out.println("Introduce tu numero secreto: ");
        int password = new Scanner(System.in).nextInt();
       
        if(password == 2222){
            try{
                int saldo1 = tc.getSaldo(password);
                System.out.println("Tu saldo es de "+saldo1+" euros");
            }catch (Exception s1){
                System.out.println("ERROR: "+s1.getMessage());
            }
            tc.ingresarDinero(100);
            System.out.println("Has ingresado 100 euros");
            try{
                int saldo2 = tc.getSaldo(password);
                System.out.println("Ahora tu saldo es de "+saldo2+" euros");
            }catch (Exception s2){
                System.out.println("ERROR: "+s2.getMessage());
            }
            try{
                boolean sacar = tc.sacarDinero(2800, password);
                if(sacar == true){
                    System.out.println("Se puede sacar esta cantidad de dinero");
                }else{
                    System.out.println("No se puede sacar esta cantidad, ya que no tienes suficiente saldo");
                }
            }catch (Exception retirar){
                System.out.println("ERROR: "+retirar.getMessage());
            }
        }else{
            System.out.println("El numero secreto que has introducido no "
                    + "es correcto, por lo que no puedes hacer ninguna transaccion");
        }
    }

}
