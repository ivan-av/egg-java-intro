/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase33_ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ivanav
 */
public class Clase33_Ej_Guia_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 1
        /*
        Escribir un programa que pida dos números enteros por teclado y calcule 
        la suma de los dos. El programa deberá después mostrar el resultado de 
        la suma
        */
//        Scanner sc = new Scanner(System.in);
//        int firstNumber, secondNumber;
//        
//        System.out.println("Ingrese un número entero");
//        firstNumber = sc.nextInt();
//        System.out.println("Ingrese un segundo entero");
//        secondNumber = sc.nextInt();
//        
//        System.out.println("La suma de " + firstNumber + " y " + secondNumber + " es: " + (firstNumber+secondNumber));
        
        
        //Ejercicio 2
        /*
        Escribir un programa que pida tu nombre, lo guarde en una variable y lo 
        muestre por pantalla.
        */
        
//        Scanner sc = new Scanner(System.in);
//        String name;
//        
//        System.out.println("Escribe tu nombre");
//        name = sc.nextLine();
//        
//        System.out.println("Tu nombre es: " + name);

//        Ejercicio 3
        /*
        Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        */
        
        Scanner sc = new Scanner(System.in);
        String phrase;
        
        System.out.println("Escribe una frase");
        phrase = sc.nextLine();
        
        System.out.println("La frase en mayúsculas es: " + phrase.toUpperCase());
        System.out.println("La frase en minúsculas es: " + phrase.toLowerCase());
        
    }
    
}
