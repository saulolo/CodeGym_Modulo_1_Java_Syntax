package org.educatiom.modulo_I.proyectoFinal_ModuloI;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Clase que valida la entrada de datos.
 */
public class Validator {

    /**
     * Verifica si la clave es válida.
     * @param key La clave a verificar.
     * @return {@code true} si la clave es válida; {@code false} en caso contrario.
     */
    public boolean isValidKey(int key) {
        return key >= 0 && key < Cipher.ALPHABET.length;
    }

    /**
     * Verifica si un archivo existe en la ruta especificada.
     * @param filePath La ruta del archivo a verificar.
     * @return {@code true} si el archivo existe; {@code false} en caso contrario.
     */
    public boolean isFileExists(String filePath) {
        if (!Files.exists(Paths.get(filePath))) {
            System.out.println("El archivo especificado no existe: " + filePath);
            return false;
        }
        return true;
    }
}
