package Package_Cafeteria;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Cafeteria {
    
    private int capacidadMaxima;
    private int capacidadActual; 
    
    //MÉTODOS
    //Por Defecto
    public Cafeteria(){
    
        capacidadMaxima = 1000;
        capacidadActual = 0;
    
    };
    
    //Con Parametros
    
    public Cafeteria(int max){
    
        capacidadMaxima = max;
        capacidadActual = max;
    
    };
    
    public Cafeteria(int max, int actual){
    
        capacidadMaxima = max;
        capacidadActual = actual;
        if(capacidadActual>capacidadMaxima){
        
            capacidadActual = max;
        
        }
    
    };
    
    //GETTERS
    public int getMax(){
    
        return capacidadMaxima;
    
    };
    
    public int getActual(){
    
        return capacidadActual;
    
    };
    
    //SETTERS
    
    public void setCapActual(int actual){
    
        capacidadActual = actual;
    
    };
    
    public void llenarCafetera(){
    
        capacidadActual = capacidadMaxima;
    
    };
    
    public void servirTaza(int servir){
        
        if(capacidadActual<servir){
        
            servir = capacidadActual;
            
            
        }else{
        
            capacidadActual = capacidadActual - servir;
        
        }
        
    
    };
    
    public void vaciarCafetera(){
    
        capacidadActual = 0;
    
    };
    
    public int agregarCafe(int aniadir){
    
        capacidadActual = capacidadActual + aniadir;
        return aniadir;
    
    };
    
}
