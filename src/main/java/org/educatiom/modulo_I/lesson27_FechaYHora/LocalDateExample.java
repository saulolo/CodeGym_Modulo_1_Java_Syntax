package org.educatiom.modulo_I.lesson27_FechaYHora;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {

    public static void main(String[] args) {

        System.out.println("------------------------- LocalDate ------------------------");
        //LocalDate
        /*Es una clase inmutable simple y poderosa con las que se pueden resolver muchas tareas relacionadas con la fecha que se
        encuentra en el paquete java.time en en cual se encuentran otras clases mas para el manejo de tiempos.*/

        System.out.println("------------------------- now() ------------------------");
        //now()
        /*Obtiene la fecha actual*/
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today); //today = 2024-12-12

        System.out.println("------------------------- now(ZoneID) ------------------------");
        //now(ZoneID)
        /*Obtienen la fecha actual en una zona horaria especifica.*/
        ZoneId timeZone = ZoneId.of("Asia/Shanghai");
        LocalDate todayZonaId = LocalDate.now(timeZone);
        System.out.println("La fecha en Shangai es = " + todayZonaId); //La fecha en Shangai es = 2024-12-13

        System.out.println("------------------------- of() ------------------------");
        //of()
        /*Para obtener una fecha especifica.*/
        LocalDate SpecificDate = LocalDate.of(1984, Month.APRIL, 28);
        System.out.println("SpecificDate = " + SpecificDate); //SpecificDate = 1984-04-28

        System.out.println("------------------------- ofYearDay() ------------------------");
        //ofYearDay()
        /*Obtener una fecha por indice de dia.*/
        LocalDate dayByIndex = LocalDate.ofYearDay(1984, 100);
        System.out.println("dayByIndex = " + dayByIndex); //dayByIndex = 1984-04-09

        System.out.println("------------------------- ofEpochDay() ------------------------");
        //ofEpochDay()
        /*devuelve la fecha calculada a partir del 1 de enero de 1970, como en las clases anteriores.*/
        LocalDate epochDay = LocalDate.ofEpochDay(100);
        System.out.println("epochDay = " + epochDay); //epochDay = 1970-04-11

        System.out.println("------------------------- getYear() ------------------------");
        //getYear()
        /*Devuelve el año.*/
        System.out.println("Año = " + today.getYear()); //Año = 2024

        System.out.println("------------------------- getMonth() ------------------------");
        //getMonth()
        /*Devuelve el mes (en constante).*/
        System.out.println("today = " + today.getMonth()); //today = DECEMBER

        System.out.println("------------------------- getMonthValue() ------------------------");
        //getMonthValue()
        /*Devuelve el índice del mes*/
        System.out.println("today = " + today.getMonthValue()); //today = 12

        System.out.println("------------------------- getDayOfMonth() ------------------------");
        //getDayOfMonth()
        /*Devuelve el indice del dia del mes.*/
        System.out.println("today = " + today.getDayOfMonth()); //today = 17

        System.out.println("------------------------- getDayOfYear() ------------------------");
        //getDayOfYear()
        /*Devuelve el indice del dia del desde el comienzo del año.*/
        System.out.println("today = " + today.getDayOfYear()); //today = 352

        System.out.println("------------------------- getDayOfWeek() ------------------------");
        //getDayOfWeek()
        /*Devuleve el dia de la semana en constante.*/
        System.out.println("today = " + today.getDayOfWeek()); //today = TUESDAY

        System.out.println("------------------------- getEra() ------------------------");
        //getEra()
        /*Devuleve la era antes (BCE) y despúes de la actual (CE).*/
        System.out.println("today = " + today.getEra()); //today = CE

        System.out.println("------------------------- plusDays() ------------------------");
        //plusDays()
        /*Agrega un número especifico de dias a la fecha, no cambia el objeto agregado sino que creá uno nuevo a partir
        de ese.*/
        System.out.println("today = " + today.plusDays(13)); //today = 2024-12-30

        System.out.println("------------------------- plusWeeks() ------------------------");
        //plusWeeks()
        /*Agrega semanas a la fecha, no cambia el objeto agregado sino que creá uno nuevo a partir de ese.*/
        System.out.println("today = " + today.plusWeeks(13)); //today = 2025-03-18

        System.out.println("------------------------- plusMonths() ------------------------");
        //plusMonths()
        /*Agrega meses a la fecha, no cambia el objeto agregado sino que creá uno nuevo a partir de ese.*/
        System.out.println("today = " + today.plusMonths(13)); //today = 2026-01-17

        System.out.println("------------------------- plusYears() ------------------------");
        //plusYears()
        /*Agrega años a la fecha, no cambia el objeto agregado sino que creá uno nuevo a partir de ese.*/
        System.out.println("today = " + today.plusYears(13)); //today = 2037-12-17

        System.out.println("------------------------- minusDays() ------------------------");
        //minusDays()
        /*Resta dias de fecha, no cambia el objeto agregado sino que creá uno nuevo a partir de ese.*/
        System.out.println("today = " + today.minusDays(13)); //today = 2024-12-04

        System.out.println("------------------------- minusWeeks() ------------------------");
        //minusWeeks()
        /*Resta semanas de fecha, no cambia el objeto agregado sino que creá uno nuevo a partir de ese.*/
        System.out.println("today = " + today.minusWeeks(13)); //today = 2024-09-17

        System.out.println("------------------------- minusMonths() ------------------------");
        //minusMonths()
        /*Resta meses de fecha, no cambia el objeto agregado sino que creá uno nuevo a partir de ese.*/
        System.out.println("today = " + today.minusMonths(13)); //today = 2023-11-17

        System.out.println("------------------------- minusYears() ------------------------");
        //minusYears()
        /*Resta años de fecha, no cambia el objeto agregado sino que creá uno nuevo a partir de ese.*/
        System.out.println("today = " + today.minusYears(13)); //today = 2011-12-17

    }
}
