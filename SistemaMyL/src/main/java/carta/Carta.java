/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carta;

import modelo.Edicion;

/**
 *
 * @author arodr
 */
public class Carta {
    private String nombre;
    private int precio;
    private String rareza;
    private int coste;
    private int puesto;
    private String edicion;

    public Carta(String nombre, int precio, String rareza, int coste, int puesto, String edicion) {
        this.nombre = nombre;
        this.precio = precio;
        this.rareza = rareza;
        this.coste = coste;
        this.puesto = puesto;
        this.edicion = edicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", precio=" + precio + ", rareza=" + rareza + ", coste=" + coste + ", puesto=" + puesto + ", edicion=" + edicion + '}';
    }
    
    
    
}
