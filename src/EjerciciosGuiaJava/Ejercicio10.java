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
public class Ejercicio10 {

    /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
    solicite números al usuario hasta que la suma de los números introducidos supere el
    límite inicial.*/
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in), getAux = new Scanner(System.in);
        int number, counter=0, aux;
        System.out.println("Ingrese un numero positivo:");
        number = getNumber.nextInt();
        do{
            System.out.println("Ingrese un numeros para superar al inicial::");
            aux = getAux.nextInt();
            counter += aux;
        }while(counter<=number);
    }
    
}
