/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaHerencia;

import Herencia.Circulo;
import Herencia.Cuadrado;
import Herencia.Linea;
import Herencia.Triangulo;

/**
 *
 * @author user
 */
public class HerenciaFormas {

   
    public static void main(String[] args) {
      
    Circulo cir1=new Circulo();
    Linea lin2=new Linea();
    Triangulo trin3=new Triangulo();
    Cuadrado cuadr4=new Cuadrado();
    
    System.out.println(cir1.dibujar("forma 1, circulo"));
    System.out.println(cir1.Calcularradio());
    System.out.println();
    
    System.out.println(lin2.dibujar("forma 2,linea"));
    System.out.println();
    
    
    System.out.println(trin3.dibujar("forma 3, triangulo"));
    System.out.println(trin3.Calculararea());
    System.out.println();
    
    System.out.println(cuadr4.dibujar("forma 4, cuadrado"));
    System.out.println(cuadr4.Calculararea());
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
