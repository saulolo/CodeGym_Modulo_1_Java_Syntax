package org.educatiom.modulo_I.lesson11_OpcionalArrays;

import java.util.Arrays;

public class ClaseArrays2 {

    public static void main(String[] args) {

        //Method Arrays.fill()
        /*llena una matriz (se puede hacer con un bucle pero tenemos este method de la clase Arrays que hace lo mismo.
        * Este method solo funciona en arrays unidimensionales.*/
        int[] numbers = {7, 9, 6, 2, 4, 3, 10, 1, 5, 8};
        Arrays.fill(numbers, 2, 6, 999);/* --> primer parámetro: array en cuestion, segundo parámetro:
        posición inicial del array, tercer parámetro: posición final del array(no inclusibe coimo siempre lo hace java
        en estos casos, cuarto parámetro: valor a reemplazar.)*/
        System.out.println(Arrays.toString(numbers));

        //Method Arrays.copyOf()
        /*Copia los elementos de un array en otra para modificar su dimension.*/
        int[] copyNumbers = Arrays.copyOf(numbers, 15); //Si la longitud es menor los valores adicionales se ignoran.
        System.out.println(Arrays.toString(copyNumbers));

        //Method Arrays.copyOfRange()
        /*Crea una nueva matriz pero la llena con los elementos de un lugar arbitrario en la matriz original.*/
        int[] copyNumbersRange = Arrays.copyOfRange(numbers, 5, 9);
        System.out.println(Arrays.toString(copyNumbersRange));

        //Method Arrays.sort()
        /*Ordena la matriz pasada en orden ascendente. El orden puede ser completo o solo parcialmente.*/
        Arrays.sort(numbers); //Ordenamiento completo.
        Arrays.sort(numbers, 3, 7); //Ordenamiento con rango establecido.
        System.out.println(Arrays.toString(numbers));

        System.out.println("=================== binarySearch ===================");
        //Method Arrays.binarySearch()
        /*Busca un valor dado dentro de una matriz la cual se debe pasar ya ordenada.*/
        int index = Arrays.binarySearch(numbers, 2);
        System.out.println(index);
    }
}
