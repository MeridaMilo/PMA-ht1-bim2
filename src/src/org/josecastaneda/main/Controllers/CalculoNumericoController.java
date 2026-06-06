/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.org.josecastaneda.main.Controllers;

/**
 *
 * @author Emilio
 */
public class CalculoNumericoController {
    
    public float calculoSalario(float horasTrabajadas,float pagoPorHora){
        float totalSalario = horasTrabajadas * pagoPorHora;
        return totalSalario;
   } 
     public float calculoAreaTriangulo(float base,float altura){
        float calculoAreaTriangulo = (base * altura)/2;
        return calculoAreaTriangulo;
   } 
}

