package org.educatiom.modulo_I.lesson26_FlujosDeIOParte3NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class FilesExample {

    public static void main(String[] args) {

        System.out.println("--------------------- Files --------------------------");
        //Files
        /*Clase para trabajar con archivos, sus methods son estáticos y operaan con la clase Path.*/

        System.out.println("--------------------- createFiles() --------------------------");
        //createFiles()
        /*Crea un nuevo archivo cuya ruta es path*/
        try {
            Files.createFile(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- createDirectory() --------------------------");
        //createDirectory()
        /*Crea un nuevo directorio.*/
        try {
            Files.createDirectory(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- createDirectories() --------------------------");
        //createDirectories()
        /*Crea multiples directorios.*/
        try {
            Files.createDirectories(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivos"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- createTempFile() --------------------------");
        //createTempFile()
        /*Crea un archivo temporal.*/
        try {
            Files.createTempFile("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/ArchivoTemporal", "2");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- createTempDirectory() --------------------------");
        //createTempDirectory()
        /*Crea un directorio temporal.*/
        try {
            Files.createTempDirectory(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/DirectorioTemporal"), "3");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- delete() --------------------------");
        //delete()
        /*Elimina un archivo o un directorio si esta vacio.*/
        try {
            Files.delete(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- copy() --------------------------");
        //copy()
        /*Copia un archivo*/
        String destinyFile = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFileDestiny.txt";
        try {
            Files.copy(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"), Path.of(destinyFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- move() --------------------------");
        //move()
        /*Mueve un archivo.*/
        try {
            Files.move(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"), Path.of(destinyFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- isDirectory() --------------------------");
        //isDirectory()
        /*Comprueba si la ruta es un directorio y no un archivo*/
        boolean esDirectorio = Files.isDirectory(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));
        System.out.println("es un Directorio: " + esDirectorio);

        System.out.println("--------------------- isRegularFile() --------------------------");
        //isRegularFile()
        /*Comprueba si la ruta es un archivo y no un directorio.*/
        boolean esArchivo = Files.isRegularFile(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));
        System.out.println("esArchivo = " + esArchivo);

        System.out.println("--------------------- exists() --------------------------");
        //exists()
        /*Comprueba si existe un objeto en la ruta dada.*/
        boolean isExists = Files.exists(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));

        System.out.println("--------------------- size() --------------------------");
        //size()
        /*Devuelve el tamaño del archivo.*/
        try {
            long tamanioFile = Files.size(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));
            System.out.println("tamanioFile = " + tamanioFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- realAllBytes() --------------------------");
        //realAllBytes()
        /*Devuelve el contenido de un archivo como un array de bytes.*/
        byte[] arrayFiles;
        try {
            arrayFiles = Files.readAllBytes(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));
            System.out.println("arrayFiles = " + Arrays.toString(arrayFiles));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- realString() --------------------------");
        //realString()
        /*Devuelve el contenido de un archivo como una cadena.*/
        try {
            String leyedoArchivo = Files.readString(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));
            System.out.println("leyedoArchivo = " + leyedoArchivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- realAllLines() --------------------------");
        //realAllLines()
        /*Devuelve el contenido de un archivo como una lista de cadenas.*/
        try {
            List<String> allFiles = Files.readAllLines(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));
            System.out.println("allFiles = " + allFiles);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- write() --------------------------");
        //write()
        /*Escribe una matriz de bytes en un arechivo.*/
        try {
            Files.write(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"), arrayFiles);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- writeString() --------------------------");
        //writeString()
        /*Escribe una cadena en un archivo.*/
        try {
            Files.writeString(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"), "newFile");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------- newDirectoryStream() --------------------------");
        //newDirectoryStream()
        /*Devuelve una colección de archivos (y subdirectorios) del diretorio dado.*/
        try {
            Files.newDirectoryStream(Path.of("C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3/Archivo/newFile.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
