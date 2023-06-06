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
public class Ejercicio16 {

    /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
    al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido*/
    public static void main(String[] args) {
        Scanner getN = new Scanner(System.in);
        int n, numeroBuscado, repetidas=0;
        System.out.println("Indicar el tamaño del vector:");
        n = getN.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("Ingrese el numero que desee buscar:");
        numeroBuscado = getN.nextInt();
        System.out.println("El numero fue encontrado en la poscicion: ");
        for (int i = 0; i < n; i++) {
            if (vector[i]==numeroBuscado) {
                System.out.println(i);
                repetidas++;
            }
        }
        System.out.println("El numero se repitio: "+repetidas);
    }
    
}
