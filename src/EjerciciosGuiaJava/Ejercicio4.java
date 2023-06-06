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
public class Ejercicio4 {

    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    public static void main(String[] args) {
        Scanner getTemperature = new Scanner(System.in);
        float temperature;
        System.out.println("Ingrese la temperatura actual en grados Centigrados:");
        temperature = getTemperature.nextInt();
        System.out.println("En Fahrenheit son: "+toFahrenheit(temperature));
    }
    public static float toFahrenheit(float esTemperature){
        return 32+(9*esTemperature/5);
    }
}
