package university.jala.chess.test;

import org.testng.annotations.Test;
import university.jala.chess.modelos.asignaciones.AsignacionArgumentos;
import university.jala.chess.modelos.excepciones.ArgumentValidationException;

import static org.junit.jupiter.api.Assertions.*;

public class AsignacionesTest {

    @Test
    void testValidacionArgumentosCorrectos() {
        String[] args = {"a=q", "t=c", "o=b", "in=r", "r=6", "s=99"};
        String[] result = AsignacionArgumentos.asignacion(args);
        assertAll(() -> assertEquals("q", result[0]),
                () -> assertEquals("c", result[1]),
                () -> assertEquals("b", result[2]),
                () -> assertEquals("6", result[3]),
                () -> assertEquals("99", result[4]));
    }

    @Test
    void testValidacionAlgoritmo() {
        String[] args = {"t", "c"};
        assertThrows(ArgumentValidationException.class, () -> AsignacionArgumentos.asignacion(args));
    }

    @Test
    void testValidacionTipoIncorrecto() {
        String[] args = {"a=q","t=m"};
        assertThrows(ArgumentValidationException.class, () -> AsignacionArgumentos.asignacion(args));
    }

    @Test
    void testValidacionTipoOrdenamientoIncorrecto() {
        String[] args = {"a=i", "t=n", "o=2123"};
        assertThrows(ArgumentValidationException.class, () -> AsignacionArgumentos.asignacion(args));
    }
    @Test
    void testValidacionInVerdadero() {
        String[] args = {"a=i", "t=n", "o=b", "in=S"};
        assertThrows(ArgumentValidationException.class, () -> AsignacionArgumentos.asignacion(args));
    }
    @Test
    void testValidacionR() {
        String[] args = {"a=i", "t=n", "in=r", "r=18"};
        assertThrows(ArgumentValidationException.class, () -> AsignacionArgumentos.asignacion(args));
    }

}

