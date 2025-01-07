package org.educatiom.modulo_I.lesson21_Excepciones;

public class AritmeticExceptionExample {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int z = x / y;
            System.out.println("z = " + z);
        } catch (ArithmeticException e) {
            System.err.println("La division por cero no es posible dentro de los enteros.");
        }
    }
}
