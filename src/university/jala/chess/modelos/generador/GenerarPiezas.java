package university.jala.chess.modelos.generador;

import university.jala.chess.modelos.asignaciones.Constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author universitario- estudiante:  Ariel Murillo
 * Interfaz para la creacion del arreglo a partir del argumento
 * tipo de los argumentos de main
 */
public interface GenerarPiezas {
     Object[] creacionArregloRandomico(String numeroPiezas);

     static Object[] crearArreglo(String tipo, String numeroPiezas) {
        GeneradorArregloCaracteres generadorArregloCaracteres = new GeneradorArregloCaracteres();
        GeneradorArregloEnteros generadorArregloEnteros = new GeneradorArregloEnteros();
        Map<String, Object[]> mapaGenerador = new HashMap<>();
        mapaGenerador.put(Constantes.NUMERICO, generadorArregloEnteros.creacionArregloRandomico(numeroPiezas));
        mapaGenerador.put(Constantes.CARACTER, generadorArregloCaracteres.creacionArregloRandomico(numeroPiezas));
        return mapaGenerador.get(tipo);
    }

}
