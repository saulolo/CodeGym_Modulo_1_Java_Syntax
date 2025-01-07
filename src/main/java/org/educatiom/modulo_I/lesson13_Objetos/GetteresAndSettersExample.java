package org.educatiom.modulo_I.lesson13_Objetos;

public class GetteresAndSettersExample {

    //Getters y Setters
    /*Cuando se declaran atributos de manera privada para que solo los metodos de su misma clase puedan acceder a ellos
    * pero Si se desea que otras clases puedan obtener o cambiar los datos dentro de los objetos de su clase, se deben de
    * agregar los metodos de obtención(getter) y configutación (setter)*/
    private String name;

    //Inicializacón del campo a travez del constructor.
    public GetteresAndSettersExample(String name) {
        this.name = name;
    }

    //Méthod Getter
    public String getName() {
        return name;
    }


    //Méthod Setter
    public void setName(String name) {
        this.name = name;
    }

}
