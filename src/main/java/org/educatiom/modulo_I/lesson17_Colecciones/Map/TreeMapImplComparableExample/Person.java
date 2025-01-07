package org.educatiom.modulo_I.lesson17_Colecciones.Map.TreeMapImplComparableExample;

import java.util.TreeMap;

public class Person implements Comparable<Person> {

    //TreeMap
    /*Es una colección tipo diccionario que almacena elementos pares calve-valor ordenandolos por clave.
     * Muy utilizado para organizar elementos de una colección de forma ascendente.
     * Nota: SI se desea colocar el tipo de oreden personalizado en un TreeMap entonces su interfaz se debe implementar
     * de la interza Comparable*/

    /*Nota: TreeMap solo puede almacenar objetos cuya clase implemente la interfaz Comparable y anule el method
    * compareTo*/

    //Ejercicio 1. Ordenar la coleccón por el apellido.
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    //Reescribir el method comparableTo() para que ordene los valores por nombre en orden alfabético inverso.
    @Override
    public int compareTo(Person person) {
        TreeMap map = new TreeMap<Person, String>();
        return person.getFirstName().compareTo(firstName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
