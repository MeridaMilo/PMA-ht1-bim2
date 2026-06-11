/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.org.josecastaneda.main.Controllers;

/**
 *
 * @author Emilio
 */
public class ProcesamientoCadenasController {
        public String concatenadorNombre(String nombre,String apellido){
        String nombreCompleto = nombre + " "+apellido;
        return nombreCompleto;
    }
        public int contadorLongitud(String palabra) {
    int longitud = palabra.length();
    return longitud;
}
        public String inversorTexto(String palabra) {
    String palabraInvertida = new StringBuilder(palabra).reverse().toString();
    return palabraInvertida;
}
        public boolean detectorVocales(char caracter) {
    char letraMinuscula = Character.toLowerCase(caracter); 
    switch (letraMinuscula) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            return true; 
        default:
            return false; 
    }
}
}
