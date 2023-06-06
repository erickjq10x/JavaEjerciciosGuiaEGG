/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuiaJava;

/**
 *
 * @author erick
 */
public class Ejercicio15 {

    /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.*/
    public static void main(String[] args) {
        int[] array = new int[100];
        
        for (int i = 1; i <101; i++) {
            array[i-1] = i;
        }
        System.out.println(array[1]);
        for (int j = 1; j < 101; j++) {
            System.out.println(array[100-j]);
        }
    }
    
}
