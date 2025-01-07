package org.educatiom.modulo_I.lesson25_FlujosDeIOParte2YPatronesDiseno.FlujosDeEntrada;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {

    public static void main(String[] args) {

        System.out.println("--------- ByteArrayInputStream ---------------- ");
        //ByteArrayInputStream
        /*Se utiliza para leer una entrada de matriz de byte.
        * Necesitamos un ByteArrayInputStream cuando queremos leer datos de una matriz de bytes. Por lo general,
        * tiene sentido utilizar esta clase en combinación con otro código que sepa cómo trabajar con InputStreams en
        * lugar de usarla por sí misma.
        * Dicha clase tiene 4 constructores y estos son los campos del constructor:
        * // Matriz de datos proporcionada por el creador del stream
            protected byte buf[];

        // Indice de donde comienza a leer la matriz.
        protected int pos;

        // Posicíón actual de la secuencia.
        protected int mark = 0;

        // Indice siguiente al mayor leido de la matriz.
        protected int count;
        * */

        System.out.println("------------------- read() ----------------------------- ");
        //read()
        /*Lee el siguiente byte de datos del flujo.*/

        System.out.println("------------ int read(byte b[], int off, int len) ---------------- ");
        //int read(byte b[], int off, int len)()
        /*Lee varios bytes del stream de entrada y los almacena en el buffer b.
        * off es un desplazamiento en el arreglo.
        * len es el número máximo de bytes a leer.*/

        System.out.println("------------ long skip(long n) ---------------- ");
        //long skip(long n)
        /*Omite n byes de entrada del flujo ingresado. Devuelve el número de bytes omitidos*/

        System.out.println("------------ available() ---------------- ");
        //available()
        /*Devuelve el número de bytes restantes que se pueden leer (o saltar) del stream de entrada.*/

        System.out.println("------------ reset() ---------------- ");
        //reset()
        /*Restablece el búfer a la posición marcada, por defecto es 0.*/

        byte[] buf = {65, 66, 67, 68, 69};
        try(ByteArrayInputStream inputStream = new ByteArrayInputStream(buf)) {
            System.out.println("Read : " + inputStream.read());
            System.out.println("Read : " + inputStream.read());
            System.out.println("Read : " + inputStream.read());
            inputStream.mark(5); //Restablece a esta posición la marca de inicio.

            System.out.println("Read : " + inputStream.read());
            System.out.println("Read : " + inputStream.read());

            System.out.println("Llamando al método reset."); //Reinicia el flujo en la posición marcada.
            inputStream.reset();

            System.out.println("Read : " + inputStream.read());
            System.out.println("Read : " + inputStream.read());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("------------ markSupported() ---------------- ");
        //markSupported()
        /*Verifica si este InputStream admite marcado/reinicio. Devuelve true para ByteArrayInputStream*/

        System.out.println("------------ close() ---------------- ");
        //close()
        /*La documentación dice que no tiene sentido cerrar un ByteArrayInputStream porque no tiene efecto..*/

        System.out.println("------------ mark(int readAheadLimit) ---------------- ");
        //mark(int readAheadLimit)
        /*Establece el campo mark a la posición actual*/


        byte[] array = {1, 2, 3, 4, 5};

        try(ByteArrayInputStream input = new ByteArrayInputStream(array)) {
            System.out.println("Bytes disponibles para lectura: " + input.available()); //Verifica si hay algo en el buffer
            input.skip(2);//Salta 2 bytes y no los lee.
            for (int i = 0; i < array.length; i++) {
                int data = input.read();  //Leyendo los bytes
                System.out.println(data + ", ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
