/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.DependenciasDeCreacion.EditorProyectoRender;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear el Proyecto
        Proyecto proyecto1 = new Proyecto("Vacaciones en la playa", 15);

        // Crear el EditorVideo
        EditorVideo miEditor = new EditorVideo();

        // Usar el EditorVideo para crear un Render (Dependencia de Creación)
        System.out.println("--- Proceso de exportación ---");
        miEditor.exportar("MP4", proyecto1);
    }
}
