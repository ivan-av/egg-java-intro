/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase37_ejercicios;

/**
 *
 * @author ivanav
 */
public class Clase37_ej15_vectores_matrices {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
    */
    
    public static void main(String[] args) {
       int[] matrix = new int[100];
       
       for(int i = 0 ; i < matrix.length ; i++){
           matrix[i] = i;
       }
       
       for(int element: matrix){
           System.out.println(matrix[element]);
       }
       
        System.out.println("");
       
    }
    
}
