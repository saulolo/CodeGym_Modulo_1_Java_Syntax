package org.educatiom.modulo_I.lesson16_ListasYGenericos;

public class ClaseIntegerExample {

    public static void main(String[] args) {

        System.out.println("================== MAX_VALUE y MIN_VALUE ==========================");
        //MAX_VALUE y MIN_VALUE
        /*Valores maximos y mininos*/
        int min = Integer.MIN_VALUE; //-2147483648
        int max = Integer.MAX_VALUE; // 2147483647
        System.out.println("man = " + max + " y min = " + min);

        System.out.println("========================= toHexString ===============================");
        //Integer.toHexString()
        /*Devuelve una cadena que es la representación hesadecimal de un número.*/
        String hexadecimal = Integer.toHexString(13);
        System.out.println("hexadecimal = " + hexadecimal);  //d

        System.out.println("========================= toBinaryString ===============================");
        //Integer.toBinaryString()
        /*Devuelve una cadena que es la representación binaria de un número.*/
        String toBinaryString = Integer.toBinaryString(13);
        System.out.println("toBinaryString = " + toBinaryString); // 1101

        System.out.println("========================= toOctalString ===============================");
        //Integer.toOctalString()
        /*Devuelve una cadena que es la representación hesadecimal de un número.*/
        String OctalString = Integer.toOctalString(13);
        System.out.println("OctalString = " + OctalString); //15

        System.out.println("========================= valueOf ===============================");
        //Integer.valueOf()
        Integer integer = Integer.valueOf(13);
        System.out.println("integer = " + integer); //13

        System.out.println("========================= parseInt ===============================");
        //Integer.parseInt()
        int number = Integer.parseInt("13"); //13
        System.out.println("number = " + number);
    }
}
