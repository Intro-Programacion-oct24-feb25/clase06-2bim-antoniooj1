/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        try {

            int valor1 = 10;
            int valor2 = 0;
            int resultado = valor1 / valor2;

            System.out.printf("Resultado %d\n", resultado);
        } catch (ArithmeticException arithmeticException) {
        }
        System.out.println("continuamos");
    }

}


