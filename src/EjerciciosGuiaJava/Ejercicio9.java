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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner getPhrase = new Scanner(System.in);
        String phrase, trueValue = "A";
        System.out.println("Ingrese una frase:");
        phrase = getPhrase.next();
        if(trueValue.equals(phrase.substring(0, 1))){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
