package org.educatiom.modulo_I.lesson21_Excepciones;

public class ExceptionExample03 {

    public static void main(String[] args) {

        //Excepeciones
        /*Ejemplo de Excepción*/

        String texto = null;

        try {
            System.out.println(texto.toUpperCase());
        } catch (Exception e) {
            System.err.println("Cadena nula encontrada");
        }
        System.out.println("Adios..");
    }
}
