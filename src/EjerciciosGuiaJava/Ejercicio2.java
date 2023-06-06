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
public class Ejercicio2 {

    /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
    pantalla.*/
    public static void main(String[] args) {
        Scanner getName = new Scanner(System.in);
        String name;
        System.out.println("Ingrese su nombre:");
        name = getName.next();
        System.out.println("Su nombre es "+name);
    }
    
}
