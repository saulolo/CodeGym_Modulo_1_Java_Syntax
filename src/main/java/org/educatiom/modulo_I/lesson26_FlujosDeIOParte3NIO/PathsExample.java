package org.educatiom.modulo_I.lesson26_FlujosDeIOParte3NIO;

import java.net.URI;
import java.nio.file.Path;

public class PathsExample {

    public static void main(String[] args) {

        System.out.println("------------------ Paths -----------------------------");
        //Paths
        /*Una clase de utilidad es una clase auxiliar con variables estáticas y métodos estáticos que realizan una lista
         específica de tareas relacionadas. Esta clase consta de un solo method de obtención estático (get) que tiene dos
        variantes con diferentes listas de parámetros.*/

        System.out.println("------------------ Path.of() -----------------------------");
        //Path.of()
        /*Esta clase de utilidad resuelve el problema de convertir una ruta (en forma de cadena) o URI en una ruta.
        * Pasamos al method get una Cadena (la ruta al archivo) y obtenemos una Ruta . Entonces podemos trabajar con él
        * según sea necesario.*/
        String file = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3NIO/filePathsExample.txt/";
        Path paths = Path.of(file, ""  );


        System.out.println("------------------ Path.of(URI.create()) -----------------------------");
        //Path.of(URI.create())
        /*También se puede obtener una ruta a partir de un URI.*/
        Path paths2 = Path.of(URI.create("file:///Users/User/Code/MyClass.java"));

        System.out.println("------------------ Path.of(System.getProperty()) -----------------------------");
        //Paths.get(System.getProperty())
        /*Indicamos la secuencia de nombres de directorio y el nombre del archivo cuya ruta con necesidad.*/
        Path paths3 = Path.of(System.getProperty("user.home"), "documents", "document.txt");
    }
}
