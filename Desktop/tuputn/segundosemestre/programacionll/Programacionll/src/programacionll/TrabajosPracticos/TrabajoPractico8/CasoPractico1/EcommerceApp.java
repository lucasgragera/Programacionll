/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico8.CasoPractico1;

/**
 *
 * @author lucasgragera
 */
public class EcommerceApp {
    public static void main(String[] args) {
        // Creación de Productos
        Producto laptop = new Producto("Laptop", 1200.00);
        Producto mouse = new Producto("Mouse Inalámbrico", 25.50);

        // Creación de Cliente
        Cliente juan = new Cliente("Juan Pérez");

        // Creación de Pedido (Notifica al crearse)
        Pedido pedidoJuan = new Pedido(juan);
        pedidoJuan.agregarProducto(laptop);
        pedidoJuan.agregarProducto(mouse);

        // 3. Calcular Total del Pedido (Usando Pagable)
        double totalPedido = pedidoJuan.calcularTotal();
        System.out.println("\nCalculando Total");
        System.out.println("El total del pedido de " + juan.getNombre() + " es: $" + totalPedido);

        // 4. Pago con Tarjeta de Crédito (Usa PagoConDescuento)
        System.out.println("\nProceso de Pago (Tarjeta con Descuento)");
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(totalPedido);
        if (tarjeta.procesarPago(totalConDescuento)) {
            pedidoJuan.setEstado("PAGADO"); // 5. Cambia estado y Notifica
        } else {
            pedidoJuan.setEstado("FALLO_PAGO"); // 5. Cambia estado y Notifica
        }

        // 4. Pago con PayPal (Usa Pago) - Ejemplo sin descuento
        System.out.println("\nProceso de Pago (PayPal)");
        PayPal paypal = new PayPal();
        if (paypal.procesarPago(totalPedido)) {
            // Esto sería un pedido diferente o un reintento.
            System.out.println("Pago con PayPal procesado.");
        }
    }
}
