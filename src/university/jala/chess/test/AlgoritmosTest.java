package university.jala.chess.test;

import org.testng.annotations.Test;
import university.jala.chess.modelos.ordenamiento.algoritmos.QuickSort;
import university.jala.chess.modelos.ordenamiento.algoritmos.SelectionSort;
import university.jala.chess.modelos.piezas.ColorPiezas;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class AlgoritmosTest {
    @Test
    void comprobacionOrdenamientoInsertionSort() {
        ColorPiezas colorPiezas = new ColorPiezas();
        Integer[] arreglo = {4, 2, 7, 1, 5,3,6,8};
        Integer[] arregloOrdenado = {1, 2, 3,4, 5,6, 7,8};
        List<String> listaPiezas= colorPiezas.asignadorColorPiezas("b");
        QuickSort<Integer> quickSort = new QuickSort<>();
        int tiempoEjecucion = quickSort.ordenarArreglo(arreglo, 0, listaPiezas, "n");

        assertArrayEquals(arregloOrdenado, arreglo);
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");
    }
    @Test
    void comprobacionOrdenamientoQuickSort() {
        ColorPiezas colorPiezas = new ColorPiezas();
        QuickSort<Integer> quickSort = new QuickSort<>();
        List<String> listaPiezas= colorPiezas.asignadorColorPiezas("b");
        String[] valores = {"a", "d", "f", "b", "h","c","e", "g"};
        int tiempoEjecucion = 1;
        int tiempoTotal = quickSort.ordenarArreglo(valores, tiempoEjecucion, listaPiezas , "c" );
        String[] arregloEsperado = {"a", "b","c", "d","e", "f","g", "h"};
        assertArrayEquals(arregloEsperado, valores);
        assertTrue(tiempoTotal > 0);
    }
    @Test
    void comprobacionOrdenamientoSelectionSort() {
        ColorPiezas colorPiezas = new ColorPiezas();
        List<String> listaPiezas= colorPiezas.asignadorColorPiezas("b");
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] arreglo = {5, 3, 8, 1, 2,4,7,6,10,9};
        int tiempoEjecucion = 1;
        int tiempoTotal = selectionSort.ordenarArreglo(arreglo, tiempoEjecucion,listaPiezas, "n");
        Integer[] arregloEsperado = {1, 2, 3,4, 5,6,7, 8,9,10};
        assertArrayEquals(arregloEsperado, arreglo);
        assertTrue(tiempoTotal > 0);
    }
}
