package ejercicio_7;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class TrabajadorTecleante extends Trabajador{
    
    private int pulsacionesMinuto;
    protected Teclado teclado;
    
    public TrabajadorTecleante(String n, int s, int nDNI, char lDNI, int ppm){
    
        super(n,s,nDNI,lDNI);
        this.pulsacionesMinuto = ppm;   
    
    }
    
    public void setTeclado(Teclado t){
    
        this.teclado = t;
    
    } 
    
    public Teclado getTeclado(){
    
        return this.teclado;
    
    }
    
    public int getPPM(){
    
        return this.pulsacionesMinuto;
    
    }
    
}
