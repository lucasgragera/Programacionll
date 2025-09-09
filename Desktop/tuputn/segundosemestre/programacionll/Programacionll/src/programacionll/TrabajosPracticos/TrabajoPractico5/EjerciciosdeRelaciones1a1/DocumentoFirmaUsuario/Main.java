/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.DocumentoFirmaUsuario;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear el usuario primero
        Usuario usuario1 = new Usuario("Roberto Gomez", "roberto.gomez@empresa.com");

        // Crear el documento, que internamente crea una FirmaDigital
        Documento documento1 = new Documento(
            "Acuerdo de Confidencialidad", 
            "El presente acuerdo establece las bases...", 
            "h2j4k6l8m0n2p4r6s8", 
            "2024-10-20", 
            usuario1
        );

        System.out.println("Información del Documento:");
        System.out.println("Título: " + documento1.getTitulo());

        System.out.println("\nInformación de la Firma Digital (desde Documento):");
        System.out.println("Código Hash: " + documento1.getFirmaDigital().getCodigoHash());
        System.out.println("Fecha: " + documento1.getFirmaDigital().getFecha());

        System.out.println("\nInformación del Usuario (desde Firma Digital):");
        System.out.println("Nombre: " + documento1.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Email: " + documento1.getFirmaDigital().getUsuario().getEmail());
    }
}
