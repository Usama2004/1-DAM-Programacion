package ejercicio_7;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Programador extends TrabajadorTecleante{
    
    private Map<String, String> lenguajes;
    
    public Programador(String n, int s, int nDNI, char lDNI, int ppm){
    
        super(n,s,nDNI,lDNI,ppm);
        this.lenguajes = new HashMap<String, String>();
        
    }
    
    public void aprenderLenguaje(String lenguaje, String HolaMundo){
    
        this.lenguajes.put(lenguaje, HolaMundo);
    
    }
    public String progrmarHolaMundo(String lenguaje) throws IllegalStateException{
    
        if(this.lenguajes.containsKey(lenguaje)){
        
            return this.lenguajes.get(lenguaje);
        
        }else{
        
            throw new IllegalStateException("El lenguaje no se halla en la lista");
        
        }
        
    }
    
}
