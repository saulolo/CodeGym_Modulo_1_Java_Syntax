package org.educatiom.modulo_I.lesson11_OpcionalArrays;

public class StringBuilderExamlpe {

    public static void main(String[] args) {

        //StringBuilder
        String name = "Saul Echeverri";
        StringBuilder builder = new StringBuilder(name);

        //Method Append
        /*Agregar a una cadena mutable*/
        builder.append(" Duque");

        System.out.println(builder);

        //Méthod toString
        /*Convierte un objeto StringBuilder em un objeto String.*/
        String result = builder.toString();
        System.out.println(result);

        //Méthod deleteChartAt
        /*Eliminar un caracter de una cadena mutable.*/
        builder.deleteCharAt(2);
        System.out.println(builder);

        //Méthod replace
        /*Reenplazar una cadena co otra cadena*/
        builder.replace(4, 13, "Lotero");
        System.out.println(builder);

        //Méthod reverse
        /*Invierte una caderna*/
        builder.reverse();
        System.out.println(builder);
    }
}
