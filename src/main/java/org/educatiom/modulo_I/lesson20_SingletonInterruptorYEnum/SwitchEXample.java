package org.educatiom.modulo_I.lesson20_SingletonInterruptorYEnum;

import java.time.Month;

public class SwitchEXample {

    public static void main(String[] args) {

        //Switch
        /*Es un operador de opción multiple. A menudo es mencionado como un antipatron, por ende se suele evitar.*/

        int temperature = 38;

        switch (temperature) {
            case 36 :
                System.out.println("Baja");
                break;
            case 37:
                System.out.println("Normal");
                break;
            case 38:
                System.out.println("Alta");
                break; //Se puede omitir este break ya que es la ultima sentencia.
            default:
                System.out.println("Es humano???");
        }
        //Alta

        //Casos de uso de Switch
        /*- Cuando halla mas de dos sentencias para no saturar el código con if.
        * - Segun el caso, no olvidar el interruptor break.
        * - Usar tambien la sentencias default para cuando aplique.*/

        //Diferencia entre la sentencia Switch y la expreción Switch
        /*A partir de Java 14 salio un swith mejorado para solventar el antipatrón que no es una sentencia switch sino
        una expresión switch.
        ¿Cuál es la diferencia? La diferencia es que una sentencia es una instrucción que realiza un conjunto determinado
         de operaciones, pero una expresión es un fragmento de código que realiza algún cálculo y devuelve un resultado.
         Este utiliza el operador flecha -> (son expresiones lambda.)
         Tambien a partir de la version 13 de Java, la exprsioón Break cambio port yield, este es análogo al return pero
         en sentencias Switch.*/
        Month month = null;
        var result = switch (month) {
            case DECEMBER, JANUARY, FEBRUARY -> 1;
            case MARCH, APRIL, MAY -> 2;
            case JUNE, JULY, AUGUST -> 3;
            case SEPTEMBER, OCTOBER, NOVEMBER -> 4;
            default -> 0;
        };
    }
}
