package daw.persona;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class dni {
    
    private int numero;
    private char letra;
    
    public dni(int n, char l){
        
        numero = n;
        letra = l;
    
    };
    
   public dni(String dni){
   
       numero = Integer.parseInt(dni.substring(0, 7));
       letra = dni.charAt(8);
              
   };
   
   public int getNum(){
   
       return numero;
   
   };
   
   public char getLetter(){
   
       return letra;
   
   };
    
}
