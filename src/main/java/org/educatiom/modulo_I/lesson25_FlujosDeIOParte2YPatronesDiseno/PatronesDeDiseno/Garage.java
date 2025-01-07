package org.educatiom.modulo_I.lesson25_FlujosDeIOParte2YPatronesDiseno.PatronesDeDiseno;

/*4. A continuación, creamos implementaciones de decoradores. Crearemos varias clases que nos permitirán agregar
características adicionales a la casa:*/
public class Garage extends HouseDecorator{

    //Un decorador que agrega un garaje a la casa.
    House house;

    public Garage(House house) {
        this.house = house;
    }

    @Override
    public int getPrice() {
        return house.getPrice() + 5_000_000;
    }

    @Override
    public String getInfo() {
        return house.getInfo() + " + garage";
    }

}
