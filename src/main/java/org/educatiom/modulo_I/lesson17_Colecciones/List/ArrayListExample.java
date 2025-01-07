package org.educatiom.modulo_I.lesson17_Colecciones.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        //ArrayList
        /* - Mantiene el orden de inserción y utiliza una matriz dinámica para almacenar elementos de diferentes tipos
        * de datos.
        * - Los elementos se pueden duplicar.
        * - No esta sincronizada.
        * - Puede almacenar valores nulos.
        * - Muy rapida accediendo a elementos.
        * - Se adapta a un gran número de escenarios.
        * - Muy utilizada cuanbdo no sabemos cuantos elmentos vamos a ingresar.*/

        ArrayList<String> libros = new ArrayList<>();
        //Agregando libros
        libros.add("Habitos Atómicos");
        libros.add("Cien años de soledad");
        libros.add("Viaje al centor de la tierra");
        libros.add("Los hijos del capitan Grant");

        //Imprimiendo los libros
        System.out.println("libros = " + libros); //libros = [Habitos Atómicos, Cien años de soledad, Viaje al centor de la tierra., Los hijos del capitan Grant]

        System.out.println("========================= iterator.next() ========================");
        //iterator()
        /*Recorriendo el ArrayList a travez del iterator. con el m;etodo next, si devuelve true al encontrar un siguiente
        * elemento, conmtinua imprimiendo.*/
        Iterator<String> iterator = libros.iterator();

        for (int i = 0; i < libros.size(); i++) {
            System.out.println("Iterator = " + iterator.next());
        }

        //Utilizando un bucle while
/*        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }*/

        System.out.println("========================= Métodos para eliminar en colecciones. ========================");
        System.out.println("========================= 1. remove() con bucle for i ========================");
        /*Elimina el elemento recorrienmdo un bucle pero este method no es adecuado para las colecciones HashSet y HashMap.*/
        for (int i = 0; i < libros.size(); i++) {
            String libro = libros.get(i);
            if (libro.equals("Cien años de soledad")) {
                libros.remove(libro);
                i--; //Necesitamos disminuir i, porque la operación de eliminación desplazó los elementos
            }
        }

        System.out.println("Libros que quedaron despues de eliminar con el for i: " + libros);


        System.out.println("========================= 2. remove() con un Iterador ========================");
        /*Elimina el elemento recorrienmdo un bucle con un iterador => Es el mejor metodo para eliminar en colecciones.*/
        Iterator<String> iterator2 = libros.iterator();
        while (iterator2.hasNext()) {
            String str = iterator2.next();
            if (str.equals("Viaje al centor de la tierra")) iterator2.remove();
        }
        //Nota: Se necesita un iterador por cada elemento a eliminar.

        System.out.println("Eliminado un elemento con el 2do metodo: " + libros);//[Habitos Atómicos, Los hijos del capitan Grant]

        System.out.println("========================= 3. remove() con un una copia de la colección ========================");
        /*Se crea una copia de la colección y luego usar la corpia con un foreach para eliminar elementos de la colección
        * original.*/
        ArrayList<String> librosCopia = new ArrayList<>(libros); //Creo una copia de la coleccion de libros.

        //Bucle For-Each
        /*Es un tipo de bucle for que se utiliza cuando se necesita procesar todos los elementos de una matriz o
        * colección.*/

        for (String s : librosCopia) {
            if (s.equals("Los hijos del capitan Grant")) {
                libros.remove(s);
            }
        }

        System.out.println("Eliminado un elemento con el 3do método: " + libros);//[Habitos Atómicos]
    }
}
