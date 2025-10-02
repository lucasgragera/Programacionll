/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author lucasgragera
 */
public class Inventario {
    
    private ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        if (buscarProductoPorId(p.getId()) == null) {
            this.productos.add(p);
            System.out.println("Producto agregado: " + p.getNombre());
        } else {
            System.out.println("Ya existe un producto con el ID: " + p.getId());
        }
    }
    
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("\n LISTADO COMPLETO DE PRODUCTOS ");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            this.productos.remove(p);
            return true;
        }
        return false;
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        System.out.println("PRODUCTOS EN CATEGORÍA: " + categoria.name() + " ");
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
                System.out.println(p); // Usa el toString()
            }
        }
        if (filtrados.isEmpty()) {
             System.out.println("No hay productos en esta categoría.");
        }
        return filtrados;
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        // Usamos la API de Streams y Comparator para encontrar el máximo
        return productos.stream()
                        .max(Comparator.comparingInt(Producto::getCantidad))
                        .orElse(null);
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        System.out.println(" PRODUCTOS CON PRECIO ENTRE $" + min + " y $" + max + " ---");
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
                System.out.println(p);
            }
        }
        if (filtrados.isEmpty()) {
             System.out.println("No se encontraron productos en este rango de precio.");
        }
        return filtrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n CATEGORÍAS DISPONIBLES ");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("• " + cat.name() + ": " + cat.getDescripcion());
        }
    }
    
}
