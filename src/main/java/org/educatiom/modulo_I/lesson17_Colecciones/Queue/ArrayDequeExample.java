package org.educatiom.modulo_I.lesson17_Colecciones.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeExample {

    public static void main(String[] args) {

        //Deque
        /*- Implementa la interfaz Deque por lo que permite operaciones en ambos extremos.
        * - No permite valores nulos.
        * - Es mas rápido que Stack y LinkedList
        * - No tiene restricción de tamaño.
        * - No esta sincronizado por lo que no es seguro para subprocesos. */

        Deque<String> numbersWords = new ArrayDeque<>();

        //Agregando números en letras.
        numbersWords.add("Uno");
        numbersWords.add("Dos");
        numbersWords.add("Tres");
        numbersWords.add("Cuatro");
        numbersWords.add("Cinco");
        
        //Imprimiendo el Deque
        System.out.println("numbersWords = " + numbersWords); //numbersWords = [Uno, Dos, Tres, Cuatro, Cinco]


        System.out.println("========================= iterator.next() ========================");
        //iterator()
        /*Recorriendo el Deque a travez del iterator con el method next, si devuelve true al encontrar un siguiente
         * elemento, conmtinua imprimiendo.*/
        Iterator<String> iterator = numbersWords.iterator();
        //Como se puede ver no muestra según el orden de inserción.
/*
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Iterator = " + iterator.next());
        }*/

        //Utilizando un bucle while
        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }
        /*iterator = Uno
        iterator = Dos
        iterator = Tres
        iterator = Cuatro
        iterator = Cinco*/

        System.out.println("=================================== addFirst() =====================================");
        //addFirst()
        /*Agrega elementos al principio de la fila.*/
        numbersWords.addFirst("Cero");
        System.out.println(numbersWords);

        System.out.println("=================================== addLast() =====================================");
        //addLast()
        /*Agrega elementos al final de la fila.*/
        numbersWords.addLast("Seis");
        System.out.println(numbersWords);

        System.out.println("=================================== getFirst() =====================================");
        //getFirst()
        /*Devuelve el primer elemento de la fila.*/
        System.out.println(numbersWords.getFirst());

        System.out.println("=================================== getLast() =====================================");
        //getLast()
        /*Devuelve el ultimo elemento de la fila.*/
        System.out.println(numbersWords.getLast());

        System.out.println("=================================== offerFirst() =====================================");
        //offerFirst()
        /*Agrega un elemento al principio de la fila y devuelve true si el elemnto es agregado o false de lo contrario.*/
        System.out.println(numbersWords.offerFirst("menos uno"));

        System.out.println("=================================== offerLast() =====================================");
        //offerLast()
        /*Agrega un elemento al final de la fila y devuelve true si el elemnto es agregado o false de lo contrario.*/
        System.out.println(numbersWords.offerLast("siete"));

        System.out.println("=================================== pop() =====================================");
        //pop()
        /*Obtiene el primer elemento de la fila y lo elimina.*/
        System.out.println(numbersWords.pop());

        System.out.println("=================================== push() =====================================");
        //push()
        /*Agrega el elemento al principio de la fila.*/
        numbersWords.push("Ocho");
        System.out.println(numbersWords);

        System.out.println("=================================== peekFirst() =====================================");
        //peekFirst()
        /*Devuelve el primer elemento de la fila pero no lo elimina.*/
        System.out.println(numbersWords.peekFirst());

        System.out.println("=================================== peekLast() =====================================");
        //peekFirst()
        /*Devuelve el ultimo elemento de la fila pero no lo elimina.*/
        System.out.println(numbersWords.peekLast());

        System.out.println("=================================== pollFirst() =====================================");
        //pollFirst()
        /*Devuelve y elimina el primer elemento de la fila. Null si no hay elementos*/
        System.out.println(numbersWords.pollFirst());

        System.out.println("=================================== pollLast() =====================================");
        //pollLast()
        /*Devuelve y elimina el ultimo elemento de la fila. Null si no hay elementos*/
        System.out.println(numbersWords.pollLast());

        /*Nota: La diferencia entre pop() y poll() es que pop() lanzará una NoSuchElementException si la lista está
        vacía, pero poll() devolverá null.*/

        System.out.println("=================================== removeLast() =====================================");
        //removeLast()
        /*Devuelve y elimina el ultimo elemento de la cola. Excepción si no hay elementos*/
        System.out.println(numbersWords.removeLast());

        System.out.println("=================================== removeFirst() =====================================");
        //removeFirst()
        /*Devuelve y elimina el primer elemento de la cola. Excepción si no hay elementos*/
        System.out.println(numbersWords.removeFirst());

        System.out.println("=================================== removeFirstOcurrence() =====================================");
        //removeFirstOcurrence()
        /*Elimina la primer ocurrencia de la cola.*/
        numbersWords.removeFirstOccurrence("cero");
        System.out.println(numbersWords);

        System.out.println("=================================== removelastOcurrence() =====================================");
        //removelastOcurrence()
        /*Elimina la ultima ocurrencia de la cola.*/
        numbersWords.removeLastOccurrence("siete");
        System.out.println(numbersWords);

        System.out.println("=================================== IMPRESIÓN DEFINITIVA() =====================================");
        System.out.println("numbersWords = " + numbersWords);
    }
}