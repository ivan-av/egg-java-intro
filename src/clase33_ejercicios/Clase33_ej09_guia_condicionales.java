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
public class Clase33_ej09_guia_condicionales {

    /**
     * @param args the command line arguments
     */
    
    /*
    Escriba un programa que pida una frase o palabra y valide si la primera 
    letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de 
    imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
    se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y 
    equals() de Java.
    */
    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        String phrase;
        
        System.out.println("Ingresa una palabra o frase");
        phrase = sc.nextLine();
        
        if(phrase.substring(0,1).toUpperCase().equals("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
