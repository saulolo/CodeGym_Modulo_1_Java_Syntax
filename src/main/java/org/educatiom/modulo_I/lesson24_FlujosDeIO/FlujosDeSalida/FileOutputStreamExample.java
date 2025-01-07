package org.educatiom.modulo_I.lesson24_FlujosDeIO.FlujosDeSalida;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOutputStreamExample {

    public static void main(String[] args) {

        System.out.println("------------- FileOutputStream ----------------------");
        //FileOutputStream
        /*Escribe bytes en un archivo.*/
        /* Nota: A partir de Java 5, las clases FileInputStreamy FileOutputStreamhan quedado obsoletas. Una de sus
         * desventajas era que cuando se crean objetos de estas clases, los archivos se crean inmediatamente en el disco.
         * Y todas las excepciones relacionadas con la creación de archivos podrían generarse potencialmente.
         * Más tarde esto fue reconocido como no la mejor decisión. En consecuencia, se recomienda utilizar los métodos
         * de la java.nio.Filesclase de utilidad para crear objetos de archivo.*/

        String file = "c:\\proyects\\test.txt";
        try (FileOutputStream stream = new FileOutputStream(file, true)) { //true para copiar varias veces cada que se lance el programa, por defecto es false
             String message = "Bienvenido a codegym, la mejor plataforma para aprender a programar.";

             stream.write(message.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Nota: Ejemplo de como se debe de hacer a partir de java 5.

        try(OutputStream stream2 = Files.newOutputStream(Path.of(file))) {
        }catch (IOException e) {
            System.out.println("No se encuentra el archivo: " + e);
        }
    }
}
