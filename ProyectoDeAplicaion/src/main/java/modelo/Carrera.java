/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author arodr
 */
public class Carrera {
    private String nombre;
    private String facultad;
    private Clase clase;
    public Carrera(String nombre, String facultad) {
        System.out.println("Nombre de la clase");
        Scanner leer = new Scanner(System.in);
        String nombreClase = leer.nextLine();
        this.nombre = nombre;
        this.facultad = facultad;
        this.clase = new Clase(nombreClase);
    }
     public void asignarClase(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija una clase :");
        
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
    
    
}
