package org.educatiom.modulo_I.proyectoFinal_ModuloI;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase que gestiona la lectura y escritura de archivos.
 */
public class FileManager {

    /**
     * Lee el contenido de un archivo.
     * @param filePath La ruta del archivo a leer.
     * @return El contenido del archivo como una cadena de texto.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public String readFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);

        if (!Files.exists(path)) {
            throw new IOException("El archivo no existe: " + filePath);
        }

        return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
    }

    /**
     * Escribe un contenido en un archivo.
     * @param content El contenido a escribir.
     * @param filePath La ruta del archivo donde se escribirá el contenido.
     * @throws IOException Si ocurre un error al escribir el archivo.
     */
    public void writeFile(String content, String filePath) throws IOException {
        Path path = Paths.get(filePath);

        Files.write(path, content.getBytes(StandardCharsets.UTF_8));
    }
}
