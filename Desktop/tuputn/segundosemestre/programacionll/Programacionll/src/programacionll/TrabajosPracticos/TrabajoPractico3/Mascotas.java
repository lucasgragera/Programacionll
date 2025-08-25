/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico3;

/**
 *
 * @author lucasgragera
 */
public class Mascotas {
    public String nombre;
    public String especie;
    public int edad;
    
    public void mostrarInfo(){
        System.out.println(nombre+" "+especie+" "+edad);
    }
    
    public int cumplirAnios(int anio){
        if (anio > 0)
            edad += anio;
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
