package org.educatiom.modulo_I.lesson27_FechaYHora;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {


        System.out.println("--------------------- Date ---------------------------");
        //Date
        /*La clase Date almacena información de fecha y hora como la cantidad de milisegundos que han transcurrido desde
         el 1 de enero de 1970 (Por inicio del tiempo de Unix). Son muchos milisegundos, por lo que el tipo long se usa para almacenarlos.*/

        System.out.println("---------------------- Fecha actual -----------------------");
        //current date
        /*Mostrar la fecha actual con un objeto Date.*/
        Date current = new Date();
        System.out.println("Fecha actual = " + current); //Fecha actual = Fri Dec 06 09:38:56 COT 2024

        System.out.println("---------------------- Establecer fecha específica -----------------------");
        //Establecer fecha específica
        /*Establecer una fecha diferente a la actual.
        * Nota: Los mesees comienzan desde 00, el año es de dos digitos y comienza desde 1900 y los dias son de dos digitos.*/
        Date birthday = new Date(84, 03, 28);
        System.out.println("birthday = " + birthday); //birthday = Wed May 28 00:00:00 COT 3884

        System.out.println("---------------------- Establecer tiempo específica -----------------------");
        //Establecer tiempo específica
        /*Establecer un timpo especifico mas preciso.*/
        Date newBirthday = new Date(84, 03, 28, 04,22, 33);
        System.out.println("newBirthday = " + newBirthday); //newBirthday = Sat Apr 28 04:22:33 COT 1984

        System.out.println("---------------------- getYear() -----------------------");
        //getYear()
        /*Obtiene el año relativo al 1900.*/
        System.out.println("Año: " + birthday.getYear()); //Año: 84

        System.out.println("---------------------- getMonth() -----------------------");
        //getMonth()
        /*Obtiene el mes recordando que se obtienen desde cero.*/
        System.out.println("Mes: " + birthday.getMonth()); //Mes: 3

        System.out.println("---------------------- getDate() -----------------------");
        //getDate()
        /*Obtiene el dia del mes.*/
        System.out.println("Dia del mes: " + birthday.getDate()); //Dia del mes: 28

        System.out.println("---------------------- getDay() -----------------------");
        //getDay()
        /*Obtiene el dia de la semana.*/
        System.out.println("Dia de la semana: " + birthday.getDay()); //Dia de la semana: 6

        System.out.println("---------------------- getHours() -----------------------");
        //getHours()
        /*Obtiene las horas.*/
        System.out.println("Hora: " + newBirthday.getHours()); //Hora: 4

        System.out.println("---------------------- getMinutes() -----------------------");
        //getMinutes()
        /*Obtiene los minutos.*/
        System.out.println("Minuto: " + newBirthday.getMinutes()); //Minuto: 22

        System.out.println("---------------------- getSeconds() -----------------------");
        //getSeconds()
        /*Obtiene los segundos.*/
        System.out.println("Segundos: " + newBirthday.getSeconds()); //Segundos: 33

        System.out.println("---------------------- getTime() -----------------------");
        //getTime()
        /*Obtiene los milisegundos.*/
        System.out.println("Milisegundos: " + newBirthday.getTime()); //Milisegundos: 451992153000

        System.out.println("---------------------- Comparar fechas -----------------------");
        //Comparar fechas
        /*Para comparar fechas tenemos tres maneras.*/
        //1. Comparadno fechas.
        if (birthday.getTime() < newBirthday.getTime()){
        }

        //2.Con before
        if (birthday.before(newBirthday)) { //si birthday es antes de newBirthday, entonces...
        }

        //3. Con after
        if (birthday.after(newBirthday)) { //si birthday es despues de newBirthday, entonces...
        }

        System.out.println("---------------------- SimpleDateFormat  -----------------------");
        //SimpleDateFormat
        /*Es una clase que me permite mostrar la fecha mas clara para los usuarios, darle un formato mas personalizado.
        * MMM: indica que se muestre el nombre del mes, abreviado con tres letras
        * dd: indica que se muestre el día del mes
        * YYYY: indica que se muestre el año usando cuatro dígitos*/

        Date currentNow = new Date(123, 12, 6, 11, 15, 0);
        System.out.println("currentNow = " + currentNow); // //currentNow = Sat Jan 06 11:15:00 COT 2024
        SimpleDateFormat formatter = new SimpleDateFormat("dd--MMM--yyyy"); // "dd--MM--yyyy" ==>  el mes como número.
        String message = formatter.format(currentNow);
        System.out.println("Date with new Format = " + message); //Date with new Format = 06--ene.--2024


        System.out.println("---------------------- Date.parse()  -----------------------");
        //Date.parse()
        /*Method para obtener una fecha de una cadena.*/
        Date current2 = new Date();
        current2.setTime(Date.parse("Jul 06 12:15:00 2019")); //Sat Jul 06 12:15:00 COT 2019
        System.out.println(current2);
        Date current3 = new Date("Jul 06 12:15:00 2019"); //Se puede crear en una sola linea ==> Sat Jul 06 12:15:00 COT 2019
        System.out.println(current3);
    }
}
