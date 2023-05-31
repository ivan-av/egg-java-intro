/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase33_ejercicios;

import java.util.Scanner;

/**
 *
 * @author ivanav
 */
public class Clase33_ej13_guia_bucles {

    /**
     * @param args the command line arguments
     */
    
    /*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        
        System.out.println("Ingresa un número");
        number = sc.nextInt();
        System.out.println("El número de asteriscos serán: " + number);
        
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ( (i != 0 && i != number-1) && (j != 0 && j != number-1) ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
