package ejercicio_03;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Rectangulo {
    
    private int base;
    private int altura;
    private int area;
    
    public Rectangulo(int base, int altura){
    
        this.base = base;
        this.altura = altura;
    
    }
    
    public void setBase(int base){
    
        this.base = base;
    
    }
    
    public void setAltura(int altura){
    
        this.altura = altura;
    
    }
    
    public int getBase(){
    
        return this.base;
    
    }
    
    public int getAltura(){
    
        return this.altura;
    
    }
    
    public int getArea(){
    
        int aux = this.base * this.altura;
        return aux;
        
    }
}
