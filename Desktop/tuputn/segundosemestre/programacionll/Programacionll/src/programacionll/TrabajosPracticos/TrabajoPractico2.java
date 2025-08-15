/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos;

import java.util.Scanner;

/**
 *
 * @author lucasgragera
 */
public class TrabajoPractico2 {
    public static void main(String[] args) {
        
        //1)-
//        Scanner input = new Scanner(System.in); 
//        System.out.print("Ingrese un año: ");
//        int año = input.nextInt();
//
//        boolean esBisiesto = false;
//
//        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
//            esBisiesto = true;
//        }
//
//        if (esBisiesto) {
//            System.out.println("El año " + año + " es bisiesto.");
//        } else {
//            System.out.println("El año " + año + " no es bisiesto.");
//        }               

        //2)-
//        Scanner input = new Scanner(System.in); 
//        System.out.print("Ingrese un primer numero: ");
//        int primerNumero = input.nextInt();
//        
//        System.out.print("Ingrese un segundo numero: ");
//        int segundoNumero = input.nextInt();
//        
//        System.out.print("Ingrese un tecer numero: ");
//        int tercerNumero = input.nextInt();
//         
//        if (primerNumero >= segundoNumero && primerNumero >= tercerNumero) {
//            System.out.println("El numero " + primerNumero + " es el mayor.");
//        } else if (segundoNumero >= primerNumero && segundoNumero >= tercerNumero) {
//            System.out.println("El numero " + segundoNumero + " es el mayor.");
//        } else {
//            System.out.println("El numero " + tercerNumero + " es el mayor.");
//        }

        //3)-
//        Scanner input = new Scanner(System.in); 
//        System.out.print("Ingrese su edad: ");
//        int edad = input.nextInt();
//        
//        if (edad < 12) {
//            System.out.println("Es un niño.");
//        } else if (edad >= 12 && edad <= 17) {
//            System.out.println("Es un adolescente.");
//        } else if (edad >= 18 && edad <= 59) {
//            System.out.println("Es un adulto.");
//        } else {
//            System.out.println("Es un adulto mayor.");
//        }

        //4)- 
//        Scanner input = new Scanner(System.in); 
//          
//        System.out.print("Ingrese el precio del producto: ");
//        int precio = input.nextInt();
//          
//        input.nextLine(); 
//
//        System.out.print("Ingrese la categoria del producto (A, B o C): ");
//        String categoria = input.nextLine().toUpperCase();
//        
//        double precioConDescuento = 0;
//        String descuento = "";
//        
//        switch (categoria) {
//            case "A":
//                precioConDescuento = precio * 0.9;
//                descuento = "10%";
//                break;
//            case "B":
//                precioConDescuento = precio * 0.85;
//                descuento = "15%";
//                break;
//            case "C":
//                precioConDescuento = precio * 0.8;
//                descuento = "20%";
//                break;
//            default:
//                // Manejamos el caso de que la categoría no sea válida
//                System.out.println("Categoría no válida. No se aplicó ningún descuento.");
//                precioConDescuento = precio;
//                descuento = "0%";
//                break;
//        }
//        System.out.println("--- Resumen del Descuento ---");
//        System.out.println("Precio inicial: " + precio);
//        System.out.println("Descuento: " + descuento);
//        System.out.println("Precio final: " + precioConDescuento); 

        //5)-
//        Scanner input = new Scanner(System.in);
//        int sumaPares = 0;
//        int numero;
//
//        System.out.print("Ingrese un número (0 para terminar): ");
//        numero = input.nextInt();
//        
//        while (numero != 0) {
//            if (numero % 2 == 0) {
//                sumaPares += numero;
//            }
//            
//            System.out.print("Ingrese un número (0 para terminar): ");
//            numero = input.nextInt();
//        }
//
//        System.out.println("\nLa suma de los números pares es: " + sumaPares); 
    
        //6)-
//        Scanner input = new Scanner(System.in);
//        int positivos = 0;
//        int negativos = 0;
//        int ceros = 0;
//        int numero;
//
//        
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("Ingrese el número " + i + ": ");
//            numero = input.nextInt();
//
//            if (numero > 0) {
//                positivos++;
//            } else if (numero < 0) {
//                negativos++;
//            } else {
//                ceros++;
//            }
//        }
//
//        System.out.println("\nResultados:");
//        System.out.println("Positivos: " + positivos);
//        System.out.println("Negativos: " + negativos);
//        System.out.println("Ceros: " + ceros);

        //7)-
//        Scanner input = new Scanner(System.in);
//        int nota;
//
//        do {
//            System.out.print("Ingrese una nota (0-10): ");
//            nota = input.nextInt();
//
//            if (nota < 0 || nota > 10) {
//                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
//            }
//
//        } while (nota < 0 || nota > 10); 
//
//        System.out.println("Nota " + nota + " guardada correctamente.");

        //8)-
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Ingrese el precio base del producto: ");
//        double precioBase = input.nextDouble();
//        
//        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
//        double impuesto = input.nextDouble();
//        
//        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
//        double descuento = input.nextDouble();
//        
//        // Llamada al método y guardamos el resultado
//        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
//        
//        System.out.println("El precio final del producto es: " + precioFinal);
//    }
//        public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
//        double impuestoDecimal = impuesto / 100.0;
//        double descuentoDecimal = descuento / 100.0;
//        
//        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
//        
//        return precioFinal;
//        

        //9)-
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Ingrese el precio del producto: ");
//        double precioProducto = input.nextDouble();
//
//        System.out.print("Ingrese el peso del paquete en kg: ");
//        double peso = input.nextDouble();
//        
//        input.nextLine(); // Consumimos el salto de línea
//
//        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
//        String zona = input.nextLine();
//
//        double costoEnvio = calcularCostoEnvio(peso, zona);
//        System.out.println("El costo de envío es: " + costoEnvio);
//
//        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);
//        System.out.println("El total a pagar es: " + totalPagar);     
//       }
//    public static double calcularCostoEnvio(double peso, String zona) {
//        if (zona.equalsIgnoreCase("Nacional")) {
//            return peso * 5;
//        } else if (zona.equalsIgnoreCase("Internacional")) {
//            return peso * 10;
//        } else {
//            System.out.println("Zona no válida. El costo de envío es 0.");
//            return 0; 
//        }
//    }
//    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
//        return precioProducto + costoEnvio;

        //10)-
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Ingrese el stock actual del producto: ");
//        int stockActual = input.nextInt();
//        
//        System.out.print("Ingrese la cantidad vendida: ");
//        int cantidadVendida = input.nextInt();
//        
//        System.out.print("Ingrese la cantidad recibida: ");
//        int cantidadRecibida = input.nextInt();
//        
//        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
//        
//        System.out.println("El nuevo stock del producto es: " + nuevoStock);
//    }
//    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
//        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
//        return nuevoStock;

        //11)-
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Ingrese el precio del producto: ");
//        double precioProducto = input.nextDouble();
//        
//        calcularDescuentoEspecial(precioProducto);
//    }
//        private static final double DESCUENTO_ESPECIAL = 0.10;
//
//        public static void calcularDescuentoEspecial(double precio) {
//
//        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
//        
//        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
//        
//        double precioFinal = precio - descuentoAplicado;
//        System.out.println("El precio final con descuento es: " + precioFinal);

        //12)-
//        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
//
//        System.out.println("Precios originales:");
//        imprimirArray(precios, 0);
//
//        int indiceAModificar = 2;
//        precios[indiceAModificar] = 129.99;
//
//        System.out.println("\nPrecios modificados:");
//        imprimirArray(precios, 0);
//        
//    }
//        public static void imprimirArray(double[] arr, int index) {
//        if (index >= arr.length) {
//            return;
//        }
//
//        System.out.println("Precio: $" + arr[index]);
//
//        imprimirArray(arr, index + 1);

        //13)-
//        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
//
//        System.out.println("Precios originales:");
//        imprimirPrecios(precios, 0); 
//
//        int indiceAModificar = 2; 
//        precios[indiceAModificar] = 129.99;
//
//        System.out.println("\nPrecios modificados:");
//        imprimirPrecios(precios, 0); 
//    }
//        public static void imprimirPrecios(double[] precios, int index) {
//        if (index >= precios.length) {
//            return;
//        }
//
//        System.out.println("Precio: $" + precios[index]);
//
//        imprimirPrecios(precios, index + 1);
    }
}

