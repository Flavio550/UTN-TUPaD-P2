
package ejercicio.pkg4.java;

import java.util.Scanner;


public class Ejercicio4Java {

    /**
      Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego 
      los muestre en pantalla. Usa Scanner para capturar los datos
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String nombre ;
        int edad ;
        
        System.out.println("Ingrese su nombre");
        nombre = input.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es " + nombre + " y tiene " + edad + " anios");
        
        
        
        
        
        
        
    }
    
}
