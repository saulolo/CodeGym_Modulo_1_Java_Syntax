package org.educatiom.modulo_I.lesson26_FlujosDeIOParte3NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class IOvsNIOExample {

    public static void main(String[] args) {


        //Inconvenientes de Java IO
        /*1. Bloqueo de acceso para entrada/salida. El problema es que cuando un desarrollador intenta leer o escribir algo en un archivo usando Java IO , bloquea el archivo y bloquea el acceso a él hasta que finaliza el trabajo.
          2. No hay soporte para sistemas de archivos virtuales.
          3. No hay soporte para enlaces.
          4. Montones y montones de excepciones comprobadas.*/


        //Java NIO Java Non-Blocking I/O (Java New I/O)
        /*Esta diseñado para operaciones de alto rendimiento.  Un canal Java NIO admite el flujo de datos asíncrono en
        los modos de bloqueo y no bloqueo.*/

        System.out.println("------------------------ Channel -------------------------------");
        //Channel
        /*Es una interfaz bidireccional, es decir puede leer y escribir.
        * FileChannel : para trabajar con archivos
        * DatagramChannel : un canal para trabajar a través de una conexión UDP
        * SocketChannel : un canal para trabajar a través de una conexión TCP
        * ServerSocketChannel contiene un SocketChannel y es similar a cómo funciona un servidor web*/

        System.out.println("------------------------ getChannel() -------------------------------");
        //getChannel()
        /*Crea un canal de archivos (fileChannel).*/

        //RandomAccessFile: permite leer y escribir tipos datos de un fichero binario indicando el modo de apertura.
        String dest = "c\\projets\\test.txt";
        try(RandomAccessFile accessFile  = new RandomAccessFile(dest, "rw"); //rw: Lectura - Escritura //r: Lectura //rvs: Lectura actualizable.
            FileChannel fileChannel = accessFile.getChannel()) { //Se unsa FileChannel para leer datos de un archivo creandolo con el method getChannel()

            ByteBuffer buffer = ByteBuffer.allocate(100);
            int bytesRead = fileChannel.read(buffer);

            while (bytesRead != -1) {
                System.out.println("Read: " + bytesRead);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.println((char) buffer.get());
                }
                buffer.clear();
                bytesRead = fileChannel.read(buffer);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("------------------------ Selector -------------------------------");
        //Selector
        /*Clase que que me indica que canal esta listo para escribir y leer datos. Para usarse el channel debe de estar
        * en modo sin bloqueo o sea que no se puede usar FileChannel.
        *                                   TIPOS DE CLAVES DE SELECCIÓN
        * SelectionKey.OP_CONNECT significa un canal que está listo para conectarse al servidor.
        * SelectionKey.OP_ACCEPT es un canal que está listo para aceptar conexiones entrantes.
        * SelectionKey.OP_READ significa un canal que está listo para leer datos.
        * SelectionKey.OP_WRITE significa un canal que está listo para escribir datos.
        * */

        /*
        try(Selector selector = Selector.open()) {
            channel.configureBlocking(false);
            SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

        System.out.println("------------------------ JAVA NIO.2 -------------------------------");
        //JAVA NIO.2
        /*Esta oreintado a la gestión de archivos.
        * La nueva API de Java NIO.2 para trabajar con archivos ofrece muchas características útiles:
        * - Mucho más útil el direccionamiento del sistema de archivos usando Path ,
        * - Manejo significativamente mejorado de archivos ZIP utilizando un proveedor de sistema de archivos personalizado,
        * - Acceso a atributos de archivos especiales,
        * - Muchos métodos convenientes, como leer un archivo completo con una sola declaración, copiar un archivo con una sola declaración, etc.*/

        System.out.println("------------------------ Path -------------------------------");
        //Path

        System.out.println("------------------------ Paths -------------------------------");
        //Paths
        /*Es una clase que fue diseñada unicamente para obtener el objeto Path de la cadena o la URI pasad, y solo
        tiene un method estatico: get() */
        Path relative = Paths.get("Main.java");
        System.out.println("File: " + relative);
        System.out.println(relative.getFileSystem());

        System.out.println("------------------------ Files -------------------------------");
        //Files
        /*Clase de utilidad que nos permite obtener directamente el tamaño de un arechivo, copiar, etc. */
        Boolean patchExists = Files.exists(relative);

        System.out.println("------------------------ FileSystem -------------------------------");
        //FileSystem()
        /*Funciona como una fabrica para crear varios objetos, (Path, PatchMatcher, Files). Nos ayuda a acceder a
        * varios archivos.*/
        try(FileSystem fileSystems = FileSystems.getDefault()) {
            for (Path rootDirectory : fileSystems.getRootDirectories()) {
                System.out.println(rootDirectory.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
