package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.InputStreamReaderExerciceCodeGym;

import java.io.IOException;
import java.io.InputStreamReader;

public class FileAccess {

    public static void main(String[] args) throws IOException {


        System.out.println("----------------- Convirtiendo Bytes a caracteres unicode --------------------");
        /*Converitir de ha byte en caracter unicoce.*/
        InputStreamReader reader = new InputStreamReader(System.in);
        //Logica para leer datos desde consola ya que el System.in leee bytes directamente no lee caracteres.
        while (true) {
            int x = reader.read();
            System.out.println(x);
        }
    }
}
