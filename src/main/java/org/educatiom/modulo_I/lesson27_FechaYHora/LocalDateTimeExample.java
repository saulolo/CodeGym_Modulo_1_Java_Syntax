package org.educatiom.modulo_I.lesson27_FechaYHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        System.out.println("------------------------ LocalDateTime ------------------------------");
        //LocalDateTime
        /*Esta clase combina las capacidades de las clases LocalDate y LocalTime: almacena tanto una fecha como una hora.
        Sus objetos también son inmutables y sus métodos son similares a los de las clases LocalDate y LocalTime.*/

        System.out.println("------------------------ now() ------------------------------");
        //now()
        /*Creacion del objeto LocalDateTime.
        * Cuando se muestra en la pantalla, la fecha y la hora están separadas por la letra T.*/
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now); //now = 2024-12-19T09:04:10.770433300

        System.out.println("------------------------ of() ------------------------------");
        //of()
        /*Obtener una fecha y hora especifica.*/
        LocalDateTime birthDate = LocalDateTime.of(1984, Month.APRIL, 28, 06, 22, 33);
        System.out.println("birthDate = " + birthDate); //birthDate = 1984-04-28T06:22:33

        //Otra forma de crear objetos LocalDate.
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("dateTime = " + dateTime); //dateTime = 2024-12-19T09:44:40.397382600

        /*Nota: La clase LocalDateTimeclase tiene methods para obtener elementos de una fecha y/u hora. Reflejan
        exactamente los métodos de las clases LocalDatey LocalTime (Ver los metodos en las clases mencionados).
        * */

    }
}
