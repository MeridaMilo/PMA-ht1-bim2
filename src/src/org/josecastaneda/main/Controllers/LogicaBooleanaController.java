/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.org.josecastaneda.main.Controllers;

/**
 *
 * @author Emilio
 */
public class LogicaBooleanaController {
    public boolean verificadorEdad(int edad){
    if (edad > 18){
        return true;
        
    }
    else {
    return false;    
    } 
   } 
    public boolean esNumeroPar(int numero) {
    // Si el residuo de dividir el número entre 2 es cero, es par (true)
    if (numero % 2 == 0) {
        return true;
    } else {
        return false;
    }
}   
}
