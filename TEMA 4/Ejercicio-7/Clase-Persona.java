package daw.persona;
import daw.persona.dni;
import java.time.LocalDate;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Persona {
    
    private String nombre;
    private dni dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    
    
    public Persona(String n, dni d, double s, LocalDate fn){
    
        nombre = n;
        dni = d;
        sueldo = s;
        fechaNacimiento = fn;
    
    };
    
    public Persona(String n, int numDni, char letraDni, double s, LocalDate fn){
    
        nombre = n;
        dni id= new dni(numDni, letraDni);
        sueldo = s;
        fechaNacimiento = fn;
    
    };
    
    public Persona(String n, dni d){
    
        nombre = n;
        dni = d;
    
    };
    
    public Persona(String n, int numDni, char letraDni){
    
        nombre = n;
        dni id = new dni(numDni, letraDni);
    
    };
    
    public String getNombre(){
    
        return nombre;
    
    };
    
    public dni getDni(){
    
        return dni;
    
    };
    
    public double getSueldo(){
    
        return sueldo;
    
    };
    
    public LocalDate getFechaNac(){
    
        return fechaNacimiento;
    
    };

    public String setSueldo(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
