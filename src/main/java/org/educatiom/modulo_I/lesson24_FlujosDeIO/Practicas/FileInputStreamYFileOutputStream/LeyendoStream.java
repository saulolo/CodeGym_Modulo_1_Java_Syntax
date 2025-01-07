package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.FileInputStreamYFileOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class LeyendoStream {

    //Ejercicio: Crear un clon de un archivo en otra ubicación.

    public int[] accediendoArchivo() {

        int contador = 0;

        int[] bytesImagen  = new int[223029];

        String fileByte = "C:/Users/SaulHernandoEcheverr/Documents/Proyectos/CodeGym/Exercises Codegym/Exercises Codegym/src/main/java/org/educatiom/lesson24/FlujosDeIO/Practicas/FileInputStreamYFileOutputStream/Volante.jpeg";

        try(FileInputStream streamArchivo = new FileInputStream(fileByte)) {
            boolean finalArchivo = false;
            while (!finalArchivo) { //Mientras no se haya llegado al final del archivo/
                int imagenByteEntrada = streamArchivo.read(); //A cada vuelta de bucle el byte de la imagen se almacenara en dicha variable.
                if (imagenByteEntrada!= -1) {
                    bytesImagen[contador] = imagenByteEntrada; //a cada vuelta de bucle almacena la posicion del array en bytesImagen[contador]
                }
               else finalArchivo = true; //Cuando llegue al final (-1) del byte del archivo, salga del bucle.

                //System.out.println(imagenByteEntrada); //Mostrar en consola la sucesión de byte de la imagen.
                System.out.println(bytesImagen[contador]); //Muestra lo que almacena cada posición del array.
                contador++;
            }
        } catch (IOException e) {
            System.err.println("No se encontro el archivo: " + e.getMessage());;
        }
        //System.out.println("contador => " + contador);
        return bytesImagen;
    }
}
