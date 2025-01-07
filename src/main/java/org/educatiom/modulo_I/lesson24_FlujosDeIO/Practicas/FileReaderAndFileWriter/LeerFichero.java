package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.FileReaderAndFileWriter;

import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

    public void readData() {
        String file = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson24/FlujosDeIO/Practicas/FileReaderAndFileWriter/test.txt";
        try (FileReader entrada = new FileReader(file)) {
            int caracter = entrada.read(); //Caracter correspondiente a cada una de las letras.
            Character letra = (char) caracter;
            while (caracter != -1) { //Mientras no hayas llegado al final
                caracter = entrada.read(); //guardar la letra en la que se encontresmoa ahora mismo
                System.out.print(letra);
                letra = (char)caracter;
            }
        } catch (IOException e) {
            System.err.println("No se ha encontrado el archivo: " + e.getMessage());;
        }
    }
}
