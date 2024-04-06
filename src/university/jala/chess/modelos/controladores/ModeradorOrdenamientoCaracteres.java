package university.jala.chess.modelos.controladores;

import university.jala.chess.modelos.ClasePrincipalImpresionArgs;
import university.jala.chess.modelos.ordenamiento.AlgoritmoOrdenamiento;
import university.jala.chess.modelos.piezas.transformacion.ArregloEquivalenteCaracteres;
import university.jala.chess.modelos.piezas.ColorPiezas;
import university.jala.chess.modelos.tablero.finalizacion.CompletarTableroCaracteres;

import java.util.List;

/**
 * Clase para moderar el correcto funcionamiento del ordenamiento de los caracteres
 *
 * @author universitario- estudiante:  Ariel Murillo
 */

public class ModeradorOrdenamientoCaracteres {
    public int ordenarValoresCaracteres(Object[] arreglo, String algoritmo, int tiempoEjecucion, String color, String tipo) {
        CompletarTableroCaracteres completarTableroCaracteres= new CompletarTableroCaracteres();
        ArregloEquivalenteCaracteres arregloEquivalenteCaracteres = new ArregloEquivalenteCaracteres();
        ColorPiezas colorPiezas= new ColorPiezas();
        ClasePrincipalImpresionArgs.comprobacionTiempo(tiempoEjecucion);
        String[] arregloStrings = new String[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            arregloStrings[i] = String.valueOf(arreglo[i]);
        }
        List<String> listaPiezas= colorPiezas.asignadorColorPiezas(color);
        String[] arregloDesordenado= arregloEquivalenteCaracteres.transformarArreglo(arregloStrings);
        tiempoEjecucion = AlgoritmoOrdenamiento.ordenar(arregloDesordenado, algoritmo, tiempoEjecucion, listaPiezas, tipo);
       if(arregloStrings.length<8){
           completarTableroCaracteres.mostrarTablero(arregloDesordenado, arregloDesordenado.length, listaPiezas, tipo);
       }
        return tiempoEjecucion;
    }
}
