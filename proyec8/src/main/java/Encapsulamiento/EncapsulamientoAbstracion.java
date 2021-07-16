
package Encapsulamiento;

import Paquete2.Futbolista;
import abstraccion.Arsenal;
import abstraccion.Juventus;
import abstraccion.Valencia;



public class EncapsulamientoAbstracion {

   
    public static void main(String[] args) {
      Futbolista futbolista = new Futbolista();
      
      futbolista.estableceredad(32);
       System.out.println(futbolista.obteneredad());
       
      futbolista.establecerNombre("Nombre es: David Suazo");
      System.out.println(futbolista.obtenerNombre());
      
       futbolista.establecerEquipoactual("Equipo actual es: Olimpia");
       System.out.println(futbolista.obtenerEquipoactual());
       
       Valencia valencia =new Valencia();
       Arsenal arsenal = new Arsenal();
       Juventus juventus = new Juventus();
       
        System.out.println();
     
     System.out.println("Equipo:" +valencia.getEquipo());
     System.out.println("Capitan:" +valencia.getCapitan());
     
     System.out.println("Equipo:" +arsenal.getEquipo());
     System.out.println("Capitan:" +arsenal.getCapitan());
     
     System.out.println("Equipo:" +juventus.getEquipo());
     System.out.println("Capitan:" +juventus.getCapitan());
       
       
    }
    
}

