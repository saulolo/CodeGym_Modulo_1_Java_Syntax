package org.educatiom.modulo_I.lesson16_ListasYGenericos;

public class ClaseDoubleExample {

    public static void main(String[] args) {

        //Clase Integer
        System.out.println("========================= parseInt ===============================");
        //Integer.parseInt()
        int number = Integer.parseInt("13"); //13
        System.out.println("number = " + number);


        //Clase Double
        /*Tiene methods ineterasantes similiares al Integer.*/

        System.out.println("===================== NEGATIVE_INFINITIVE =========================");
        //NEGATIVE_INFINITIVE
        /*Infinito Negativo*/
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println("negativeInfinity = " + negativeInfinity); //-Infinity

        System.out.println("===================== POSITIVE_INFINITIVE =========================");
        //POSITIVE_INFINITIVE
        /*Infinito Positivo*/
        double positiveInfinity = Double.POSITIVE_INFINITY;
        System.out.println("positiveInfinity = " + positiveInfinity); //Infinity

        System.out.println("===================== MIN_EXPONENT =========================");
        //MIN_EXPONENT
        /*Exponente Minimmo*/
        double minExponent = Double.MIN_EXPONENT;
        System.out.println("minExponent = " + minExponent); //-1022.0

        System.out.println("===================== MAX_EXPONENT =========================");
        //MAX_EXPONENT
        /*Exponente Máximo*/
        double maxExponent = Double.MAX_EXPONENT;
        System.out.println("maxExponent = " + maxExponent); //1023.0

        System.out.println("===================== MIN_VALUE =========================");
        //MIN_VALUE
        /*Valor minimo posible*/
        double minValue = Double.MIN_VALUE;
        System.out.println("minValue = " + minValue);  //4.9E-324

        System.out.println("===================== MAX_VALUE =========================");
        //MAX_VALUE
        /*Valor máximo posible*/
        double maxValue = Double.MAX_VALUE;
        System.out.println("maxValue = " + maxValue); //1.7976931348623157E308

        System.out.println("===================== toHexString() =========================");
        //toHexString()
        /*Devuelve una cadena que es la representación hexadecimal del número.*/
        String hexString = Double.toHexString(2.87);
        System.out.println("hexString = " + hexString);  // 0x1.6f5c28f5c28f6p1

        System.out.println("===================== isInfinite() =========================");
        //isInfinite()
        /*Comprueba si el número pasado es infinito.*/
        boolean finite = Double.isInfinite(5.6787);
        System.out.println("finite = " + finite); //False

        System.out.println("===================== isNaN() =========================");
        //isNaN()
        /*Comprueba si el número pasado es Nan.*/
        boolean naN = Double.isNaN(3.67);
        System.out.println("naN = " + naN);  //False

        System.out.println("===================== valueOf() =========================");
        //valueOf()
        /*Envuelve un double en un objeto Double.*/
        Double aDouble = Double.valueOf(4.97);
        System.out.println("aDouble = " + aDouble);  //4.97

        System.out.println("===================== parseDouble() =========================");
        //parseDouble()
        /*Convierte una cadena en un número.*/
        double parseDouble = Double.parseDouble("45.7");
        System.out.println("parseDouble = " + parseDouble);  // 45.7


        //Clase Character
        /*Tiene gran cantidad de methods estáticos de verificación para ver si los caracteres pertenecen a varias
        * categorias.*/

        System.out.println("===================== isAlphabetic() =========================");
        //isAlphabetic()
        /*comprueba si un caracter es alfabético.*/
        boolean alphabetic = Character.isAlphabetic(13);
        System.out.println("alphabetic = " + alphabetic);  //false

        System.out.println("===================== isLetter() =========================");
        //isLetter()
        /*Comprueba si el caracter es una letra.*/
        boolean letter = Character.isLetter('s');
        System.out.println("letter = " + letter);  //True

        System.out.println("===================== isDigit() =========================");
        //isDigit()
        /*Comprueba si el caracter es una digito.*/
        boolean digit = Character.isDigit('5');
        System.out.println("digit = " + digit); //True

        System.out.println("===================== isSpaceChar() =========================");
        //isSpaceChar()
        /*Comprueba si el caracter es un espacio, un salto de línea o un salto de pagina (cod:12, 13, 14).*/
        boolean spaceChar = Character.isSpaceChar(' ');
        System.out.println("spaceChar = " + spaceChar);  //True

        System.out.println("===================== isWhitespace() =========================");
        //isWhitespace()
        /*Comprueba si el caracter es un espacio en blanco: un espacio, una pestaña,etc.*/
        boolean whitespace = Character.isWhitespace(' ');
        System.out.println("whitespace = " + whitespace); //True

        System.out.println("===================== isLowerCase() =========================");
        //isLowerCase()
        /*Comprueba si el caracter esta en minísculas.*/
        boolean lowerCase = Character.isLowerCase('S');
        System.out.println("lowerCase = " + lowerCase); //False

        System.out.println("===================== isUpperCase() =========================");
        //isUpperCase()
        /*Comprueba si el caracter esta en mayúsculas.*/
        boolean upperCase = Character.isUpperCase('S');
        System.out.println("upperCase = " + upperCase);  //True

        System.out.println("===================== toLowerCase() =========================");
        //toLowerCase()
        /*Convierte el caracter a minúsuculas.*/
        char toLowerCase = Character.toLowerCase('A');
        System.out.println("toLowerCase = " + toLowerCase);  //a

        System.out.println("===================== toLowerCase() =========================");
        //toLowerCase()
        /*Convierte el caracter a mayúsculas.*/
        char toUpperCase = Character.toUpperCase('a');
        System.out.println("toUpperCase = " + toUpperCase);  //A


        //Clase Boolean
        /*Esta Clase es practicamente la misma que la de tipo booelan.*/
        System.out.println("===================== Boolean.TRUE =========================");
        //Boolean.TRUE
        /*Constante de tipo true.*/
        boolean aTrue = Boolean.TRUE;
        System.out.println("aTrue = " + aTrue);  //True

        System.out.println("===================== Boolean.FALSE =========================");
        //Boolean.FALSE
        /*Constante de tipo false.*/
        boolean aFalse = Boolean.FALSE;
        System.out.println("aFalse = " + aFalse); //False

        /*Nota: Si comparamos un int con un Integer, el Integuer se convierte en un int. pero si comparamos dos
        * Integeur entre si, ellos no se convirten en int.*/
    }
}
