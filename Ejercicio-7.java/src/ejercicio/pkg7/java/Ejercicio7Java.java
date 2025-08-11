
package ejercicio.pkg7.java;

import java.util.Scanner;

/**
       FLAVIO BRAVO
 */
public class Ejercicio7Java {

    /**
     Analiza el siguiente código y responde: ¿Cuáles son expresiones y cuáles son 
     instrucciones? Explica la diferencia en un breve párrafo.  
     int x = 10; // Línea 1  
     x = x + 5; // Línea 2  
     System.out.println(x); // Línea 3
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = 10 ; // En esta linea hay una instruccion, ya que se declara X como entero 
                     // y se le asigna un valor 
        
        x = x + 5 ;  // En esta linea tambien tenemos una instruccion, ya que 
                     // se le asigna un valor a x, pero tambien hay una expresion que es x + 5,
                     // y esa expresion va a dar un resultado
                     
        System.out.println(x);
        
        /** En conclusion, una instruccion es una accion que declara y asigna, mientras que una 
         * expresion es una convinacion de variables, valores y operadores que se puede evaluar
         * y va a dar un resultado. Dentro de las instrucciones se pueden encontrar expresiones
         */
        
    }
    
}
