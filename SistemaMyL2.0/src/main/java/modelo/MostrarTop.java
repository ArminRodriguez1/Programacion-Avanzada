/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import carta.AlmacenamientoCarta;
import carta.Carta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author arodr
 */
public class MostrarTop {

    ArrayList<Carta> top = new ArrayList<>();

    public MostrarTop() {
        AlmacenamientoCarta ac = new AlmacenamientoCarta();
        ac.agregarCarta(this.top);

    }

    public void agregarTop() {
        Collections.sort(this.top);
        int cont = 0;
        for (Carta aux : this.top) {
            System.out.println("PUESTO " + this.top.get(cont).getPuesto());
            System.out.println("NOMBRE DE LA CARTA : " + this.top.get(cont).getNombre());
            System.out.println("COSTE EN ORO DE LA CARTA : " + this.top.get(cont).getCoste());
            System.out.println("PRECIO EN CLP DE LA CARTA : " + this.top.get(cont).getPrecio());
            System.out.println("RAREZA DE LA CARTA : " + this.top.get(cont).getRareza());
            System.out.println("EDICION DE LA CARTA : " + this.top.get(cont).getEdicion());
            System.out.println("*********************************************************");
            cont++;
        }
    }
}
