package org.educatiom.modulo_I.lesson24_FlujosDeIO.Practicas.BufferedReaderConReadLineExerciseCodeGym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostrandoEnConsola {

    public static void main(String[] args) throws IOException {
        System.out.println("---- Convirtiendo lineas completas datos desde teclado a caracteres completos ----");
        System.out.println("--------------------------- readLine() ----------------------------------");
        /*Esto, por supuesto, es muy conveniente cuando se trabaja con textos grandes,*/
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String s = reader2.readLine();
        System.out.println("Ingresando el el siguiente texto: ");
        System.out.println(s);
        reader2.close();
    }
}
