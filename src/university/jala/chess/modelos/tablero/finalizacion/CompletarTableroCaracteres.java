package university.jala.chess.modelos.tablero.finalizacion;

import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.piezas.transformacion.ArregloEquivalenteCaracteres;
import university.jala.chess.modelos.piezas.OrdenamientoPiezas;

import java.util.List;
import java.util.Map;

public class CompletarTableroCaracteres {
    public void mostrarTablero(Object[] arreglo, int numPiezas, List<String> piezas, String tipo) {
        OrdenamientoPiezas ordenamientoPiezas = new OrdenamientoPiezas();
        Map<Object, String> mapaPiezas = ordenamientoPiezas.asignarValoresPiezas(arreglo, piezas, tipo);
        System.out.println(" ");
        int limite;
        int inicio;
        for (int indiceFilas = 0; indiceFilas < Constantes.NUMERO_LIMITE_TABLERO; indiceFilas++) {
            imprimirLineaSupeior();
            if (indiceFilas < Constantes.VALOR_VALIDO_2) {
                if (indiceFilas == 0) {
                    imprimirLineaMedia(mapaPiezas, arreglo);
                }
            }
            if (indiceFilas > 1 || (indiceFilas == 1 && (numPiezas <= Constantes.NUMERO_LIMITE_TABLERO))) {
                inicio = 0;
                limite = Constantes.NUMERO_LIMITE_TABLERO;
                imprimirLineaVacia(inicio, limite);
            }
            if (indiceFilas==Constantes.VALOR_ANTERIOR_AL_LIMITE_7){
                imprimirLineaSupeior();
            }
        }
    }

    public void imprimirLineaSupeior() {
        for (int linealSuperior = 0; linealSuperior < Constantes.NUMERO_LIMITE_TABLERO; linealSuperior++) {
            if (linealSuperior == Constantes.NUMERO_LIMITE_TABLERO - 1) {
                System.out.printf(Constantes.LINEA_SUPERIOR_TERMINAL);
            } else {
                System.out.printf(Constantes.LINEA_SUPERIOR);
            }
        }
        System.out.println(Constantes.VACIO);
    }

    public void imprimirLineaVacia(int inicio, int limite) {
        for (int linealSuperior = inicio; linealSuperior < limite; linealSuperior++) {
            if (linealSuperior == Constantes.VALOR_ANTERIOR_AL_LIMITE_7) {
                System.out.printf(Constantes.LINEA_VACIA_TERMINAL);
            } else {
                System.out.printf(Constantes.LINEA_VACIA);
            }
        }
        System.out.println(Constantes.VACIO);
    }

    public void imprimirLineaMedia(Map<Object, String> mapaPiezas, Object[] arreglo) {
        String valorCaracter;
        int posicion = 0;
        String inicio = "a";
        String limite = "h";
        for (char posicionArreglo = inicio.charAt(0); posicionArreglo <= limite.charAt(0); posicionArreglo++) {
            String posicionArregloString = String.valueOf(posicionArreglo);
            if (arreglo.length <= posicion) {
                if (posicionArregloString.equals("h")) {
                    System.out.printf(Constantes.LINEA_VACIA_TERMINAL);
                } else {
                    System.out.printf(Constantes.LINEA_VACIA);
                }
            } else if (arreglo.length > posicion) {

                if (posicionArregloString.equals(arreglo[posicion])) {
                    if (arreglo[posicion].equals("h")) {
                        valorCaracter = ArregloEquivalenteCaracteres.devolverCaracter((String) arreglo[posicion]);
                        System.out.printf("| " + mapaPiezas.get(valorCaracter) + " |");
                        posicion++;
                    } else {
                        valorCaracter = ArregloEquivalenteCaracteres.devolverCaracter((String) arreglo[posicion]);
                        System.out.printf("| " + mapaPiezas.get(valorCaracter) + " ");
                        posicion++;
                    }
                } else {
                    System.out.printf(Constantes.LINEA_VACIA);
                }
            }
        }
        System.out.println(Constantes.VACIO);
    }
}


