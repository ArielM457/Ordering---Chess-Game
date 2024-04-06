package university.jala.chess.modelos.asignaciones.verificaciones;

import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.excepciones.ArgumentValidationException;

/**
 * Clase validadora de si el argumento es " "
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class VerificacionValorNulo  {
    public static void verificar (String argumento, boolean verificador){
        if (verificador && argumento.equals(Constantes.ALGORITMO)) {
            ArgumentValidationException.algortimoInvalido();
                }
        if (verificador && argumento.equals(Constantes.TIPO_ORDENAMIENTO))
        {
            ArgumentValidationException.tipoOrdenamientoInvalido();
        }
    }
}
