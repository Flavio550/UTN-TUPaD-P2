
package ejercicio.pkg8.java;

import java.util.Scanner;

/**
 FLAVIO BRAVO
 */
public class Ejercicio8Java {

    /**
     Manejar conversiones de tipo y división en Java.  
     a. Escribe un programa que divida dos números enteros ingresados por el 
     usuario.  
     b. Modifica el código para usar double en lugar de int y compara los 
     resultados. 
     * ( Se va a realizar el programa ingresando los mismos numeros usando int y double
     *   para ver y comparar los resultados en pantalla )
     */
     
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, DivisionInt;
        double num3, num4, DivisionDouble ;
        
         // Se ingresan los dos numerOS y se dividen usando INT
         
         System.out.println("ingrese el primer numero");
         num1 = Integer.parseInt(input.nextLine());
         System.out.println("ingrese el segundo numero");
         num2 = Integer.parseInt(input.nextLine());
         
         DivisionInt = num1 / num2 ;
         
         System.out.println(" El resultado es " + DivisionInt);
         
         // Se ingresan los mismos numeros y se dividen pero usando DOUBLE
         
         System.out.println("Ingrese el tercer numero");
         num3 = Double.parseDouble(input.nextLine());
         System.out.println("Ingrese el cuarto numero");
         num4 = Double.parseDouble(input.nextLine());
         
         DivisionDouble = num3 / num4 ;
         
         System.out.println("El resultado es " + DivisionDouble);
         
         
         
        
        
    }
    
}
