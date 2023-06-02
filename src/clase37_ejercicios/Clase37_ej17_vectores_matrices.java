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
public class Clase37_ej17_vectores_matrices {

    /**
     * @param args the command line arguments
     */
    
    /*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
    */
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int matrixSize;
//        
//        System.out.println("Bienvenido, ingresa el tamaño del vector");
//        matrixSize = sc.nextInt();
        
        int[] matrix = {1,10,100,1000,10000};
        int oneDigit = 0;
        int twoDigit = 0;
        int threeDigit = 0;
        int fourDigit = 0;
        int fiveDigit = 0;
        
        for(int i = 0 ; i < matrix.length ; i++){
            int counter = 0;
            double divisionResult = matrix[i];
            
            while(!(divisionResult < 10)){
                divisionResult = divisionResult / 10;
                counter++;
            }
            switch(counter){
                case 0:
                    oneDigit++;
                    break;
                case 1:
                    twoDigit++;
                    break;
                case 2:
                    threeDigit++;
                    break;
                case 3:
                    fourDigit++;
                    break;
                case 4:
                    fiveDigit++;
                    break;
                case 5:
                default:
                    break;
            }
        }
        
        System.out.println("La cantidad de número con 1 dígito fueron: " + oneDigit);
        System.out.println("La cantidad de número con 2 dígitos fueron: " + twoDigit);
        System.out.println("La cantidad de número con 3 dígitos fueron: " + threeDigit);
        System.out.println("La cantidad de número con 4 dígitos fueron: " + fourDigit);
        System.out.println("La cantidad de número con 5 dígitos fueron: " + fiveDigit);
        
    }
    
}
