/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico5;

/**
 *
 * @author lucasgragera
 */
public interface Pagable {
    // El contrato: todas las clases que implementen Pagable deben tener este método.
    void pagar(double monto);
    String obtenerTipo();
}
