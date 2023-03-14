package ejercicio_5;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Edificio {
    
        private String direccion;
        private int numPlantas;
        
        public Edificio(String d, int p) throws IllegalArgumentException{
        
            this.direccion = d;
            if(p >= 0){
            
                this.numPlantas = p;
            
            }else{
            
                IllegalArgumentException e = new IllegalArgumentException("No"
                + "se admiten numeros negativos");
                throw e;
                    
            }
        
        }
        
        public String getDireccion(){
        
            return this.direccion;
        
        }
        
        public int getNumPlantas(){
        
            return this.numPlantas;
            
        }
    
}
