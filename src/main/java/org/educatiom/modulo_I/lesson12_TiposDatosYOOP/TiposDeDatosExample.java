package org.educatiom.modulo_I.lesson12_TiposDatosYOOP;

public class TiposDeDatosExample {

    public static void main(String[] args) {

        //Encasillamiento
        /*Es cuando se asingan las variables de distintos tipos entre si. (Muñecas rusas)*/
    /*      Tipo               Tamaño
        ↓   byte               1 byte
        ↓   short              2 bytes
        ↓   int                4 bytes
        ↓   long               8 bytes
        ↓   float              4 bytes
        ↓   double             8 bytes
    */

        //Conversion de Tipo de Ampliación
        /*Conversion de un tipo de dato mas pequeño a uno mas grande.*/
        byte a = 5;
        short b = a;
        int c = a + b;
        long d = c * c;

        float e = 2.98F;
        double f = e;

        long g = 123456789;
        float h = g;  //b == 1.23456794E9
        double i = g; //i == 1.23456789E9

        //Conversion de Tipo de Reducción
        /*Transformación de un tipo de variable grande a una mas pequeña pero se pueden perder valores.
        * Debemos de decire al compilador que no estamos cometiendo un error con esta transformación y que somos
        * concientes de ello y para hacerlo utilizamos el operador typecast (type).*/
        long j = 1_000_000;  //a == 1_000_000
        int k = (int) j;     //k == 1_000_000
        short l = (short) k; //l == 16_960
        byte m = (byte) l;   //m == 64

        //Tipo de Expresión
        /*Cuando hay variables invlolucradas en una operación y estas son de distinto tipo, java las convierte a las mas
        * grandes para poder operarlas.
        * Si la operacion esta involucrada con un tipo int y un tipo flotante (float o double), java convertira el tipo
        * int a flotante.*/
        int n = 1;
        long o = 2;
        long q = n + o;  //n se ampliara a long y luego se producira la adición.

        //Nota cualquier operación aritmetica que involucre algun tipo de dato de entero, su resultado siempre sera entero.
        short r = 12;
        short s = 10;
        int t = r + s; //Su resultado de debe de almacenar en una variable tipo int para que pueda compilar o se debe de castear.

        //Nota: los casteos siempre tiene prioridad antes de cualquier operación aritmetica que lo relacione.
        byte w = 1;
        byte x = 2;
        byte y = (byte) (w * x);




    }
}
