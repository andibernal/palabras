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
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("ingrese el texto: ");
        String texto = teclado.nextLine();
        
        
        int tamaño, posicion=0;
        boolean repite=false;
        tamaño = texto.length();
        int vector [] = new int [tamaño]; 
        String palabra ="";
        System.out.println("leer ");
        for(int i=0; i<texto.length(); i++){
            System.out.println("analizando: "+texto.charAt(i));
            repite = false;
            for (int j=i+1; j<texto.length(); j++){
                
                if((texto.charAt(i))== (texto.charAt(j))){
                    System.out.println("se repite: "+texto.charAt(i));
                    repite = true;
                        
                }        
            }
            
            if(repite != true){
                palabra += texto.charAt(i) ;
                System.out.println("no se repite: "+texto.charAt(i));
            }
                
        }
        System.out.println("la primera letra que no se repite "+palabra.charAt(0));
        
    }
    
}
