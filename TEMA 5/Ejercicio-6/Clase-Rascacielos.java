package ejercicio_5;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Rascacielos extends Edificio{
    
    private int altura;
    
    
    public Rascacielos(String d, int np, int a) throws IllegalArgumentException{
    
        super(d, np);
        if(a >= 0){
            
            this.altura = a;
            
        }else{
            
            IllegalArgumentException e = new IllegalArgumentException("No"
            + "se admiten numeros negativos");
            throw e;
                    
        }
    
    }
    
    public int getAltura(){
        
        int aux = 10 + (3 * this.getNumPlantas());
        return aux;
    
    }
    
}
