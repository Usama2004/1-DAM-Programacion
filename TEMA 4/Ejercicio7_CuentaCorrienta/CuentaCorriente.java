package daw.persona;
import java.util.Random;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class CuentaCorriente {
    
    private int numero;
    private double saldo;
    
    public CuentaCorriente(){
    
        Random r = new Random();
        numero = r.nextInt(0, 1000);
        saldo = 0;
    
    }
    
    public CuentaCorriente(int num){
    
        numero = num;
        saldo = 0;
    
    }
    
    public CuentaCorriente(int num, double sld){
    
        numero = num;
        saldo = sld;
    
    }
    
    public double getSaldo(){
    
        return saldo;
        
    }
    
    public void añadirDinero(int cantidad){
    
        saldo = saldo + cantidad;
    
    }
    
    public void retirarDinero(int cantidad){
    
        saldo = saldo - cantidad;
    
    }
    
    public String toString(){
    
        String aux = "Tu numero de cuenta es "+numero+" y saldo actual es "
                + ""+saldo;
        return aux;
    
    }
    
    
}
