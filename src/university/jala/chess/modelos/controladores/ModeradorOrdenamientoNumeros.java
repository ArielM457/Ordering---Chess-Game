package university.jala.chess.modelos.controladores;

import university.jala.chess.modelos.ClasePrincipalImpresionArgs;
import university.jala.chess.modelos.ordenamiento.AlgoritmoOrdenamiento;
import university.jala.chess.modelos.piezas.transformacion.ArregloEquivalenteNumeros;
import university.jala.chess.modelos.piezas.ColorPiezas;
import university.jala.chess.modelos.tablero.finalizacion.CompletarTableroEnteros;

import java.util.List;

/**
 * Clase para moderar el correcto funcionamiento del ordenamiento de los numeros
 *
 * @author universitario- estudiante:  Ariel Murillo
 */

public class ModeradorOrdenamientoNumeros {
    public int ordenarValores(Object[] arreglo, String algoritmo, int tiempoEjecucion, String color,String tipo) {
        CompletarTableroEnteros completarTableroEnteros = new CompletarTableroEnteros();
        ColorPiezas colorPiezas = new ColorPiezas();
        ClasePrincipalImpresionArgs.comprobacionTiempo(tiempoEjecucion);
        Integer[] arregloEnteros = new Integer[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            arregloEnteros[i] = (Integer) arreglo[i];
        }
        List<String> listaPiezas= colorPiezas.asignadorColorPiezas(color);
        ArregloEquivalenteNumeros arregloEquivalenteNumeros = new ArregloEquivalenteNumeros();
        Integer[] arregloDesordenado= arregloEquivalenteNumeros.transformarArreglo(arregloEnteros);
        tiempoEjecucion = AlgoritmoOrdenamiento.ordenar(arregloDesordenado, algoritmo, tiempoEjecucion, listaPiezas, tipo);
        if(arregloDesordenado.length<8){
            completarTableroEnteros.mostrarTablero( arregloDesordenado, arreglo.length, listaPiezas, tipo);
        }
        return tiempoEjecucion;
    }
}
