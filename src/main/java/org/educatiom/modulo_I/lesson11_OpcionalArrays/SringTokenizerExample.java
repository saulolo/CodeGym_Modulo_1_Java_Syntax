package org.educatiom.modulo_I.lesson11_OpcionalArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SringTokenizerExample {

    public static void main(String[] args) {

        //Method Split
        /*Usa expresiones regulares*/
        String str = "Feliz en mi camino como programador";
        String[] strings = str.split("mi");
        System.out.println(Arrays.toString(strings));

        //Clase StringTokenizer
        String str2 = "Feliz en mi camino como programador";
        StringTokenizer tokenizer = new StringTokenizer(str2, "mi");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }


        //Method String.format() y Clase StringFormatter
        String name = "Amigo";
        int age = 12;
        String friend = "Diego";
        int weight = 83;

        System.out.println("User = {name: " + name + ", age:" + age + ", friend:" + friend + ", weight:" + weight + " Kg.}");
        //No es muy legible esta impresión.

        //con String.format
        System.out.println(String.format("Fullname=%s, Friend=%s", name, friend));
        System.out.println(String.format("Age=%d, Weight=%d", age, weight));

        /* ESPECIFICADORES DE FORMATO
        especificador	Significado
            %s              String
            %d              entero: byte, short, int,long
            %f              número real: float,double
            %b              boolean
            %c              char
            %t              Date
            %%              %personaje
        */

        //Especificadores con orden de los datos:
        String s = String.format("a=%3$d, b=%2$d, c=%d", 11, 12, 13);
        System.out.println(s);

        //Usando una clase
        class User{
            String name = "Amigo";
            int age = 12;
            List<String> friends = Collections.singletonList("Diego");
            int extraInformation = 200;


            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            public List<String> getFriends() {
                return friends;
            }

            public int getExtraInformation() {
                return extraInformation;
            }
        }

        User user = new User();
        System.out.println("User = {name: " + user.getName() + ", age: " + user.getAge() + ", friend: " + user.getFriends() + ", Extra information: " + user.getExtraInformation());
        //Tampoco es muy legible de leer.


        //StringPool
        /* Optimiza el almacenamiento de cadenas almacenandolas en la misma referencia cuando estas son identicas.*/
        String a1 = "Hello";
        String b1 = "Hello";
        String c1 = "Bye";

        String[] pool = {"Hello", "Bye"};
        a1 = pool[0];
        b1 = pool[0];
        c1 = pool[1];


        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println(a == b);  //falso

        String t1 = a.intern();
        String t2 = b.intern();

        System.out.println(a == b); //false
        System.out.println(t1 == t2); //true
        /*Si se agregan dos cadenas idénticas usando StringPoolel intern()método, el método devuelve la misma referencia
        . Esto se puede usar para comparar cadenas por referencia*/








    }
}
