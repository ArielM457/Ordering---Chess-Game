package university.jala.chess.test;

import org.junit.jupiter.api.Test;
import university.jala.chess.modelos.generador.GeneradorArregloEnteros;

import static org.junit.jupiter.api.Assertions.*;

public class GeneradorArregloEnterosTest {

    @Test
    void comprobacionCreacionArreglo() {
        GeneradorArregloEnteros generador = new GeneradorArregloEnteros();
        String numeroPiezas = "10";
        Integer[] result = generador.creacionArregloRandomico(numeroPiezas);
        assertEquals(10, result.length);
        assertTrue(elementosDuplicados(result));
    }

    private boolean elementosDuplicados(Integer[] array) {
        for (int indiceArreglo = 0; indiceArreglo < array.length - 1; indiceArreglo++) {
            for (int indiceNumerosUnicos = indiceArreglo + 1; indiceNumerosUnicos < array.length; indiceNumerosUnicos++) {
                if (array[indiceArreglo].equals(array[indiceNumerosUnicos])) {
                    return false;
                }
            }
        }
        return true;
    }
}

