package org.educatiom.modulo_I.lesson22_ExcepcionesParteII.BestException;

//Clase Enum para representar los códigos de error para manejo de excepciones
public enum ErrorCodes {
    FIRST_ERROR(1),
    SECOND_ERROR(2),
    THIRD_ERROR(3);

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
