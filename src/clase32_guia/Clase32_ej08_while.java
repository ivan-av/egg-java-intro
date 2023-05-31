/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase32_guia;

import java.util.Scanner;

/**
 *
 * @author ivanav
 */
public class Clase32_ej08_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa tu calificación");
        nota = sc.nextInt();
        
        while(nota < 0 || nota > 10){
            System.out.println("Ingresa un valor válido");
            nota = sc.nextInt();
        }
        
        System.out.println("Tu calificación fue de: " + nota);
    }
}
