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
public class Ejercicio6 {

    /*Crear un programa que dado un numero determine si es par o impar.*/
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero para saber si es par o impar");
        number=getNumber.nextInt();
        if(number%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}
