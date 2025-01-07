package org.educatiom.modulo_I.lesson27_FechaYHora;

import java.time.*;

public class ZonedDateTimeExample {

    public static void main(String[] args) {


        System.out.println("----------------------- ZoneId --------------------------");
        //ZoneId
        /*Calse cuyo method es listar todas las zonas horarias disponibles (Son 599). */

        System.out.println("----------------------- getAvailableZoneIds() --------------------------");
        //getAvailableZoneIds()
        /*Method estático de la clase ZoneId que devuelve todas las zonas horarias conocidas.*/
        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        System.out.println("----------------------- of() --------------------------");
        //of()
        /*Obtiene un objeto ZonaId por su nombre.*/
        ZoneId africa = ZoneId.of("Africa/Cairo");
        System.out.println("Zona horaria de: " + africa);

        System.out.println("----------------------- ZonedDateTime --------------------------");
        //ZonedDateTime
        /*Su objetivo principal es facilitar el trabajo con fechas en diferentes zonas horarias.
        *La zona horaria se determina automáticamente según la configuración de la computadora que ejecuta el programa */
        ZonedDateTime time = ZonedDateTime.now();
        System.out.println("time = " + time); //time = 2024-12-20T09:12:03.640045400-05:00[America/Bogota]


        //Conversión de una fecha global a una local
        /*Una de las características interesantes de ZonedDateTimees su capacidad para convertir a una fecha y hora
        locales.*/
        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime cairoTome = ZonedDateTime.now(zone);
        System.out.println("cairoTome = " + cairoTome);

        LocalDate localDate = cairoTome.toLocalDate();
        LocalTime localTime = cairoTome.toLocalTime();
        LocalDateTime localDateTime = cairoTome.toLocalDateTime();
        System.out.println("localDate = " + localDate + " localTime = " + localTime + " localDateTime = " + localDateTime);
        //localDate = 2024-12-20 localTime = 16:20:30.729623400 localDateTime = 2024-12-20T16:20:30.729623400

        System.out.println("----------------------- getYear() --------------------------");
        //getYear()
        /*Devuelve el año de una fecha especifica.*/
        System.out.println("Año = " + cairoTome.getYear()); //Año = 2024

        System.out.println("----------------------- getMonth() --------------------------");
        //getMonth()
        /*Devuelve el mes de una fecha especifica en constantes.*/
        System.out.println("Mes = " + cairoTome.getMonth()); //Mes = DECEMBER

        System.out.println("----------------------- getMonthValue() --------------------------");
        //getMonthValue()
        /*Devuelve el indice del mes de una fecha especifica comienza con enero == 1.*/
        System.out.println("Month index = " + cairoTome.getMonthValue()); //Month Index = 12

        System.out.println("----------------------- getDayOfMonth() --------------------------");
        //getDayOfMonth()
        /*Devuelve el indice del dia del mes de una fecha especifica.*/
        System.out.println("Day index = " + cairoTome.getDayOfMonth()); //Day Index = 20

        System.out.println("----------------------- getDayOfWeek() --------------------------");
        //getDayOfWeek()
        /*Devuelve el indice del dia de la semana de una fecha especifica en constante.*/
        System.out.println("Day index week = " + cairoTome.getDayOfWeek()); //Day index week = FRIDAY

        System.out.println("----------------------- getDayOfYear() --------------------------");
        //getDayOfYear()
        /*Devuelve el indice del dia del año de una fecha especifica.*/
        System.out.println("Day index year = " + cairoTome.getDayOfYear()); //Day index year = 355

        System.out.println("----------------------- getHour() --------------------------");
        //getHour()
        /*Devuelve la hora de una fecha especifica.*/
        System.out.println("Hour = " + cairoTome.getHour()); //Hour = 16

        System.out.println("----------------------- getMinute() --------------------------");
        //getMinute()
        /*Devuelve los minutos de una fecha especifica.*/
        System.out.println("Minutes = " + cairoTome.getMinute()); //Minutes = 39

        System.out.println("----------------------- getSecond() --------------------------");
        //getSecond()
        /*Devuelve los segundos de una fecha especifica.*/
        System.out.println("Segundos = " + cairoTome.getSecond()); //Segundos = 53

        System.out.println("----------------------- getNano() --------------------------");
        //getNano()
        /*Devuelve los nanosegundos de una fecha especifica.*/
        System.out.println("Nanosegundos = " + cairoTome.getNano()); //Nanosegundos = 973862300


        /*Nota: La clase ZonedDateTime tiene methods para agregar y restar elementos de fecha como dias, mes, año, hora,
         etc. Estan reflejados  exactamente los métodos de las clases  LocalTime, ejemplos de estos methods son:
         plusYear, plusDays, plusNanos, minusYears, minusDays(Ver los metodos en las clases mencionados).
        * */

    }
}
