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
public class Clase33_ej12_procedimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber;
        
        System.out.println("Ingrese un número entero");
        firstNumber = sc.nextInt();
        System.out.println("Ingrese un segundo entero");
        secondNumber = sc.nextInt();
        System.out.println("");
        
        esMultiplo(firstNumber, secondNumber);
        
    }
    
    public static void esMultiplo (int number1, int number2){
        if(number1 % number2 == 0) {
            System.out.println(number1 + " ES MÚLTIPLO de " + number2);
        } else {
            System.out.println(number1 + " NO es múltiplo de " + number2);
        }
    }
    
}
