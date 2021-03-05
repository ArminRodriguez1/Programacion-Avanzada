/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import carta.AlmacenamientoCarta;
import carta.Carta;
import java.util.ArrayList;

/**
 *
 * @author arodr
 */
public class Filtrado {

    private final ArrayList<Carta> totalCartas = new ArrayList<>();
    public Filtrado() {
        AlmacenamientoCarta ac = new AlmacenamientoCarta();
        ac.agregarCarta(totalCartas);
       }
    public void filtrarPorNombre(String nombreBuscado){
        for (int i = 0; i < totalCartas.size(); i++) {
            if (this.totalCartas.get(i).getNombre().equals(nombreBuscado)) {
                System.out.println(totalCartas.get(i));
            }
        }
    }
}