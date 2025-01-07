package org.educatiom.modulo_I.lesson17_Colecciones.Map.TreeMapImplComparableExample;

import java.util.TreeMap;

public class PersonMain {

    public static void main(String[] args) {

        //Reescribir el method comparableTo() para que ordene los valores por nombre en orden alfabético inverso.
        TreeMap map = new TreeMap<Person, String>();
        map.put(new Person("Saul", "Echeverri"), "aa");
        map.put(new Person("Alejandra", "Arenas"), "aa");
        map.put(new Person("Felipe", "Vasquez"), "aa");
        map.put(new Person("Eliany", "Guanipa"), "aa");


    }
}
