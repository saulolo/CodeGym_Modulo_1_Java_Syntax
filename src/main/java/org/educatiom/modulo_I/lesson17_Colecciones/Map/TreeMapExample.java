package org.educatiom.modulo_I.lesson17_Colecciones.Map;

import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {

        //TreeMap
        /*Es una colección tipo diccionario que almacena elementos pares calve-valor ordenandolos por clave.
        * - Poco eficiente en todas sus operaciones.*/


        //Instanciando el TreeMap
        SortedMap<String, Integer> names = new TreeMap<>();

        System.out.println("=============================== put() ===============================");
        //put()
        /*Agrega el par de key y value a la colección. si la clave ya existe en la colección, el valor anterior
        se reemplaza por el valor nuevo.*/
        names.put("Felipe", 5);
        names.put("Sandra", 5);
        names.put("Diego", 5);
        names.put("Eliza", 4);
        names.put("Alvaro", 4);
        names.put("Alejandra", 3);
        names.put("Saul", 4);
        names.put("Saul", 5);

        //Imprimiendo el map
        System.out.println("names = " + names); //names = {Alejandra=3, Alvaro=4, Diego=5, Eliza=4, Felipe=5, Sandra=5, Saul=5}

        System.out.println("=============================== comparador() ===============================");
        //comparador()
        /*es bastante importante para SortedMap/TreeMap. Establece reglas personalizables para ordenar
         * o clasificar el mapa; sino establecemos un comparador, el oreden por defecto es el que se crea con la colección*/
        /*Ejercicio 1. Comparador: Almacenar los elementos ordenados segun la longitud de la clavve tipo cadena, si la
        longitud es igual entonces los ordenara alfabéticamente.*/

        //Impementamos nuestra propia clase comparadora personalizable y sobreescribimos el method compare.
        class LengthCompadaor implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
                Integer lenghComaredResult = Integer.compare(o1.length(), o2.length());
                return lenghComaredResult != 0 ? lenghComaredResult : o1.compareTo(o2);
            }
        }

        //Creamos el objeto que implementara dicha clase
        SortedMap<String, Integer> lengtgComparemap = new TreeMap<>(new LengthCompadaor());
        lengtgComparemap.put("Felipe", 5);
        lengtgComparemap.put("Sandra", 5);
        lengtgComparemap.put("Diego", 5);
        lengtgComparemap.put("Eliza", 4);
        lengtgComparemap.put("Alvaro", 4);
        lengtgComparemap.put("Alejandra", 3);
        lengtgComparemap.put("Saul", 4);
        lengtgComparemap.put("Saul", 5);

        System.out.println("lengtgComparemap = " + lengtgComparemap); //lengtgComparemap = {Saul=5, Diego=5, Eliza=4, Alvaro=4, Felipe=5, Sandra=5, Alejandra=3}

        System.out.println("=============================== firstKey() ===============================");
        //firstKey()
        /*Obtiene la clave del primer valor*/
        System.out.println("firstKey ==> " + lengtgComparemap.firstKey()); //firstKey ==> Saul

        System.out.println("=============================== lastKey() ===============================");
        //lastKey()
        /*Obtiene la clave del ultimo valor*/
        System.out.println("lastKey ==> " + lengtgComparemap.lastKey()); //lastKey ==> Alejandra

        System.out.println("=============================== tailMap() ===============================");
        //tailMap()
        /*Devuelve un SortedMap que contiene todos los elementos del SortedMap original hasta e incluyendo el elemento
        con la clave end.*/
        System.out.println("tailMap ==> " + lengtgComparemap.tailMap("Alvaro")); //tailMap ==> {Alvaro=4, Felipe=5, Sandra=5, Alejandra=3}

        System.out.println("=============================== headMap() ===============================");
        //headMap()
        /*Devuelve un SortedMap que contiene todos los elementos del SortedMap original, comenzando en el elemento con
        la clave start (inclusive).*/
        System.out.println("headMap ==> " + lengtgComparemap.headMap("Alvaro")); // headMap ==> {Saul=5, Diego=5, Eliza=4}

        System.out.println("=============================== subMap() ===============================");
        //subMap()
        /*Devuelve un SortedMap que contiene todos los elementos del SortedMap original, desde el elemento con la clave
        start hasta el elemento con la clave end (no incluyendo end).*/
        System.out.println("subMap ==> " + lengtgComparemap.subMap("Alvaro","Sandra")); //subMap ==> {Alvaro=4, Felipe=5}

    }
}
