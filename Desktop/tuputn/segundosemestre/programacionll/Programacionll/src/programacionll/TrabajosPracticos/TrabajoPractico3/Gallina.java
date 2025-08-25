/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico3;

/**
 *
 * @author lucasgragera
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void mostrarEstado(){
        System.out.println(idGallina+" "+edad+" "+huevosPuestos);
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public int ponerHuevo(int huevos){
        if (huevos > 0)
            huevosPuestos += huevos;
        return huevosPuestos;    
    }
    public int envejecer(int anios){
        if (anios > 0)
            edad += anios;
        return huevosPuestos;    
    }
}
