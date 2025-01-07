package org.educatiom.modulo_I.lesson17_Colecciones.Map;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        //HashMap
        /*- Almacena elementos por clave y valor (Tambien se le conoce como diccionarios) Es la implementación de Map
        mas utilizada.
        * - No permite valores nulos.
        * - No permite claves iguales.
        * - No garantiza el orden de la inserción.
        * - No esta sincronizado. */

        HashMap<Integer, String> countries = new HashMap<>();

        System.out.println("========================= put() ========================");
        //put()
        /*Agrega el par de key y value a la colección, si la clave ya existe en la colección, el valor anterior
        se reemplaza por el valor nuevo.*/
        countries.put(1, "Colombia");
        countries.put(2, "USA");
        countries.put(3, "Nueva Zelanda");
        countries.put(4, "Brasil");


        //Imprimiendo el Deque
        System.out.println("countries = " + countries); //countries = {1=Colombia, 2=USA, 3=Nueva Zelanda, 4=Brasil}

        System.out.println("========================= get() ========================");
        //get()
        /*Muestra el valor segun el indice proporcionado.*/
        System.out.println("El valor del indice 2 es: " + countries.get(2));

        System.out.println("========================= containsKey() ========================");
        //containsKey()
        /*Comprueba si existe una clave en la colección.*/
        System.out.println(countries.containsKey(2)); //true

        System.out.println("========================= containsValue() ========================");
        //containsValue()
        /*Comprueba si existe un valor en la colección.*/
        System.out.println(countries.containsValue("USA")); //true

        System.out.println("========================= remove() ========================");
        //remove()
        /*Elimina un elemento de la colección.*/
        System.out.println(countries.remove(3));

        System.out.println("========================= size() ========================");
        //size()
        /*Devuelve la coantdad de claves-valor de la colección.*/
        System.out.println(countries.size());

        System.out.println("========================= Map.Entry() ========================");
        //Map.Entry()
        /*Recorriendo el HashMap para iterar seguin su clave y valor.*/
        for (Map.Entry m : countries.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        /*1 Colombia
        2 USA
        3 Nueva Zelanda
        4 Brasil
        */

        System.out.println("========================= keySet() ========================");
        //keySet()
        /*Para mostrar todas las entradas de HashMap lo hacemos con un bucle pero no con un for i porque las entradas
        * no estan enumeradas secuencialmente, por lo tanto no podemos usar un contador asi que por eso usamos un keyset.*/
        for (Integer key : countries.keySet()) {
            String value = countries.get(key);
            System.out.println(key + " --> " + value);
        }

    }
}
