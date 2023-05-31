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
public class Clase31_ej05_correccionerrores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        System.out.println("Tu edad es " + edad);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        System.out.println("Tu nombre es " + nombre);
    }
    
}
    
