package org.educatiom.modulo_I.lesson26_FlujosDeIOParte3NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

public class SelectorExample {

    public static void main(String[] args) {

        //Selector
        /*Una clase selectro puede monitorear uno o mas objetos Channel, verifica su preparación para leer/escribir.
        * Necesita una transmision no una transmision por canal.
        * //Aquí debemos mencionar que un canal debe estar en modo sin bloqueo para que pueda usarse con un selector.
        * De ello se deduce que un selector no funcionará con un FileChannel , porque un FileChannel no se puede
        * cambiar al modo sin bloqueo (el method configureBlocking se declara en la clase SelectableChannel , que
        * FileChannel no hereda)
         */


        String file = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson26/FlujosDeIOParte3NIO/fileExample.txt/";
        try(Selector selector = Selector.open()){ //Creación obteto selectro abierto

            //Registrando los canales en un objeto selector.
            int key1 = selector.select(SelectionKey.OP_READ);
            int key2 = selector.select(SelectionKey.OP_WRITE);

        } catch (FileNotFoundException e) {
            System.err.println("No se pudo encontrar el archivo: " + e);
        } catch (IOException e) {
            System.err.println("A ocurrido una excepción de tipo: " + e);
        }

        //Selection key
        /*Este objeto contiene datos sobre el registro del canal.*/
        /*Conclusión
        Después de registrar canales con un selector, podemos:
        - averiguar el número de canales listos para realizar operaciones específicas
        - bloquear la ejecución de nuestro programa hasta que al menos un canal esté listo
        - obtener un juego de claves para canales listos*/

    }
}
