package ejercicio_7;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Trabajador {
    
    private String dni;
    private String nombre;
    protected int sueldo;
    
    public Trabajador(String nombre, int sueldo, int numDNI, char letraDNI){
    
        this.nombre = nombre;
        this.sueldo = sueldo;
        numDNI = Integer.parseInt(dni.substring(0, 7));
        letraDNI = dni.charAt(8);
    
    }
    
    public int getSueldo(){
    
        return this.sueldo;
    
    }
    
    public String getNombre(){
    
        return this.nombre;
    
    }
    
    public String getDNI(){
    
        return this.dni;
    
    }
    
    
}
