package org.educatiom.modulo_I.lesson24_FlujosDeIO.FlujosDeEntrada;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) {

        System.out.println("------------- BufferedInputStream ----------------------");
        //BufferedInputStream
        /*Lee bytes en bloques de un archivo y los almacena temporalmente en buffer.
        (Los buffer se utilizan para optimizar procesos de I/O, reduciendo la cantidad de veces que se accede
        a un archivo, ya que esto es una operación muy costosa.*/

        //Leemos byte de un archivo, los convertimos a caracteres y los mostramos en consola.
        String dest = "c\\projets\\test.txt";
        try (FileInputStream fileInputStream = new FileInputStream(dest);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200)) { //Tamaño del buffer en el segundo argumento.

            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
