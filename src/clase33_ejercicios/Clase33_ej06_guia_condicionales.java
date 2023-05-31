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
public class Clase33_ej06_guia_condicionales {

    /**
     * @param args the command line arguments
     */
    
    /*
    Crear un programa que dado un numero determine si es par o impar
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.println("Ingresa un número");
        number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("El número " + number + " es PAR" );
        } else {
            System.out.println("El número " + number + " es IMPAR" );
        }
             
    }
    
}
