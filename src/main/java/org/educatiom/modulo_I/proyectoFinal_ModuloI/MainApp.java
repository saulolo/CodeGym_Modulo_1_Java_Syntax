package org.educatiom.modulo_I.proyectoFinal_ModuloI;

import java.io.IOException;

/**
 * Clase principal que ejecuta la aplicación.
 */
public class MainApp {

    public static void main(String[] args) {

        // Definir la ruta del archivo de entrada y salida
        String inputFilePath = "src/main/resources/entrada.txt";
        String outputFilePath = "src/main/resources/salida.txt";

        // Definir la clave para el cifrado
        int key = 5;

        // Crear instancias de las clases necesarias
        FileManager fileManager = new FileManager();
        Validator validator = new Validator();
        Cipher cipher = new Cipher();

        try {
            // Verificar que el archivo de entrada exista
            if (!validator.isFileExists(inputFilePath)) {
                System.out.println("El archivo de entrada no existe.");
                return;
            }

            // Verificar que la clave sea válida
            if (!validator.isValidKey(key)) {
                System.out.println("La clave no es válida.");
                return;
            }

            // Leer el contenido del archivo de entrada
            String content = fileManager.readFile(inputFilePath);

            // Cifrar el contenido
            String encryptedContent = cipher.encrypt(content, key);
            // Mostrar el texto cifrado por consola (opcional)
            System.out.println("Texto cifrado: " + encryptedContent);

            // Escribir el contenido cifrado en el archivo de salida
            fileManager.writeFile(encryptedContent, outputFilePath);
            System.out.println("Operación completada con éxito. El archivo de salida es 'salida.txt'.");

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }
}
