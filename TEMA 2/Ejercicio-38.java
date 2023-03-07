package ejercicio_38;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio_38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Haz un programa que calcule las dos soluciones "
                + "de la ecuacion x2 - 5x + 6");
       
       int a=1, b=-5, c=6;
       
       double raiz = Math.sqrt(Math.pow(b, 2) - 4*a*c);
            
       double resul_suma = (-b + raiz)/(2*a); // x1
       double resul_resta = (-b - raiz)/(2*a); // x2
       
        System.out.println("El resultado de x1 es "+resul_suma);
        System.out.println("El resultado de x2 es "+resul_resta);
    }

}
