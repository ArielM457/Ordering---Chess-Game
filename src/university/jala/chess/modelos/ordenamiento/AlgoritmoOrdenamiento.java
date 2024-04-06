package university.jala.chess.modelos.ordenamiento;

import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.ordenamiento.algoritmos.InsertionSort;
import university.jala.chess.modelos.ordenamiento.algoritmos.QuickSort;
import university.jala.chess.modelos.ordenamiento.algoritmos.SelectionSort;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Esta interfaz define métodos para ordenar un arreglo de cadenas
 * de enteros y caracteres utilizando diferentes algoritmos de ordenamiento.
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public interface AlgoritmoOrdenamiento {
    /**
     * Ordena el arreglo de cadenas de caracteres y numeros utilizando el algoritmo especificado.
     *
     * @param arreglo:   Arreglo inicial a ordenar
     * @param algoritmo: Algoritmo que se usará para ordenar
     */

     static  <T extends Comparable<T>> int ordenar(T[] arreglo, String algoritmo, int tiempoEjecucion, List<String> piezas, String tipo) {
        Map<String, Integer> mapaAlgoritmos = new TreeMap<>();
        InsertionSort<T> insertionSort = new InsertionSort();
        QuickSort<T> quickSort = new QuickSort();
        SelectionSort<T> selectionSort = new SelectionSort();
        switch (algoritmo)
        {
            case Constantes.INSERTION_SORT:
                mapaAlgoritmos.put(Constantes.INSERTION_SORT, insertionSort.ordenarArreglo(arreglo, tiempoEjecucion, piezas, tipo));
                break;
            case Constantes.QUICK_SORT:
                mapaAlgoritmos.put(Constantes.QUICK_SORT, quickSort.ordenarArreglo(arreglo, tiempoEjecucion, piezas, tipo));
                break;
            case Constantes.SELECTION_SORT:
                mapaAlgoritmos.put(Constantes.SELECTION_SORT,  selectionSort.ordenarArreglo(arreglo, tiempoEjecucion, piezas, tipo));
        }
       tiempoEjecucion= mapaAlgoritmos.get(algoritmo);
        return tiempoEjecucion;
    }
     <T extends Comparable<T>> int ordenarArreglo(T[] arreglo, int tiempoEjecucion,  List<String> piezas, String tipo);


}



