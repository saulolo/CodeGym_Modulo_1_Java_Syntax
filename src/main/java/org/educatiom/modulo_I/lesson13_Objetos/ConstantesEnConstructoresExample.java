package org.educatiom.modulo_I.lesson13_Objetos;

public class ConstantesEnConstructoresExample {

    public final int maxAge = 20;
    public final int maxWeight;

    //Las constantes tambien se pueden inicializar en el constructor.
    public ConstantesEnConstructoresExample(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
