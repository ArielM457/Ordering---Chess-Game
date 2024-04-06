package university.jala.chess.modelos;

import university.jala.chess.modelos.generador.GenerarPiezas;

public class Moderador {
    public void moderadorArgumentos (String [] variables){
        String algoritmo = variables[0];
        String tipo = variables[1];
        String color = variables[2];
        String numeroPiezas = variables[3];
        int tiempoEjecucion = Integer.parseInt(variables[4]);

        Object[] arreglo = GenerarPiezas.crearArreglo(tipo, numeroPiezas);
        ClasePrincipalImpresionArgs.mostrarConsola(algoritmo, tipo, color, tiempoEjecucion, arreglo);
    }

}
