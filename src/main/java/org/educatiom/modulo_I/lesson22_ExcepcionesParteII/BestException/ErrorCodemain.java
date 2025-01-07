package org.educatiom.modulo_I.lesson22_ExcepcionesParteII.BestException;

public class ErrorCodemain {

    public static void main(String[] args) throws Exception{

        getException();

        MyCoolUncheckedException exception = getException(3);
        System.out.println("getException().getErrorCode() = " + exception.getErrorCode());
        throw exception;
    }

    public static void getException() {
        throw new MyCoolUncheckedException("My genial excepeción!");
    }

    public static MyCoolUncheckedException getException(int errorCode) {
        return switch (errorCode) {
            case 1:
                yield new MyCoolUncheckedException("En mi genial excepción se produjo un error: " + ErrorCodes.FIRST_ERROR.getCode(), new Throwable(), ErrorCodes.FIRST_ERROR);
            case 2:
                yield new MyCoolUncheckedException("En mi genial excepción se produjo un error: " + ErrorCodes.SECOND_ERROR.getCode(), new Throwable(), ErrorCodes.SECOND_ERROR);
            default:
                yield new MyCoolUncheckedException("En mi genial excepción se produjo un error: " + ErrorCodes.THIRD_ERROR.getCode(), new Throwable(), ErrorCodes.THIRD_ERROR);
        };
    }
}
