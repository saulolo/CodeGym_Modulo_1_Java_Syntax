package org.educatiom.modulo_I.lesson17_Colecciones;

public class ConcejosSobreColecciones {

    public static void main(String[] args) {

        //List
        /*List es lo más cercano posible a un simple array. Esta colección nos permite almacenar convenientemente una
         lista de objetos del mismo tipo sin preocuparnos por el tamaño de la colección en sí, como tendríamos que hacer
          si estuviéramos usando un array. Los elementos de la colección se acceden por índice. Si sabemos exactamente
          dónde está un objeto y necesitamos acceder a él con frecuencia sin tener que agregar o eliminar elementos con
          frecuencia, una List es ideal.*/

        //Set
        /*Set tiene una estructura completamente diferente. Set es más adecuado cuando necesitamos almacenar objetos
        únicos. Por ejemplo, un conjunto de autores en una biblioteca donde cada autor es único. Pero no podemos
        simplemente tomar cualquier autor específico de ella. Set nos permite verificar rápidamente si un autor
        particular está presente en nuestra biblioteca, es decir, podemos verificar si un objeto único está presente en
        un Set. También podemos iterar sobre toda la colección, accediendo a cada elemento, pero hacerlo no es óptimo.
        En otras palabras, para nuestra biblioteca, un Set puede representar la colección de todos los autores únicos
        para verificar rápidamente si algún autor en particular está presente.*/

        //Map
        /*Mapa es más como una archivo, donde cada archivo está firmado y puede almacenar objetos individuales o
        estructuras enteras. Mapa se debe utilizar en casos en los que necesitamos mantener una asignación de un valor a
        otro. Para Mapa, estas relaciones se llaman pares clave-valor. Podríamos utilizar esta estructura en nuestra
        biblioteca usando objetos de autor como las claves y listas (objetos Lista) de libros como los valores. Por lo
        tanto, después de verificar un Conjunto para ver si un objeto de autor existe en la biblioteca, podemos usar el
        mismo objeto de autor para obtener una Lista de sus libros de un Mapa.*/

        //Queue
        /*Cola es una colección que, sorpresa, implementa el comportamiento de una cola. Y la cola puede ser tanto LIFO
        (último en entrar, primero en salir) o FIFO (primero en entrar, primero en salir). Además, la cola puede ser
        bidireccional, o "de doble final". Esta estructura es útil cuando los objetos agregados a la clase necesitan
        ser utilizados en el orden en que se reciben. Por ejemplo, tomemos nuestra biblioteca. Podemos agregar a los
        visitantes recién llegados a una Cola y atenderlos en orden, emitiendo los libros que vienen a buscar.*/
    }
}
