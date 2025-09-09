/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.DependenciasDeCreacion.GeneradorUsuarioCodigo;

/**
 *
 * @author lucasgragera
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    // Getters
    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
