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
public class Ejercicio19 {

    /*
     Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
    una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
    de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
//        int[][] matriz = {{0,-2,4,0},{2,0,2,0},{-4,-2,0,0},{0,0,0,0}};
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
        traspuesta(matriz);
        if (antiSimetrica(matriz)) {
            System.out.println("Es una matriz Anti simetrica.");
        }
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
    public static boolean antiSimetrica(int[][] esMatriz){
        int counter=0;
        boolean esAT= false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                esAT = esMatriz[i][j]==-(esMatriz[j][i]) || -(esMatriz[i][j])==esMatriz[j][i];
                if (esAT == false) {
                    counter++;
                }
            }
        }
        if (counter==0) {
            return esAT;
        }else{
            return false;
        }
    }
}
