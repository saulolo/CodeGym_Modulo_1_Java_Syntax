package org.educatiom.modulo_I.lesson22_ExcepcionesParteII.CustomException;

public class CreditCarMain {

    public static void main(String[] args) throws AplicationNameException {

        //Instancio la clase PhoneNumberRegisterService
        PhoneNumberRegisterService service = new PhoneNumberRegisterService();

        try {
            service.validarNumeroTelefonico("31456788994");
        } catch (PhoneNumberAlreadyExistsException e) {
            //Aquí podemos escribir en registros o mostrar la pila de llamadas.
            e.printStackTrace(); //Este method es recomendable solo usar en ambientes de desarrollo en su lugar usar framework como Log4j ó SLF4J.
        } catch (PhoneNumberContainLettersException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new AplicationNameException("Error"); //Traga excepeciones (No se debe de hacer en codigo real, no es buena practica)).
        }

        /* catch (AplicationNameException e) {
            e.printStackTrace();
            //System.err.println("Error desconocidido");
        }*/
    }
}

