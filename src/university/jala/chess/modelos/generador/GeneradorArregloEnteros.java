package university.jala.chess.modelos.generador;

import java.util.Random;

/**
 * Clase que genera el Arreglo para enteros con datos randomicos sin orden
 *
 *  @author universitario- estudiante:  Ariel Murillo
 */
public class GeneradorArregloEnteros implements GenerarPiezas {
    @Override
    public Integer[] creacionArregloRandomico(String numeroPiezas) {
        Random random = new Random();
        int numeroPiezasEntero = Integer.parseInt(numeroPiezas);
        Integer[] arreglo = new Integer[numeroPiezasEntero];
        for (int posicionArreglo = 0; posicionArreglo < arreglo.length; posicionArreglo++) {
            arreglo[posicionArreglo] = random.nextInt(numeroPiezasEntero) + 1;
            for (int numeroRandomicoUnico = posicionArreglo; numeroRandomicoUnico > 0; numeroRandomicoUnico--) {
                if (arreglo[posicionArreglo].equals(arreglo[numeroRandomicoUnico - 1]) ) {
                    posicionArreglo--;
                    break;
                }
            }
        }
        return arreglo;
    }
}
