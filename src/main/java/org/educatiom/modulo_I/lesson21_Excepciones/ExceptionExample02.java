package org.educatiom.modulo_I.lesson21_Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample02 {

    public static void main(String[] args)  {
        File f = null;

        try {
            new File("archivo.txt");

            FileReader fr = new FileReader(f);

            BufferedReader bufferedReader = new BufferedReader(fr);

        //} catch (Exception e) { Podemos dejar esta excepcion pero es muy general
        } catch (FileNotFoundException e) {
            //System.err.println(e.getMessage().toUpperCase());

            System.out.println("El archivo: " + f.getName() + " no fue encontrado.");
        }
    }
}
