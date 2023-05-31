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
public class Clase33_Ej_Guia_4 {
    /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
    grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        double temperature;
        
        System.out.println("Ingresa la temperatura en °C");
        temperature = sc.nextDouble();
        
        System.out.println("La temperatura en °F es: " + (32 + (9 * temperature /5 )));
             
    }
}
