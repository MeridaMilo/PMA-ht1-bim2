/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src.org.josecastaneda.main;

import src.org.josecastaneda.main.Controllers.ProcesamientoCadenasController;
import src.org.josecastaneda.main.Controllers.CalculoNumericoController;

import java.util.Scanner;



/**
 *
 * @author Emilio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       Scanner scaneador = new Scanner(System.in);
  
        int opcion = 0;
        int opcion_modulo_a = 0;
        while (opcion!=99){
            System.out.println("Menu: Ingrese la opcion y presione Enter");
            System.out.println("1. Modulo A");
            System.out.println("2. modulo B");
            System.out.println("3. modulo C");
            System.out.println("99. Salir");
             System.out.print("Seleccione: ");
             System.out.println("");
            opcion = scaneador.nextInt();
            switch (opcion) {
                    case 1 -> {
                        while (opcion_modulo_a!=99){
                            System.out.println("1. Calculadora de Salario");
                            System.out.println("2. Área de un Triángulo:");
                            System.out.println("3. Promedio Académico");
                            System.out.println("99. Regresar Menu Principal");
                             System.out.print("Seleccione: ");
                             System.out.println("");
                            opcion_modulo_a = scaneador.nextInt();
                            switch (opcion_modulo_a) {
                                case 1 -> {
                                    
                                  System.out.print("Horas Trabajadas:  ");
        float horasTrabajadas = scaneador.nextFloat();
        System.out.print("Pago Por hora:  ");
        float pagoPorHora = scaneador.nextFloat();
        CalculoNumericoController calculoNumerico = new CalculoNumericoController();
        float totalSalario = calculoNumerico.calculoSalario(horasTrabajadas, pagoPorHora);
        System.out.print("Resultado:  ");
         System.out.println(totalSalario);
        
                                }
                                default -> System.out.println("Opcion no valida. Intente de nuevo.");
                            }
                        }
                    }
                    
                    default -> System.out.println("Opcion no valida. Intente de nuevo.");
                }
            
        }
    }
    
}
    
