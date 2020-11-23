/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

/**
 *
 * @author diegonarvaez
 */
public class Algorithm {

    public static void main(String[] args) {
        Algorithm algo = new Algorithm();

        System.out.println(algo.convertTransposition("EL Gato come comida"));

        System.out.println(algo.convertCesar("JUAN"));

    }

    public String convertTransposition(String mensaje) {

        if (validate_letter(mensaje)) {

            String convert = mensaje.replace(" ", "").toUpperCase();
            String R1 = "";

            String R2 = "";

            for (int i = 0; i < convert.length(); i++) {
                if (i % 2 == 0) {
                    R1 += convert.charAt(i);
                } else {
                    R2 += convert.charAt(i);
                }

            }

            if (convert.length() % 2 == 1) {
                R2 += "X";
            }

            return R1 + R2;
        } else {
            return "Formato no válido";
        }

    }

    public boolean validate_letter(String c) {
        boolean res = false;

        c = c.toUpperCase();

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z' || c.charAt(i) == ' ') {
                res = true;
            } else {
                res = false;
                break;
            }
        }

        return res;
    }

    public String convertCesar(String mensaje) {
        if (validate_letter(mensaje)) {

            String convert = mensaje.replace(" ", "").toUpperCase();

            int n = (int) (Math.random() * (27 - 0)) + 0;
            //int n = 5;

            System.out.println(n);

            String resultado = "";

            char[] array = Array.array;
            int nuevoValor = 0;

            for (int i = 0; i < convert.length(); i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == convert.charAt(i)) {
                        int newPosition = j + n;

                        if (newPosition > 26) {
                            newPosition = newPosition - 26;
                        }

                        resultado += array[newPosition];
                        break;
                    }

                }

            }

            return resultado;
        } else {
            return "Formato no válido";
        }
    }

}
