/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico3;

/**
 *
 * @author lucasgragera
 */
public class Estudiante {
    public String nombre;
    public String apellido;
    public String curso;
    private int calificacion = 5;
    
    public void mostrarInfo(){
        System.out.println(nombre+" "+apellido+" "+curso+" "+calificacion);
    }
    
    public int subirCalificacion(int puntos){
        if(puntos > 0)
            calificacion += puntos;
        return calificacion;
    }
    
    public int bajarCalificacion(int puntos){
        if(puntos > 0)
            calificacion -= puntos;
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
   
}
