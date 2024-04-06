package university.jala.chess.modelos.excepciones;

/**
 * Clase para la creacion de excepciones y mensajes en
 * ellas segun corresponda el error en los argumentos
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class ArgumentValidationException extends IllegalArgumentException {
    public ArgumentValidationException(String message) {
        super(message);
    }
    public static void algortimoInvalido() {
        throw new ArgumentValidationException("Error, valor inválido para selección de algoritmo\n");
    }
    public static void sinAlgortimo() {
        throw new ArgumentValidationException("Error, no existe valor para selección de algoritmo");
    }
    public static void tipoInvalido() {
        throw new ArgumentValidationException("Error, Tipo no reconocido");
    }
    public static void sinTipo() {
        throw new ArgumentValidationException(" Error, falta valor para tipo");
    }
    public static void tipoOrdenamientoInvalido() {
        throw new ArgumentValidationException("Error, tipo de ordenamiento no reconocido");
    }
    public static void sinTipoOrdenamiento() {
        throw new ArgumentValidationException("Error, falta tipo de ordenamiento");
    }
    public static void validadorNumeroPiezasInvalido() {
        throw new ArgumentValidationException("Error, tipo de entrada de valores no valido");
    }
    public static void sinValidadorNumeroPiezas() {
        throw new ArgumentValidationException("Error, falta tipo de entrada de valores");
    }
    public static void numeroPiezasInvalido() {
        throw new ArgumentValidationException("Error cantidad de piezas.");
    }
    public static void sinNumeroPiezas() {
        throw new ArgumentValidationException("Error, falta cantidad de piezas");
    }
    public static void tiempoInvalido() {
        System.err.println("\nValor para pausa de retardo invalido" );
        System.exit(1);
    }
    public static void sinTiempo() {
        System.err.println("\nFalta valor para pausa de retardo" );
        System.exit(1);
    }
}

