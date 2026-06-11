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
        public String extractorIniciales(String nombre, String apellido) {
    String iniciales = "" + nombre.charAt(0) + apellido.charAt(0);
    return iniciales;
}
        public String normalizadorMayusculas(String textoMixto) {
    String textoEnMayusculas = textoMixto.toUpperCase();
    return textoEnMayusculas;
}
        public String conversorBinarioParImpar(String textoBinario) {

    if (textoBinario.length() % 2 == 0) {
        return "par";
    } else {
        return "impar";
    }
}
}
