package org.educatiom.modulo_I.lesson17_Colecciones.Set;

import java.util.*;

public class HastSetExample {

    public static void main(String[] args) {

        //HastSet
        /*- Implementa la interfaz set por lo que no contiene valores duplicados.
        * - Los elementos en esta colección no tiene indices.
        * - Permite valores nulos.
        * - No mantiene el orden de inserción.
        * - Opción muy utilizada para operaciones de busqueda.
        * - No esta sincronizada por lo que no se accede a elementos aleatorios. */

        HashSet<Integer> numbers  = new HashSet<>();

        System.out.println("========================= add() ========================");
        //add()
        /*Agrega elementos a la colección.*/

        //Agregando números.
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);

        //Mostrnado los números.
        System.out.println("numbers = " + numbers);

        System.out.println("========================= remove() ========================");
        //remove()
        /*Elimina un elemento del HastSet.*/
        System.out.println(numbers.remove(3));

        System.out.println("========================= contains() ========================");
        //contains()
        /*Comprueba si la HastSert tiene un elemento.*/
        System.out.println(numbers.contains(2));


        System.out.println("========================= size() ========================");
        //size()
        /*Muestra la cantridad de elementos de la colección.*/
        System.out.println(numbers.size());


        System.out.println("========================= iterator.next() ========================");
        //iterator()
        /*Recorriendo el HastSet a travez del iterator con el method next, si devuelve true al encontrar un siguiente
         * elemento, conmtinua imprimiendo.*/
        Iterator<Integer> iterator = numbers.iterator(); //numbers = [1, 2, 3, 4, 5, 6]
        //Como se puede ver no muestra según el orden de inserción.
/*
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Iterator = " + iterator.next());
        }*/

        //Utilizando un bucle while
        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }

        System.out.println("========================= clear() ========================");
        //clear()
        /*Borra todos los elementos de la colección.*/
        numbers.clear();
        System.out.println("numbers = " + numbers);


        //Ejercicio 1. Escribir un programa que se despida cuando el usuario diga hola
        HashSet<String> saludo = new HashSet<>();
        saludo.add("Hola");
        saludo.add("Hello");
        saludo.add("Bonjour");
        saludo.add("Ciao");
        saludo.add("namaste");

        Scanner scanner = new Scanner(System.in);
        String srt = scanner.nextLine();

        if (saludo.contains(srt)) {
            System.out.println("Goodbye!");
        }
    }
}
