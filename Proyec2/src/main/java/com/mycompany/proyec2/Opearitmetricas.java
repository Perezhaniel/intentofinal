
package com.mycompany.proyec2;


public class Opearitmetricas {

 
    public static void main(String[] args) {
    double numero1 = 40;
         double numero2 = 20;
         double numero3 = 10;
         double numero4 = 4;
         double suma, resta, multiplicacion = 0;
         double division = 0; 
    
         suma = numero1 + numero2 + numero3 + numero4;
         resta = numero1 - numero2 - numero3 - numero4;
         multiplicacion = numero1 * numero2 * numero3 * numero4;
    
    //Controlamos que la división se haga sobre un denominador 0
         if (numero2 != 0){
                division = numero1 / numero2 / numero3 / numero4;
         }
        
    // Imprimimos en consola los resultados
 System.out.println("La suma es: " + suma);
 System.out.println("La resta es: " + resta);
 System.out.println("La multiplicacion es: " + multiplicacion);
 System.out.println("La division es: " + division);
    }
    
}
