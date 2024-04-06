package university.jala.chess.modelos.asignaciones.verificaciones;

import university.jala.chess.modelos.asignaciones.AsignacionArgumentos;
import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.excepciones.ArgumentValidationException;

/**
 * Clase validadora del numero de piezas
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class VerificacionNumeroPiezas implements AsignacionArgumentos {
    @Override
    public  String verificar(String argumentoString) {
        int argumento = Integer.parseInt(argumentoString);
        String NumeroPiezas="";
        if ((argumento==(Constantes.VALOR_MINIMO_PIEZAS_ELEGIDAS)) || (argumento==(Constantes.VALOR_VALIDO_2)) || (argumento==(Constantes.VALOR_VALIDO_4)) || (argumento==(Constantes.VALOR_VALIDO_6)) || (argumento==(Constantes.NUMERO_LIMITE_TABLERO)) || (argumento==(Constantes.VALOR_VALIDO_10)) || (argumento==(Constantes.VALOR_MAXIMO_PIEZAS))) {
            NumeroPiezas = argumentoString;
        } else {
            ArgumentValidationException.numeroPiezasInvalido();
        }
        return NumeroPiezas;
    }
}
