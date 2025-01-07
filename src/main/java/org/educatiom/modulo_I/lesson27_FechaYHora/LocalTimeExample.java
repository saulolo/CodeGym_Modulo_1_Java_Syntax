package org.educatiom.modulo_I.lesson27_FechaYHora;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {

        System.out.println("------------------------ LocalTime ------------------------------");
        //LocalTime
        /*Creada para cuando se necesita trabajar con tiempo pero sin fecha. Sus objetos no se pueden cambiar una vez
        * creados.*/

        System.out.println("------------------------ now() ------------------------------");
        //now()
        /*Creacion del objeto LocalTime.*/
        LocalTime now = LocalTime.now();
        System.out.println("time = " + now); //now = 11:41:29.810103500
        //El punto va seguido del número actual de nanosegundos.

        System.out.println("------------------------ of() ------------------------------");
        //of()
        /*Obtener un tiempo especifico.*/
        LocalTime time = LocalTime.of(13, 23, 12, 56);
        LocalTime time2 = LocalTime.of(14, 22);
        System.out.println("time = " + time); //time = 13:23:12.000000056
        System.out.println("time = " + time2); //time = 14:22

        System.out.println("------------------------ ofSecondOfDay() ------------------------------");
        //ofSecondOfDay()
        /*Obtener un tiempo basandole el indice de segundos.
        * Sí, 10.000 segundos es un poco menos de tres horas. Está todu correcto.*/
        LocalTime time3 = LocalTime.ofSecondOfDay(124);
        System.out.println("time3 = " + time3); //time3 = 00:02:04

        System.out.println("------------------------ getHour() ------------------------------");
        //getHour()
        /*Devuelve la hora.*/
        System.out.println("Hora = " + now.getHour()); //Hora = 13

        System.out.println("------------------------ getMinute() ------------------------------");
        //getMinute()
        /*Devuelve los minutos.*/
        System.out.println("Minutos = " + now.getMinute()); //Minutos = 49

        System.out.println("------------------------ getSecond() ------------------------------");
        //getSecond()
        /*Devuelve los segundos.*/
        System.out.println("Segundos = " + now.getSecond()); //Segundos = 43

        System.out.println("------------------------ getNano() ------------------------------");
        //getNano()
        /*Devuelve los nanosegundos.*/
        System.out.println("Nanosegundos = " + now.getNano()); //Nanosegundos = 850020100

        System.out.println("------------------------ plusHours() ------------------------------");
        //plusHours()
        /*Agrega horas.*/
        LocalTime timePlus = now.plusHours(2);
        System.out.println("timePlus = " + timePlus);  //timePlus = 16:00:12.636040500

        System.out.println("------------------------ plusMinutes() ------------------------------");
        //plusMinutes()
        /*Agrega minutes.*/
        LocalTime plusMinutes = now.plusMinutes(2);
        System.out.println("plusMinutes = " + plusMinutes);  //plusMinutes = 14:03:35.071246800

        System.out.println("------------------------ plusSeconds() ------------------------------");
        //plusSeconds()
        /*Agrega segundos.*/
        LocalTime plusSeconds = now.plusSeconds(2);
        System.out.println("plusSeconds = " + plusSeconds);  //plusSeconds = 14:02:51.717359900

        System.out.println("------------------------ plusNanos() ------------------------------");
        //plusNanos()
        /*Agrega nanosegundos.*/
        LocalTime plusNanos = now.plusNanos(2);
        System.out.println("plusNanos = " + plusNanos);  //plusNanos = 14:03:51.616304402

        System.out.println("------------------------ minusHours() ------------------------------");
        //minusHours()
        /*Resta horas.*/
        LocalTime minusHours = now.minusHours(2);
        System.out.println("minusHours = " + minusHours);  //minusHours = 12:05:26.194361

        System.out.println("------------------------ minusMinutes() ------------------------------");
        //minusMinutes()
        /*Resta minutos.*/
        LocalTime minusMinutes = now.minusMinutes(2);
        System.out.println("minusMinutes = " + minusMinutes);  //minusMinutes = 14:05:01.374852400

        System.out.println("------------------------ minusSeconds() ------------------------------");
        //minusSeconds()
        /*Resta segundos.*/
        LocalTime minusSeconds = now.minusSeconds(2);
        System.out.println("minusSeconds = " + minusSeconds);  //minusSeconds = 14:08:05.616853800

        System.out.println("------------------------ minusNanos() ------------------------------");
        //minusNanos()
        /*Resta nanosegundos.*/
        LocalTime minusNanos = now.minusNanos(2);
        System.out.println("minusNanos = " + minusNanos);  //minusNanos = 14:09:01.944282398

        /*Tambien la clase LocalTime tiene constantes como: MIN, MAX, MIDNIGHT, etc; bastante explicitas a tener en
        en consideración.*/

    }
}
