/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.DependenciasDeUso.ReproductorCancionArtista;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear el Artista y la Canción
        Artista artista1 = new Artista("Queen", "Rock");
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", artista1);

        // Crear el Reproductor
        Reproductor miReproductor = new Reproductor();

        // Usar el Reproductor para reproducir la Canción (Dependencia de Uso)
        System.out.println("--- Iniciando reproducción ---");
        miReproductor.reproducir(cancion1);
    }
}
