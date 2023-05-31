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
public class Clase33_ej09_do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number, counter, sum;
        Scanner sc = new Scanner(System.in);
        counter = 0;
        sum = 0;
        
        do{
            System.out.println("Ingresa un número");
            number = sc.nextInt();
            if(number == 0){
                System.out.println("Se encontró el número cero");
                break;
            }
            
            if(number > 0){
                sum += number; 
            }
            
            System.out.println("Hasta ahora la suma es: " + sum); 
            counter++;
        } while (counter < 20);
        
        System.out.println("La suma total fue: " + sum);   
    }
    
}
