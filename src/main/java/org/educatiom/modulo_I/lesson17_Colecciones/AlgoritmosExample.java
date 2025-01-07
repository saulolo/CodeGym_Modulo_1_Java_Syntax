package org.educatiom.modulo_I.lesson17_Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AlgoritmosExample {

    public static void main(String[] args) {

        //Algoritmos
        /*Las colecciones nos proporcionan diferentes algoritmos para diferentes operaciones las cuales se pueden
        * aplicar a las colecciones. Contiene algoritmos principalmente para:
        * - Orden
        * - Busqueda
        * - Arrastramiento
        * - Manipulación rutinaria de datos
        * - Composición
        * - Encontrar valores extremos.*/

        ArrayList<String> books=new ArrayList<>();
        //Agregando libros a la arraylist
        books.add("A Time to Kill");
        books.add("Absalom, Absalom!");
        books.add("The House of Mirth");
        books.add("East of Eden");

        System.out.println("========================= Iterator() ========================");
        //Iterator()
        /*Itera sobre los elemntos del ArrayList.*/

        //Recorre la lista a traves del iterador antes de ordenar
        Iterator itAntesOrdenar = books.iterator();
        while (itAntesOrdenar.hasNext()) {
            System.out.println(itAntesOrdenar.next());
        }

        System.out.println("========================= sort() ========================");
        //sort()
        /*Ordena los elementos por orden ascendente.*/

        //Ordenando los libros
        Collections.sort(books);
        Iterator itDespuesOrdenar = books.iterator();
        while (itDespuesOrdenar.hasNext()) {
            System.out.println(itDespuesOrdenar.next());
        }
    }
}
