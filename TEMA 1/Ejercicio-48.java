package com.mycompany.ejercicio48;

/**
 *
 * @author oussama
 */
public class EJercicio48 {

    public static void main(String[] args) {
        
        int año=2100;
        
        if(año%400 == 0){
            
            System.out.println("El "+año+" es bisiesto");
            
        }else if((año%400 != 0) && (año%4 == 0) && (año%100 != 0)){
            System.out.println("El "+año+" es binifiesto");
        }else{
            System.out.println("EL "+año+" no es bisiesto");
        }
        
    }
}
