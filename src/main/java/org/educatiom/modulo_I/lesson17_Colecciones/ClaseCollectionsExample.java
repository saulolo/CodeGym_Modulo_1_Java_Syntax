package org.educatiom.modulo_I.lesson17_Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClaseCollectionsExample {

    public static void main(String[] args) {

        //Collections
        /*java tiene una clase estática llamda Collectios que tiene muchos methods utiles para trabajar con colecciones.*/


        System.out.println("========================= addAll() ========================");
        //addAll()
        /*Agrega elementos a la colección*/
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6);

        //Muestro la lista
        for (Integer number : numbers) {
            System.out.println("Numero: " + number);
        }

        System.out.println("========================= fill() ========================");
        //fill()
        /*Reemplaza todos los elementos de la colección por el elemento objeto.*/
        Collections.fill(numbers, 10);
        for (Integer i : numbers) {
            System.out.println(i);
        }

        System.out.println("========================= nCopies() ========================");
        //nCopies()
        /*Devuelve una lista de nCopias del objeto elemento. La lista devuelta es inutable, o sea que no se puede cambiar,
        * Solo se puede usar para ver los valores.*/
        List<Integer> listCopy = Collections.nCopies(3, 4);

        //Copiando la lista
        ArrayList<Integer> list = new ArrayList<>(listCopy);

        //Nota Con un for-each nos e pueden eliminar elementos ni modificar porque precisamente, esta recorriendo un bucle.
        for (Integer s : list) {
            System.out.println(s);
        }

        System.out.println("========================= replaceAll() ========================");
        //replaceAll()
        /*Reemplaza todos las instancias de la colección de un valor a otro de la colección.*/
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Collections.replaceAll(arrayList, 2, 20);
        for (Integer i : arrayList) {
            System.out.println(i);
        }

        System.out.println("========================= copy() ========================");
        //copy()
        /*Copia todos los elementos de una lista a otra.*/
        ArrayList<Integer> arrayListCopy = new ArrayList<>();
        Collections.addAll(arrayListCopy, 10, 20, 30, 40, 50);

        //Copiando a colección
        Collections.copy(arrayListCopy, arrayList);
        for (Integer cop : arrayListCopy) {
            System.out.println(cop);
        }

        System.out.println("========================= sort() ========================");
        //sort()
        /*Ordena la lista en forma ascendente.*/
        Collections.sort(arrayListCopy);

        for (Integer or : arrayListCopy) {
            System.out.println(or);
        }

        System.out.println("========================= reverse() ========================");
        //reverse()
        /*Invierte el orden de los elementos de la lista pasada.*/
        Collections.reverse(arrayListCopy);

        for (Integer rev : arrayListCopy) {
            System.out.println(rev);
        }

        System.out.println("========================= rotate() ========================");
        //rotate()
        /*Desplaza ciclicamente los elementos de la lista pasada por número de posiciones hacia adelante .*/
        Collections.rotate(arrayListCopy, 2);

        for (Integer rot : arrayListCopy) {
            System.out.println(rot);
        }

        System.out.println("========================= shuffle() ========================");
        //shuffle()
        /*Mezcla alatoriamente los elementos de la lista.*/
        Collections.shuffle(arrayListCopy);

        for (Integer sh : arrayListCopy) {
            System.out.println(sh);
        }

        System.out.println("========================= min() ========================");
        //min()
        /*Devuelve el elemento minimo de la colección.*/
        int min = Collections.min(arrayListCopy);
        System.out.println("min = " + min);

        System.out.println("========================= max() ========================");
        //max()
        /*Devuelve el elemento maximo de la colección.*/
        int max = Collections.max(arrayListCopy);
        System.out.println("max = " + max);

        System.out.println("========================= frequency() ========================");
        //frequency()
        /*Cuenta el número de veces que un elemento aparece en la colección.*/
        int frecuencia = Collections.frequency(arrayListCopy, 50);
        System.out.println("frecuencia = " + frecuencia);

        System.out.println("========================= binarySearch() ========================");
        //binarySearch()
        /*Busca una clave en una lista ordenada y devuelve el indice correspondiente.*/
        int index = Collections.binarySearch(arrayListCopy, 1);
        System.out.println("index = " + index);

        System.out.println("========================= disjoint() ========================");
        //disjoint()
        /*Regresa true si las colecciones que se le pasan no tiene ningun elemento en comúb.*/
        boolean comun = Collections.disjoint(arrayListCopy, arrayList);
        System.out.println("comun = " + comun);


        System.out.println("========================= Ejercicio 2. ========================");
        //Ejercicio 2. Crear una lista de planetas.

        //Creación expclicita del objeto mediande el constructor.
        String mercury = new String("Mercury");
        String venus = new String("Venus");
        String earth = new String("Earth");
        String mars = new String("Mars");
        String jupiter = new String("Jupiter");
        String saturn = new String("Saturn");
        String uranus = new String("Uranus");
        String neptune = new String("Neptune");

        //Pasar la lista de objetos a un ArrayList explcitamente.
        ArrayList<String> planets = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune));

        //Ordenando la lista alfabeticamente.
        Collections.sort(planets);
        System.out.println("planets = " + planets);

        //Imprimiendo el valor minimo y maximo.
        System.out.println(Collections.min(planets));
        System.out.println(Collections.max(planets));

        //Imprimienod la colección al reves
        Collections.reverse(planets);
        System.out.println("planets = " + planets);

        //Ingresando otra coleccíon en este caso la misma.
        Collections.shuffle(planets);
        System.out.println("planets = " + planets);
    }
}
