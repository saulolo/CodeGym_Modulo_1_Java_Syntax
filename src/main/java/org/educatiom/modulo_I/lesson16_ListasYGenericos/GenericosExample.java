package org.educatiom.modulo_I.lesson16_ListasYGenericos;

import java.util.ArrayList;

public class GenericosExample {

    /*Ejercicio 1. Sumar los números en una colección de enteros.*/
    public int sum(ArrayList<Integer> numbers) {
        int result = 0;
        for (int i = 0; i < numbers.size(); i++)
            result = result + numbers.get(i);
        return  result;
    };

    public static void main(String[] args) {

        //Genericos
        /*Si el tipo de variable y el tipo de objeto no coinciden, se lanza una ClassCastException.
         * Un genérico en Java significa la capacidad de agregar parámetros de tipo a los tipos, en
         * pocas palabras un generico es una característica que permite crear clases, interfaces y
         * métodos que funcionen con cualquier tipo de dato sin necesidad de especificarlo previamente ej:*/
        ArrayList<Integer> listExample;  //Creando variables.
        listExample = new ArrayList<Integer>(); //Creando objetos.
        ArrayList<Integer>[] arrayLists; //Creando arreglos.

    }
}



