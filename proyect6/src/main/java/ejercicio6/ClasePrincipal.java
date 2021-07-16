
package ejercicio6;

public class ClasePrincipal {

    public static void main(String[] args) {
        Recursos recursos = new Recursos();
        recursos.presentacion();
        recursos.edad(12);
        recursos.multi( 20,50);
        recursos.numeros(5);
    }
    public static class Recursos{
        
     public void presentacion(){
         System.out.println("Programacion Orientada a Objeto 2021");
     }
    
      public void edad(int edad){
      if(edad>=21){
     System.out.println(" El es mayor de edad");
      }else{
              System.out.println("El es menor de edad");
              }
      }
      
      public static int multi(int a, int b){
          int multi=a*b;
          System.out.println("El resultado es " + multi);
         return multi;
          
      }
    
    public void numeros(int x){
     for(int i=1; i<=x;  i++){
         System.out.println(i);
     }
    }
    
    
  }
       
  }

