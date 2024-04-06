package university.jala.chess.modelos;

import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.controladores.ModeradorOrdenamientoCaracteres;
import university.jala.chess.modelos.controladores.ModeradorOrdenamientoNumeros;
import university.jala.chess.modelos.excepciones.ArgumentValidationException;

/**
 * Clase de Salida que muestra los argumentos y el ordenamiento segun esos argumentos
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public final class ClasePrincipalImpresionArgs {
    private ClasePrincipalImpresionArgs() {
    }

    public static void mostrarConsola(String algoritmo, String tipo, String color, int tiempoEjecucion, Object[] arreglo) {
        ModeradorOrdenamientoNumeros moderadorOrdenamientoNumeros = new ModeradorOrdenamientoNumeros();
        ModeradorOrdenamientoCaracteres moderadorOrdenamientoCaracteres = new ModeradorOrdenamientoCaracteres();
        if (tipo.equals(Constantes.NUMERICO)) {
            tiempoEjecucion = moderadorOrdenamientoNumeros.ordenarValores(arreglo, algoritmo, tiempoEjecucion, color, tipo);
        } else if (tipo.equals(Constantes.CARACTER)) {
            tiempoEjecucion = moderadorOrdenamientoCaracteres.ordenarValoresCaracteres(arreglo, algoritmo, tiempoEjecucion, color, tipo);
        }
        System.out.println("tiempo: " + tiempoEjecucion);
    }


    public static void comprobacionTiempo(int tiempoEjecucion) {
        if (!(tiempoEjecucion == (Integer.parseInt(Constantes.NULO))) && (tiempoEjecucion < 100 || tiempoEjecucion > 1000)) {
            ArgumentValidationException.tiempoInvalido();
        } else if (tiempoEjecucion == (Integer.parseInt(Constantes.NULO))) {
            ArgumentValidationException.sinTiempo();
        }
    }

}

