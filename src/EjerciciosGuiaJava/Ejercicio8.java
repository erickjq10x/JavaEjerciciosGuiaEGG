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
public class Ejercicio8 {

    /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
    el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
    por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
    “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/
    public static void main(String[] args) {
        Scanner getPhrase = new Scanner(System.in);
        String phrase;
        System.out.println("Ingrese una palabra de 8 caracteres:");
        phrase=getPhrase.next();
        if(phrase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
