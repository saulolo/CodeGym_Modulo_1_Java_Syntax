package org.educatiom.modulo_I.lesson24_FlujosDeIO.FlujosDeEntrada;

import java.io.*;
import java.util.Scanner;

public class InputStreamReaderExample {

    public static void main(String[] args) throws IOException {

        System.out.println("--------------------------- InputStreamReader ----------------------------------");
        //InputStreamReader (Cadenas de hilos)
        /*Clase que permite a Java conectar una secuencia de datos con otra (Se conoce como flujo intermedio).
        * Esta secuencia de datos con InputStreamReader no solo lee y entega datos, sino que tambien puede transformarlos
        * o realizar varias operaciones entre ellos.
        * Cuando crea un objeto InputStreamReader, debe pasar un InputStreamobjeto o una de sus clases descendientes.
        * Los methods de la clase InputStreamReader son los mismos que los de la clase Reader, la principal diferencia
        * es de donde las clases leen los datos, FileReaderlee datos de un archivo (por eso se llama FileReader), pero
        * InputStreamReaderlee datos de un archivo InputStream*/
        String src = "c:\\projects\\log.txt";
        try (FileInputStream input = new FileInputStream(src);  //try-with-resources
             InputStreamReader reader = new InputStreamReader(input)) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------------- FileReader ----------------------------------");
        //FileReader
        /*Es una clase de Java que se utiliza para leer archivos de texto carater por caracter de manera sencilla.
        * Se utiliza para manejar archivos de textos que no son bloques grandes, Pero no es muy eficiente para leer
        * múltiples caracteres o líneas de texto*/


        System.out.println("--------------------------- BufferedReader ----------------------------------");
        //BufferedReader
        /*Es una clase de tipo flujo intermedio que tambien lee datos de otro flujo. Permite leer caracteres pasandaole
        * como duente de datos un stream que tambien pueda leer caracteres.
        * La diferencia entre InputStreamReader y BufferedReader es que esta (BufferedReader) no convierte bytes en
        * caracteres: no convierte nada en absoluto. En su lugar, almacena datos en búfer.
        * Es una clase de Java que se utiliza para leer texto de una manera más eficiente que FileReader.
        * Sirve para leer texto de un Reader (como FileReader) de manera más eficiente al usar un buffer interno.
        * Esto permite leer líneas completas de texto con el method readLine() en lugar de leer carácter por carácter.
        * Util para manejar bloques grandes en vez de utilizar caracter por caracter.*/

        /*                        Diferencia entre FileReader y BufferedReader
        FileReader: Lee el archivo directamente, carácter por carácter. Es más básico y no es tan eficiente para leer
        archivos grandes o varias líneas.
        BufferedReader: Utiliza un buffer interno que almacena los datos temporalmente y permite leer líneas completas
        con el method readLine(). Esto hace que la lectura sea más rápida y eficiente.*/

        /*                              ALMACENANDO DATOS CON BUFFER

                                       Reading data without using a buffer
                                       -----------------------------------
                                       [ 🥄 ] <---- Data ---- [ 🍚 ]
                                          |                      |
                                        sugar                  SUGAR

                                       -----------------------------------

                                       Reading data using a buffer
                                       ---------------------------
                                       [ 🥄 ] <---- Data ---- [ 🥣 ] <---- Data ---- [ 🍚 ]
                                          |                      |                      |
                                         sugar                storage                 SUGAR

        * */

        System.out.println("--------------------------- readLine() ----------------------------------");
        //readLine()
        /*Permite leer cadenas completas de datos del flujo de origen de una sola vez. Muy usado para leer un archivo y
        * mostrar su contenido en la pantalla linea por linea.*/
        //Ej: Mostrar lineas de un archivo.
        String src2 = "c:\\projects\\log.txt"; //Archivo como fuente de datos.
        try (FileReader in = new FileReader(src2);  //Creamos un objeto FileReader y le pasamos el archivo ser2.
             BufferedReader reader = new BufferedReader(in)) {  //Creamos un objeto BufferedReader y lem pasamos el objeto FileReader (in).
            while (reader.ready()) {  //Siempre que haya datos en el objeto de lectura.
                String line = reader.readLine();  //Lea una linea.
                System.out.println(line); //Mostrar dicha linea
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*Nota: La clase Scanner es un fluo de entrada intermedio, que lee datos desde la consola a travez de un System.in*/

        //Leyendo datos con Scanner:
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        String line = scanner.nextLine();

        //Leyendo datos con las clases BufferedReader y BufferedWriter:
        InputStream stream1 = System.in;
        InputStreamReader reader = new InputStreamReader(stream1);
        BufferedReader buffer = new BufferedReader(reader);
        String line2 = buffer.readLine();
    }
}
