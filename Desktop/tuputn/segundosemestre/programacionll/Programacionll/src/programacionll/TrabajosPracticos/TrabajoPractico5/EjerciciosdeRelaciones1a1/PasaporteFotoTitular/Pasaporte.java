/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.PasaporteFotoTitular;

/**
 *
 * @author lucasgragera
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Relación de composición
    private Titular titular; // Relación de asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
    this.numero = numero;
    this.fechaEmision = fechaEmision;
    this.foto = new Foto(imagenFoto, formatoFoto);
    this.titular = titular;

    // This line establishes the bidirectional link
    titular.setPasaporte(this); 
    }
    

    // Getters
    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }
}
