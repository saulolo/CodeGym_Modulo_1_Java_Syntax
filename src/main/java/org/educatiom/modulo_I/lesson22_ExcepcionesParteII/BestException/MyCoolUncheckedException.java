package org.educatiom.modulo_I.lesson22_ExcepcionesParteII.BestException;

//Creamos varios constructores de nuestra excepción para darle mas capacidad.
public class MyCoolUncheckedException extends RuntimeException {

    private Integer errorCode;


    public MyCoolUncheckedException(String message) {
        super(message);
    }

    public MyCoolUncheckedException(Throwable cause) {
        super(cause);
    }

    public MyCoolUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCoolUncheckedException(String message, Throwable cause, ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode.getCode();
    }


    public Integer getErrorCode() {
        return errorCode;
    }
}
