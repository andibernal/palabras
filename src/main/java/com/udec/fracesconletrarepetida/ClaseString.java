/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.fracesconletrarepetida;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @Andres Bernal, Duvan Casas
 */
public class ClaseString {
    
    public void leerPalabras(){
        /**
         * lee el teclado
         */
        Scanner teclado = new Scanner(System.in);
        /**
         * se ingresa el texto y se guarda en el extring texto
         */
        System.out.print("ingrese el texto: ");
        String texto = teclado.nextLine();
        
        
        /**
         * se crea dos bucles para hacer la lectura y comparacion del mismo vector mediante i,j en busca 
         * de las letras que se repitan.
         * se crea un segundo string para el almacenamiento de las palabras que no se repiten seleccionandolas con un metodo de verdadero o falso
         */
        boolean repite=false;
        String palabra ="";
        System.out.println("comenzamos ");
        for(int i=0; i<texto.length(); i++){
            System.out.println("analizando: "+texto.charAt(i));
            repite = false;
            for (int j=i+1; j<texto.length(); j++){
                /**
                 * condicional para detectar las letras parecidas.
                 */
                if((texto.charAt(i))== (texto.charAt(j))){
                    System.out.println("se repite: "+texto.charAt(i));
                    repite = true;
                        
                }        
            }
            /**
             * condicional que examina el booleano y almacena los diferentes
             */
            if(repite != true){
                palabra += texto.charAt(i) ;
                System.out.println("no se repite: "+texto.charAt(i));
            }
                
        }
        /**
         * imprime la primer letra que no se repite alamcenda en el segundo string "palabra"
         */
        System.out.println("la primera letra que no se repite "+palabra.charAt(0));
        
    }
    
}
