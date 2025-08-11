package ejercicio.pkg9.java;

import java.util.Scanner;

/**
 FLAVIO BRAVO
 */
public class Ejercicio9Java {

    /**
     Corrige el siguiente código para que funcione correctamente. Explica qué error 
     tenía y cómo lo solucionaste:
    * 
    * import java.util.Scanner; 
      public class ErrorEjemplo { 
      public static void main(String[] args) { 
      * 
      Scanner scanner = new Scanner(System.in); 
      System.out.print("Ingresa tu nombre: "); 
      String nombre = scanner.nextInt(); // ERROR 
      System.out.println("Hola, " + nombre); 
      
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); // Se corrige el error en esta linea
        String nombre ;
        
        System.out.println("Ingresa tu nombre");
        nombre = input.nextLine();
        
        System.out.println(" Hola, " + nombre);
        

        
    }
    
}
