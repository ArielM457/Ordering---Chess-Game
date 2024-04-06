package university.jala.chess.modelos.piezas;

import java.util.Objects;

/**
 * PiezasAjedrez que se usarán por su nombre y se imprimirá su sigla
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class PiezasAjedrez {
    private String siglaPieza;

    public PiezasAjedrez() {

    }
    public PiezasAjedrez(String siglaPieza) {
        this.siglaPieza = siglaPieza;
    }

    public void setSiglaPieza(String siglaPieza) {
        this.siglaPieza = siglaPieza;
    }


    public String getSiglaPieza() {
        return siglaPieza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PiezasAjedrez that)) return false;
        return Objects.equals(siglaPieza, that.siglaPieza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siglaPieza);
    }
}
