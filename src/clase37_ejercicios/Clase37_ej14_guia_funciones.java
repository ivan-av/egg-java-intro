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
public class Clase37_ej14_guia_funciones {
    
    /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euroCoin = -1;
        String coinType = "";
        
        System.out.println("Bienvenido a la calculadora de divisas");
        do{
            System.out.println("Por favor, ingresa tu monto: ");
            euroCoin = sc.nextDouble();
        }while(euroCoin < 0);
        
        do {
            System.out.println("A ¿qué moneda desear convertir (dolar, yen o libra) tu monto?");
            coinType = sc.next();
        } while(!coinType.equals("dolar") && !coinType.equals("yen") && !coinType.equals("libra"));

        
        convertCoin(euroCoin, coinType);
    }
    
    public static void convertCoin(double euroIn, String coinTypeIn){
        double coinOut = 0;
        
        switch(coinTypeIn){
            case "dolar":
                coinOut = euroIn* 0.86;
                break;
            case "yen":
                coinOut = euroIn* 1.28611;
                break;
            case "libra":
                coinOut = euroIn* 129.852;
                break;
            default:
                System.out.println("Moneda no válida");
                break;
        }
        
        System.out.println("El cambio de tu monto (" + euroIn + ") a " + coinTypeIn + " es: " + coinOut);
    }
    
}
