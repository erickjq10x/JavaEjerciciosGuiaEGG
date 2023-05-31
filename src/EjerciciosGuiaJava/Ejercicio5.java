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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero entero:");
        number=getNumber.nextInt() ;
        System.out.println("El doble del numero ingresado es: "+number*2+"\nEl triple del numero ingresado es: "+number*3+"\nLa raiz cuadrada del numero ingresado es:"+Math.sqrt(number));        
    }
    
}
