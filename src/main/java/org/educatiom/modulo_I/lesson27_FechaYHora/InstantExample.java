package org.educatiom.modulo_I.lesson27_FechaYHora;

import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {

        System.out.println("------------------------ Instant ------------------------------");
        //Instant
        /*Clase destinada para trabajar con los procesos que ocurren dentro de las computadoras al trabajar con
        segundos, milisegundos y nanosegundos.
        Esta clase tiene dos campos que representan:
        - El número de segundos que han transcurrido desde el 1 de enero de 1970.
        - Un número de nanosegundos.*/

        Instant now = Instant.now();
        System.out.println("now = " + now); //now = 2024-12-19T16:15:40.781028900Z

        System.out.println("------------------------ ofEpochMilli(), ofEpochSecond() ------------------------------");
        //of()
        /*Se puede crear objetos Instance con variaciones de of*/
        Instant instant = Instant.ofEpochMilli(100);
        Instant instant1 = Instant.ofEpochSecond(100);
        System.out.println("today = " + instant); //today = 1970-01-01T00:00:00.100Z
        System.out.println("today2 = " + instant1); //today2 = 1970-01-01T00:01:40Z

        System.out.println("------------------------ getEpochSecond() ------------------------------");
        //getEpochSecond()
        /*Obtiene el número de segundos que han transcurrido desde el 1 de enero de 1970 */
        System.out.println("Second = " + instant.getEpochSecond()); //instant.getEpochSecond()

        System.out.println("------------------------ getNano() ------------------------------");
        //getNano()
        /*Obtiene los nanosegundos.*/
        System.out.println("Nanosegundos = " + instant.getNano());  //Nanosegundos = 100000000

        System.out.println("------------------------ toEpochMilli() ------------------------------");
        //toEpochMilli()
        /*Obtiene el número de milisegundos que han transcurrido desde el 1 de enero de 1970.*/
        System.out.println("Milisegundos = " + instant.toEpochMilli());  //Milisegundos = 100

        System.out.println("------------------------ plusSeconds() ------------------------------");
        //plusSeconds()
        /*Añade segundos a la hora actual,*/
        System.out.println("plusSeconds = " + instant.plusSeconds(13));  //plusSeconds = 1970-01-01T00:00:13.100Z

        System.out.println("------------------------ plusMillis() ------------------------------");
        //plusMillis()
        /*Añade milisegundos a la hora actual,*/
        System.out.println("milisegundos = " + instant.plusMillis(13));  //milisegundos = 1970-01-01T00:00:00.113Z

        System.out.println("------------------------ plusNanos() ------------------------------");
        //plusNanos()
        /*Añade nanosegundos a la hora actual,*/
        System.out.println("nanosegundos = " + instant.plusNanos(13));  //nanosegundos = 1970-01-01T00:00:00.100000013Z

        System.out.println("------------------------ minusSeconds() ------------------------------");
        //minusSeconds()
        /*Resta segundos a la hora actual,*/
        System.out.println("segundos = " + instant.minusSeconds(13));  //segundos = 1969-12-31T23:59:47.100Z

        System.out.println("------------------------ minusMillis() ------------------------------");
        //minusSeconds()
        /*Resta milisegundos a la hora actual,*/
        System.out.println("milisegundos = " + instant.minusMillis(13));  //milisegundos = 1969-12-31T23:59:47.100Z

        System.out.println("------------------------ minusNanos() ------------------------------");
        //minusNanos()
        /*Resta nanosegundos a la hora actual,*/
        System.out.println("nanosegundos = " + instant.minusNanos(13));  //nanosegundos = 1970-01-01T00:00:00.099999987Z
        
    }
}
