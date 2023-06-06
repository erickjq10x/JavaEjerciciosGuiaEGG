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
public class Ejercicio11 {
    /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
    pantalla el siguiente menú:
    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
    pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
    opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
    programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
    seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
    del programa, caso contrario se vuelve a mostrar el menú.*/
    public static void main(String[] args) {
        Scanner getNumber1 = new Scanner(System.in), getNumber2 = new Scanner(System.in), getOption = new Scanner(System.in);
        int number1, number2, option , result;
        String confirm;
        System.out.println("Ingrese dos numeros para que le aparesca el menu:");
        number1 = getNumber1.nextInt();
        number2 = getNumber2.nextInt();
        do {
            System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nElegir opcion");
            option = getOption.nextInt();
            switch (option) {
                case 1:
                    result = number1 + number2;
                    System.out.println("La suma es: "+result);
                    break;
                case 2:
                    result = number1 - number2;
                    System.out.println("La resta es: "+result);
                    break;
                case 3:
                    result = number1 * number2;
                    System.out.println("La multiplicacion es: "+result);
                    break;
                case 4:
                    result = number1 / number2;
                    System.out.println("La division es:"+result);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confirm = getOption.next();
                    if(confirm.equalsIgnoreCase("s")){
                        option = 5;
                    }else{
                        option = 1;
                        break;
                    }
                    break;
                default:
                    System.out.println("Opcion elegida no valida");
                    break;
            }
        } while (option!=5);
        
    }
    
}
