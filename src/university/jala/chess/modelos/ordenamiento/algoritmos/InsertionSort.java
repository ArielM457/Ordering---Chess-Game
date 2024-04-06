package university.jala.chess.modelos.ordenamiento.algoritmos;

import university.jala.chess.modelos.tiempo.TiempoEjecucion;
import university.jala.chess.modelos.ordenamiento.AlgoritmoOrdenamiento;
import university.jala.chess.modelos.tablero.MatrizTablero;

import java.util.List;

/**
 * Clase que extiende de AlgoritmoOrdenamiento heredando ordenarArreglo para implementar
 * el algoritmo de ordenamiento InsertionSort para objetos los ordena de menor a mayor
 * comparando elementos según va recorriendo el arreglo
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class InsertionSort<T extends Comparable<T>> implements AlgoritmoOrdenamiento {
    @Override
    public <T extends Comparable<T>> int ordenarArreglo(T[] valores, int tiempoEjecucion, List<String> piezas, String tipo) {
        T guardar ;
        MatrizTablero matrizTablero= new MatrizTablero();
        int contadorTiempo = 0;
        int limite = valores.length;
        matrizTablero.mostrarTablero( valores, valores.length, piezas, tipo);
        for (int posicionArreglo = 0; posicionArreglo < limite - 1; posicionArreglo++) {
            if (valores[posicionArreglo + 1].compareTo(valores[posicionArreglo]) < 0 && posicionArreglo == 0) {
                guardar = valores[posicionArreglo];
                valores[posicionArreglo] = valores[posicionArreglo + 1];
                valores[posicionArreglo + 1] = guardar;
                matrizTablero.mostrarTablero( valores, valores.length, piezas, tipo);
                TiempoEjecucion.tiempo(tiempoEjecucion);
                contadorTiempo += tiempoEjecucion;
            }
            if (valores[posicionArreglo + 1].compareTo(valores[posicionArreglo]) < 0) {
                for (int posicionOrdenar = posicionArreglo; posicionOrdenar >= 0; posicionOrdenar--) {
                    if (valores[posicionOrdenar + 1].compareTo(valores[posicionOrdenar]) < 0) {
                        guardar = valores[posicionOrdenar];
                        valores[posicionOrdenar] = valores[posicionOrdenar + 1];
                        valores[posicionOrdenar + 1] = guardar;
                        matrizTablero.mostrarTablero( valores, valores.length, piezas, tipo);
                        TiempoEjecucion.tiempo(tiempoEjecucion);
                        contadorTiempo += tiempoEjecucion;
                    }
                }
                TiempoEjecucion.tiempo(tiempoEjecucion);
                contadorTiempo += tiempoEjecucion;
            }
        }
        return contadorTiempo;
    }
}
