package org.educatiom.modulo_I.lesson23_ErrorYPalabrasReservadas;

public class ErrorExample {

    public static void main(String[] args) {

        //Error
        /*Por lo generarl son problemas que no dependen del programador, estos no se pueden capturar en un try-catch
        * excepto para registrar ya que son problemas de la JVC, pero en caso de error es mejor utilizar la clase padre:
        * Throweable, ya que aqui captura el error y la excepción*/

        try {
            //Codigo
        } catch (Throwable throwable) {
            // Código
        }

        //Errores comunes
        /*OutOfMemoryError: Cuando el programa no tiene suficiente memoria para crear objetos.
         StackOverFlowError: Se produce cuando se desborda la pila de memoria.*/

        //                      DIFERENCIA ENTRE ERROR Y EXCEPCIÓN
        /*              ERROR                                               EXCEPCIÓN
        * - No se puede corregir con bloque catch.           - Se puede manejar con bloque catch.
        * - No ocurre en tiempo de compilcación.             - Se puede capturar en tiempo de compilación.
        * - Problemas en la JVM.                             - Problemas en la lógica del código.
        * - Todos los errores no son verificados.            - Son verificadas y no verificadas.
        * */

    }

}
