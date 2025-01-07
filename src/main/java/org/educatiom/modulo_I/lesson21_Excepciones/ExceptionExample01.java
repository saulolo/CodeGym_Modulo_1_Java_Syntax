package org.educatiom.modulo_I.lesson21_Excepciones;

public class ExceptionExample01 {

    public static void main(String[] args) {

        //Excepeciones
        /*Si tienes un programa que no funciona correctamente, puedes arreglarlo. Pero si tienes un programa cuyo código
         es incomprensible, no puedes hacer nada con él.
         Todos los métodos/funciones deben devolver un código de error que indica el resultado de su ejecución. Si una
         función funcionaba perfectamente, devolvía 0 . Si no, devolvía un código de error (no cero). Con este enfoque
         de los errores, después de casi todas las llamadas a funciones, los programadores tenían que agregar una
         verificación para ver si la función finalizaba con un error.
         Java tiene casi 400 clases de tipo exception. */

        System.out.println("======================== Try-Catch ============================");
        //Try-Catch
        /*Es el mecanismo que tiene Java para detección de excepeciones.
        * Dentro de "Try" ponemos el codigo donde podria ocurrir la excepción y dentro del "Catch", el código donde
        * capturaremos y de le daremos manejo a dicha excepción.
        * Nota: Se puede tener tantos catch como excepciones debamos controlar; y si una excepción se captura en varios
        * catch, se llamara aquella que este mas cercana al bloque try, es mejor colocar el mas general de ultimo.*/
        System.out.println("Atención por favor!!!, nos preparamos para el fin del mundo :(");
        endTheWorld();
        System.out.println("El mundo se acabo satisfatoriamente. :)");
    }

    private static void endTheWorld() {
        System.out.println("Hagamos algo importante");
        doSomeWork(3);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        doSomeWork(0);
        System.out.println("Todo salio bien");
    }

    private static void doSomeWork(int number) {
        try {
            System.out.println("No pasará nada de malo: " + number);
            System.out.println(2 / number);
            System.out.println("Nada terrible ha pasado: " + number);
        } catch (ArithmeticException e) {
            System.out.println("División por cero.");
        }
        catch (Exception e) {
            System.out.println("Se detecto una excepción!!!");
        }

        System.out.println("======================== Throw ============================");
        //throw
        /*Operador que nos permite volver a lanzar una excepción*/
        try {
            int d = 2 / 0;
        } catch (Exception e) {
            System.out.println("Capturando la excepción.");
            throw e;
        }

        System.out.println("======================== Finally ============================");
        //finally
        /*Operador que indica que se ejecute un bloque, salga una excepeción o no. Se puede prescindir del catch cuando
        * se llame el finally si no se requeire capturar una excepción. */
        try {
            int a = 3 / 0;
        } finally {
            System.out.println("Ejecutando de todos modos.");
        }

        System.out.println("======================== Tipos de Excepciones ============================");
        //Tipos de Excepciones
        /*Todas las excepeciones se dividen en 4 tipos que en realidad son calses que heredan unas de otras.
        *
                                            Throwable
                                           /         \
                                         Error     Exception
                                                       |
                                                RuntimeException

         * Clase Throwable: Clase base para todas las excepeciones.
         * Clase Error: genera excepciones graves por ejemplo un fallo de hardware, memoria insuficiente, etc.
         * Clase Exception: junto con la clase RuntimeException son para errores coumnes en muchos métodos.
         * Clase RuntimeException: Es una version mas liviana de Exception.
         */

        System.out.println("======================== Categoria de Excepciones ============================");
        //Categoria de Excepciones
        /*Hay dos categorias de excepeciones, las verificadas y no verificadas.
        * Excepciones No Verificadas: Todas las excepeciones que heredan de RuntimeException y Error se consideran de
        * este tipo, el 95% de las excepciones generadas son de este tipo (Culpa del programador).
        * Excepciones Verificadas: Todas las demas (Herdan de IOExcepction y no son culpa del programador.)
        *
        * La principal desventaja de las excepciones verificadas es que deben manejarse. Y aquí tenemos dos opciones:
        * manejarlas en su lugar usando un try-catch, o, si usamos la misma excepción en muchos lugares, usar throws
        * para lanzar las excepciones hacia arriba y procesarlas en las clases de nivel superior.
        * Los problemas surgen en aplicaciones bastante grandes con muchas excepciones que se manejan: la lista de
        * throws en un method de nivel superior puede crecer fácilmente hasta incluir una docena de excepciones.
        * Ej:public NuestraClaseGenial() throws PrimeraExcepcion, SegundaExcepcion, TerceraExcepcion, NombreDeLaAplicacionException...
        *                  */

        /*Nota: Puede tener tantos bloques catch como desee. Sin embargo, un solo bloque catch no puede especificar
        excepciones que hereden una de otra. En otras palabras, no puede escribir catch (Exception | RuntimeException e),
        porque la clase RuntimeException hereda de Exception.*/

        System.out.println("======================== Importante sobre Excepciones ============================");
        //Importante sobre Excepciones
        /*1. Registra los log de las excepciones lanzadas y no dejar un bloque catch vacio.
        * 2. Evita catch (Exception e) o peor aún, catch (Throwable t), es una mala practica.
        * 3. Lanza excepciones lo antes posible para tener un código mas robusto.
        * 4. Llama a las clases de las excepciones especificas y no solo a su padre  por ejemplo exception.
        * 5. Captura excepciones solo cuando se puedan manejar.
        * 6. Escribe tus propias excepciones pro supuesto que se entiendan.
        * 7. En la declaración de los nombres identificarlas bien y dene de terminar con la palabra exception.
        * 8. Documentar las excepciones con javadoc con la anotación @trows.
        * 9. No descuidar la cosntrucción try-with-resorces.
        * 10. Utilice las excepciones sabiamente ya que es un recurso demasiado costoso para la máquina.
        * 11. No utilizar logica de operaciones en las excepciones.*/


        /*                          JERARQUIA DE EXCEPCIONES

                                            Error
                                           /     \
                                          /       \
                                 Tiempo de        Tiempo de
                                 compilación     ejecución
                                 (sintaxis)       (runtime)
                                           \       /
                                            \     /
                                           Throwable
                                           /      \
                                         /          \
                                      Error       Exception
                                                    /     \
                                                   /       \
                                             IOException  RuntimeException



                        //TIPOS DE EXCEPCIONES

                               Object
                                 |
                             Throwable
                            /          \
                       Error           Exception
                       /   \            /        \
              OutOfMemoryError  StackOverflowError  RuntimeException  IOException
                     |                 |                  |              /     \
                 LinkageError    IllegalArgumentException IndexOutOfBoundsException  FileNotFoundException
                                   /          \               /                |           |
                    NumberFormatException  ArithmeticException  ArrayIndexOutOfBoundsException SocketException


        * */
    }

}
