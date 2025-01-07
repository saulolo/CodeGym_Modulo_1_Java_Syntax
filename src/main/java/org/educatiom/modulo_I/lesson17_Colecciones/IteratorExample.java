package org.educatiom.modulo_I.lesson17_Colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        System.out.println("========================= iterator.next() ========================");
        //Iterator
        /*Es un obteto especial asociado a una colección, la cual recorre los elementos de la colección sin repetir
         * ninguno.*/

        HashSet<Integer> ages = new HashSet<>();
        /*Agrega elementos a la colección.*/

        //Agregando Edades.
        ages.add(18);
        ages.add(14);
        ages.add(32);
        ages.add(40);
        ages.add(31);
        ages.add(40);

        //Mostrando los números.
        System.out.println("Edades = " + ages);

        //Creando el objeto Iterador para el conjunto ages..
        Iterator<Integer> iterator = ages.iterator();

        System.out.println("========================= iterator.next() ========================");
        //iterator.next()
        /*Devuelve el siguiente elemento de la colección.*/

        System.out.println("========================= iterator.hasNext() ========================");
        //iterator.hasNext()
        /*Comprueba si aun hay elementos que aun no se han recorrido..*/

        //Mostranado la colección con el iterador utilizando el bucle while
        //Nota: el iterador no muestra elementos repetidos.
        while (iterator.hasNext()) { //Mientras haya elementos
            Integer age = iterator.next(); //Obtener el siguiente elemnto
            System.out.println("age: " + age); //Muestra el elemento en pantalla.
        }
        /*age: 32
        age: 18
        age: 40
        age: 14
        age: 31*/

        //Mostranado la colección con el iterador utilizando el bucle for
/*        for (int i = 0; i < ages.size(); i++) {
            System.out.println("Iterator = " + iterator.next());
        }*/

        System.out.println("========================= iterator.remove() ========================");
        //iterator.remove()
        /*Elimina el elemento actual de la colección.*/
        iterator.remove();
        System.out.println("Edades despues de eliminar: " + ages); //[32, 18, 40, 14]


        /*Nota: No se puede eliminar con el method remove en un bucle foreach, ya que generara un error, pues no se
        puede cambiar una colección mientras la recoore con un iterador.*/

    }
}

