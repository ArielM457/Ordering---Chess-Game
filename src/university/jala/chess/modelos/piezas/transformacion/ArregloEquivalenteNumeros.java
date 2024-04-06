package university.jala.chess.modelos.piezas.transformacion;

import university.jala.chess.modelos.asignaciones.Constantes;

import java.util.HashMap;
import java.util.Map;

public class ArregloEquivalenteNumeros {
    public static  final Map<Integer, Integer> MAPA_TABLERO= new HashMap<>();
    public Integer [] transformarArreglo(Integer[] arreglo){
        MAPA_TABLERO.put(Constantes.VALOR_MINIMO_PIEZAS_ELEGIDAS, Constantes.VALOR_VALIDO_4);
        MAPA_TABLERO.put(Constantes.VALOR_VALIDO_2, Constantes.VALOR_IMPAR_5);
        MAPA_TABLERO.put(Constantes.VALOR_IMPAR_3, Constantes.VALOR_MINIMO_PIEZAS_ELEGIDAS);
        MAPA_TABLERO.put(Constantes.VALOR_VALIDO_4, Constantes.NUMERO_LIMITE_TABLERO);
        MAPA_TABLERO.put(Constantes.VALOR_IMPAR_5, Constantes.VALOR_IMPAR_3);
        MAPA_TABLERO.put(Constantes.VALOR_VALIDO_6, Constantes.VALOR_VALIDO_6);
        MAPA_TABLERO.put(Constantes.VALOR_ANTERIOR_AL_LIMITE_7, Constantes.VALOR_ANTERIOR_AL_LIMITE_7);
        MAPA_TABLERO.put(Constantes.NUMERO_LIMITE_TABLERO, Constantes.VALOR_VALIDO_2);
        MAPA_TABLERO.put(Constantes.VALOR_INICIAL_SEGUNDA_FILA_9, Constantes.VALOR_INICIAL_SEGUNDA_FILA_9);
        MAPA_TABLERO.put(Constantes.VALOR_VALIDO_10, Constantes.VALOR_VALIDO_10);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_11, Constantes.VALOR_MEDIO_11);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_12, Constantes.VALOR_MEDIO_12);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_13, Constantes.VALOR_MEDIO_13);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_14, Constantes.VALOR_MEDIO_14);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_15, Constantes.VALOR_MEDIO_15);
        MAPA_TABLERO.put(Constantes.VALOR_MAXIMO_PIEZAS, Constantes.VALOR_MAXIMO_PIEZAS);
        Integer []arregloTransformado = new Integer[arreglo.length];
        for(int indiceArreglo=0; indiceArreglo<arreglo.length; indiceArreglo++ ){
            arregloTransformado[indiceArreglo]= MAPA_TABLERO.get(arreglo[indiceArreglo]);
        }
        return arregloTransformado;
    }
    public static int devolverNumero(int numero){
        MAPA_TABLERO.put(Constantes.VALOR_MINIMO_PIEZAS_ELEGIDAS,Constantes.VALOR_IMPAR_3);
        MAPA_TABLERO.put(Constantes.VALOR_VALIDO_2,Constantes.NUMERO_LIMITE_TABLERO);
        MAPA_TABLERO.put(Constantes.VALOR_IMPAR_3,Constantes.VALOR_IMPAR_5);
        MAPA_TABLERO.put(Constantes.VALOR_VALIDO_4, Constantes.VALOR_MINIMO_PIEZAS_ELEGIDAS);
        MAPA_TABLERO.put(Constantes.VALOR_IMPAR_5,Constantes.VALOR_VALIDO_2);
        MAPA_TABLERO.put(Constantes.VALOR_VALIDO_6, Constantes.VALOR_VALIDO_6);
        MAPA_TABLERO.put(Constantes.VALOR_ANTERIOR_AL_LIMITE_7, Constantes.VALOR_ANTERIOR_AL_LIMITE_7);
        MAPA_TABLERO.put(Constantes.NUMERO_LIMITE_TABLERO,Constantes.VALOR_VALIDO_4);
        MAPA_TABLERO.put(Constantes.VALOR_INICIAL_SEGUNDA_FILA_9, Constantes.VALOR_INICIAL_SEGUNDA_FILA_9);
        MAPA_TABLERO.put(Constantes.VALOR_VALIDO_10, Constantes.VALOR_VALIDO_10);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_11, Constantes.VALOR_MEDIO_11);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_12, Constantes.VALOR_MEDIO_12);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_13, Constantes.VALOR_MEDIO_13);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_14, Constantes.VALOR_MEDIO_14);
        MAPA_TABLERO.put(Constantes.VALOR_MEDIO_15, Constantes.VALOR_MEDIO_15);
        MAPA_TABLERO.put(Constantes.VALOR_MAXIMO_PIEZAS, Constantes.VALOR_MAXIMO_PIEZAS);
        int numeroCambiado= MAPA_TABLERO.get(numero);
        return numeroCambiado;
    }
}
