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
public class Ejercicio13 {

    /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * * */
    public static void main(String[] args) {
        Scanner getN = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamanio del cuadrado:");
        n=getN.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n-2; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j==0  || j==(n-1) ) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    
}
