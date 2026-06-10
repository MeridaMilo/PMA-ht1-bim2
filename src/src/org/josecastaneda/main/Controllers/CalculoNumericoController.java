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
        public float calculoPromedio(float calificacion1,float calificacion2, float calificacion3){
        float calculoPromedio = (calificacion1 + calificacion2 + calificacion3)/3;
        return calculoPromedio;
   } 
        public float calculoGrados(float gradosCelsius){
        float calculoGrados = (gradosCelsius * 1.8f) + 32;
        return calculoGrados;
}
        public float calculoPerimetroCirculo(float radio){
    float calculoPerimetro = 2 * (float)Math.PI * radio;
    return calculoPerimetro;
}
        public float calculoVolumenCilindro(float radio, float altura){
    // Fórmula: Pi * (radio^2) * altura
    float calculoVolumen = (float)Math.PI * (float)Math.pow(radio, 2) * altura;
    return calculoVolumen;
}
        public float calculoHipotenusa(float catetoA, float catetoB) {
        float a2 = (float) Math.pow(catetoA, 2);
        float b2 = (float) Math.pow(catetoB, 2);
        float suma = a2 + b2;
        float hipotenusa = (float) Math.sqrt(suma);

        return hipotenusa;
    }
        public int diasAMinutos(int dias) {
        int horas = dias * 24;
        int minutos = horas * 60;
        return minutos;
    }
}
