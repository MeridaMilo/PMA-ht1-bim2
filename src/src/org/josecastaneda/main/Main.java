/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src.org.josecastaneda.main;

import src.org.josecastaneda.main.Controllers.ProcesamientoCadenasController;
import src.org.josecastaneda.main.Controllers.CalculoNumericoController;
import src.org.josecastaneda.main.Controllers.LogicaBooleanaController;

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
        int opcion_modulo_b = 0;
        int opcion_modulo_c = 0;
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
                            System.out.println("2. Area de un Triangulo");
                            System.out.println("3. Promedio Academico");
                            System.out.println("4. Convertidor de Temperatura");
                            System.out.println("5. Perimetro de Circulo");
                            System.out.println("6. Volumen de un Cilindro");
                            System.out.println("7. Hipotenusa");
                            System.out.println("8. Dias a Minutos");
                            System.out.println("9. Resto de Division");
                            System.out.println("10. Potencia al Cubo");
                            System.out.println("99. Regresar Menu Principal");
                             System.out.print("Seleccione: ");
                             System.out.println("");
                            opcion_modulo_a = scaneador.nextInt();
                            scaneador.nextLine();
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
                                case 2 -> {
                                    
                                  System.out.print("Ingrese la base");
                                    float baseTriangulo = scaneador.nextFloat();
                                    System.out.print("Ingrese la altura ");
                                    float alturatriangulo = scaneador.nextFloat();
                                    CalculoNumericoController calculoNumerico = new CalculoNumericoController();
                                    float areaTriangulo = calculoNumerico.calculoAreaTriangulo(baseTriangulo, alturatriangulo);
                                    System.out.print("Area Triangulo  ");
                                    System.out.println(areaTriangulo);
        
                                }
                                case 3 -> {
                                    
                                  System.out.print("Ingrese el promedio");
                                    System.out.print("Ingrese la calificacion 1 ");
                                    float calculoPromedio1 = scaneador.nextFloat();
                                    System.out.print("Ingrese la calificacion 2 ");
                                    float calculoPromedio2 = scaneador.nextFloat();
                                    System.out.print("Ingrese la calificacion 3 ");
                                    float calculoPromedio3 = scaneador.nextFloat();
                                    CalculoNumericoController calculoNumerico = new CalculoNumericoController();
                                    float calculoPromedio4 = calculoNumerico.calculoPromedio(calculoPromedio1, calculoPromedio2, calculoPromedio3);
                                    System.out.print("Promedio:  ");
                                    System.out.println(calculoPromedio4);
        
                                } 
                                 case 4 -> {
                                    
                                  System.out.print("Ingrese la temperatura en celsius ");
                                    float calculoTemperatura1 = scaneador.nextFloat();
                                    CalculoNumericoController calculoNumerico = new CalculoNumericoController();
                                    float calculoTemperatura2 = calculoNumerico.calculoGrados(calculoTemperatura1);
                                    System.out.print("temperatura a Fahrenheit:  ");
                                    System.out.println(calculoTemperatura2);
                                } 
                                 case 5 -> {
                                     System.out.print("Ingrese el radio del circulo: ");
                                        float calculoRadio1 = scaneador.nextFloat();
                                        CalculoNumericoController calculoNumerico = new CalculoNumericoController();
                                        float calculoPerimetro2 = calculoNumerico.calculoPerimetroCirculo(calculoRadio1);
                                     System.out.print("El perimetro del circulo es: ");
                                     System.out.println(calculoPerimetro2);
                                } 
                                 case 6 -> {
                                System.out.print("Ingrese el radio del cilindro: ");
                                float calculoRadio1 = scaneador.nextFloat();
                                System.out.print("Ingrese la altura del cilindro: ");
                                float calculoAltura1 = scaneador.nextFloat();
                                CalculoNumericoController calculoNumerico = new CalculoNumericoController();
                                float calculoVolumen2 = calculoNumerico.calculoVolumenCilindro(calculoRadio1, calculoAltura1);
                                System.out.print("El volumen del cilindro es: ");
                                System.out.println(calculoVolumen2);
                               }
                                 case 7 -> {
                                System.out.print("Ingrese la longitud del cateto A: ");
                                float calculoCatetoA1 = scaneador.nextFloat();
                                System.out.print("Ingrese la longitud del cateto B: ");
                                float calculoCatetoB1 = scaneador.nextFloat();
                                CalculoNumericoController calculoNumerico = new CalculoNumericoController();
                                float calculoHipotenusa2 = calculoNumerico.calculoHipotenusa(calculoCatetoA1, calculoCatetoB1);
                                System.out.print("La longitud de la hipotenusa es: ");
                                System.out.println(calculoHipotenusa2);
                               }
                                 case 8 -> {
                                System.out.print("Ingrese la cantidad de dias: ");
                                int calculoDias1 = scaneador.nextInt();
                                CalculoNumericoController calculoNumerico = new CalculoNumericoController();
                                int calculoMinutos2 = calculoNumerico.diasAMinutos(calculoDias1);
                                System.out.print("El equivalente en minutos totales es: ");
                                System.out.println(calculoMinutos2);
                               }
                                 case 9 -> {
                                System.out.print("Ingrese el dividendo  ");
                                int calculoDividendo1 = scaneador.nextInt();
                                System.out.print("Ingrese el divisor: ");
                                int calculoDivisor1 = scaneador.nextInt();
                                CalculoNumericoController calculoNumerico = new CalculoNumericoController();
                                int calculoResto2 = calculoNumerico.restoDivision(calculoDividendo1, calculoDivisor1);
                                System.out.print("El residuo de la division es: ");
                                System.out.println(calculoResto2);
                                }
                                case 10 -> {
                                System.out.print("Ingrese el numero que desea elevar al cubo: ");
                                int calculoNumero1 = scaneador.nextInt();

                                CalculoNumericoController calculoNumerico = new CalculoNumericoController();
                                int calculoCubo2 = calculoNumerico.potenciaCubo(calculoNumero1);
                                System.out.print("El resultado del numero al cubo es: ");
                                System.out.println(calculoCubo2);
                               }   
                                default -> System.out.println("Opcion no valida. Intente de nuevo.");
                            }
                            
                        }
                    }
                    case 2 -> {
                        while (opcion_modulo_b!=99){
                            System.out.println("1. Concatenador de Nombre");
                            System.out.println("2. Contador de Longitud:");
                            System.out.println("3. xxxxxxxxx");
                            System.out.println("3. xxxxxxxxx");
                            System.out.println("3. xxxxxxxxx");
                            System.out.println("3. xxxxxxxxx");
                            System.out.println("99. Regresar Menu Principal");
                             System.out.print("Seleccione: ");
                             System.out.println("");
                            opcion_modulo_b = scaneador.nextInt();
                            scaneador.nextLine();
                            switch (opcion_modulo_b) {
                                case 1 -> {
                                    
                                  System.out.print("Ingrese el Nombre  ");
                                    String nombre = scaneador.nextLine();
                                    System.out.print("Ingrese el Apellido");
                                    String apellido = scaneador.nextLine();                            
                                    ProcesamientoCadenasController nombreApellido = new ProcesamientoCadenasController();                                   
                                    String nombreCompleto = nombreApellido.concatenadorNombre(nombre, apellido);
                                    System.out.print("Nombre Completo  ");
                                    System.out.println(nombreCompleto);
        
                                }
                                case 2 -> {
                                    
                               System.out.print("Ingrese una palabra: ");
                               String calculoPalabra1 = scaneador.next();
                               ProcesamientoCadenasController procesamientoCadenas = new ProcesamientoCadenasController();
                               int calculoLongitud2 = procesamientoCadenas.contadorLongitud(calculoPalabra1);
                               System.out.print("La cantidad de letras que tiene la palabra es: ");
                               System.out.println(calculoLongitud2);
                                }
                                 case 3 -> {
                                    
                               System.out.print("Ingrese una palabra: ");
                               String calculoPalabra1 = scaneador.next();
                               ProcesamientoCadenasController procesamientoCadenas = new ProcesamientoCadenasController();
                               int calculoLongitud2 = procesamientoCadenas.contadorLongitud(calculoPalabra1);
                               System.out.print("La cantidad de letras que tiene la palabra es: ");
                               System.out.println(calculoLongitud2);
                                }
                                default -> System.out.println("Opcion no valida. Intente de nuevo.");
                            }
                        }
                    }
                    case 3 -> {
                        while (opcion_modulo_c!=99){
                            System.out.println("1. Verificador de Edad");
                            System.out.println("2. Número Par");
                            System.out.println("3. Semáforo");
                            System.out.println("3. Rango Numérico");
                            System.out.println("99. Regresar Menu Principal");
                             System.out.print("Seleccione: ");
                             System.out.println("");
                            opcion_modulo_c = scaneador.nextInt();
                            scaneador.nextLine();
                            switch (opcion_modulo_c) {
                                case 1 -> {
                                    
                                  System.out.print("Ingrese su edad:  ");
                                    int edad = scaneador.nextInt();
                                    LogicaBooleanaController logicaBooleana = new LogicaBooleanaController();
                                    boolean calculoDeEdad  = logicaBooleana.verificadorEdad(edad);
                                    System.out.print("Resultado:  ");
                                    System.out.println(calculoDeEdad);
        
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
    
    
