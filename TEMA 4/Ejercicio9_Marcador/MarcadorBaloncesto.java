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
    
    public int getPuntos(char equipo){
        
        int aux = 0;
    
        if(equipo == 'L' || equipo == 'l'){
        
                aux = PuntosLocal;
        
        }else if(equipo == 'V' || equipo == 'v'){
        
                aux = PuntosVisitante;
        
        }
        
        return aux;
    
    }
    
    // Inicio del Ejercicio 9
    
    public void añadirCanasta(char equipo, int puntos){
    
        if(puntos == 1 || puntos == 2 || puntos == 3){
        
            if(equipo == 'L' || equipo == 'l'){
        
                PuntosLocal += puntos;
        
            }else if(equipo == 'V' || equipo == 'v'){
        
                PuntosVisitante += puntos;
        
            }
        
        }else{
        
            System.out.println("El numero que has introducido no es valido");
        
        }
        
    }
    
    public void reset(){
    
        PuntosLocal = 0;
        PuntosVisitante = 0;
    
    }
    
    // Fin del Ejercicio 9
    
    public String toString(){
    
        String aux;
        aux = nombreLocal+" VS "+nombreVisitante;
        return aux;
    
    };
    
    
    
}
