package org.educatiom.modulo_I.lesson24_FlujosDeIO.FlujosDeEntrada;

import java.io.*;

public class InputStreamYReaderExample {

    public static void main(String[] args) throws IOException {

        //Flujos de Datos
        /*Por lo general o en la mayoria de casos, creamos programas que interactuen con el mundo exterior, esto se
         * traduce a la necesidad de realizar intercambio de datos entre el programa y el mundo exterior, esto se
         * realiza en dos vias, entrada y salida de datos (se conoce como flujo de datos).
         * En Java utilizamos los streams, que es una herramienta muy versátil para que el programa reciba y envie flujos
         * de datos (Tambienllamados flujos de bytes), por lo tanto los streams tiene dos tipos:
         * - Un flujo de entrada para recibir datos (InputStream).
         * - Un flujo de salida para enviar datos (OutputStream).*/

        /*
                                                 Java Stream Classes
                                                         |
                             --------------------------------------------------------
                            |                                                        |
                   Byte Stream Classes                                  Character Stream Classes
                            |                                                        |
                   ----------------------                              ----------------------
                   |                    |                              |                    |
                InputStream         OutputStream                  Reader Classes      Writer Classes
                  Classes              Classes                    (e.g., FileReader)   (e.g., FileWriter)
           (e.g., FileInputStream)  (e.g., FileOutputStream)      (BufferedReader)      (BufferedWriter)
            (ByteArrayInputStream)  (ByteArrayOutputStream)       (InputStreamReader)   (OutputStreamWriter)

        * */

        System.out.println("-------------------------- read() -----------------------------------------");
        //read()
        /*Method de la clase InputStream que permite leer datos de ella.
         * Lee un byte de la secuencia.
         * int read(byte[] buffer)  => lee una matriz de bytes de la secuencia.*/

        System.out.println("-------------------------- write() -----------------------------------------");
        //write()
        /*Method de la clase OutputStream que permite escribir datos de ella.*/

        //Flujos de Bytes (Datos)
        /*Las clases de InputStream y OutputStream, son clases genéricas que reciben el tipo de datos mas común, el
        byte (No admiten otro tipo).
        Una caracteristica es que los datos se leen secuencialmente (linea por linea)
        Los methods de las clases de flujos no almacenan datos, son herramientas para leer y escribir pero tiene sus
        excepciones. */

        System.out.println("-------------------------- Clase Reader -----------------------------------------");
        //Clase Reader
        /*Es una clase análoga a la clase InputStream cuyo method read() lee caracteres, no bytes.*/

        System.out.println("-------------------------- ready() -----------------------------------------");
        //ready()
        /*Method de la clase Reader que comprueba si todavia queda algo en el flujo.*/

        //Ej: A modo de comprobación, escribamos un programa que copie un archivo de texto.
        String entrada = "c:\\projects\\log.txt";
        String salida = "c:\\projects\\copy.txt";

        FileReader reader = new FileReader(entrada);
        FileWriter writer = new FileWriter(salida);

        char[] bufferChars = new char[65536]; //128 kb
        while (reader.ready()) {
            int real = reader.read(bufferChars);
            writer.write(bufferChars, 0, real);
        }

        System.out.println("-------------------------- Write -----------------------------------------");
        //Write
        /*Es una clase análoga a la clase OutputStream cuyo method writes() envia caracteres, no bytes.*/

        System.out.println("-------------------------- Clase InputStream -----------------------------------------");
        //Clase InputStream
        /*Clase padre de la cual heredan muchas otras.*/

        System.out.println("-------------------------- readAllBytes() -----------------------------------------");
        //readAllBytes()
        /*Lee todos los bytes (matriz) de la secuencia; los devuleve como una matriz de un solo byte.
        Muy efectivo para leer archivos pequeños, ya que si son muy grandes devuelve una excepción*/

        System.out.println("-------------------------- skip() -----------------------------------------");
        //skip()
        /*Salta n bytes en el flujo (los lee y los descarta). Devuelve el núemro de bytes que se omitieron.*/

        System.out.println("-------------------------- available() -----------------------------------------");
        //available()
        /*Comprueban cuantos bytes quedan en el flujo.*/

        System.out.println("-------------------------- close() -----------------------------------------");
        //close()
        /*Cierra el flujo de datos y libera los recursos asociados a él; una vez se cierra la secuencia no puede leer
         * mas datos de la misma.*/
        //Ej: Escribir un programa de ejemplo que copie un archivo muy grande.
        String src = "c:\\projects\\log.txt";
        String dest = "c:\\projects\\copy.txt";

        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(src);
            output = new FileOutputStream(dest);

            byte[] buffer = new byte[65536];  //64 kb, Buffer en el que leemos los datos.

            while (input.available() > 0) {  //Siempre que haya datos en la secuencia.
                int real = input.read(buffer);  //Leer datos en el buffer.
                output.write(buffer, 0, real);  //Escribir los datos del buffer en la segunda secuencia.
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (output != null) {
                output.close();
            }
            if (input != null) {
                input.close();
            }
        }
    }
}
