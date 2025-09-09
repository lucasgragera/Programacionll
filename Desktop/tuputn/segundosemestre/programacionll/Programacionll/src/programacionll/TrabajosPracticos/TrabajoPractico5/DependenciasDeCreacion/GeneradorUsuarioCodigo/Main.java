/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.DependenciasDeCreacion.GeneradorUsuarioCodigo;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear el Usuario
        Usuario usuario1 = new Usuario("Lucas Perez", "lucas@example.com");

        // Crear el GeneradorQR
        GeneradorQR generador = new GeneradorQR();

        // Usar el GeneradorQR para crear un CodigoQR (Dependencia de Creación)
        System.out.println("--- Proceso de generación ---");
        generador.generar("http://mi-sitio-web.com/perfil/1", usuario1);
    }
}
