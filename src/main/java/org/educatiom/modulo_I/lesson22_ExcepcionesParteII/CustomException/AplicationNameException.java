package org.educatiom.modulo_I.lesson22_ExcepcionesParteII.CustomException;

//Ejemplo 3.
/*Podemosm hacer una excepcion general en el ultimo catch para caputara aquellas excepciones incomprencibles.*/


public class AplicationNameException extends Exception {

    public AplicationNameException(String message) {
        super(message);
    }
}
