package org.educatiom.modulo_I.lesson17_Colecciones.List;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    public static void main(String[] args) {

        //LinkedList
        /*- Implementa una lista doblemente enlazada, por lo que no es un array ya que fucnioan por medio de enlaces dobles.
        * - Presenta gran eficiencia agregando y eliminando elementos.
        * - Muy uttil para trabajar con elementos (incersión o eliminación) de en medio.
        * - Puede almacenar elementos duplicados.
        * - Muy itilizada para implementar el concepto FIFO (Primero en entrar, primero en salir.*/

        Queue<String> customerQueue = new LinkedList<>();
        //Agregando clientes al customer a medida que llegan
        customerQueue.add("Felipe");
        customerQueue.add("Alejandra");
        customerQueue.add("Leidy");
        customerQueue.add("Saul");
        customerQueue.add("Eliany");
        customerQueue.add("Diego");

        System.out.println("Cliente en cola: " + customerQueue); //Muestra los clientes según orden de llegada.

        System.out.println("========================= element() ========================");
        //element()
        /*Muestra el primer elemento en entrar.*/
        System.out.println("Atendiendo al primer cliente: " + customerQueue.element());

        System.out.println("========================= remove() ========================");
        //remove()
        /*Elimina el primer elemento de la LinkedList pero si la lista esta vacia retorna una excepción:
        NoSuchElementException.*/
        System.out.println("Eliminando el primer cliente: " + customerQueue.remove());
        System.out.println("customerQueue = " + customerQueue);

        System.out.println("========================= poll() ========================");
        //poll()
        /*Tambien elimina el primer elemento de la linkedList pero si la lista esta vacia retorna un null en vez
        * de mostrar una excepción.*/
        System.out.println("Eliminando " + customerQueue.poll());
        System.out.println("customerQueue = " + customerQueue);
    }
}
