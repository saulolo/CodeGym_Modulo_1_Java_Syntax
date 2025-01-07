package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.FileReaderAndFileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

    public void writing() {
        String text = "Esto es un texto nuevo para agregar a traves de stream de datos :)";
        String fileNew = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson24/FlujosDeIO/Practicas/FileReaderAndFileWriter/textNew.txt";
        try(FileWriter writer = new FileWriter(fileNew, true)) { //true si queremos agregar en un fichero existente, por defecto es false entonces lo crea.
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i)); //Escribe a cada vuelta de bucle caracter a caracter lo que esta en la variable text.

            }
        } catch (IOException e) {
            System.err.println("No se encuentra el fichero: " + e.getMessage());
        }
    }

}
