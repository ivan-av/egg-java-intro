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
public class Clase33_ej10_guia_bucles {

    /**
     * @param args the command line arguments
     */
    
    /*
    Escriba un programa en el cual se ingrese un valor límite positivo, 
    y a continuación solicite números al usuario hasta que la suma de los números 
    introducidos supere el límite inicial.
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maxLimit, number, sumNumbers;
        sumNumbers = 0;
        
        do{
            System.out.println("Ingresa un valor límite positivo");
            maxLimit = sc.nextInt();
        }while(maxLimit < 1);
        
        while(!(sumNumbers > maxLimit)){
            System.out.println("Ingresa un número");
            number = sc.nextInt();
            sumNumbers += number;
            System.out.println("Hasta ahora la suma es: " + sumNumbers);
        }
        
        System.out.println("La suma total es: " + sumNumbers);
        
    }
    
}
