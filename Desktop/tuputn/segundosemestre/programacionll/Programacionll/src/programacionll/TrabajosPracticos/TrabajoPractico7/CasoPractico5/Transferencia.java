/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico5;

/**
 *
 * @author lucasgragera
 */
public class Transferencia implements Pagable{
    private String cbuDestino;

    public Transferencia(String cbuDestino) {
        this.cbuDestino = cbuDestino;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Iniciando transferencia de $" + monto + ".");
        System.out.println("  > CBU Destino: " + cbuDestino);
        // Lógica real: conectar con sistema bancario.
    }
    
    @Override
    public String obtenerTipo() {
        return "Transferencia Bancaria";
    }
}
