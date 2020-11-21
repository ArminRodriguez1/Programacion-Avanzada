
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        System.out.println("Ingrese cantidad de horas que juega");
        int hrsDeJuego = leer.nextInt();
        final int hrsMaxima = 24;
        try{
            if (hrsDeJuego < 24) {
                System.out.println("Usted juega " + hrsDeJuego + " horas");
            }
            else{
                throw new Excepcion("Horas de juego incorrectas");
            }   
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
