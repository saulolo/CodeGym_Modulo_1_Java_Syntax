package org.educatiom.modulo_I.lesson16_ListasYGenericos;

public class WrapperClassesExample {

    public static void main(String[] args) {

        //Tipos Wrapper
        /*Clases que envuelven valores primitivos. los primitivos empiezan con minuscula pero su correspondiente wrapper
        * empieza con mayusculas, ej:
        * int --> Integer
        * double --> Double*
        Para convertir un int a un Integer:*/
        //Integer name = new Integer(value);
        // y un Integer a un int
        // int name = variable.intValue();
        //Integer age = new Integer(18); --> ya esta en desuso
         //int x = age.intValue();

        System.out.println("========================= Autoboxing and Unboxing ========================");
        //Autoboxing and Unboxing
        /*Como el tipo Integer es inmutable es necesario escribir explicitamente un nuevo objeto Integer.*/
        Integer a = Integer.valueOf(18); //Wrap 18 en un onbjeto Integer
        int b = a.intValue();  //Obtenemos el valor del objeto Integer
        //Integer c = new Integer(b + 5);

        /*Como el codigo anterior es muy engorroso, se programo a java para que hiciera esto de manera automática
        * el proceso de pasar de manera automoatica un int a un Integer se llama autoboxing (poner el valor en una
        * caja automáticamente) y de Integer a int se llama unboxing. ej:*/
        Integer c = 10;
        int d = c;
        /*Esto permite que podemois hacer distinciones entre los tipos int e Integer sin ninguna complejidad*/
        //Nota: Si comparamos una variable tipo wrappper con otra wrapper, las comparaciones se hacen por referencia
        //y no por su valor.
        Integer numA = 18;
        Integer numB = 18;
        //System.out.println(numA == numB); //True
        System.out.println(numA.equals(numB)); //True
        /*Nota:Cuando trabajas con variables de tipo primitivo como int, puedes compararlas directamente usando ==.
        Sin embargo, cuando trabajas con clases envolventes (como Integer), es mejor usar el método equals() en lugar
        de == para comparar el contenido de los objeto. Usa == solo si realmente necesitas saber si las dos referencias
        apuntan al mismo objeto. Tambien aplica a los envoltorios de tipo String.*/

    }
}
