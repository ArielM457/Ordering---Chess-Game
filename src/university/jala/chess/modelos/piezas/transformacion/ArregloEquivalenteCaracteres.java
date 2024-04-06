package university.jala.chess.modelos.piezas.transformacion;

import java.util.HashMap;
import java.util.Map;

public class ArregloEquivalenteCaracteres {
    public static  final Map<String, String> MAPA_TABLERO= new HashMap<>();
    public String [] transformarArreglo(String[] arreglo){
        MAPA_TABLERO.put("a", "d");
        MAPA_TABLERO.put("b", "e");
        MAPA_TABLERO.put("c", "a");
        MAPA_TABLERO.put("d", "h");
        MAPA_TABLERO.put("e", "c");
        MAPA_TABLERO.put("f", "f");
        MAPA_TABLERO.put("g", "g");
        MAPA_TABLERO.put("h", "b");
        MAPA_TABLERO.put("i", "i");
        MAPA_TABLERO.put("j", "j");
        MAPA_TABLERO.put("k","k" );
        MAPA_TABLERO.put("l", "l");
        MAPA_TABLERO.put("m", "m");
        MAPA_TABLERO.put("n", "n");
        MAPA_TABLERO.put("o", "o");
        MAPA_TABLERO.put("p", "p");
        String []arregloTransformado = new String[arreglo.length];
        for(int indiceArreglo=0; indiceArreglo<arreglo.length; indiceArreglo++ ){
            arregloTransformado[indiceArreglo]= MAPA_TABLERO.get(arreglo[indiceArreglo]);
        }
        return arregloTransformado;
    }
    public static String devolverCaracter(String caracter){
        MAPA_TABLERO.put("a","c");
        MAPA_TABLERO.put("b", "h");
        MAPA_TABLERO.put("c","e");
        MAPA_TABLERO.put("d","a");
        MAPA_TABLERO.put("e","b");
        MAPA_TABLERO.put("f","f");
        MAPA_TABLERO.put("g","g");
        MAPA_TABLERO.put("h","d");
        MAPA_TABLERO.put("i", "i");
        MAPA_TABLERO.put("j", "j");
        MAPA_TABLERO.put("k","k" );
        MAPA_TABLERO.put("l", "l");
        MAPA_TABLERO.put("m", "m");
        MAPA_TABLERO.put("n", "n");
        MAPA_TABLERO.put("o", "o");
        MAPA_TABLERO.put("p", "p");
        String caracterCambiado= MAPA_TABLERO.get(caracter);
        return caracterCambiado;
    }
}
