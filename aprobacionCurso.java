package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Determinar si un estudiante ganó o perdió un curso, si pierden el curso todos los
estudiantes cuya nota es menor a 70.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej3w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 

        int nota;
        String resultado;

        escribir.println("Digite la nota del estudiante");
        nota = Integer.parseInt(leer.readLine());

        if (nota>= 70){
            resultado = "El estudiante ganó el curso";
        } else {
            resultado = "El estudiante perdió el curso";
        }

        escribir.println(resultado);
    }
}