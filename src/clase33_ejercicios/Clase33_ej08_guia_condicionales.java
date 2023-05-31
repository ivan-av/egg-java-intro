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
public class Clase33_ej08_guia_condicionales {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un programa que solo permita introducir solo frases o palabras de 
    8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se 
    deberá de imprimir un mensaje por alla que diga “CORRECTO”, en caso 
    contrario, se deberá imprimir “INCORRECTO”. 
    Nota: investigar la función Lenght() en Java.
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;
        
        System.out.println("Escribe una frase");
        phrase = sc.nextLine();
        
        if(phrase.length() == 8){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }
    
}
