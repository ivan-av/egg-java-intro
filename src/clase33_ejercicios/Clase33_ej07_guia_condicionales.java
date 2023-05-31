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
public class Clase33_ej07_guia_condicionales {

    /**
     * @param args the command line arguments
     */
    
    /*
    Crear un programa que pida una frase y si esa frase es igual a “eureka” 
    el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
    Incorrecto. Nota: investigar la función equals() en Java.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;
        
        System.out.println("Escribe una frase");
        phrase = sc.nextLine();
        
        if (phrase.toLowerCase().equals("eureka")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
     
    }
    
}
