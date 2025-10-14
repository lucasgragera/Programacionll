/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico8.CasoPractico2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
/**
 *
 * @author lucasgragera
 */
public class EjerciciosExcepciones {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 1. División Segura: Manejo de ArithmeticException
     */
    public static void divisionSegura() {
        System.out.println("\n1. División Segura");
        try {
            System.out.print("Introduce el numerador (dividendo): ");
            double num1 = scanner.nextDouble(); // Puede lanzar InputMismatchException

            System.out.print("Introduce el denominador (divisor): ");
            double num2 = scanner.nextDouble();

            if (num2 == 0) {
                // Lanzamos la excepción manualmente si el denominador es 0
                throw new ArithmeticException("¡No se puede dividir por cero!");
            }

            double resultado = num1 / num2;
            System.out.printf("Resultado de la división: %.2f%n", resultado);

        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error: Debes introducir un número válido.");
            scanner.nextLine(); // Limpia el buffer del scanner
        }
    }

    /**
     * 2. Conversión de Cadena a Número: Manejo de NumberFormatException
     */
    public static void convertirCadenaANumero() {
        System.out.println("\n2. Conversión de Cadena");
        System.out.print("Introduce un texto para convertirlo a entero: ");
        // Leemos como texto, independientemente de lo que ingrese el usuario
        String texto = scanner.next(); 

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversión exitosa. El número es: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error: El texto introducido ('" + texto + "') no es un número entero válido.");
        }
    }

    /**
     * 3. Lectura de Archivo: Manejo de FileNotFoundException
     */
    public static void leerArchivo() {
        System.out.println("\n3. Lectura de Archivo");
        // Asume que 'archivo_inexistente.txt' NO existe para probar la excepción
        String nombreArchivo = "archivo_prueba.txt"; 
        
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            // Si el archivo existe, leemos y mostramos.
            // Para simplificar, solo mostramos que se abrió. 
            // La excepción de archivo no encontrado se lanzará aquí si falta el archivo.
            System.out.println("✅ Archivo '" + nombreArchivo + "' encontrado. (Contenido no mostrado completamente)");
            fileReader.close(); 
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado. Asegúrate de que '" + nombreArchivo + "' exista.");
        } catch (IOException e) {
            System.err.println("Error de I/O al cerrar el archivo: " + e.getMessage());
        }
    }

    /**
     * 4. Excepción Personalizada: EdadInvalidaException
     */
    public static void validarEdad(int edad) {
        System.out.println("\n4. Excepción Personalizada");
        try {
            if (edad < 0 || edad > 120) {
                // Lanzar la excepción personalizada
                throw new EdadInvalidaException("La edad (" + edad + ") debe estar entre 0 y 120 años.");
            }
            System.out.println("Edad validada correctamente: " + edad + " años.");
        } catch (EdadInvalidaException e) {
            System.err.println("Error de Validación: " + e.getMessage());
        }
    }

    /**
     * 5. Uso de try-with-resources: Manejo de IOException
     */
    public static void lecturaConTryWithResources() {
        System.out.println("\n5. Uso de try-with-resources");
        String nombreArchivo = "archivo_prueba.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            // El BufferedReader (y el FileReader) se cerrarán automáticamente 
            // al salir del bloque try, incluso si ocurre una excepción.
            
            System.out.println("Leyendo archivo con try-with-resources...");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("  > " + linea);
            }
            System.out.println("Lectura de archivo completada y recursos cerrados automáticamente.");

        } catch (java.io.FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado. (" + e.getMessage() + ")");
        } catch (IOException e) {
            System.err.println("Error de I/O durante la lectura: " + e.getMessage());
        }
        
        // El recurso 'br' está garantizado de estar cerrado aquí
    }

    public static void main(String[] args) {
        // Ejecución de los ejercicios
        divisionSegura();
        convertirCadenaANumero();
        leerArchivo();
        
        // Pruebas de excepción personalizada
        validarEdad(35);
        validarEdad(-5);
        validarEdad(150);

        // Para que la prueba de try-with-resources funcione, puedes crear un archivo 
        // llamado 'archivo_prueba.txt' en la misma carpeta del proyecto.
        lecturaConTryWithResources();

        scanner.close();
    }
}
