package org.educatiom.modulo_I.lesson17_Colecciones.Map;

import java.util.HashMap;

public class SortedMapExample {

    public static void main(String[] args) {

        //SortedMap
        /* Es un mapa que almacena los elementos en orden ascedente por clave. */

        HashMap<Integer, String> names = new HashMap<>();

        System.out.println("========================= put() ========================");
        //put()
        /*Agrega el par de key y value a la colección, si la clave ya existe en la colección, el valor anterior
        se reemplaza por el valor nuevo.*/
        names.put(1, "Colombia");
        names.put(2, "USA");
        names.put(3, "Nueva Zelanda");
        names.put(4, "Brasil");


        //Imprimiendo el Deque
        System.out.println("countries = " + names); //countries = {1=Colombia, 2=USA, 3=Nueva Zelanda, 4=Brasil}

        System.out.println("========================= get() ========================");
        //get()
        /*Muestra el valor segun el indice proporcionado.*/
        System.out.println("El valor del indice 2 es: " + names.get(2));


    }
}
