/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase33_guia;

import java.util.Scanner;

/**
 *
 * @author ivanav
 */
public class Clase33_ej10_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa un número");
            num = sc.nextInt();
            
            while(num < 1 || num > 20){
                System.out.println("Ingresa un número entre 1 y 20");
                num = sc.nextInt();
            }
            
            System.out.print(num + " ");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
