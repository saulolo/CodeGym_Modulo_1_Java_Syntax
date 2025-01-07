package org.educatiom.modulo_I.lesson25_FlujosDeIOParte2YPatronesDiseno.PatronesDeDiseno;

/*5. Ahora creemos casas*/
public class HouseMain {

    public static void main(String[] args) {

        System.out.println("--------------- Casa de ladrillo -----------------");
        //Creamos una casa de ladrillo.
        House brickHouse = new BrickHouse();

        System.out.println(brickHouse.getInfo());
        System.out.println(brickHouse.getPrice());

        //A continuación, establecemos nuestra variable casa igual a un nuevo decorador, pasando nuestra casa:
        brickHouse = new SecondFloor(brickHouse); //Vairable house ahora es una casa con segundo piso.

        System.out.println(brickHouse.getInfo());
        System.out.println(brickHouse.getPrice());


        //Casa de ladrillo con segundo piso y garage
        brickHouse = new SecondFloor(brickHouse);
        brickHouse = new Garage(brickHouse);

        System.out.println(brickHouse.getInfo());
        System.out.println(brickHouse.getPrice());


        System.out.println("--------------- Casa de Madera -----------------");
        //Creamos una casa de madera
        WoodenHouse woodenHouse = new WoodenHouse();

        System.out.println(woodenHouse.getInfo());
        System.out.println(woodenHouse.getPrice());


        //Casa de madera con garage
        House woodenHouseWithGarage = new Garage(woodenHouse);

        System.out.println(woodenHouseWithGarage.getInfo());
        System.out.println(woodenHouseWithGarage.getPrice());

    }
}
