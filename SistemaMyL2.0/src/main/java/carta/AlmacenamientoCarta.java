/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carta;

import java.util.ArrayList;
import modelo.Edicion;

/**
 *
 * @author arodr
 */
public class AlmacenamientoCarta {

    public AlmacenamientoCarta() {
    }

    public void agregarCarta(ArrayList<Carta> cartas) {
        cartas.add(new Carta("carta", 1500, "rara", 3, 3, Edicion.DinastíaDelDragón));
        cartas.add(new Carta("carta2", 1500, "rara", 3, 2, Edicion.DinastíaDelDragón));
        cartas.add(new Carta("carta3", 1500, "rara", 3, 1, Edicion.DinastíaDelDragón));
        cartas.add(new Carta("carta4", 1500, "rara", 3, 6, Edicion.DinastíaDelDragón));
        cartas.add(new Carta("carta5", 1500, "rara", 3, 4, Edicion.DinastíaDelDragón));
    }
}
