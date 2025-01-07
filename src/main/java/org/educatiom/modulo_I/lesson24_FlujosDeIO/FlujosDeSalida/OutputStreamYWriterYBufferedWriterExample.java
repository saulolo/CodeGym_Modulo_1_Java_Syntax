package org.educatiom.modulo_I.lesson24_FlujosDeIO.FlujosDeSalida;

import java.io.*;

public class OutputStreamYWriterYBufferedWriterExample {

    public static void main(String[] args) {


        System.out.println("-------------------------- OutputStream -----------------------------------------");
        //OutputStream
        /*Es la clase de salida2 para los bytes, no es para caracteres u otro tipo de datos. Es una clase abstracta, asi
        * que no la usamos directamente sino mas bien una de sus clases descendientes com la clase FileOutputStream.
        * Estos son los methodos principales de su clase.*/

        System.out.println("--------------------------- write() ------------------------------------------");
        //write()
        /*Escribe un byte en el stream (no un int).*/

        System.out.println("--------------------- write(byte[] buffer) -----------------------------------");
        //write(byte[] buffer)
        /*Escribe un array de bytes en el stream.*/

        System.out.println("------------------ write(byte[] buffer, off, len) ------------------------------");
        //write(byte[] buffer, off, len)
        /*Escribe parte de un array de bytes en el stream. off indica el índice del primer elemento y len la longitud total.*/

        System.out.println("------------------------------ flush() -----------------------------------------");
        //flush()
        /*Escribe todos los datos almacenados en el buffer en el stream.*/

        System.out.println("----------------------------- close() -----------------------------------------");
        //close()
        /*Cierra el stream (flujo).*/

        String entrada = "c:\\projects\\log.txt";
        String salida = "c:\\projects\\copy.txt";

        try (FileInputStream input = new FileInputStream(entrada); //InputStream para leer desde un archivo.
             FileOutputStream output = new FileOutputStream(salida)) { //OutputStream para escribir en un archivo.
            byte[] buffer = new byte[65536]; //64 kb. Buffer en el cual leeremos los datos.
            while (input.available() > 0) {  //Mientras haya datos en el stream.
                int real = input.read(buffer);   //Leer los datos en el buffer.
                output.write(buffer, 0, real); //Escrbir los datos del buffer en el segundo stream.
            }
        } catch (IOException e) {
            System.err.println("Algo a ocurrido: " + e.getMessage());
        }

        System.out.println("-------------------------- Writer -----------------------------------------");
        //Writer
        /*Escribe un caracter (no un int) en el stream.*/

        System.out.println("--------------------- write(byte[] buffer) -----------------------------------");
        //write(char[] buffer)
        /*Escribe un array de caracteres en el stream.*/

        System.out.println("------------------ write(byte[] buffer, off, len) ------------------------------");
        //write(byte[] buffer, off, len)
        /*Escribe parte de un array de caracteres en el stream. off indica el índice del primer elemento y len la longitud total.*/

        System.out.println("------------------------------ flush() -----------------------------------------");
        //flush()
        /*Escribe todos los datos almacenados en el buffer en el stream.*/

        System.out.println("----------------------------- close() -----------------------------------------");
        //close()
        /*Cierra el stream (flujo).*/

        String entrada2 = "c:\\projects\\log.txt";
        String salida2 = "c:\\projects\\copy.txt";

        try (FileReader reader = new FileReader(entrada2); //Reader para leer desde un archivo.
             FileWriter writer = new FileWriter(salida2)) { //writer para escribir en un archivo.
            char[] buffer = new char[65536]; //6128 kb. Buffer en el cual leeremos los datos.
            while (reader.ready()) {  //Mientras haya datos en el stream.
                int real = reader.read(buffer);   //Leer los datos en el buffer.
                writer.write(buffer, 0, real); //Escrbir los datos del buffer en el segundo stream.
            }
        } catch (IOException e) {
            System.err.println("Algo a ocurrido: " + e.getMessage());
        }


        System.out.println("-------------------------- StringWriter -----------------------------------------");
        //StringWriter
        /*Clase que hereda de Writer la cual contiene una cadena mutable y cada vez que se "escribe" algo en dicha
        cadena, el texto se agrega al buffer interno.
        Ej: */
        StringWriter stringWriter = new StringWriter(); //Se crea un stream de caracteres de destino (StringWriter).
        stringWriter.write("Hello");  //Se escribe una cadena en el buffer dentro de StringWriter.
        stringWriter.write(String.valueOf(123)); //Se escribe una cadena en el buffer dentro de StringWriter.
        String result = stringWriter.toString(); //Conversion del contenido en un objeto cadena.


        System.out.println("-------------------------- BufferedWriter -----------------------------------------");
        //BufferedWriter
        /*Es una clase que escribe caracteres en un bufer a un flujo. Esta clase se hace para escribir en un archivo
        de una manera rápida, ya que no escribe un solo caracter cada vez sino que lo hace escribiendo en un bufer
        y luego lo hace en los medios a la vez aumentando considerablemente la velocidad de escritura.
        Tamaño de buffer predeterminado es de 8192 caracteres pero se puede cambiar en el consutructor:
        BufferesWriter(Writer in, int sz)
        .*/



        System.out.println("-------------------------- Bufferedreader -----------------------------------------");
        //Bufferedreader
        /*Es para leer datos en un bufer.
        * Bufer: Recopila datos, luego toma todu y lo escribe en lugar de escribir cada fragemrnto por separado.
        Ejemplo del carrito del supermercado que recopila productos antes de pagar en la caja.*/


        System.out.println("--------------------- write(char[] array) -----------------------------------");
        //write(char[] array)
        /*Escribe un array de caracteres en el buffer.*/

        System.out.println("------------------ write(String s, int off, int len) ------------------------------");
        //write(String s, int off, int len)
        /*Escribe parte de un una cadena en un buffer.*/

        System.out.println("-------------------------- append(char c) ------------------------------------");
        //append(char c)
        /*Escribe un caracter en un buffer.*/

        System.out.println("-------------------- append(charSequence csq, int start, int end) ------------------------");
        //append(charSequence csq, int start, int end)
        /*Escribe parte de un array en el buffer.*/

        System.out.println("-------------------------- newLine() ------------------------------------");
        //newLine()
        /*Escribe un separador de línea.*/

        System.out.println("-------------------------- flush() ------------------------------------");
        //flush()
        /*Vuelca(vacea el buffer) el stream.*/

        /*Ej: Escribir un programa que escriba un valor en un archivo.*/
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"))) {
            String message = "Hola Amigo, este es un mensaje muy importante";
            bufferedWriter.write(message);
            bufferedWriter.newLine(); //Opcional para agregar una nueva linea.
            bufferedWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

                                            //Diferencia entre write() y append()
        /* la diferencia es que el méthod append es más nuevo y toma una CharSequence como argumento, y como String
        implementa CharSequence, podemos pasar Strings y StringBuilders, y StringBuffers al method append. Pero el
        method write() solo aceptará un String.*/

    }

}
