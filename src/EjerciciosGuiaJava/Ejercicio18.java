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
public class Ejercicio18 {

    /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
    obtiene cambiando sus filas por columnas (o viceversa).*/
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
        traspuesta(matriz);
    }
    public static void llenarMatriz(int[][] esMatriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                esMatriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public static void mostrarMatriz(int[][] esMatriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+esMatriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void traspuesta(int[][] esMatriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+esMatriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
