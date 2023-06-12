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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lecturasBien = 0;
        int lecturasMal = 0;
        boolean fin = false;

        while (!fin){
            System.out.println("Ingrese una palabra: ");
            String palabra = scanner.nextLine();
            palabra = palabra.toUpperCase();

            if (palabra.equals("&&&&&")) {
                fin = true;
            } else if (palabra.length() == 5 && palabra.charAt(0) == 'X' && palabra.charAt(4) == '4') {
                lecturasBien++;
            } else {
                lecturasMal++;
            }
        }

        System.out.println("Reporte: ");
        System.out.println("Lecturas Correctas: " + lecturasBien);
        System.out.println("Lecturas Incorrectas: " + lecturasMal);
    }
    
}
