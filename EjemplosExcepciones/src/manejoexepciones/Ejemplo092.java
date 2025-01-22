/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);

        while (bandera) {
            try {
                System.out.println("Ingrese el nombre de un pais: ");
                String pais = entrada.nextLine();
                char vocal = pais.charAt(0);

                if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o'
                        || vocal == 'u') {
                    throw new Exception("Ingrese un pais que inicie en "
                            + "consonante");
                }
                bandera = false;

            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
                bandera = false;
            }
        }
    }
}
