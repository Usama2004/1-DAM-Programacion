package com.mycompany.post_examen1_11;

/**
 *
 * @author oussama
 */
public class Post_examen1_11 {

    public static void main(String[] args) {
        int anio=2100;
        
        if(anio%400==0){
        System.out.println("El año es bisiesto");
        }else if(anio%400!=0 && anio%4==0 && anio%100!=0){
        System.out.println("El año es bisiesto");
        }else{
        System.out.println("El año no es bisiesto");
        } 
    }
}
