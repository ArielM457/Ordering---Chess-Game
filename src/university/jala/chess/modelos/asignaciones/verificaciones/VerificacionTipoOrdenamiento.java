package university.jala.chess.modelos.asignaciones.verificaciones;

import university.jala.chess.modelos.asignaciones.AsignacionArgumentos;
import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.asignaciones.ConversorArgumentosMinuscula;
import university.jala.chess.modelos.excepciones.ArgumentValidationException;

/**
 * Clase validadora de el tipo de ordenamiento
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class VerificacionTipoOrdenamiento implements AsignacionArgumentos {
    @Override
    public  String verificar(String argumento) {
        argumento=ConversorArgumentosMinuscula.convertirMinusculas(argumento);
        String tipoOrdenamiento = "";
        if ((argumento.equals(Constantes.BLANCO)) || (argumento.equals(Constantes.NEGRO))) {
            tipoOrdenamiento = argumento;
        } else {
            ArgumentValidationException.tipoOrdenamientoInvalido();
        }
        return tipoOrdenamiento;
    }

}
