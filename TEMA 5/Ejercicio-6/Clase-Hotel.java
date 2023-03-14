package ejercicio_5;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Hotel extends Edificio{
    
    private List<String> clientes;
    private int maximo;
    
    public Hotel(String d, int np, int m) throws IllegalArgumentException{
    
        super(d, np);
        if(m >= 0){
            
            this.maximo = m;
            
        }else{
            
            IllegalArgumentException e = new IllegalArgumentException("No"
            + "se admiten numeros negativos");
            throw e;
                    
        }
    
    }
    
    public void añadirCliente(String c)throws IllegalStateException{
    
        if(clientes.size() < this.maximo){
        
            clientes.add(c);
        
        }else{
        
            throw new IllegalStateException("No se admiten más clientes");
        
        } 
        
    
    }
    
    public void retirarCliente(String c) throws NoSuchElementException{
    
        if(clientes.contains(c)){
        
            clientes.remove(c);
        
        }else{
        
            throw new NoSuchElementException("No se encontro este elemento");
        
        }
    
    }
    
}
