package org.educatiom.modulo_I.lesson20_SingletonInterruptorYEnum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum EnumsExampleDay {
    //Enum
    /*Es un tipo de dato que consta de un conjunto finito de valores compusta de valores. Por convención siempre van
    * en mayúsculas.
    * Nota: La palabra reservada extends no funciona en los enums porque no se puede extender clases pero si se pueden
    * implementar interfaces.*/
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    //Agregando nuestros propios metodos en la clase enum
    public static List<EnumsExampleDay> aslist() {
        ArrayList<EnumsExampleDay> days = new ArrayList<>();
        Collections.addAll(days, values());
        return days;
    }
}


