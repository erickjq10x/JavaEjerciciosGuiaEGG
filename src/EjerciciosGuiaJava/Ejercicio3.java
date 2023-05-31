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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner getPhrase = new Scanner(System.in);
        String phrase;
        System.out.println("Ingrese una frase:");
        phrase = getPhrase.nextLine();
        System.out.println("En mayusculas la frase queda asi: "+upperPhrase(phrase)+"\nEn minusculas la frase queda asi: "+lowerPhrase(phrase));
    }
    
    public static String upperPhrase(String esPhrase){
        return esPhrase.toUpperCase();
    }
    
    public static String lowerPhrase(String esPhrase){
        return esPhrase.toLowerCase();
    }
}
