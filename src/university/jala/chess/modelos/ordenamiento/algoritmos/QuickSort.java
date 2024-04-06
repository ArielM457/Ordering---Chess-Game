package university.jala.chess.modelos.ordenamiento.algoritmos;

import university.jala.chess.modelos.tiempo.TiempoEjecucion;
import university.jala.chess.modelos.ordenamiento.AlgoritmoOrdenamiento;
import university.jala.chess.modelos.tablero.MatrizTablero;

import java.util.List;

/**
 * Clase que extiende de AlgoritmoOrdenamiento heredando ordenarArreglo
 * implementa el algoritmo de ordenamiento Quick Sort para objetos
 * sigue el concepto de divide y vencerás tomando un pivote, ordena de menor a mayor
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class QuickSort<T extends Comparable<T>> implements AlgoritmoOrdenamiento {
    @Override
    public <T extends Comparable<T>> int ordenarArreglo(T[] valores, int tiempoEjecucion, List<String> piezas, String tipo) {
        int contadorTiempo=0;
        MatrizTablero matrizTablero= new MatrizTablero();
        int pivote = valores.length - 1;
        T valorPivote = valores[pivote];
        int valMenor ;
        T guardar;
        boolean validacion;
        matrizTablero.mostrarTablero( valores, valores.length, piezas, tipo);
        for (int posicionArreglo = 0; posicionArreglo < pivote; posicionArreglo++) {
            if (valores[posicionArreglo].compareTo(valorPivote) > 0) {
                valMenor = posicionArreglo;
                validacion = true;
                while (validacion && valMenor < valores.length) {
                    valMenor++;
                    if (valMenor == valores.length) {
                        break;
                    }
                    if (valores[valMenor].compareTo(valorPivote) < 0) {
                        guardar = valores[posicionArreglo];
                        valores[posicionArreglo] = valores[valMenor];
                        valores[valMenor] = guardar;
                        validacion = false;
                        matrizTablero.mostrarTablero( valores, valores.length, piezas, tipo);
                        TiempoEjecucion.tiempo(tiempoEjecucion);
                        contadorTiempo += tiempoEjecucion;
                    }
                }
            }
        }

        for (int posicionArreglo = 0; posicionArreglo < pivote; posicionArreglo++) {
            for (int indiceComparacion = 0; indiceComparacion < pivote - posicionArreglo - 1; indiceComparacion++) {
                if (valores[indiceComparacion].compareTo(valores[indiceComparacion + 1]) > 0) {
                    T temp = valores[indiceComparacion];
                    valores[indiceComparacion] = valores[indiceComparacion + 1];
                    valores[indiceComparacion + 1] = temp;
                    matrizTablero.mostrarTablero( valores, valores.length, piezas, tipo);
                    TiempoEjecucion.tiempo(tiempoEjecucion);
                    contadorTiempo += tiempoEjecucion;
                }
            }
        }

        for (int posicionPivote = valores.length -1; posicionPivote > 0; posicionPivote--) {
            if(valores[posicionPivote].compareTo(valores[posicionPivote-1])<0){
                guardar = valores[posicionPivote - 1];
                valores[posicionPivote - 1] = valores[posicionPivote];
                valores[posicionPivote] = guardar;
                matrizTablero.mostrarTablero( valores, valores.length, piezas, tipo);
                TiempoEjecucion.tiempo(tiempoEjecucion);
                contadorTiempo += tiempoEjecucion;
            }
            else {
                break;
            }

        }
        return  contadorTiempo;
    }


}

