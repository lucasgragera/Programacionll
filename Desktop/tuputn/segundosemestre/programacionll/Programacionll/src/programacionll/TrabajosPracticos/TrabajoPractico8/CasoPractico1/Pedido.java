/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico8.CasoPractico1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasgragera
 */
public class Pedido implements Pagable{
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "PENDIENTE";
        notificarCliente("Pedido creado y en estado PENDIENTE.");
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        notificarCliente("Producto '" + producto.getNombre() + "' agregado al pedido.");
    }

    // Implementación de Pagable
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal(); // Llama a calcularTotal de Producto
        }
        return total;
    }

    // 5. Método para cambiar de estado y notificar
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCliente("El estado del pedido ha cambiado a: " + nuevoEstado);
    }

    // 5. Lógica de notificación
    private void notificarCliente(String mensaje) {
        if (cliente != null) {
            cliente.recibirNotificacion("ID_PEDIDO: " + mensaje);
        }
    }

    public String getEstado() {
        return estado;
    }
}
