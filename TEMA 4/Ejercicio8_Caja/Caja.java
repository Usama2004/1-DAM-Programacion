package daw.objeto;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Caja {
    
    private boolean abierta;
    private String mensaje;
    
    
    public Caja(){
        
        String men;
        men = "Viva el tema 7";
        
        abierta = false;
        mensaje = men;
    
    };
    
    public Caja(String m){
    
        mensaje = m;
        abierta = false;
    
    };
    
    public Caja(boolean on_off, String m){
    
        abierta = on_off;
        mensaje = m;
    
    };
    
    public String getMensaje(){
    
        return mensaje;
    
    }
    
    public boolean getEstado(){
    
        return abierta;
    
    }
    
    // Inicio del Ejercicio 8
    
    public void setMensaje(String m){
        
        if(abierta){
        
            mensaje = m;
        
        }else{
        
            mensaje = null;
        
        }
    
    }
    
    public void pasarMasculas(){
    
        mensaje.toUpperCase();
    
    }
    
    // Fin del ejercicio 8
    
    public String toString(){
    
        String aux;
        if(abierta)
            aux = "La caja esta abierta";
        else
            aux = "La caja esta cerrada";
        
        aux += " y Viva el Tema 7";
        return aux;
    
    };
    
    
}
