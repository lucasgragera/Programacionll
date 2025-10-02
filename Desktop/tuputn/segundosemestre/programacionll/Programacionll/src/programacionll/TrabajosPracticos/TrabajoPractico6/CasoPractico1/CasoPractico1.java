/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico1;

/**
 *
 * @author lucasgragera
 */
public class CasoPractico1 {
    
    public static void main(String[] args) {
        // Inicialización del Inventario
        Inventario inventario = new Inventario();
        
        System.out.println(" INICIO DE TAREAS ");

        // 1. Crear al menos cinco productos y agregarlos al inventario.
        System.out.println("\n[TAREA 1] Creación y adición de productos:");
        inventario.agregarProducto(new Producto("A001", "Smartphone Modelo X", 2500.00, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("H005", "Set de Sábanas King", 1250.50, 40, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("R010", "Pantalón Denim Clásico", 899.90, 80, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("AL02", "Bolsa de Granos de Café", 550.00, 120, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("E002", "Televisor LED 4K", 4500.00, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("H002", "Aspiradora Robótica", 2800.00, 25, CategoriaProducto.HOGAR));


        // 2. Listar todos los productos mostrando su información y categoría.
        // Se utiliza p.mostrarInfo() para cumplir con el método de la clase Producto.
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n[TAREA 3] Búsqueda de producto por ID (H005):");
        Producto productoBuscado = inventario.buscarProductoPorId("H005");
        if (productoBuscado != null) {
            System.out.print("Encontrado: ");
            productoBuscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica (HOGAR).
        System.out.println("\n[TAREA 4] Filtrar por categoría HOGAR:");
        inventario.filtrarPorCategoria(CategoriaProducto.HOGAR);

        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n[TAREA 5] Eliminación de producto (R010) y listado restante:");
        if (inventario.eliminarProducto("R010")) {
            System.out.println("Producto R010 eliminado con éxito.");
        } else {
            System.out.println("No se pudo eliminar el producto R010 (ID no encontrado).");
        }
        inventario.listarProductos();

        // 6. Actualizar el stock de un producto existente (A001).
        System.out.println("\n[TAREA 6] Actualizar stock del Smartphone (A001):");
        if (inventario.actualizarStock("A001", 20)) {
            System.out.println("Stock de A001 actualizado a 20.");
            inventario.buscarProductoPorId("A001").mostrarInfo();
        } else {
            System.out.println("ERROR: No se pudo actualizar el stock.");
        }

        // 7. Mostrar el total de stock disponible.
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("\n[TAREA 7] Total de stock disponible:" + totalStock + " unidades.");

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("\n[TAREA 8] Producto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con más unidades: " + mayorStock); // Usa el toString()
        } else {
            System.out.println("El inventario está vacío.");
        }

        // 9. Filtrar productos con precios entre $1000 y $3000.
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);

        // 10. Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();
        
        System.out.println(" FIN DE TAREAS ");
    
    }
}
