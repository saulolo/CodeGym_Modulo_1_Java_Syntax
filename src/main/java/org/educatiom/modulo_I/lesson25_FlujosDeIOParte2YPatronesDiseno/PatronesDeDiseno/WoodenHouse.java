package org.educatiom.modulo_I.lesson25_FlujosDeIOParte2YPatronesDiseno.PatronesDeDiseno;

//2. Implementación estandar de casa de madera.
public class WoodenHouse extends House{

    public WoodenHouse() {
        info = "Casa de Madera";
    }

    @Override
    public int getPrice() {
        return 18_000_000;
    }
}
