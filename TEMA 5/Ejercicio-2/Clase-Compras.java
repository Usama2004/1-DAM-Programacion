package ejercicio_2;
import java.util.List;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Compras {
    
    private double presupuesto;
    private List<Double> precios;
    
    public Compras(double presupuesto){
    
        this.presupuesto = presupuesto;
    
    }
    
    //SETTERS
    
    public void registrarCompra(double dinero) throws Exception{
        
        if(this.presupuesto - dinero >= 0){
            
            precios.add(dinero);
            this.presupuesto -= dinero;
        
        }else{
        
            Exception e = new Exception("No hay presupuesto\nTe hace "
                    + "falta "+Math.abs(this.presupuesto-dinero));
            throw e;
            
        }
    
    }
    
    //GETTERS
    
    public String toString(){
    
         int i = 1;
        
        String aux = "Presupuesto Actual: "+this.presupuesto+"\n"
                +"Compras realizadas: \n";    
        
        for(double precio : precios){
            
            aux +="Articulo: "+i+" Precio: "+precio+"\n";
            i++;
        }     
        return aux;
    } 
    
}
