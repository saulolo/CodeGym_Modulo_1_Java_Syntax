package org.educatiom.modulo_I.lesson22_ExcepcionesParteII.CustomException;

import java.util.Arrays;
import java.util.List;

public class PhoneNumberRegisterService {

    //Aqui pongo Instancio la BD en este caso una lista de telefonos.
    List<String> numerosTelefonicos = Arrays.asList("3213455433", "345667467", "3145678899", "3115667654");

    public void validarNumeroTelefonico(String numeroTelefonico) throws PhoneNumberAlreadyExistsException, PhoneNumberContainLettersException {
        if (numerosTelefonicos.contains(numeroTelefonico)) {
            throw new PhoneNumberAlreadyExistsException("El número telefonico ingresado ya esta en uso por otro cliente!.");
        }
        if (numerosTelefonicos.isEmpty() | !numeroTelefonico.matches("\\d+")) {
            throw new PhoneNumberContainLettersException("El número telefonico no debe de contener letras.");
        }
        System.out.println("El núemro telefónico " + numeroTelefonico + " es válido.");
    }
}
