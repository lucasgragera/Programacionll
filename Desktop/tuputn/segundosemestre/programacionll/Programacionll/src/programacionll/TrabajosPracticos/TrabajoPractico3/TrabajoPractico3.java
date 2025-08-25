/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico3;

/**
 *
 * @author lucasgragera
 */
public class TrabajoPractico3 {
    
    public static void main(String[] args){
//
        //1
//        
//        Estudiante lucas = new Estudiante();
//        lucas.setNombre("Lucas");
//        lucas.setApellido("Gragera");
//        lucas.setCurso("Programacion");
//        
//        lucas.mostrarInfo();
//        lucas.subirCalificacion(3);
//        lucas.mostrarInfo();
//        lucas.bajarCalificacion(1);
//        lucas.mostrarInfo();

        //2
        
//        Mascotas theo = new Mascotas();
//        theo.setNombre("Theo");
//        theo.setEspecie("Labrador");
//        theo.setEdad(5);
//        
//        theo.mostrarInfo();
//        theo.cumplirAnios(1);
//        theo.mostrarInfo();

        //3
//        Libro titanic = new Libro();
//        titanic.setTitulo("La historia del Titanic");
//        titanic.setAutor("Lucas Gragera");
//        
//        titanic.mostrarInfo();
//        titanic.setAñoPublicacion(-1999);
//        titanic.mostrarInfo();
//        titanic.setAñoPublicacion(1999);
//        titanic.mostrarInfo();

        //4
        
//        Gallina jarolda = new Gallina();
//        jarolda.setIdGallina(1);
//        jarolda.setEdad(2);
//        jarolda.setHuevosPuestos(5);
//        
//        jarolda.mostrarEstado();
//        jarolda.ponerHuevo(3);
//        jarolda.envejecer(3);
//        jarolda.mostrarEstado();
//        
//        Gallina roberta = new Gallina();
//        roberta.setIdGallina(2);
//        roberta.setEdad(4);
//        roberta.setHuevosPuestos(3);
//        
//        roberta.mostrarEstado();
//        roberta.ponerHuevo(2);
//        roberta.envejecer(3);
//        roberta.mostrarEstado();

        //5
        
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setNombre("Explorador-1");
        nave1.setCombustible(50.0);
        nave1.mostrarEstado();
        
        nave1.avanzar(600);
        nave1.mostrarEstado();
        
        nave1.recargarCombustible(50);
        nave1.mostrarEstado();
        
        nave1.avanzar(500);
        nave1.mostrarEstado();
    }
    
}