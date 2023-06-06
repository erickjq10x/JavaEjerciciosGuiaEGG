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
public class Ejercicio17 {

    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).*/
    public static void main(String[] args) {
        Scanner getN = new Scanner(System.in);
        int n;
        System.out.println("Indicar el tamaño del vector:");
        n = getN.nextInt();
        int[] vector = new int[n];
        llenarVector(vector, n);
        contarDigitos(vector, n);
    }
    public static void llenarVector(int[] esVector, int esN){
        for (int i = 0; i < esN; i++) {
            esVector[i] = (int) (Math.random() * 1000);
        }
    }
    public static void contarDigitos(int[] esVector, int esN){
        int counter1=0, counter2=0, counter3=0, counter4=0, counter5=0;
        String aux;
        for (int i = 0; i < esN; i++) {
            aux=String.valueOf(esVector[i]);
            switch (aux.length()) {
                case 1:
                    counter1++;
                    break;
                case 2:
                    counter2++;
                    break;
                case 3:
                    counter3++;
                    break;
                case 4:
                    counter4++;
                    break;
                case 5:
                    counter5++;
                    break;
            }
        }
        System.out.println("Numeros de un digito: "+counter1+"\nNuemros de dos digitos: "+counter2+"\nNuemros de tres digitos: "+counter3+"\nNuemros de cuatro digitos: "+counter4+"\nNuemros de cinco digitos: "+counter5);
    }
}
