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
 * @author Admin
 */
public class ClaseString {
    
    public void leerPalabras(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("ingrese el texto: ");
        String texto = teclado.nextLine();
        
        
        int tamaño, posicion=0;
        tamaño = texto.length();
        int vector [] = new int [tamaño]; 
        
        System.out.println("leer ");
        for(int i=0; i<texto.length(); i++){
            System.out.println("analizando: "+texto.charAt(i));
            for (int j=i; j<texto.length(); j++){
                 
                if (i!=j){
                    if(texto.charAt(i)==texto.charAt(j)){
                        
                    }
                }
                
            }
                
        }
        System.out.println("no se repite: "+Arrays.toString(vector));
        
        
        
        
    }
    
}
