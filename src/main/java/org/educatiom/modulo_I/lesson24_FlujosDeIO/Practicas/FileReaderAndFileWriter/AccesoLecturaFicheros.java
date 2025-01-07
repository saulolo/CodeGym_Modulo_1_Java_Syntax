package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.FileReaderAndFileWriter;

public class AccesoLecturaFicheros {

    public static void main(String[] args) {

        /**
         * Ejercicios del Curso Tutorizado de Pildoras Informtaicas.
         */

        //Leyendo archivo.
        LeerFichero miFichero = new LeerFichero();
        miFichero.readData();

        System.out.println();

        //Escribiendo en el nuevo archivo.
        EscribirFichero escribirMiArchivo = new EscribirFichero();
        escribirMiArchivo.writing();
    }
}
