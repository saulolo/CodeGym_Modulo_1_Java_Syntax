package org.educatiom.modulo_I.lesson25_FlujosDeIOParte2YPatronesDiseno.FlujosDeSalida;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamExample {

    public static void main(String[] args) {

        System.out.println("------------- ByteArrayOutputStream ----------------------");
        //ByteArrayOutputStream
        /*Implementa un flujp de salida que escribe datos en una matriz de bytes.
         * Tiene dos constructores:
         * ByteArrayOutputStream() Este constructor crea un búfer en memoria de 32 bytes de longitud.
         * ByteArrayOutputStream(int a)	Este constructor crea un búfer en memoria con un tamaño específico.*/

        System.out.println("------------------ write() ---------------------------");
        //write()
        /*Escribe un byte*/

        System.out.println("------------------ write(byte b[], int off, int len) ---------------------------");
        //write(byte b[], int off, int len)
        /*Escribe un conjunto de bytes de tamaño especifico.*/

        System.out.println("------------------ write(byte b[]) ---------------------------");
        //write(byte b[])
        /*Escribe un array de bytes.*/

        System.out.println("------------------ writeTo(OutputStream out) ---------------------------");
        //writeTo(OutputStream out)
        /*Escribe los datos del stream actual en el strema pasado como argumento.*/

        System.out.println("------------------ toByteArray() ---------------------------");
        //toByteArray()
        /*Devuelve el contenido actual del stream de salida como una matriz de bytes y se puede usar el toString
         * para devolverlo.*/

        System.out.println("------------------ reset() ---------------------------");
        //reset()
        /*Restablece el número de bytes válidos en la matriz de salida a cero. Cuando llamamos al método no obtenemos nada.*/

        try (ByteArrayOutputStream outputByte = new ByteArrayOutputStream()) {
            while (outputByte.size() != 7) {
                outputByte.write("CodeGym".getBytes());  //Escribir un byte.
            }
            String value = "\nBienvenido a Java\n";
            byte[] arrayBytes = value.getBytes(); //Escribir un array de bytes.

            String codegym = "CodeGym";
            byte[] bytes = codegym.getBytes();
            outputByte.write(bytes, 4, 3); //Escribir parte de un array.

            FileOutputStream stream = new FileOutputStream("output.txt");
            outputByte.write(80);
            outputByte.writeTo(stream); //Escribir en un archivo.

            //outputByte.reset();

            byte[] result = outputByte.toByteArray();
            System.out.println (Arrays.toString(result));
            for (int i = 0; i < result.length; i++) {
                System.out.println((char) result[i]);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*Salida:
        * ]avarush
        * Bienvenido a java
        * RushP*/





    }

}

