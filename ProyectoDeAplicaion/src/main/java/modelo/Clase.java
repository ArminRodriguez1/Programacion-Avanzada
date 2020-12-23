/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author arodr
 */
public class Clase {
    private String nombre;
    private Ayudante ayudante;
    private String tema;
    private String fecha;
    public Clase(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Ayudante getAyudante() {
        return ayudante;
    }

    public void setAyudante(Ayudante ayudante) {
        this.ayudante = ayudante;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
