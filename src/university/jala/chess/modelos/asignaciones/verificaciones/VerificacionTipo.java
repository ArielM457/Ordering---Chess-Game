package university.jala.chess.modelos.asignaciones.verificaciones;

import university.jala.chess.modelos.asignaciones.AsignacionArgumentos;
import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.asignaciones.ConversorArgumentosMinuscula;
import university.jala.chess.modelos.excepciones.ArgumentValidationException;

/**
 * Clase para la validacion del tipo de arreglo
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class VerificacionTipo implements AsignacionArgumentos {
    @Override
    public  String verificar(String argumento) {
        argumento= ConversorArgumentosMinuscula.convertirMinusculas(argumento);
        String tipo = "";
        if ((argumento.equals(Constantes.NUMERICO)) || (argumento.equals(Constantes.CARACTER))) {
            tipo = argumento;
        } else {
            ArgumentValidationException.tipoInvalido();
        }
        return tipo;
    }
}
