import javax.swing.JOptionPane;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      //Yo quiero realizar una calculadora de dos numeros que sume, reste, multiplique y divida, y quiero realizar estas acciones todas las veces que quiera.
       Scanner leer = new Scanner(System.in);
       int opc = 10;
        while(opc !=0){
        System.out.println("Seleccione una opcion");
        System.out.println("[1] sumar");
        System.out.println("[2] restar");
        System.out.println("[3] dividir");
        System.out.println("[4] multiplicar");
        System.out.println("[0] Salir");
        opc = leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingrese los numeros a sunar");
                    int a = leer.nextInt();
                    int b = leer.nextInt();
                    int suma = a + b;
                    System.out.println("El resultado de la suna es : " + suma);break;
                case 2:
                    System.out.println("Ingrese los numeros a restar");
                    int c = leer.nextInt();
                    int d = leer.nextInt();
                    int resta= c-d;
                    System.out.println("El resultado de la resta es : " + resta);break;
                case 3:
                    System.out.println("Ingrese los numeros a dividir");
                    int e = leer.nextInt();
                    int f = leer.nextInt();
                    int division = e/f;
                    System.out.println("El resultado de la division es : " + division);break;
                case 4:
                    System.out.println("Ingrese los numeros a multiplicar");
                    int g = leer.nextInt();
                    int h = leer.nextInt();
                    int multiplicar = g+h;
                    System.out.println("El resultado de la multiplcacion es : " + multiplicar);break;
                case 0:
                    System.out.println("Adios");break;
                default:
                    System.out.println("Opcion no valida");break;
            }
        } //claudio x2, y francisco.

    }
}