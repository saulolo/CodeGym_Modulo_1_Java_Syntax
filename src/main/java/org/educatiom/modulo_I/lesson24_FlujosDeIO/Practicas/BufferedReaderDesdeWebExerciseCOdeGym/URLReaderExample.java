package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.BufferedReaderDesdeWebExerciseCOdeGym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReaderExample {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("---- Leyendo datos directamente desde la web ----");
        /*Usando la URL requerida.*/

        try {
            URL url = new URL("https://www.oracle.com/index.html");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String lineaEntrada;
            while ((lineaEntrada = reader.readLine()) != null) {
                System.out.println(lineaEntrada);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("No se encuentra URL: " + e.getMessage());
        }
    }
}
