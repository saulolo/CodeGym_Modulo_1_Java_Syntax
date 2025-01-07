package org.educatiom.modulo_I.lesson20_SingletonInterruptorYEnum;

import java.util.List;

public class DayMain {

    public static void main(String[] args) {

        //Instancia de tipo Day = a friday.
        EnumsExampleDay day = EnumsExampleDay.FRIDAY;

        System.out.println("day = " + day); //day = FRIDAY


        System.out.println("========================= values() ========================");
        //values()
        /*Devuelve una matriz con todos los valores del enum.*/
         EnumsExampleDay[] days = EnumsExampleDay.values();

        for (EnumsExampleDay day1 : days) {
            System.out.println("dayOfWeek = " + day1);
        }
        /*dayOfWeek = MONDAY
        dayOfWeek = TUESDAY
        dayOfWeek = WEDNESDAY
        dayOfWeek = THURSDAY
        dayOfWeek = FRIDAY
        dayOfWeek = SATURDAY
        dayOfWeek = SUNDAY*/

        //Imprimiendo un solo dia
        System.out.println("day wednesday = " + days[2]);

        System.out.println("========================= ordinal() ========================");
        //ordinal()
        /*Devuelve el número ordinal de la constante.*/
        System.out.println("Friday = " + EnumsExampleDay.FRIDAY.ordinal()); //4

        System.out.println("========================= toString() ========================");
        //toString()
        /*Convertir un objeto enum a una cadena.*/
        String convertirAString= EnumsExampleDay.FRIDAY.toString();
        System.out.println("convertirAString = " + convertirAString); //convertirAString = FRIDAY

        System.out.println("========================= valueOf() ========================");
        //valueOf()
        /*Convertir un de una cadena a un objeto tipo Enum.*/

        EnumsExampleDay convertedToEnum = EnumsExampleDay.valueOf(convertirAString);
        System.out.println("convertedToEnum = " + convertedToEnum); //convertedToEnum = FRIDAY

        //Nota: Se puede comparar enums com ==.

        EnumsExampleDay day1 = EnumsExampleDay.SATURDAY;
        int index = day1.ordinal();
        EnumsExampleDay newDay = EnumsExampleDay.values()[index +  2]; //Dos dias despues del Sábado.

        System.out.println("====================== Imprimiendo la lista del metodo del enum() =====================");
        //Imprimiendo la lista del metodo del enum()
        /*Debido a que los enums son calses, tambien puedo implementar methods personalizados.*/
        List<EnumsExampleDay> lista = EnumsExampleDay.aslist();
        for (EnumsExampleDay exampleDay : lista) {
            System.out.println("Dias = " + exampleDay);
        }
    }
}
