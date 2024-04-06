package university.jala.chess.modelos.tiempo;

/**
 * Clase asignadora del tiempo de ejecucion
 *
 * @author universitario - estudiante: Ariel Murillo
 */
public final class TiempoEjecucion {
    private TiempoEjecucion() {
    }

    public static void tiempo(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException interrupcion) {
            System.err.println("Error al esperar por milisegundos: " + interrupcion.getMessage());
        }
    }

}
