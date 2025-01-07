package org.educatiom.modulo_I.lesson25_FlujosDeIOParte2YPatronesDiseno.PatronesDeDiseno;

//1. Creao una clase abstracta House.
public abstract class House {

    String info;

    //Devueelve el nombre y las caracteristicas de la casa.
    public String getInfo() {
       return info;
    }

    //Devuelve el precio de la configuración actual de la casa.
    public abstract int getPrice();
}

/*Ambas clases heredan de la clase House y reemplazan su method de precio, estableciendo un precio personalizado para
una casa estándar. Establecemos el nombre en el constructor.*/

