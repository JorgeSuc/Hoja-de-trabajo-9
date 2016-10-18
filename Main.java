/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author JoiceAndrea
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado= new Scanner(System.in); // Se declara variable de tipo Scanner para leer lo ingresado
                System.out.println("Bienvenido al programa");
                System.out.println("Que tipo de mapeo desea utilizar:");
                System.out.println("1) Red Black Tree");
                System.out.println("2) Arbol 1-3");
                System.out.println("***Ingrese solo caracteres numericos y enteros***");
                int  opcion = teclado.nextInt(); //Guarda numero ingresado en variable opcion
    }
    
}
