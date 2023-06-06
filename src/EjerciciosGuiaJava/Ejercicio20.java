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
public class Ejercicio20 {

    /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
    suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
    permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
    El programa deberá comprobar que los números introducidos son correctos, es decir,
    están entre el 1 y el 9. */
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Posicion " + i + " " + j + ":");
                    matriz[i][j] = getNumber.nextInt();
                    if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                        System.out.println("El numero debe estar entre 1 y 9");
                        matriz[i][j] = getNumber.nextInt();
                    }
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
        mostrarMatriz(matriz);
        if (esMagico(matriz)) {
            System.out.println("Es un cuadrado magico");
        }
    }

    public static void mostrarMatriz(int[][] esMatriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + esMatriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean esMagico(int[][] esMatriz) {
        int aux = 0;
        boolean magico = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux += esMatriz[i][j];
                if (j == 2 && aux == 15) {
                    aux = 0;
                } else if (j == 2 && aux != 15) {
                    return magico;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux += esMatriz[j][i];
                if (j == 2 && aux == 15) {
                    aux = 0;
                } else if (j == 2 && aux != 15) {
                    return magico;
                }
            }
        }
        aux = esMatriz[0][0] + esMatriz[1][1] + esMatriz[2][2];
        magico = aux == 15;
        return magico;
    }
}
