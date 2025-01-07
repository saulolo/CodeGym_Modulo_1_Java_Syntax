package org.educatiom.modulo_I.lesson25_FlujosDeIOParte2YPatronesDiseno.PatronesDeDiseno;

//2. Implementación estandar de casa de ladrillo.
public class BrickHouse extends House{


    public BrickHouse() {
        info = "Casa de ladrillo";
    }

    @Override
    public int getPrice() {
        return 20_000_000;
    }
}
