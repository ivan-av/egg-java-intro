/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase37_ejercicios;

import java.util.Scanner;

/**
 *
 * @author ivanav
 */
public class Clase37_ej16_vectores_matrices {

    /**
     * @param args the command line arguments
     */
    
            /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
        */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numberToSearch;
        int matrixSize;
        
        System.out.println("Bienvenido, ingresa el tamaño del vector");
        matrixSize = sc.nextInt();
        
        int[] randomMatrix = new int[matrixSize];
        
        for(int i = 0; i < randomMatrix.length; i++){
            int randomNumber = (int)(Math.random()*10);
            randomMatrix[i] = randomNumber;
        }
        
        System.out.println("¿Qué número deseas buscar en el vector?");
        numberToSearch = sc.nextInt();
        
        int counter = 0;
        for(int i = 0; i < randomMatrix.length; i++){
            if(randomMatrix[i] == numberToSearch){
                System.out.println("El número " + numberToSearch+  ", se encontró en la posición: " + i);
                counter++;
            } 
        }
        
        if(counter > 0){
            System.out.println("Se encontró el número " + numberToSearch + " un total de: " + counter + " veces");
        } else {
            System.out.println("No se encontró el número solicitado");
        }
        
    }
    
}
