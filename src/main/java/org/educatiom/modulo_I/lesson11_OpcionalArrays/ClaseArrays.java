package org.educatiom.modulo_I.lesson11_OpcionalArrays;

import java.util.Arrays;

public class ClaseArrays {

    public static void main(String[] args) {

        //Method Arrays.tosString()
        /*Imprimir una matriz de la clase Arrays*/
        String[] str = {"Saul", "Felipe", "Alejandra", "Leidy"};
        Integer[] age = {40, 39, 38, 37};
        Integer[] numbers1 = {1, 2, 3, 4, 5};
        Integer[] numbers2 = {1, 2, 3, 4, 5};
        Integer[] ageEmpty = {};

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(age));
        System.out.println(Arrays.toString(ageEmpty));

        //Method Arrays.deepToString()
        /*Convertir una matriz bidimensional o de cualesquier dimension en un method de cadena.
        * Este method no funciona con matrices unidimencionales primitivas (ej int[])*/
        int[][] arrayBi = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};
        String deepStr = Arrays.deepToString(str);
        String deepArray = Arrays.deepToString(arrayBi);
        System.out.println(deepStr);
        System.out.println(deepArray);

        //Method Arrays.equals()
        /*Compara referencias de matrices*/
        boolean compareEquals = numbers1.equals(numbers2); //Clase lang
        System.out.println(compareEquals); //-->false (compara es referencias)
        boolean compareArrays = Arrays.equals(numbers1, numbers2);
        System.out.println(compareArrays); //-->true (compara contenido)

        //Method Arrays.deepEquals()
        /*Comparar arreglos multidimensionales.*/
        int[][] arrayBi2 = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};
        int[][] arrayBi3 = {{1, 1}, {2, 2}, {3, 3}};
        boolean compareArraysDeep = Arrays.deepEquals(arrayBi, arrayBi2);
        boolean compareArraysDeep2 = Arrays.deepEquals(arrayBi2, arrayBi3);
        boolean compareEqualsArraysBi = Arrays.equals(arrayBi, arrayBi2);
        System.out.println(compareArraysDeep); //-->true (compara contenido)
        System.out.println(compareArraysDeep2); //-->false (compara contenido)
        System.out.println(compareEqualsArraysBi); //-->false (Equals: compara solo arrays unidimensionales)
    }
}
