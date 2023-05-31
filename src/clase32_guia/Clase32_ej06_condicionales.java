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
public class Clase32_ej06_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int refValue = 25;
 
        
        System.out.println("Ingresa un número entero");
        int firstValue = sc.nextInt();
        System.out.println("El valor que ingresaste fue: " + firstValue);
        
        System.out.println("Ingresa un segundo número entero");
        int secondValue = sc.nextInt();
        System.out.println("El valor que ingresaste fue: " + secondValue);
        
        System.out.println("¿Alguno de los dos es mayor a 25?");
        
        if(firstValue > refValue && secondValue > refValue) {
            System.out.println("Ambos valores son mayores a 25");
        } else if (firstValue > refValue || secondValue > refValue) {
            System.out.println("Uno de los valores es mayor a 25");
        } else {
            System.out.println("Ninguno de los valores es mayor a 25    ");
        }

    }
    
}
