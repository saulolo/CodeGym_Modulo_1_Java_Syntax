package org.educatiom.modulo_I.lesson26_FlujosDeIOParte3NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferExample {

    public static void main(String[] args) {
        
        //Buffer
        /*La principal diferencia entre los dos enfoques de I/O es que la API de IO está orientada a la transmisión,
        mientras que la API de NIO está orientada al búffer.e*/

        //Diferencia entre un Channel y un Buffer.
        /*Channel: es una puerta de enlace que proporciona acceso a dispositivos de E/S, como archivos o sockets.
        * Buffer: es simplemente un bloque de memoria en el que podemos escribir información y desde el cual podemos
        * leer información.
        * Puede avanzar y retroceder en un búfer, es decir, "caminar" por el búfer, algo que no podría hacer en flujos.
        * Esto da más flexibilidad al procesar datos.
        * En la biblioteca estándar, los búferes están representados por la clase Buffer abstracta y varios de sus descendientes:
        * Buffer de bytes
        * CharBuffer
        * Búfer corto
        * IntBuffer
        * Buffer flotante
        * búfer doble
        * búfer largo
        * La principal diferencia entre las subclases es el tipo de datos que almacenan: bytes , ints , longs y otros
        * tipos de datos primitivos.*/

        //Propiedad tampón
        /*Un búfer tiene cuatro propiedades principales. Estos son:
        - Capacidad: Capacidad máxima de datos/bytes que se pueden almacenar en el buffer, la capicad no se puede cambiar,
        una vez lleno se deve vaciar para sobreescribirse.
        - Límite: En el modo de escritura, el límite de un búfer es el mismo que su capacidad, lo que indica la cantidad
         máxima de datos que se pueden escribir en el búfer. En el modo de lectura, el límite de un búfer se refiere a la
          cantidad máxima de datos que se pueden leer del búfer.
        - Posición:  indica la posición actual del cursor en el búfer. Inicialmente, se establece en 0 cuando se crea
        el búfer. En otras palabras, es el índice del siguiente elemento a leer o escribir.
        - Marca: se utiliza para guardar una posición del cursor. A medida que manipulamos un búfer, la posición del
        cursor cambia constantemente, pero siempre podemos devolverlo a la posición previamente marcada.*/

        System.out.println("----------------------- allocate(int capacity) ---------------------------");
        //allocate(int capacity)
        /*Este method se utiliza para asignar un nuevo búfer con la capacidad especificada. El method allocate() lanza
        una IllegalArgumentException si la capacidad pasada es un entero negativo.*/

        System.out.println("----------------------- capacity() ---------------------------");
        //capacity()
        /* Devuelve la capacidad del bufer actual.*/

        System.out.println("----------------------- position() ---------------------------");
        //position()
        /*Devuelve la posición actual del cursor. Las operaciones de lectura y escritura mueven el cursor al final del
        búfer. El valor devuelto siempre es menor o igual que el límite.*/

        System.out.println("----------------------- limit() ---------------------------");
        //limit()
        /*Devuelve el limite del bufere actual.*/

        System.out.println("----------------------- mark() ---------------------------");
        //mark()
        /*Se usa para marcar (guardar) la posición actual del cursor.*/

        System.out.println("----------------------- reset() ---------------------------");
        //reset()
        /*Devuelve el cursor a la posición previamente marcada (guardada).*/

        System.out.println("----------------------- clear() ---------------------------");
        //clear()
        /*Establece la posición en cero y establece el límite de la capacidad. Este method no borra los datos del búfer.
         Sólo reinicializa la posición, el límite y la marca*/

        System.out.println("----------------------- flip() ---------------------------");
        //flip()
        /*Cambia el búfer del modo de escritura al modo de lectura. También establece el límite de la posición actual y
        luego vuelve a poner la posición en cero..*/

        System.out.println("----------------------- read() ---------------------------");
        //read()
        /*El method de lectura del canal se usa para escribir datos del canal en el búfer, mientras que el method put()
        del búfer se usa para escribir datos en el búfer.*/

        System.out.println("----------------------- write() ---------------------------");
        //write()
        /*El method de escritura del canal se usa para escribir datos del búfer al canal, mientras que el method get()
        del búfer se usa para leer datos del búfer.*/

        System.out.println("----------------------- rewind() ---------------------------");
        //rewind()
        /*Rebobina el búfer. Este method se usa cuando necesita volver a leer el búfer: establece la posición en cero y
         no cambia el límite.*/

        /*Ej: Leamos un archivo y mostremos su contenido en la consola, y luego escribamos una cadena de texto en el archivo.*/
        //Creo la ruta del archivo
        String file = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/file.txt/";
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw"); //Creo el objeto RandomAccessFile pasandole la ruta del archivo (file) y el arggumento de lectura y escritura.
            FileChannel channel = randomAccessFile.getChannel();) { //Creo un objeto de tipo FileChannel.

            ByteBuffer byteBuffer = ByteBuffer.allocate( (int) channel.size()); //Creamos un buffer en función del canal creado.

            StringBuilder builder = new StringBuilder(); //Creo un Objeto de tipo StringBuilder para que los datos leidos se pongan en este obeto.
            channel.read(byteBuffer); //Escribe datos del canal al buffer.
            byteBuffer.flip(); //Cambuio el buffer de modo escritura a lectura.

            while (byteBuffer.hasRemaining()) { //Escribo los datos al builder.
                builder.append((char) byteBuffer.get());
            }
            /* Ahora escribamos datos en nuestro archivo creado*/
            String text = " ==> Texto de ensayo agregado al archivo creado";

                /*Crea un nuevo búfer para escribir, pero deja que el canal siga siendo el mismo, porque vamos al  mismo
                 archivo, en otras palabras, podemos usar un canal tanto para leer como para escribir en un archivo.
                 Crea un búfer específicamente para nuestra cadena: convierte la cadena en una matriz y obtén su longitud*/
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(text.getBytes().length); //Creamos un buffer en función del canal creado.

            byteBuffer2.put(text.getBytes()); //Escribimos la nueva cadena en el buffer.
                /*/ Cambia el búfer del modo de escritura al modo de lectura // para que el canal pueda leer desde el
                búfer y escribir nuestra cadena en el archivo*/
            byteBuffer2.flip();
            channel.write(byteBuffer2); //El canal lee la información del buffer y la escribe en nuestro archivo

            System.out.println("builder = " + builder); //Muestro el contenido en la consola.

        } catch (FileNotFoundException e) {
            System.err.println("No se pudo encontrar el archivo: " + e);
        } catch (IOException e) {
            System.err.println("A ocurrido una excepción de tipo: " + e);
        }
    }
}
