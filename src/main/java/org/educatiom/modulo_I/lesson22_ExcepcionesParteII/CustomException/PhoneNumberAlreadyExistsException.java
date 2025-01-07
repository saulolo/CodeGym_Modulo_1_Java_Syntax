package org.educatiom.modulo_I.lesson22_ExcepcionesParteII.CustomException;

//Excepciones Personalizadas
/*Hay situaciones en las que necesitamos crear nuestras propias excepeciones. */

//Ejemplo 1.
/*Supongamos que alguien llena un formulario y pone un numero telefónico que ya esta en uso.*/

//Creamos la excepción.
public class PhoneNumberAlreadyExistsException extends Exception {

    //Creamos un constructor
    public PhoneNumberAlreadyExistsException(String message) {
        super(message);
    }
}
