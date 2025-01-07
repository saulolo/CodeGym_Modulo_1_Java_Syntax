package org.educatiom.modulo_I.lesson13_Objetos;

public class ComparaciónObjetosExample {

    public String name;

    public static void main(String[] args) {

        //Comparando Objetos
        /*Comparando Refereencias: Si dos variables apuntan al mismo objeto en la memoria, entonces las referencias
        * almacenadas en estas variables son iguales. Se compara con ==*/
        Integer a = 5;
        Integer b = a;
        System.out.println(a == b); //true
        System.out.println(a.equals(b));  //true

        /*Comparando por Valor: Puede existr que dos variables referencien a dos objetos que son distintos que pueden ser
        * identicos, por ejemplo dos objetos de cadenas diferentes con el mismo texto, en este caso se utiliza el method
        * equals(). */
        String c = new String("Hello");
        String d = new String("Hello");
        Integer e = 5;
        String f = "Hello";
        System.out.println(c == d); //false
        System.out.println(c.equals(d)); //true
        System.out.println(e.equals(f)); //false
        System.out.println(f.equals(e)); //false;
        //Object g = new Integer(6);
        //Object h = new Integer(6);
        //System.out.println(g.equals(h)); //true

        //Clase Object
        /*Todas las clases de java incluso las que yo creo propiamente, heredan de la clase Object, la cual es conocida como
         * la clase cósmica, por endte todos los metodos que conteie como por ejemplo equals(), hashCode(), etc.. los heredan
         * las clases hijas.*/


        System.out.println("====================EQUALS=====================");
        //Method equals()
        /*Solo compara las referencias de los objetos.*/
        ComparaciónObjetosExample example1 = new ComparaciónObjetosExample();
        example1.name = "Saul";

        ComparaciónObjetosExample example2 = new ComparaciónObjetosExample();
        example2.name = "Saul";

        System.out.println(example1 == example2);  //false (son objetos distintos.)
        System.out.println(example1.equals(example2)); //false (Son objetos distintos


        //Method hashCode()
        /*Es un method de comparación rapida pero imprecisa, la cual consta de comparar los respectivos hasCode de los
        * objetos creados.
        * Nota: Si se implementa un metodo de compartación (equals()) personalizado (lo cual no es aconcejable) se debe
        * tambien implementar el method  hasCode() para la totalidad de la comparación.*/


    }

}
