/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;
import modelo.Ayudante;
import modelo.Universidad;

/**
 *
 * @author arodr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Universidad universidad = new Universidad("Universidad de la frontera");
        System.out.println("----- tutor ------- ");
        universidad.asignarClase();
    }
    
}
