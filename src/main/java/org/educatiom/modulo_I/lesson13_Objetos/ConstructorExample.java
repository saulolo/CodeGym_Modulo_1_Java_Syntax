package org.educatiom.modulo_I.lesson13_Objetos;

public class ConstructorExample {

    private int x;
    private int y;

    //Constructor
    /*El nombre del constructor es el mismo de la clase.
    * Un constructor no tiene tipo de retorno.*/
    public ConstructorExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        //Instancia del Objeto creado.
        ConstructorExample example = new ConstructorExample(43, 5);
    }
}
