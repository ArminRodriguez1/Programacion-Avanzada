/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exepciones;

import java.util.Scanner;

/**
 *
 * @author arodr
 */
public class Division {

    public Division() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los numeros a dividir");
        System.out.println("");
        try {
            int numerador, denominador, resultado;
            System.out.println("Digite el numerador");
            numerador = leer.nextInt();
            System.out.println("Digite el denominador");
            denominador = leer.nextInt();
            resultado = numerador / denominador;
            System.out.println("El resultado es; " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("No se puede divir por 0");
        }

    }

}
