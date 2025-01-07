package org.educatiom.modulo_I.lesson22_ExcepcionesParteII.RastreoDePila;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

public class RastreoDePilaExample {

    public static void main(String[] args) throws IOException {

        //Rastreo de pila
        /*Es cuando en el momento de la ejecución de un programa, se puede averiguar la clase y el nombre del method
        * que se esta ejecutamdo actaulmente, es una lista de llamadas que consiste en el method actual, method que lo
        * invocó y method que lo llamó.*/


        System.out.println("------------------------- Clase StackTrace ------------------------------");
        //Clase StackTrace
        /*Clase que contiene informacion sobre un methods para el manejo de seguimiento de la pila de excepciones.
        * Devuelve la traza de la pila de llamadas a los methods.*/

        test();
    }

    /*El method estático currentThread() de la clase Thread devuelve una referencia a un objeto Thread, que contiene
    información sobre el hilo actual, es decir, el hilo actual de ejecución. */

    public static void test() throws IOException {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();


        for (StackTraceElement info : methods) {
            System.out.println(info);

            System.out.println("------------------------- getClassName() ------------------------------");
            //getClassName()
            /*Devuelve el nombre de la clase.*/
            System.out.println(info.getClassName()); //.....RastreoDePilaExample

            System.out.println("------------------------- getMethodName() ------------------------------");
            //getMethodName()
            /*Devuelve el nombre del method.*/
            System.out.println(info.getMethodName()); //main

            System.out.println("------------------------- getFileName() ------------------------------");
            //getFileName()
            /*Devuelve el nombre del archivo y este a su vez puede tener varias clases.*/
            System.out.println(info.getFileName()); //RastreoDePilaExample.java

            System.out.println("------------------------- getLineNumber() ------------------------------");
            //getLineNumber()
            /*Devuelve el número de lienas donde se llamo al method.*/
            System.out.println(info.getModuleName()); //null

            System.out.println("------------------------- getModuleName() ------------------------------");
            //getModuleName()
            /*Devuelve el nombre del módulo y puede ser null.*/
            System.out.println(info.getModuleName()); //null


            System.out.println("------------------------- getModuleVersion() ------------------------------");
            //getModuleVersion()
            /*Devuelve la version del módulo.*/
            System.out.println(info.getModuleVersion()); //null
        }


        //Apilar
        /*Pila: es una estructura de datos a la que puede agregar elementos y desde la cual puede recuperar elementos.
        * Al hacerlo, solo puede tomar elementos del final: primero toma el último agregado, luego el penúltimo agregado,
        * etc, o sea se recueparn en orden inverso (priemero en entrar, ultimo en salir.*/

        Stack<Integer> stack = new Stack<>();
        System.out.println("------------------------- push() ------------------------------");
        //push()
        /*Agrega el objeto elemento al principio de la pila.*/
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("stack = " + stack); //stack = [1, 2, 3, 4, 5]

        System.out.println("------------------------- pop() ------------------------------");
        //pop()
        /*Elimina el elemento de la parte superior de la pila, la pila va disminuyendo.*/
        stack.pop();
        System.out.println("stack = " + stack); //stack = [1, 2, 3, 4]

        System.out.println("------------------------- peek() ------------------------------");
        //peek()
        /*Devuelve el elemento de la parte superior de la pila(La pila no cambia).*/
        stack.peek();
        System.out.println("stack = " + stack);

        System.out.println("------------------------- empty() ------------------------------");
        //empty()
        /*Comprueba si la colección esta vacía.*/
        System.out.println(stack.empty()); //false

        System.out.println("------------------------- search() ------------------------------");
        //search()
        /*Busca un objeto de la colección y devuelve su indice.*/
        System.out.println(stack.search(2)); //3

        //Seguimiento de Pila de Excepciones
        /*Cuando ocurre un error en un programa y se lanza una excepción , la excepción contiene el seguimiento de la
        pila actual : una matriz que consta de una lista de métodos que comienzan, desde el métho principal y terminan
        con el method donde ocurrió el error. ¡Incluso está la línea donde se lanzó la excepción!
        Este seguimiento de la pila se almacena dentro de la excepción y se puede recuperar fácilmente mediante el
        siguiente method:StackTraceElement[] getStackTrace()
        */

        System.out.println("------------------------- printStackTrace() ------------------------------");
        //printStackTrace()
        /*Muestra toda la información de seguimiento de pila almacenada dentro de la excepción.*/

        try {
            int x = 10;
            int y = 0;
            int z = x / y;
            System.out.println("z = " + z);
        } catch (Exception e) {
            StackTraceElement[] elements = e.getStackTrace(); //Obtenemos el seguimiento de la pila cuando ocurrio el error.
            System.out.println("elements ==> " + elements);
            e.printStackTrace();
        }

        System.out.println("------------------------- close() ------------------------------");
        //close()
        /*Method especial para liberar recursos externos. Se usa para cerrar los archivos una vez se usan para liberar
        * recursos del sistema operativo*/
        String path = "c:\\projects\\log.txt"; //Ruta del archivo.
        FileOutputStream output = null; //Obtener el objeto del archivo: adquirir el recurso.
        try {
            output = new FileOutputStream(path);
            output.write(1); //Escribir el archivo.
            output.close(); //Cerrar el archivo - Liberar recurso.
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close(); //Cerrar el archivo - Liberar recurso.
            }
        }

        //try-with-resources
        /*Otra forma de crear declaraciones de forma sintactica es usando el try con recursos el cual aplica
        * paréntesis en su declaración.
        * Esta sintaxis fue creado precisamente para resolver el problema con la llamada obligatoria al method close().
        * asi no tendriamos que llamarlo.
        * Nota: Puede utilizar varias llamadas en el mismo parentesis, ej:
        * try (FileOutputStream output2 = new FileOutputStream(path);
        *      FileOutputStream output2 = new FileOutputStream(path))*/
        try (FileOutputStream output2 = new FileOutputStream(path)){
            output2.write(1);
        }
        /*Por cierto, podemos agregar catchy finallybloques a la tryinstrucción -with-resources. O no puede agregarlos
        si no son necesarios.*/


    }
}
