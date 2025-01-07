package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.FileInputStreamYFileOutputStream;

public class LeyendoEscribiendoArchivoByteMain {

    public static void main(String[] args) {

        /**
         * Ejercicios del Curso Tutorizado de Pildoras Informtaicas.
         */

        //Leemos la imagen almacenada en bytes.
        LeyendoStream miImagen = new LeyendoStream();
        miImagen.accediendoArchivo();

        //Copiamos dicha imagen en otra carpeta
        EscribiendoStream miCopiaImagen = new EscribiendoStream();
        miCopiaImagen.copiandoArchivo(miImagen.accediendoArchivo());
    }
}
