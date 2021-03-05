/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.util.Scanner;
import vistas.VentanaBuscar;
import vistas.VentanaMostrarCarta;

/**
 *
 * @author arodr
 */
public class Menu {
private Scanner leer = new Scanner(System.in);
    public Menu() throws IOException, InterruptedException {
        System.out.println("***********ACCION A REALIZAR***********");
        System.out.println("[1] Buscar carta");
        System.out.println("[2] Mostrar todas las cartas");
        System.out.println("[3] Mostrar top cartas");
        System.out.println("[4] Estadisticas generales");
        System.out.println("[5] Salir");
        int opc = leer.nextInt();
        switch(opc){
            case 1:
                VentanaBuscar vn = new VentanaBuscar();break;
            case 2:
               VentanaMostrarCarta mc = new VentanaMostrarCarta();break;
            case 3:
                System.out.println("Top de cartas");break;
            case 4:
                System.out.println("Mazos populares y razas buffeadas con las expanciones");
            case 5:
                System.out.println("Salio");break;
                
        }
    }
    public void mostrarTodasCartas(){
        
    }
    public void cartasFiltradas(){
        
    }
}
