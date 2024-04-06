package university.jala.chess.modelos.ordenamiento.algoritmos;

import university.jala.chess.modelos.tiempo.TiempoEjecucion;
import university.jala.chess.modelos.ordenamiento.AlgoritmoOrdenamiento;
import university.jala.chess.modelos.tablero.MatrizTablero;

import java.util.List;

/**
 * Clase que hereda metodo ordenarArreglo de AlgoritmoOrdenamiento
 * implementa el algoritmo Selection Sort que ordena identificando en la iteracion al menor
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class SelectionSort<T extends Comparable<T>> implements AlgoritmoOrdenamiento {
    @Override
    public <T extends Comparable<T>> int ordenarArreglo(T[] arreglo, int tiempoEjecucion, List<String> piezas, String tipo) {
        MatrizTablero matrizTablero= new MatrizTablero();
        int contadorTiempo = 0;
        matrizTablero.mostrarTablero( arreglo, arreglo.length, piezas, tipo);
        for (int indeceArreglo = 0; indeceArreglo < arreglo.length - 1; indeceArreglo++) {
            int indiceMinimo = indeceArreglo;
            for (int indiceComparacion = indeceArreglo + 1; indiceComparacion < arreglo.length; indiceComparacion++) {
                if (arreglo[indiceComparacion].compareTo(arreglo[indiceMinimo]) < 0) {
                    indiceMinimo = indiceComparacion;
                    TiempoEjecucion.tiempo(tiempoEjecucion);
                    contadorTiempo += tiempoEjecucion;
                }
            }
            if (indiceMinimo != indeceArreglo) {
                T temp = arreglo[indeceArreglo];
                arreglo[indeceArreglo] = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = temp;
                matrizTablero.mostrarTablero( arreglo, arreglo.length, piezas, tipo);
                TiempoEjecucion.tiempo(tiempoEjecucion);
                contadorTiempo += tiempoEjecucion;
            }
        }
        return contadorTiempo;
    }

}
