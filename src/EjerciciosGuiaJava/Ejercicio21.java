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
public class Ejercicio21 {

    /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
    que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
    menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
    columna de la matriz M en la cual empieza el primer elemento de la submatriz P. */
    public static void main(String[] args) {
        int[][] mD = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] mT = {{36, 5, 67},
        {89, 90, 75},
        {14, 22, 26}};
        mostrarMatriz(mD);
        mostrarMatriz(mT);
        hayMatrizDentro(mD, mT);
    }

    public static void mostrarMatriz(int[][] esMatriz) {
        int tamanio;
        tamanio = esMatriz.length;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(" " + esMatriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void hayMatrizDentro(int[][] esMD, int[][] esMT) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (existeMatriz(esMD, esMT, i, j)) {
                    System.out.println("la matriz pequenia esta dentro de la matri grande en la fila: " + i + " y la columna: " + j);
                }
            }
        }
    }

    public static boolean existeMatriz(int[][] esMD, int[][] esMT, int esI, int esJ) {
        int contador = 0, contador2 = 0;
        for (int i = esI; i < esI + 3; i++) {
            contador = i == 0 ? 0 : contador+1;
            for (int j = esJ; j < esJ + 3; j++) {
                contador2 = contador2 == 2 ? 0 : contador2;
                if (esMD[i][j] != esMT[contador][contador2]) {
                    System.out.println(esMT[contador][contador2] + " " + esMD[i][j]);
                    return false;
                }
                contador2++;
            }
        }
        return true;
    }
}
