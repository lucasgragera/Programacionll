/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.DependenciasDeCreacion.GeneradorUsuarioCodigo;

/**
 *
 * @author lucasgragera
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        // La dependencia de creación se demuestra aquí
        CodigoQR codigo = new CodigoQR(valor, usuario);
        
        System.out.println("Generando código QR...");
        System.out.println("Valor del código: " + codigo.getValor());
        System.out.println("Generado por el usuario: " + codigo.getUsuario().getNombre());
    }
}
