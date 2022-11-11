package practica03;
import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Practica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introduce la palabra, para qur se traduzca al latin: ");
        String p1 = new Scanner(System.in).nextLine();
        
        char[] vocal = {'a','b','c','e','i','u'};

        char ult = p1.charAt(p1.length());
        System.out.println("La ultima letra es "+ult);
               
        if{(ult=='a'||ult=='A'||ult=='b||ult=='B'||ult=='c'||ult=='C'||ult=='e'||ult=='E'||ult=='i'||ult=='I' || ult=='u' || ult=='U')
                
                p1.substring(ult);
                String p2 = p1.concat("us");
                System.out.println("TRADUCCION: "+p2);
        
        }else{
        
                String p3 = p1.concat("us");
                System.out.println("TRADUCCION: "+p3);
        }
        }
        
    }
    

