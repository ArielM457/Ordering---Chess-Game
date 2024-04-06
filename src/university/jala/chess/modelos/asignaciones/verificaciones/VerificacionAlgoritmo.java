package university.jala.chess.modelos.asignaciones.verificaciones;

import university.jala.chess.modelos.asignaciones.AsignacionArgumentos;
import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.asignaciones.ConversorArgumentosMinuscula;
import university.jala.chess.modelos.excepciones.ArgumentValidationException;

/**
 * CLase validadora algoritmo
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class VerificacionAlgoritmo implements AsignacionArgumentos {
@Override
    public String verificar(String argumento) {
        argumento=ConversorArgumentosMinuscula.convertirMinusculas(argumento);
        String algoritmo = "";
        if ((argumento.equals(Constantes.INSERTION_SORT)) || (argumento.equals(Constantes.QUICK_SORT)) || (argumento.equals(Constantes.SELECTION_SORT))) {
            algoritmo = argumento;
        } else {
            ArgumentValidationException.algortimoInvalido();
        }
        return algoritmo;
    }
}
