package org.educatiom.modulo_I.lesson26_FlujosDeIOParte3NIO;

import java.nio.file.Path;

public class PathExample {

    public static void main(String[] args) {


        System.out.println("--------------------- Path -------------------------");
        //Path
        /*La interfaz path reemplazo la clase File de Java, es mas segura y eficiente.
        * Tiene clases descendiente como WindowsPath y UnixPath ya que existen muchos S.O. en el mundo.*/
        //Creación del Objeto Path.
        Path name = Path.of("uri"); //el method .of se utiliza para crear objetos WindowsPath si el programa se ejecuta en windows.
        //Nota: No se puede crear objetos tipo Path con el operador new.

        System.out.println("--------------------- getParent() -------------------------");
        //getParent()
        /*Devuelve el directorio principal.*/
        String file = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3PathExample.txt";
        Path path = Path.of(file).getParent();
        System.out.println("path = " + path); //path = C:\Users\SaulHernandoEcheverr\Documents\Proyectos\CodeGym\Exercises Codegym\Exercises Codegym\src\main\java\org\educatiom\lesson26

        System.out.println("--------------------- getFileName() -------------------------");
        //getFileName()
        /*Devuelve el nombre del archivo sin directorio. Lo que viene despues del último delimitador.*/
        System.out.println("Directorio: " + path.getFileName()); //Directorio: lesson26

        System.out.println("--------------------- getRoot() -------------------------");
        //getRoot()
        /*Devuelve el directorio raiz de una ruta.*/
        System.out.println("Root: " + path.getRoot()); //Root: C:\


                                    //Paths abslutos y Relativos
        /*Path Absoluto: Comienza desde el directoriuo raiz.
        * Ej: en windows ==> c:\carpeta.
        * en linux ==> /carpeta.
        * Path Relativo: Es significativa con respecto a algún directorio. Es decir como el final del camino pero sin el
        * principio. sepuede pasar de una ruta a otra y visceversa.*/
        System.out.println("--------------------- isAbsolute() -------------------------");
        //isAbsolute()
        /*Comprueba si la ruta actual es absoluta.*/
        System.out.println( path.isAbsolute()); //true

        System.out.println("--------------------- toAbsolutePath() -------------------------");
        //toAbsolutePath()
        /*Convierte la ruta en absoluta.*/
        Path pathAbsolute = path.toAbsolutePath();
        System.out.println("pathAbsolute = " + pathAbsolute); //pathAbsolute = C:\Users\SaulHernandoEcheverr\Documents\Proyectos\CodeGym\Exercises Codegym\Exercises Codegym\src\main\java\org\educatiom\lesson26

        System.out.println("--------------------- normalize() -------------------------");
        //normalize()
        /*Elimina los comodines en un nombre de directorio. En lugar de un nombre de directorio se puede escribir ".." que
        * significa retroceder un directorio*/
        System.out.println(path.normalize()); //C:\Users\SaulHernandoEcheverr\Documents\Proyectos\CodeGym\Exercises Codegym\Exercises Codegym\src\main\java\org\educatiom\lesson26

        System.out.println("--------------------- relativize() -------------------------");
        //relativize()
        /*Obtiene una ruta relatitva de dos rutas absolutas para comparar entre dos paths.*/
        String file2 = "C:/Users/";
        Path path2 = Path.of(file2);
        Path result = path2.relativize(path);
        System.out.println(result); //SaulHernandoEcheverr\Documents\Proyectos\CodeGym\Exercises Codegym\Exercises Codegym\src\main\java\org\educatiom\lesson26

        System.out.println("--------------------- resolve() -------------------------");
        //resolve()
        /*Construye una nueva ruta absoluta a partir de rutas absolutas y relativas.*/
        Path result2 = path2.resolve(path);
        System.out.println(result2); //C:\Users\SaulHernandoEcheverr\Documents\Proyectos\CodeGym\Exercises Codegym\Exercises Codegym\src\main\java\org\educatiom\lesson26

        System.out.println("--------------------- startsWith() -------------------------");
        //startsWith()
        /*Comprueba si la ruta actual comienza con una ruta dada.*/
        System.out.println(path.startsWith(path2)); //true

        System.out.println("--------------------- endsWith() -------------------------");
        //endsWith()
        /*Comprueba si la ruta actual termina con una ruta dada.*/
        System.out.println(path.endsWith(path2)); //false
        
        System.out.println("--------------------- getNameCount() -------------------------");
        //getNameCount()
        /*Divide la ruta en partes utilizando / como delimitador y devuelve el número de partes.*/
        System.out.println(path.getNameCount()); //13

        System.out.println("--------------------- getName() -------------------------");
        //getName()
        /*Divide la ruta en partes utilizando / como delimitador y devuelve el una parte por su indice.*/
        System.out.println(path.getName(12)); //lesson26

        System.out.println("--------------------- subPath() -------------------------");
        //subPath()
        /*Divide la ruta en partes utilizando / como delimitador y devuelve el subcamino que corresponde al intervalo dado.*/
        System.out.println(path.subpath(10, 12)); //org\educatiom

        System.out.println("--------------------- toFile() -------------------------");
        //toFile()
        /*Convierte un objeto en un objeto Path obsoleto de File*/
        System.out.println(path.toFile()); //C:\Users\SaulHernandoEcheverr\Documents\Proyectos\CodeGym\Exercises Codegym\Exercises Codegym\src\main\java\org\educatiom\lesson26

        System.out.println("--------------------- toUri() -------------------------");
        //toUri()
        /*Convierte objeto Path en un objeto Uri*/
        System.out.println(path.toUri()); //file:///C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises%20Codegym/Exercises%20Codegym/src/main/java/org/educatiom/lesson26/
    }
}
