/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase33_guia;

import java.util.Scanner;

/**
 *
 * @author ivanav
 */
public class Clase33_ej11_funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String letra, fraseCodificada;
        
        fraseCodificada = "";
        
        do {
            System.out.println("Ingresa una letra");
            letra = sc.nextLine();
            fraseCodificada = fraseCodificada.concat(codificarFrase(letra.toLowerCase()));
        } while(!letra.contains("."));
        
        System.out.println(fraseCodificada);

    }
    
    public static String codificarFrase(String letraArg){
        
        String letraCambiada;
        letraCambiada = letraArg;
        
       switch(letraArg){
           case "a":
               letraCambiada = "@";
               break;
            case "e":
                letraCambiada = "#";
                break;
            case "i":
                letraCambiada = "$";
                break;
            case "o":
                letraCambiada = "%";
                break;
            case "u":
                letraCambiada = "*";
                break;
            default:
            break;
       } 
       
       return letraCambiada;
    }
}
