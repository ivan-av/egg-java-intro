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
public class Clase37_ej19_vectores_matrices {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
    */
    
    public static void main(String[] args) {
        int[][] nMatrix = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int[][] negativeMatrix = new int[nMatrix.length][nMatrix.length];
        int[][] transposedMatrix = new int[nMatrix.length][nMatrix.length];
        int differenceCounter = 0;
        
        // Print nMatrix
        System.out.println("Matrix inicial");
        for(int i = 0; i < nMatrix.length; i++){
            for (int j = 0; j < nMatrix.length; j++) {
                if(nMatrix[i][j] < 0){
                    System.out.print(nMatrix[i][j] + "| ");
                } else{
                    System.out.print(nMatrix[i][j] + " | ");
                }
            }
            System.out.println("");
        }
        
        System.out.println(" ");
        
        System.out.println("Matriz negativa");
        // Fill negativeMatrix with the switched values of nMatrix
        for(int i = 0; i < nMatrix.length; i++){
            for (int j = 0; j < nMatrix.length; j++) {
                negativeMatrix[i][j] = nMatrix[i][j] * -1;
                if(negativeMatrix[i][j] < 0){
                    System.out.print(negativeMatrix[i][j] + "| ");
                } else{
                    System.out.print(negativeMatrix[i][j] + " | ");
                }            }
            System.out.println("");
        }
        
        System.out.println(" ");

        // Transpose nMatrix
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                transposedMatrix[j][i] = nMatrix[i][j];
            }
        }
        
        System.out.println("Matriz (inicial) traspuesta");
        // Print transposed matrix
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                if(transposedMatrix[i][j] < 0){
                    System.out.print(transposedMatrix[i][j] + "| ");
                } else{
                    System.out.print(transposedMatrix[i][j] + " | ");
                }            }
            System.out.println();
        }
        
        // Validate if the negativeMatrix is equal to transposedMatrix
        for (int i = 0; i < negativeMatrix.length; i++) {
            for (int j = 0; j < negativeMatrix[i].length; j++) {
                if(negativeMatrix[i][j] != transposedMatrix[i][j]){
                    differenceCounter++;
                }
            }
        }
        
        System.out.println("");
        // Print veredict
        if(differenceCounter > 1){
            System.out.println("La matriz no es antisimétrica");
        } else {
            System.out.println("¡La matriz es antisimétrica!");
        }
    }
    
}
