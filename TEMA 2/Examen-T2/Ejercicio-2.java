package examen_t2_3_ejercicio2;
import bpc.daw.objetos.*;
import java.util.*;
/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Examen_T2_3_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TarjetaCredito tc = new TarjetaCredito(100, 91222);
        int contrasenia = 0;
        boolean repetir = true;
        
        while(repetir){
            
            System.out.println("Introduce la contrasenia de tu tarjeta de credito: ");
            contrasenia = new Scanner(System.in).nextInt();
            
                
            if(contrasenia == 91222){
                
                
                System.out.println("Has marcado la contrasenia: 91222");
                System.out.println("Contrasenia aceptada con saldo inicial: 100");
                
            
                try{
                    
                    System.out.println("Tarjeta leida con saldo "+tc.getSaldo(contrasenia));
                    
                }catch(Exception x){
                    
                    System.out.println(x.getMessage());
                    
                }
            
                System.out.println("Indique la operacion a realizar: Ingresar(I), Retirar(R), Terminar(T), Saldo actual(S)");
                char respuesta = new Scanner(System.in).next().charAt(0);
                
                
                if(respuesta == 'I' || respuesta == 'i'){
                    
                    System.out.println("Cuanto dinero quieres ingresar");
                    double ingresar = new Scanner(System.in).nextDouble();
                    
                    System.out.println("Se han ingresado "+tc.ingresarDinero(ingresar" euros");
                    
                }else if(respuesta == 'R' || respuesta == 'r'){
                    
                    System.out.println("Cuanto dinero quieres retirar");
                    int retirar = new Scanner(System.in).nextInt();
                    
                    try{
                        
                        tc.sacarDinero(retirar, contrasenia);
                        
                    }catch(Exception x){
                        
                        System.out.println(x.getMessage());
                        
                    }
                    
                }else if(respuesta == 'S' || respuesta == 's'){
                    
                    System.out.println(tc.getSaldo(contrasenia));
                    
                }else if(respuesta == 'T' || respuesta == 't'){
                    
                    repetir = false;
                    System.out.println("Fin del programa");
                    
                }
        }else{
                
           for(int i=0; i<3 && contrasenia != 91222; i++){
               
                System.out.println("Introduce la contrasenia de tu tarje"
                + "ta de credito: ");
                contrasenia = new Scanner(System.in).nextInt();
                repetir = false;
            } 
        }
        }
        }
    }


