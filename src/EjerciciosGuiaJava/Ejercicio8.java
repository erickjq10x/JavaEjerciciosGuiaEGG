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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner getPhrase = new Scanner(System.in);
        String phrase;
        System.out.println("Ingrese una palabra de 8 caracteres:");
        phrase=getPhrase.next();
        if(phrase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
