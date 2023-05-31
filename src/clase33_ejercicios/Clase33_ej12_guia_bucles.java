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
public class Clase33_ej12_guia_bucles {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctFormat, incorrectFormat;
        correctFormat = 0;
        incorrectFormat = 0;
        String word = "";
        
        do{
            System.out.println("Escribe una palabra");
            word = sc.nextLine();
            while(word.length() != 5){
                System.out.println("Escribe una palabra de 5 palabras");
                word = sc.nextLine();
            }
            System.out.println(word);
            System.out.println(word.substring(0, 1));
            System.out.println(word.substring(4, 5));
            if (word.equals("&&&&&")) {
                break; 
            } else if(word.substring(0, 1).equals("X") && word.substring(4, 5).equals("O")){
                correctFormat++;
            } else {
                incorrectFormat++;
            }
        }while(!word.equals("&&&&&"));
        
        System.out.println("# Palabras con formato Correcto: " + correctFormat);
        System.out.println("# Palabras con formato Incorrecto: " + incorrectFormat);
    }
    
}
