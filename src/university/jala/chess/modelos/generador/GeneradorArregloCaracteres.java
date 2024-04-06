package university.jala.chess.modelos.generador;

import java.util.Random;

/**
 * Clase que genera el Arreglo con datos randomicos sin orden
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class GeneradorArregloCaracteres implements GenerarPiezas {
    @Override
    public Character[] creacionArregloRandomico(String numeroPiezas) {
        int numeroPiezasEntero = Integer.parseInt(numeroPiezas);
        Random random = new Random();
        Character[] arreglo = new Character[numeroPiezasEntero];
        for (int posicionArreglo = 0; posicionArreglo < arreglo.length; posicionArreglo++) {
            arreglo[posicionArreglo] = (char) (random.nextInt(numeroPiezasEntero) + 'a');
            for (int NumeroRandomicoUnico = posicionArreglo; NumeroRandomicoUnico > 0; NumeroRandomicoUnico--) {
                if (arreglo[posicionArreglo] == arreglo[NumeroRandomicoUnico - 1]) {
                    posicionArreglo--;
                    break;
                }

            }

        }
        return arreglo;
    }
}
