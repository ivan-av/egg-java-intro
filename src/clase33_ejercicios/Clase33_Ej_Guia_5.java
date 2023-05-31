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
public class Clase33_Ej_Guia_5 {
    
    /*
    Escribir un programa que lea un número entero por teclado y muestre por 
    pantalla el doble, el triple y la raíz cuadrada de ese número. 
    Nota: investigar la función Math.sqrt().
    */
    
        public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.println("Ingresa un número");
        number = sc.nextInt();
        
        System.out.println("El doble de " + number + " es: " + number*2);
        System.out.println("El triple de " + number + " es: " + number*3);
        System.out.println("La raíz cuadrada de " + number + " es: " + Math.sqrt(number));
             
    }
}
