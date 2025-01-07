package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.BufferedReaderAndBufferedWriter;

import java.io.*;

public class LeerFicheroBuffer {

    String fileTextBuffer = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson24/FlujosDeIO/Practicas/BufferedReaderAndBufferedWriter/textExampleBuffer.txt";

    public void readDataBuffer() {
        try(FileReader reader = new FileReader(fileTextBuffer);
            BufferedReader buffereader = new BufferedReader(reader)) {

            String line = "";
            while (line != null) {
                line = buffereader.readLine();

                if (line != null) {  //Para no imprimir el null.
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.err.println("No se encuentra el archivo: " + e.getMessage());;
        }
    }
}
