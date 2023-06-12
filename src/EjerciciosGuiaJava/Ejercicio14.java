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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valor;
        System.out.println("Ingrese el monto en euros a convertir: ");
        valor = scanner.nextFloat();
        System.out.println("Ingrese (1) para convertirlo a Dólares, (2) a Libras, (3) a Yenes");
        int opcion = scanner.nextInt();

        Convertir(valor, opcion);
    }

    public static void Convertir(float a, int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("La conversión a dólares es: " + (a * 1.28611) + " USD");
                break;
            case 2:
                System.out.println("La conversión a libras es: " + (a * 0.86) + " L");
                break;
            case 3:
                System.out.println("La conversion a yenes es: " + (a * 129.852) + " Y");
                break;
            default:
                System.out.println("Opción No Válida");
                break;
        }
    }

}
