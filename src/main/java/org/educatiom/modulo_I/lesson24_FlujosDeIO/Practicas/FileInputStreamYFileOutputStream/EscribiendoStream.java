package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.FileInputStreamYFileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscribiendoStream {

    public void copiandoArchivo(int[] arrayImagen) { //Recibe el array de los bytes de la imagen leida

        String fileByteCopy = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson24/FlujosDeIO/Practicas/FileInputStreamYFileOutputStream/CopiaArchivo/VolanteCopy.jpeg";

        try(FileOutputStream outputArchivo = new FileOutputStream(fileByteCopy)) {

            for (int i = 0; i < arrayImagen.length; i++) {
                outputArchivo.write(arrayImagen[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
