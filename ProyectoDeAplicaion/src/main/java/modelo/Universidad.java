/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arodr
 */
public class Universidad {

    private Carrera[] carrera;
    private ArrayList<Ayudante> arrayAyudante = new ArrayList();
    private Ayudante aux;
    private String nombre;

    public Universidad() {
    }
    
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.carrera = new Carrera[4];
        this.carrera[0] = new Carrera("Medicina", "Medicina");
        this.carrera[1] = new Carrera("Ingeneria informatica", "Ingeniería y Ciencias");
        this.carrera[2] = new Carrera("Pedagogía en Matemática", "Educación, Ciencias Sociales y Humanidades");
        this.carrera[3] = new Carrera("Odontología", "Odontología");
        registrarTutor();
    }

    public void registrarTutor() {
        System.out.println("-------------------- REGISTRO DE TUTORES ------------------------");
        Scanner leer = new Scanner(System.in);
        System.out.println("Cantidad de tutores");
        int cantidadTutor = leer.nextInt();
        for (int i = 0; i < cantidadTutor; i++) {
            System.out.println("Nombre :");
            String nombre = leer.nextLine();
            leer.nextLine();
            System.out.println("Matricula :");
            String matricula = leer.nextLine();
            leer.nextLine();

            aux = new Ayudante();
            aux.setNombre(nombre);
            aux.setMatricula(matricula);
            this.arrayAyudante.add(aux);

        }
        
    }

    public void asignarClase() {
        Scanner leer = new Scanner(System.in);
        System.out.println("----------------------- SELECCION DE CLASE ----------------------");
        System.out.println("********************** Clases Disponibles ***********************");
        mostrarClase();
        System.out.println("Seleccione una opcion");
        System.out.println("1.- Asignar clase");
        System.out.println("2.- Salir");
        int salir = 0;
        int opc = leer.nextInt();
        System.out.println("Elija una clase :");
        String name = leer.nextLine();
        for (int i = 0; i < this.arrayAyudante.size(); i++) {
            if (name.equals(this.carrera[i].getClase().getNombre())) {
                System.out.println("La clase " + this.carrera[i].getClase().getNombre() + " A sido asignada");
                this.carrera[i].getClase().setAyudante(this.arrayAyudante.get(i));
                System.out.println("Ingrese Tema de la clase");
                String tema = leer.nextLine();
                this.carrera[i].getClase().setTema(tema);
                System.out.println("Ingrese fecha de la clase");
                String fecha = leer.nextLine();
                this.carrera[i].getClase().setFecha(fecha);


            }
        }
    }

    public void mostrarClase() {
        for (int i = 0; i < this.carrera.length; i++) {
            System.out.println(this.carrera[i].getClase().getNombre());
        }

    }

}
