/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase34_guia;

import java.util.Scanner;

/**
 *
 * @author ivanav
 */
public class Clase34_ej14_vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String[] students = new String[9];
        
        for (int i = 0; i < 9; i++) {
            System.out.println("Ingresa el nombre del compañero de equipo: ");
            students[i] = sc.nextLine();
        }
        
        System.out.println("(For) El equipo está conformado por: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(students[i]);        
        }
        
        System.out.println("(For mejorado) El equipo está conformado por: ");
        for(String student: students){
            System.out.println(student);
        }
    }
    
}
