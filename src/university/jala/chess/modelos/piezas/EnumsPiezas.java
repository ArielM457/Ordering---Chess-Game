package university.jala.chess.modelos.piezas;

/**
 * Creamos enums los cuales serán usados más adelante para el ordenamiento de las piezas
 *
 * @author universitario- estudiante:  Ariel Murillo
 */

public enum EnumsPiezas {
    REY( 1,"a", "K"),
    REYNA(2, "b","Q"),
    TORRE_I(3, "c","T"),
    TORRE_II(4, "d","T"),
    ALFIL_I(5, "e","A"),
    ALFIL_II(6, "f","A"),
    CABALLO_I(7, "g","C"),
    CABALLO_II(8, "h","C"),
    PEON_I(9, "i","P"),
    PEON_II(10,"j", "P"),
    PEON_III(11,"k", "P"),
    PEON_IV(12, "l","P"),
    PEON_V(13, "m", "P"),
    PEON_VI(14, "n","P"),
    PEON_VII(15,"o", "P"),
    PEON(16, "p","P") ;
    private final int nroPieza;

    public String getCaracterPieza() {
        return caracterPieza;
    }

    private final String  caracterPieza;

    private final String sigla;

    EnumsPiezas(int nroPieza, String caracterPieza, String sigla) {
        this.nroPieza = nroPieza;
        this.caracterPieza = caracterPieza;
        this.sigla = sigla;
    }

    public int getNroPieza() {
        return nroPieza;
    }

    public String getSigla() {
        return sigla;
    }


}
