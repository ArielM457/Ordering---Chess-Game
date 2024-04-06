package university.jala.chess.modelos.tablero;

import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.piezas.transformacion.ArregloEquivalenteCaracteres;
import university.jala.chess.modelos.piezas.transformacion.ArregloEquivalenteNumeros;
import university.jala.chess.modelos.piezas.OrdenamientoPiezas;

import java.util.List;
import java.util.Map;

/**
 * Impresion de la matriz que representará al tablero
 *
 * @author universitario- estudiante:  Ariel Murillo
 */
public class MatrizTablero {
    public void mostrarTablero(Object[] arreglo, int numPiezas, List<String> piezas, String tipo) {
        OrdenamientoPiezas ordenamientoPiezas = new OrdenamientoPiezas();
        Map<Object, String> mapaPiezas = ordenamientoPiezas.asignarValoresPiezas(arreglo, piezas, tipo);
        System.out.println(" ");
        int limite;
        int inicio;
        for (int indiceFilas = 0; indiceFilas < Constantes.NUMERO_LIMITE_TABLERO; indiceFilas++) {
            imprimirLineaSupeior();
            if (indiceFilas < 2) {
                if (indiceFilas == 0) {
                    limite = Constantes.NUMERO_LIMITE_TABLERO;
                    inicio = 0;
                    imprimirLineaMedia(mapaPiezas, arreglo, inicio, limite, tipo);
                } else if (indiceFilas == 1 && (numPiezas > Constantes.NUMERO_LIMITE_TABLERO)) {
                    inicio = Constantes.NUMERO_LIMITE_TABLERO;
                    limite = Constantes.VALOR_MAXIMO_PIEZAS;
                    imprimirLineaMedia(mapaPiezas, arreglo, inicio, limite, tipo);
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
            if (linealSuperior == 7) {
                System.out.printf(Constantes.LINEA_VACIA_TERMINAL);
            } else {
                System.out.printf(Constantes.LINEA_VACIA);
            }
        }
        System.out.println(Constantes.VACIO);
    }

    public void imprimirLineaMedia(Map<Object, String> mapaPiezas, Object[] arreglo, int inicio, int limite, String tipo) {
        Object ValorPosicion = null;
        for (int posicionArreglo = inicio; posicionArreglo < limite; posicionArreglo++) {
            if (posicionArreglo < arreglo.length) {
                if (posicionArreglo == limite - 1) {
                    switch (tipo) {
                        case Constantes.NUMERICO:
                            ValorPosicion = ArregloEquivalenteNumeros.devolverNumero((Integer) arreglo[posicionArreglo]);
                            break;
                        case Constantes.CARACTER:
                            ValorPosicion = ArregloEquivalenteCaracteres.devolverCaracter((String) arreglo[posicionArreglo]);
                    }
                    System.out.printf("| " + mapaPiezas.get(ValorPosicion) + " |");
                } else {
                    switch (tipo) {
                        case Constantes.NUMERICO:
                            ValorPosicion = ArregloEquivalenteNumeros.devolverNumero((Integer) arreglo[posicionArreglo]);
                            break;
                        case Constantes.CARACTER:
                            ValorPosicion = ArregloEquivalenteCaracteres.devolverCaracter((String) arreglo[posicionArreglo]);
                    }
                    System.out.printf("| " + mapaPiezas.get(ValorPosicion) + Constantes.VACIO);
                }
            } else {
                if (posicionArreglo == limite - 1) {
                    System.out.printf(Constantes.LINEA_VACIA_TERMINAL);
                } else {
                    System.out.printf(Constantes.LINEA_VACIA);
                }
            }
        }
        System.out.println(Constantes.VACIO);

    }
}
