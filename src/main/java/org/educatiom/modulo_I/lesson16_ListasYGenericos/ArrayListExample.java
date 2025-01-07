package org.educatiom.modulo_I.lesson16_ListasYGenericos;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        //ArrayList
        /*Es un array pero redimensionable, ya que un array normal no se le puede cambiar su dimensión una vez
        * ya creada; la clase arrayList, no posee las desventajas que tiene un array, los arrayList pueden:
        * - Almacenar elementos de un mismo tipo.
        * - Redimensionar dinamicamente las listas.
        * - Agregar elementos al final de la lista.
        * - Insertar elementos al final o al medio de la lista.
        * - Eliminar elementos de cualquier parte de la lista. */

        /*Nota: Las colecciones no pueden almacenar tipos primitivos, solo tipos de referencias (Objetos).*/
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();


        //Methods de ArrayList

        System.out.println("================================ add() ================================");
        //add()
        /*Agrega un elemento a la lista.*/
        names.add("Saul");
        names.add("Felipe");
        names.add(1, "Alejandra");  //Agrega el elemento en una posición especifica.
        System.out.println(names); // [Saul, Alejandra, Felipe]

        System.out.println("================================ size() ================================");
        //size()
        /*Devuelve el número de elementos de la lista (Tamaño).*/
        System.out.println(names.size()); // 3

        System.out.println("================================ toArray() ================================");
        //toArray()
        /*Convierte un ArrayList a un array normal.*/
        String[] namesArray = names.toArray(new String[0]);
        for (int i = 0; i < namesArray.length; i++) {
            System.out.println(namesArray[i]);
        }

        System.out.println("================================ size() ================================");
        //size()
        /*Devuelve el número de elementos de la lista (Tamaño).*/
        System.out.println(names.size()); // 3

        System.out.println("================================ get() ================================");
        //get()
        /*Devuelve un elemento de la lista de una posicicón especifica.*/
        System.out.println(names.get(1));  // Felipe

        System.out.println("================================ set() ================================");
        //set()
        /*Se asigna un valor (value) al elemento cuyo indice es index.*/
        names.set(2, "Diego");
        System.out.println(names.get(2));  // Diego

        System.out.println("================================ remove() ================================");
        //remove()
        /*Elimina un elemento por indice. Devuelve el elemento eliminado.*/
        names.remove(2);
        System.out.println(names);  //[Saul, Alejandra]
        boolean remove = names.remove("Alejandra");
        System.out.println(names); //[Saul]

        System.out.println("================================ clear() ================================");
        //clear()
        /*Borra la lista completa.*/
        names.clear();
        System.out.println(names);  //[]

        System.out.println("================================ contains() ================================");
        //contains()
        /*Comprueba si la lista tiene algun valor.*/
        boolean contains = names.contains("Saul");
        System.out.println(contains);  //false

        System.out.println("================================ isEmpty() ================================");
        //isEmpty()
        /*Comprueba si la lista esta vacia o no, o sea si la longitud de la lista es cero.*/
        boolean empty = names.isEmpty();
        System.out.println(empty);  //true

        System.out.println("============================ Array vs ArrayList =============================");
        //Comparación de Array vs ArrayList
        /*           Arrays                                                  ArrayList*/
        String[] array = new String[10];  /* <--Crear el objeto--> */   ArrayList<String> arrayList = new ArrayList<>();
        //String s = array[1];            /* <--Obtener un elemento--> */ String s1 = arrayList.get(1);
        //array[0] = "Carlos";            /* <--Settear un elemento--> */ arrayList.set(0, "Carlos");
        //int count = array.length;        /* <--Tamaño del array--> */   int counts = arrayList.size();

        /*Nota: Los programadores usan arrayList por los otros methods que los arrays simples no tienen, tales como:
        * - Agregar un elemento a la lista.
        * - Agregar un elemento al medio de la lista.
        * - Buscar un elemento de la lisra.
        * - Eliminar un elemento de la lista.*/


        System.out.println("============== Comparación ejercicio Array vs ArrayList ======================");
        /*Leer 10 cadenas del teclado y mostrar en pantalla el orden inverso.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Array ========");
        /*Array*/
        String[] matriz = new String[10];

        //llenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            String word = scanner.nextLine();
            matriz[i] = word;
        }

        //Mostrar la matriz en orden inversa
        for (int i = 0; i < matriz.length; i++) {
            int inverso = matriz.length - i - 1;
            System.out.println(matriz[inverso]);
        }

        System.out.println("======= ArrayList ========");
        /*ArrayList*/
        ArrayList<String> stringArrayList = new ArrayList<>();

        //llenar el arrayList
        for (int i = 0; i < stringArrayList.size(); i++) {
            String word = scanner.nextLine();
            stringArrayList.add(word);
        }

        //Mostrar el arrayList en orden inversa
        for (int i = 0; i < stringArrayList.size(); i++) {
            int inverso = stringArrayList.size() - 1 - i;
            System.out.println(stringArrayList.get(inverso));
        }

        System.out.println("======= Ejercicios con ArrayList ========");
        //Ejercicios con ArrayList
        /*1. Enumere los números pares que hay entre el 1 y el 20.*/
        ArrayList<Integer> numbersList = new ArrayList<>();

        //Llenado de la lista
        for (int i = 0; i < 20; i++) {
            if (i% 2 == 0) {
                numbersList.add(i); //Recorre toda la lista y agrega aquellos que son pares.
            }
        }

        //Mirando la lista
        for (int i = 0; i < 20; i++) {
            System.out.println(numbersList.get(i));
        }


        /*2. Eliminar todos los elementos que son divisibles por 4. Tener en cuenta que cada que un elemento se
        elimina, la lista se actualiza cambiando de posición los elementos restantes.*/
        ArrayList<Integer> integers = new ArrayList<>();

        //Llenado de la lista
        for (int i = 0; i < 20; i++) {
            if (i% 2 == 0) {
                integers.add(i); //Recorre toda la lista y agrega aquellos que son pares.
            }
        }

        //Recoorre ellemento a elemento
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) %4 == 0) {  //si un elemento es divivisible por 4
                integers.remove(i);   //Elimina el elemento
                i--;   //Disminuye el contador para que obtengamos el mismo indice en la proxima iteración.
            }
        }

        /*Nota: Los elementos deben eliminarse desde el final o desde otra ubicación constante ya que los elementos
        * se desplazan uno tras otro despues de cada operación de eliminación.*/

        //Iniciación rapida de matrices de colecciones
        /*Manera Convencional:*/
        var list = new ArrayList<String >();
        list.add("Mavilia");
        list.add("Hernando");
        list.add("Vanessa");

        /*Con Sugar sintático:*/
        var list2 = new ArrayList<String >() {
            {
                add("Eliany");
                add("Liliana");
                add("Diego");
            }
        };



        










    }
}
