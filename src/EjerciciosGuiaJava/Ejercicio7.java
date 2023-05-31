/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaJava;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner getPhrase = new Scanner(System.in);
        String phrase, realPhrase="eureka";
        System.out.println("Ingrese la palabra correcta:");
        phrase=getPhrase.next();
        if(realPhrase.equals(phrase)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
