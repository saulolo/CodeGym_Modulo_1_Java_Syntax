package org.educatiom.modulo_I.lesson14_Static;

public class Solution {

    public static void main(String[] args) {

        //Method static
        /*Para llamar un metodo estatico (no ordinario) en una clase como el main, debe de llamar el nombre de
        * la clase seguid de un punto y el nombre del method tal cual como tambien se haven las variables estaticas,
        * esto es posible porque el metodo main es estatico y por ende puede llamar otros estaticos.*/
        System.out.println(StaticExample.getValue());

        //Nota: Existen variables, metodos y clases estáticas.
    }

    //Clase anidada estatica .
    static class newClass{

    }
    
}
