package ejercicio_7;
import java.time.LocalDateTime;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Administrativo extends TrabajadorTecleante{
    
    public Administrativo(String n, int s, int nDNI, char lDNI, int ppm){
    
        super(n, s, nDNI, lDNI, ppm);
    
    }
    
    public void escribirInforme(String t){
    
        LocalDateTime date = LocalDateTime.now();
        String informe = date.toString(); 
    
    }
    
}
