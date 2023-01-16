package ejercicio8_t3;

import java.util.*;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio8_t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Usa la clase StringTokenizer para hacer un programa que pregunte al usuario
         "Escriba una frase" y nos muestre en una línea diferente cada palabra de la frase y además, el
        número total de palabras encontradas. */
        
        int num=0;
        
        System.out.println("Escribe una frase: ");
        String frase = new Scanner(System.in).nextLine();

        StringTokenizer separador = new StringTokenizer(frase, " ");

        while (separador.hasMoreTokens()) {

            System.out.println("Separador: " + separador.nextToken());
            num++;
        }
        
        System.out.println("El numero de palabras de la frase es "+num);

    }

}
