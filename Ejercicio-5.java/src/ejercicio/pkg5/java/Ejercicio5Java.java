
package ejercicio.pkg5.java;

import java.util.Scanner;


public class Ejercicio5Java {

    /**
      Escribe un programa que solicite dos números enteros y realice las siguientes 
      operaciones:   
      a. Suma   
      b. Resta   
      c. Multiplicación   
      d. División  
     Muestra los resultados en la consola.
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion ;
        double division ;
        
        
        System.out.println("Ingrese el primer numero entero");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero entero");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2 ;
        resta = num1 - num2 ;
        multiplicacion = num1 * num2 ;
        division = (double)num1 / num2 ;
        
        System.out.println("la suma de los numero es " + suma);
        System.out.println("la resta de los numeros es " + resta);
        System.out.println("la multiplicacion de los numeros es " + multiplicacion);
        System.out.println("la division de los numeros es " + division);
        
        
        
        
       
        
    }
    
}
