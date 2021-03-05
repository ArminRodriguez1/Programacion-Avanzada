/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import carta.Carta;
import static java.lang.System.console;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author arodr
 */
public class Filtrado {

    private final ArrayList<Carta> totalCartas;

    public Filtrado() {
        this.totalCartas = Json.recurperarObjetos();
       }
    public void filtrarPorNombre(String nombreBuscado){
        for (int i = 0; i < totalCartas.size(); i++) {
            if (this.totalCartas.get(i).getNombre().equals(nombreBuscado)) {
                System.out.println(totalCartas.get(i));
            }
        }
    }
}