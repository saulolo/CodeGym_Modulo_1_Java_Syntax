package org.educatiom.modulo_I.lesson24_FlujosDeIO.FlujosDeEntrada;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileInputStreamExample {

    public static void main(String[] args) {

        System.out.println("------------- FileInputStream ----------------------");
        //FileInputStream
        /*Lee bytes de un archivo.
        * Nota: A partir de Java 5, las clases FileInputStreamy FileOutputStreamhan quedado obsoletas. Una de sus
        * desventajas era que cuando se crean objetos de estas clases, los archivos se crean inmediatamente en el disco.
        * Y todas las excepciones relacionadas con la creación de archivos podrían generarse potencialmente.
        * Más tarde esto fue reconocido como no la mejor decisión. En consecuencia, se recomienda utilizar los métodos
        * de la java.nio.Filesclase de utilidad para crear objetos de archivo.*/

        //Leemos byte de un archivo, los convertimos a caracteres y los mostramos en consola.
        String dest = "c\\projets\\test.txt";
        try (FileInputStream stream = new FileInputStream(dest)) {
            int i;
            while ((i = stream.read()) != -1) {
                System.out.println((char)i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Nota: como se debe de hacer con la clase Files:
        try(InputStream stream2 = Files.newInputStream(Path.of(dest))) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
