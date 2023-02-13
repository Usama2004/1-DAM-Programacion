package daw.oficina;
import java.util.ArrayList;
import daw.persona.Persona;
import daw.persona.dni;
import java.time.LocalDate;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Oficina {
    
    private String nombre;
    private ArrayList<Persona> trabajadores = new ArrayList();
    
    public Oficina(String n){
    
        nombre = n;
    
    }
    
    public Oficina(String n, int tipo){
    
        nombre = n;
        
            dni id1 = new dni("11111111H");
            LocalDate fn1 = LocalDate.of(2000,2,28);
            Persona p1 = new Persona("Antonio Perez Perez", id1, 900, fn1);
            
            dni id2 = new dni("22222222J");
            LocalDate fn2 = LocalDate.of(1995,9,10);
            Persona p2 = new Persona("Luis Luis Lopez", id2, 1000, fn2);
            
            dni id3 = new dni("33333333P");
            LocalDate fn3 = LocalDate.of(1985,5,21);
            Persona p3 = new Persona("Antonio Perez Perez", id3, 900, fn3);
            
        if(tipo==0 || tipo>3){
            
            trabajadores = null;
            
        }
        else if(tipo==1){
            
            trabajadores.add(p1);
            
        }
        else if(tipo==2){
        
            trabajadores.add(p1);
            trabajadores.add(p2);
        
        }
        else if(tipo==3){
        
            trabajadores.add(p1);
            trabajadores.add(p2);
            trabajadores.add(p3);
        
        }
    
    }
    
    public Oficina(){
        
            dni id1 = new dni("11111111H");
            LocalDate fn1 = LocalDate.of(2000,2,28);
            Persona p1 = new Persona("Antonio Perez Perez", id1, 900, fn1);
            
            dni id2 = new dni("22222222J");
            LocalDate fn2 = LocalDate.of(1995,9,10);
            Persona p2 = new Persona("Luis Luis Lopez", id2, 1000, fn2);
            
            dni id3 = new dni("33333333P");
            LocalDate fn3 = LocalDate.of(1985,5,21);
            Persona p3 = new Persona("Antonio Perez Perez", id3, 900, fn3);
    
            nombre = "Industrias DAW";
        
            trabajadores.add(p1);
            trabajadores.add(p2);
            trabajadores.add(p3);
    
    }
    
}
