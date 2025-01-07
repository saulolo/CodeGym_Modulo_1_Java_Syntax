package org.educatiom.modulo_I.lesson27_FechaYHora;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

    public static void main(String[] args) {

        System.out.println("----------------- Calendar --------------------------");
        //Clase Calendar
        /*Es una clase concebida para realizar operaciones dificiles con fechas
        Admite 3 tipos de calendarios, el gregoriano, el budista y el japones imperial (tambien acepta el chino y el
        musulman.*/

        System.out.println("----------------- getInstance() --------------------------");
        //getInstance()
        /*Method que crea un objeto inicializado con la fecha actual segun la PC donde se este ejecutando.*/
        Calendar date = Calendar.getInstance();

        System.out.println("----------------- GregorianCalendar() --------------------------");
        //GregorianCalendar()
        /*Es el mas usado.*/
        Calendar dateGregorian = new GregorianCalendar(1984, 04, 28);
        GregorianCalendar dateGregorian2 = new GregorianCalendar(1984, 04, 28, 06, 22, 33);

        System.out.println("----------------- getTime() --------------------------");
        //getTime()
        /*Convierte un objeto Calendar a un objeto Date.*/
        Calendar date2 = new GregorianCalendar(2019, 03, 12);
        System.out.println(date2.getTime()); //Fri Apr 12 00:00:00 COT 2019

        System.out.println("----------------- get(Calendar.MONTH) --------------------------");
        //get(Calendar.MONTH)
        /*Obtine el mes de un objeto Calendar.*/
        System.out.println("Mes = " + date2.get(Calendar.MONTH)); //Mes = 3

        System.out.println("----------------- get(Calendar.ERA) --------------------------");
        //get(Calendar.ERA)
        /*Se obtiene la era del objeto Calendar. (Despues de la era común). */
        System.out.println("Era = " + date2.get(Calendar.ERA)); //Era = 1

        System.out.println("----------------- get(Calendar.YEAR) --------------------------");
        //get(Calendar.YEAR)
        /*Se obtiene el año del objeto Calendar. */
        System.out.println("Año = " + date2.get(Calendar.YEAR)); //Año = 2019

        System.out.println("----------------- get(Calendar.DAY_OF_MONTH) --------------------------");
        //get(Calendar.DAY_OF_MONTH)
        /*Se obtiene el dia del mes del objeto Calendar. */
        System.out.println("Dia = " + date2.get(Calendar.DAY_OF_MONTH)); //Dia = 12

        System.out.println("----------------- get(Calendar.DAY_OF_WEEK) --------------------------");
        //get(Calendar.DAY_OF_WEEK)
        /*Se obtiene el dia de la semana del objeto Calendar. */
        System.out.println("Dia = " + date2.get(Calendar.DAY_OF_WEEK)); //Dia = 6

        System.out.println("----------------- get(Calendar.HOUR) --------------------------");
        //get(Calendar.HOUR)
        /*Se obtiene la hora del dia del objeto Calendar. */
        System.out.println("Hora = " + date2.get(Calendar.HOUR)); //Hora = 0

        System.out.println("----------------- get(Calendar.MINUTE) --------------------------");
        //get(Calendar.MINUTE)
        /*Se obtiene los minutos de la hora del objeto Calendar. */
        System.out.println("Minuto = " + date2.get(Calendar.MINUTE)); //Minuto = 0

        System.out.println("----------------- get(Calendar.SECOND) --------------------------");
        //get(Calendar.SECOND)
        /*Se obtiene los segundos del objeto Calendar. */
        System.out.println("Second = " + date2.get(Calendar.SECOND)); //Second = 0

        System.out.println("----------------- set(Calendar.MONTH, value) --------------------------");
        //set(Calendar.*MONTH, value)
        /*Method para setear los atributos del objeto CALENDAR.
        * YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, MINUTES, SECONDS */
        date2.set(Calendar.MONTH, 5);
        date2.set(Calendar.DAY_OF_MONTH, 4);
        System.out.println("Month = " + date2.get(Calendar.MONTH)); //Month = 5
        System.out.println("Day of mounth = " + date2.get(Calendar.DAY_OF_MONTH)); //Day of mounth = 4
        System.out.println("Calendar = " + date2.getTime()); //Calendar = Tue Jun 04 00:00:00 COT 2019

        System.out.println("----------------- Constantes de Calendar --------------------------");
        //Constantes de Calendar
        /*La clase Calendar tiene varias constantes que no se limitan a mostar solo elementos de la fecha.
        * Posee contantes de Meses (JANUARY, FEBRUARY...*/
        Calendar date3 = new GregorianCalendar(2019, Calendar.APRIL, 3);
        System.out.println("Date 3 = " + date3.getTime()); //Date 3 = Wed Apr 03 00:00:00 COT 2019
        if (date3.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
            System.out.println("Es Miercoles"); //Es miercoles.
        }

        System.out.println("----------------- add(Calendar.MONTH, value) --------------------------");
        //add(Calendar.*MONTH, value)
        /*method para operar de una manera mas inteligente y agregar elementos al objeto Calendar.
        * Este method tiene en cuenta las diferentes duraciones de los meses, así como los años bisiestos.*/
        date3.add(Calendar.MONTH, 5);
        System.out.println("Nuevo mes = " + date3.getTime()); //Nuevo mes = Tue Sep 03 00:00:00 COT 2019

        System.out.println("----------------- roll(Calendar.MONTH, value) --------------------------");
        //roll(Calendar.*MONTH, value)
        /*Funciona como add pero sin tener en cuenta la duracion de los meses, años, etc.*/
        date3.roll(Calendar.MONTH, 7);
        System.out.println("Nuevo mes roll = " + date3.getTime()); //Nuevo mes roll = Wed Apr 03 00:00:00 COT 2019















    }
}
