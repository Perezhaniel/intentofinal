
package Paquete2;


public class Futbolista {
    private int edad;
    private String  Nombre;
    private String Equipoactual;
   
    public void estableceredad ( int edad){
        this.edad = edad;    
    }
    public int obteneredad(){
    return edad;
}
    
    public void establecerNombre(String Nombre){
        this.Nombre= Nombre;
    }
    public String obtenerNombre(){
        return Nombre;
    }
    
    public void establecerEquipoactual(String Equipoactual){
        this.Equipoactual =Equipoactual;
    }
    public String obtenerEquipoactual(){
        return Equipoactual;
    }

   
}
