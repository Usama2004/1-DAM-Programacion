package daw.persona;
import java.time.LocalDate;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Persona {
    
    private String nombre;
    private dni id;
    private double sueldo;
    private LocalDate fechaNacimiento;
    
    
    public Persona(String n, dni d, double s, LocalDate fn){
    
        nombre = n;
        id = d;
        sueldo = s;
        fechaNacimiento = fn;
    
    }
    
    public Persona(String n, int numDni, char letraDni, double s, LocalDate fn){
    
        nombre = n;
        id= new dni(numDni, letraDni);
        sueldo = s;
        fechaNacimiento = fn;
    
    }
    
    public Persona(String n, dni d){
    
        nombre = n;
        id = d;
    
    }
    
    public Persona(String n, int numDni, char letraDni){
    
        nombre = n;
        id = new dni(numDni, letraDni);
    
    }
    
    public String getNombre(){
    
        return nombre;
    
    }
    
    public dni getDni(){
    
        return id;
    
    }
    
    public int getNum(){
    
        return id.getNum();
    
    }
    
    public char getLetter(){
    
        return id.getLetter();
    
    }
    
    public double getSueldo(){
    
        return this.sueldo;
    
    }
    
    public LocalDate getFechaNac(){
    
        return this.fechaNacimiento;
    
    }
    
    public void setSueldo(double s){
        
        this.sueldo = s;
    
    }
    
}
