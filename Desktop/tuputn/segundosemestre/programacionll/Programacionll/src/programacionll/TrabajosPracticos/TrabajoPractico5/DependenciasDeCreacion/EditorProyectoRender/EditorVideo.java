/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.DependenciasDeCreacion.EditorProyectoRender;

/**
 *
 * @author lucasgragera
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        // La dependencia de creación se demuestra aquí
        Render render = new Render(formato, proyecto);

        System.out.println("Exportando proyecto a " + render.getFormato() + "...");
        System.out.println("Proyecto: " + render.getProyecto().getNombre());
        System.out.println("Duración: " + render.getProyecto().getDuracionMin() + " minutos");
    }
}
