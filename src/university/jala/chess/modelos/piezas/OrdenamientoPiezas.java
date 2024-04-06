package university.jala.chess.modelos.piezas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Creacion de las posiciones de las piezas según la matriz ordenada
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class OrdenamientoPiezas {
    public Map<Object, String> mapaPiezas = new HashMap<>();

    public Map<Object, String> asignarValoresPiezas(Object[] arreglo, List<String> listaPiezas, String tipo) {
        int numeroCaracter;
        switch (tipo) {
            case "n":
                for (int posicionMapa = 1; posicionMapa < 17; posicionMapa++) {
                    mapaPiezas.put(posicionMapa, listaPiezas.get(posicionMapa - 1));
                }
                break;
            case "c":
                String inicio = "a";
                String limite = "p";
                for (char posicionMapa = inicio.charAt(0); posicionMapa <= limite.charAt(0); posicionMapa++) {
                    String posicionMapaString = String.valueOf(posicionMapa);
                    for (EnumsPiezas piezas : EnumsPiezas.values()) {
                        if (posicionMapaString.equals(piezas.getCaracterPieza())) {
                            numeroCaracter = piezas.getNroPieza() - 1;
                            mapaPiezas.put(posicionMapaString, listaPiezas.get(numeroCaracter));
                        }
                    }
                }
        }
        return mapaPiezas;
    }
}
