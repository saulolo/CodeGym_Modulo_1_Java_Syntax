package org.educatiom.modulo_I.lesson27_FechaYHora;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

    public static void main(String[] args) {

        System.out.println("-------------------------- DateTimeFormatter ----------------------------");
        //DateTimeFormatter
        /*Es una clase cuyo propósito es facilitar al máximo a los programadores la conversión de una fecha y hora al
        formato exacto que deseen.*/

        System.out.println("-------------------------- ofPattern() ----------------------------");
        //ofPattern()
        /*Es el method utilizado para crear un objeto DateTimeFormatter pasando un patron en especifico.*/

        System.out.println("-------------------------- format() ----------------------------");
        //format()
        /*Method para convertir un objeto LocadDateTime en una cadena de texto.*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        String text = formatter.format(LocalDateTime.now());
        System.out.println("Fecha formateada = " + text); //Fecha formateada = 12-20-24
        /* MM: indica que se muestre el nombre del mes, abreviado con dos letras
         * dd: indica que se muestre el día del mes
         * yy: indica que se muestre el año usando 2 dígitos
         * h: horas
         * m: minutos
         * s: segundos
         * S: Milisegundos
         * n: Nanosegundos*/

        //                                  Tabla Completa de Patrones
        /*Patrón	    Variaciones del patrón	    Ejemplo	                            Descripción
            y	            yy, yyyy	            19; 2019	                            Año
            L/M	        M, MM, MMM, MMMM, MMMMM	    1; 01; Ene; Enero; j	                Mes
            d	            d, dd	                9; 09	                                Día
            H	            H, HH	                2; 02	                                Horas
            m   	        mmm	                    3; 03	                                Minutos
            s	            s, ss	                5; 05	                                Segundos
        S	            S, SS, SSS, ...	        1; 12; 123	                                Milésimas de segundo
            n	            n                   	123456789	                            nanosegundos
            G           	G, GGGG, GGGGG	        ANUNCIO; De nueva era; A;	            Era
            P/q	            q, qq, qqq, qqqq	    3; 03; Q3; 3er trimestre	            Cuarto
            w	            w	                    13	                                    semana del año
            W	            W	                    3	                                    semana del mes
            mi	            EEE, EEEE, EEEEE	    Lun; Lunes; METRO	                    Día de la semana
            CE	            e, ee, eee, eeee, eeeee	1; 01; Lun; Lunes; METRO	            Día de la semana
            a	            a	                    PM	                                    Am o PM
            h	            h	                    12	                                    reloj de 12 horas.
            V	            vv	                    Europa/Helsinki	                        Zona horaria
            z	            z zzzz	                EET; Hora estándar de Europa del Este	Zona horaria
            O	            OOOOO	                GMT+2; GMT+02:00	                    Zona horaria
                    * */


        System.out.println("-------------------------- parse() ----------------------------");
        //parse()
        /*Analiza una cadena para dividirla en tokens significativos.*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse("23:59:59", dtf);
        System.out.println(time); //23:59:59
    }
}
