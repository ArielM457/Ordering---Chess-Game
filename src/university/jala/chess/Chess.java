package university.jala.chess;

import university.jala.chess.modelos.Moderador;
import university.jala.chess.modelos.asignaciones.AsignacionArgumentos;

/**
 * Clase main, ejecución del programa
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class Chess {
    public static void main(String[] args) {
        String[] variables = AsignacionArgumentos.asignacion(args);
        Moderador moderador = new Moderador();
        moderador.moderadorArgumentos(variables);
        if (variables.length < 4) {
            System.out.println("Argumentos Necesarios: java jala.Main <algoritmo> <tipo> <color> <in> <piezas> <tiempo>");
        }
    }
}