/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico8.CasoPractico2;

/**
 *
 * @author lucasgragera
 */

//1. Excepción Personalizada:
public class EdadInvalidaException extends Exception{
    // Constructor que acepta un mensaje de error
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
