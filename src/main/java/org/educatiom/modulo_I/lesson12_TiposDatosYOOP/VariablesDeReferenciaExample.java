package org.educatiom.modulo_I.lesson12_TiposDatosYOOP;

public class VariablesDeReferenciaExample {

    public static void main(String[] args) {

        //Variables de Referencia
        /*La variables primitivas almacenan valores directamente en la variable, en cambio las variables de referencia
        * almacenan referencias a objetos, o sea que la la variable de referencia almacena es la dirección a dicho objeto
        * que se encuentra ya almacenado en algun lugar de la memoria ejemplo las variables de tipo String y de array.*/

        String hello = "hello";  //Esto esta
        String s = hello;        // pemitido.

        String world = "world"; //Esto
        //world++;              //no esta permitido.

        //String str = 0*23423; //Esto no esta permitido.

        //Referencia Null
        /*null es una palabra reservada en java que significa una referencia vacia (ausencia de referencia).*/
        String name;  //Tiene un valor predeterminado de null o sea que no se han inicializado.
        int age;      //Tiene un valor predeterminado de 0 o sea que no se han inicializado.
        
        String lastname = "Echeverri";
        lastname = null;  //Asi borro el valor de la variable lastname
        System.out.println("lastname = " + lastname);
    }
}
