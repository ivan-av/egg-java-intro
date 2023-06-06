/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase38_ejercicios;

/**
 *
 * @author ivanav
 */
public class clase38_ej21_matrices {

    /**
     * @param args the command line arguments
     */
    
    /*
    Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
    */
    
    public static void main(String[] args) {
        int[][] matrizM = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
            {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
            {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
            {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
            {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
            {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };

        int[][] matrizP = {
            {23, 24, 25},
            {33, 34, 35},
            {43, 44, 45}
        };

        boolean encontrada = false;
        int filaInicio = -1;
        int columnaInicio = -1;

        System.out.println("Impresión de matriz 10x10");
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                if(matrizM[i][j] < 10){
                    System.out.print(" " + matrizM[i][j] + " ");
                } else{
                System.out.print(matrizM[i][j] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        
        
        System.out.println("Impresión de matriz 3x3");
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                if(matrizP[i][j] < 10){
                    System.out.print(" " + matrizP[i][j] + " ");
                } else{
                    System.out.print(matrizP[i][j] + " ");
                }            }
            System.out.println("");
        }
        System.out.println("");
        
        
        // Recorrer las submatrices de 3x3 en la matriz M
        for (int i = 0; i <= matrizM.length - matrizP.length; i++) {
            for (int j = 0; j <= matrizM[i].length - matrizP[0].length; j++) {
                // Comprobar si la submatriz coincide con la matriz P
                if (esSubmatriz(matrizM, matrizP, i, j)) {
                    encontrada = true;
                    filaInicio = i;
                    columnaInicio = j;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }

        // Imprimir resultado
        if (encontrada) {
            System.out.println("La matriz 3x3 está contenida en la matriz 10x10.");
            System.out.println("La submatriz 3x3 comienza en la fila " + filaInicio + " y columna " + columnaInicio + ".");
        } else {
            System.out.println("La matriz P no está contenida en la matriz M.");
        }
    }

    // Método para comprobar si una submatriz coincide con otra matriz dada
    private static boolean esSubmatriz(int[][] matrizM, int[][] matrizP, int filaInicio, int columnaInicio) {
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP[i].length; j++) {
                if (matrizM[filaInicio + i][columnaInicio + j] != matrizP[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
