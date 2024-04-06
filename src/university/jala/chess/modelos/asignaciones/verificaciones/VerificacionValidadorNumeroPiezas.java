package university.jala.chess.modelos.asignaciones.verificaciones;

import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.asignaciones.ConversorArgumentosMinuscula;
import university.jala.chess.modelos.excepciones.ArgumentValidationException;

/**
 * Clase validadora del in verdadero
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class VerificacionValidadorNumeroPiezas {

    public static boolean verificar(String argumento) {
        argumento=ConversorArgumentosMinuscula.convertirMinusculas(argumento);
        boolean inVerdadero = false;
        if (argumento.equals(Constantes.VALOR_VALIDADOR_NUMERO_PIEZAS)) {
            inVerdadero = true;
        } else {
            ArgumentValidationException.validadorNumeroPiezasInvalido();
        }
        return inVerdadero;
    }
}
