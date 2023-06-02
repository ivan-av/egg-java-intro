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
public class Clase37_ej18_vectores_matrices {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
    */
    
    public static void main(String[] args) {
        
        int[][] randomMatrix = new int[4][4];
        int[][] transposedMatrix = new int[4][4];
        
        for(int i = 0; i < randomMatrix.length; i++){
            for (int j = 0; j < randomMatrix.length; j++) {
                int randomNumber = (int)(Math.random()*10);
                randomMatrix[i][j] = randomNumber;
                System.out.print(randomMatrix[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                transposedMatrix[j][i] = randomMatrix[i][j];
            }
        }

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        

    }
    
}
