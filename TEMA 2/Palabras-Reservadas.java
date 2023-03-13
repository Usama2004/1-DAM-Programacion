package palabras_reservadas;
import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Palabras_Reservadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("======================================================");
        System.out.println("======================================================");
        System.out.println("========        RESERVED WORDS IN JAVA       =========");
        System.out.println("======================================================");
        System.out.println("======================================================");
        System.out.println("");
        System.out.println("========  REGLAS DEL JUEGO  ========");
        System.out.println("");
        System.out.println("- Hay 59 palabras reservadas en Java, por lo que en el juego tienes 59 intentos para escribir\n todas las palabras, es decir no tienes margen de error");
        System.out.println("- No se pueden repetir las palabras");
        System.out.println("- Todo se debe escribir en minuscula");
        System.out.println("");
        
        for(int i=1;i<=59;i++){
            
            System.out.println("Introduce la palabra reservada: ");
            String palabra = new Scanner(System.in).nextLine();
            
            if(palabra.equals("boolean") || palabra.equals("byte") || palabra.equals("char") || palabra.equals("short") || palabra.equals("int") || palabra.equals("long") || palabra.equals("float") || palabra.equals("double") || palabra.equals("void") || palabra.equals("false") || palabra.equals("null") || palabra.equals("true") || palabra.equals("abstract") || palabra.equals("final") || palabra.equals("native") || palabra.equals("private") || palabra.equals("protected") || palabra.equals("public") || palabra.equals("static") || palabra.equals("synchronized") || palabra.equals("transient") || palabra.equals("volatile") || palabra.equals("break") || palabra.equals("case") || palabra.equals("catch") || palabra.equals("continue") || palabra.equals("default") || palabra.equals("do") || palabra.equals("else") || palabra.equals("finally") || palabra.equals("for") || palabra.equals("if") || palabra.equals("return") || palabra.equals("switch") || palabra.equals("throw") || palabra.equals("try") || palabra.equals("while") || palabra.equals("class") || palabra.equals("extends") || palabra.equals("implements") || palabra.equals("interface") || palabra.equals("throws") || palabra.equals("import") || palabra.equals("package") || palabra.equals("instanceof") || palabra.equals("new") || palabra.equals("super") || palabra.equals("this") || palabra.equals("byvalue") || palabra.equals("cast") || palabra.equals("const") || palabra.equals("future") || palabra.equals("generic") || palabra.equals("goto") || palabra.equals("inner") || palabra.equals("operator") || palabra.equals("outer") || palabra.equals("rest") || palabra.equals("var")){
                System.out.println(palabra);
            }else{
                System.out.println(palabra+" no es una palabra reservada");
            }
            
            
        }  
        System.out.println("");
         System.out.println("Te animas a repetirlo otra vez??");
            
    }

}
