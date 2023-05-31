/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase31_guia;

import java.util.Scanner;

/**
 *
 * @author ivanav
 */
public class Clase31_ej05_leerescribir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean logico;
        double real;
        char cadena;
        
        System.out.println("Ingresa true o false (booleano)");
        logico = read.nextBoolean();
        System.out.println("El valor que ingresaste fue: " + logico);
        
        System.out.println("Ingresa un número real (ej: 1.0, 1.5, etc)");
        real = read.nextDouble();
        System.out.println("El número que ingresaste fue: " + real);
        
        System.out.println("Ingresa un caracter (ej: a, b, etc.)");
        cadena = read.next().charAt(0);
        System.out.println("El caracter que ingresaste fue: " + cadena);
    }
    
    
}
