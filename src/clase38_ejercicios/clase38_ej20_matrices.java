/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase38_ejercicios;

import java.util.Scanner;

/**
 *
 * @author ivanav
 */
public class clase38_ej20_matrices {

    /**
     * @param args the command line arguments
     */
    
    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
    */
    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Ingreso del cuadrado por teclado
        System.out.println("Ingresa los números del cuadrado mágico (1 al 9)");
        for (int i = 0; i < 3; i++) {
            System.out.println("Números de la fila " + (i+1) + " :");
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = scanner.nextInt();
            }
        }
        
        // Comprobar si los números son correctos (1 al 9)
        boolean numerosCorrectos = true;
        boolean[] numerosRepetidos = new boolean[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int numero = cuadrado[i][j];
                if (numero < 1 || numero > 9 || numerosRepetidos[numero]) {
                    numerosCorrectos = false;
                    break;
                }
                numerosRepetidos[numero] = true;
            }
        }
        
        if (!numerosCorrectos) {
            System.out.println("Los números ingresados no son correctos.");
        } else {
            // Comprobar si es un cuadrado mágico
            int sumaObjetivo = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
            
            System.out.println(" ");
            System.out.println("Impresión de cuadro");
            for (int i = 0; i < cuadrado.length; i++) {
                for (int j = 0; j < cuadrado.length; j++) {
                    System.out.print(cuadrado[i][j] + " ");
                }
                System.out.println("");
            }
            
            System.out.println(" ");
            
            // Comprobar filas
            boolean esCuadradoMagico = true;
            for (int i = 0; i < 3; i++) {
                int sumaFila = 0;
                for (int j = 0; j < 3; j++) {
                    sumaFila += cuadrado[i][j];
                }
                if (sumaFila != sumaObjetivo) {
                    esCuadradoMagico = false;
                    break;
                }
            }

            // Comprobar columnas
            if (esCuadradoMagico) {
                for (int j = 0; j < 3; j++) {
                    int sumaColumna = 0;
                    for (int i = 0; i < 3; i++) {
                        sumaColumna += cuadrado[i][j];
                    }
                    if (sumaColumna != sumaObjetivo) {
                        esCuadradoMagico = false;
                        break;
                    }
                }
            }

            // Comprobar diagonales
            if (esCuadradoMagico) {
                int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
                int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
                if (sumaDiagonal1 != sumaObjetivo || sumaDiagonal2 != sumaObjetivo) {
                    esCuadradoMagico = false;
                }
            }

            // Imprimir resultado
            if (esCuadradoMagico) {
                System.out.println("El cuadrado ingresado es un cuadrado mágico.");
            } else {
                System.out.println("El cuadrado ingresado no es un cuadrado mágico.");
            }
        }
    }
    
}
