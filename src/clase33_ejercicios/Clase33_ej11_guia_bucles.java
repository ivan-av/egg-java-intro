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
public class Clase33_ej11_guia_bucles {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un programa que pida dos números enteros positivos por teclado y 
    muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
    
El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
    por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que 
    se elija la opción 5. Tener en cuenta que, si el usuario selecciona la 
    opción 5, en vez de salir del programa directamente, se debe mostrar el 
    siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa 
    (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
    contrario se vuelve a mostrar el menú.
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuIndex;
        double firstNumber, secondNumber;
        char confirmEnd;
        boolean endMenu;
        menuIndex = 0;
        endMenu = false;
        
        System.out.println("Ingresa un primer número");
        firstNumber = sc.nextDouble();
        
        System.out.println("Ingresa un segundo número");
        secondNumber = sc.nextDouble();
        
        while(!endMenu){
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opción:");
            
            menuIndex = sc.nextInt();
            
            switch(menuIndex){
                case 1:
                    System.out.println("Suma: " + (firstNumber + secondNumber));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Restar: " + (firstNumber - secondNumber));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Multiplicar: " + (firstNumber * secondNumber));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Dividir: " + (firstNumber / secondNumber));
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                    confirmEnd = sc.next().charAt(0);
                    System.out.println("");
                    if(confirmEnd == 'S' || confirmEnd == 's') {
                        endMenu = true;
                    } 
                    break;
                default:
                System.out.println("Opción no válida");
                break;
            }
        };
    }
    
}
