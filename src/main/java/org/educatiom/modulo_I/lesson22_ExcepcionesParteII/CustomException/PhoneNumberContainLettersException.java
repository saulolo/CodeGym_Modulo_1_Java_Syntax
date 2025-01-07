package org.educatiom.modulo_I.lesson22_ExcepcionesParteII.CustomException;

//Ejemplo 2.
/*Validemos que el número telefónico no contenga letras.*/

//Creamos la excepción.
public class PhoneNumberContainLettersException extends Exception {

    public PhoneNumberContainLettersException(String message) {
        super(message);
    }
}
