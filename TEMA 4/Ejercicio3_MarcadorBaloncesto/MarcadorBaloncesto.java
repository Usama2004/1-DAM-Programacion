package daw.marcador;
import java.time.LocalDate;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class MarcadorBaloncesto {
    
    private String nombreLocal;
    private String nombreVisitante;
    private int PuntosLocal;
    private int PuntosVisitante;
    private LocalDate fecha;
    
    
    public String toString(){
    
        String aux;
        aux = nombreLocal+" VS "+nombreVisitante;
        return aux;
    
    };
    
    public MarcadorBaloncesto(String nLocal, String nVisitante){
    
        nombreLocal = nLocal;
        nombreVisitante = nVisitante;
        PuntosLocal = 0;
        PuntosVisitante = 0;
        fecha = LocalDate.now();
    
    };
    
    public MarcadorBaloncesto(String nLocal, String nVisitante, LocalDate date){
    
        nombreLocal = nLocal;
        nombreVisitante = nVisitante;
        PuntosLocal = 0;
        PuntosVisitante = 0;
        fecha = date;
    
    };
    
    public MarcadorBaloncesto(String nLocal, int pLocal, String nVisitante, int pVisitante, LocalDate date){
    
        nombreLocal = nLocal;
        nombreVisitante = nVisitante;
        PuntosLocal = pLocal;
        PuntosVisitante = pVisitante;
        fecha = date;
    
    };
    
    
    //GETTERS
    
    
    
}
