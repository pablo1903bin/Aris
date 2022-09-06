package com.mx.logica.aris;

import java.util.Scanner;

/**
 * Crea un programa que recorra los números del 1 al 100,Hay que imprimir en
 * pantalla cuando sean múltiplos de 3 la palabra “Hola” y, cuando sea múltiplos
 * de 5 la palabra “Mundo”. En el lenguaje que tu quieras.
 *
 * @author Pablo_Rosas Portillo
 */
public class Aris {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int num1;
        System.out.println("ingresa un numero grande: ");
        num1 = dato.nextInt();

        int rest;
        int rest2;

        int mul = 3;
        int mul2 = 5;
        for (int i = 1; i <= num1; i++) {

            rest = i % mul;
            rest2 = i % mul2;
            if (rest == 0) {
                System.out.println(i+" es multiplo de "+mul+"  --> " + " Hola");
            }
            if (rest == 0 & rest2 == 0) {
                System.out.println(i +" es multiplo de "+mul2+"   --> " + "Mundo");
            }
        }
    }

}
