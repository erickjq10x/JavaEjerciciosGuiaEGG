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
public class Ejercicio1 {

    /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma*/
    public static void main(String[] args) {
        Scanner getNum1 = new Scanner(System.in), getNum2 = new Scanner(System.in);
        int number1, number2;
        System.out.println("Ingrese el primer numero:");
        number1 = getNum1.nextInt();
        System.out.println("Ingrese el segundo numero:");
        number2 = getNum2.nextInt();
        System.out.println(sum(number1,number2));
        
        
    }
    public static int sum(int esNum1, int esNum2){
        return esNum1+esNum2;
    }
}
