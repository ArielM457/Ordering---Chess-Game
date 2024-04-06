package university.jala.chess.modelos.tablero.finalizacion;

import university.jala.chess.modelos.asignaciones.Constantes;
import university.jala.chess.modelos.piezas.transformacion.ArregloEquivalenteNumeros;
import university.jala.chess.modelos.piezas.OrdenamientoPiezas;

import java.util.List;
import java.util.Map;

public class CompletarTableroEnteros {
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
                    limite = Constantes.NUMERO_LIMITE_TABLERO;
                    inicio = 0;
                    imprimirLineaMedia(mapaPiezas, arreglo, inicio, limite);
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
        public void imprimirLineaMedia(Map<Object, String> mapaPiezas, Object[] arreglo, int inicio, int limite) {
        int numero;
        int posicion=0;
        for (int posicionArreglo = inicio; posicionArreglo < limite; posicionArreglo++) {
            if (  arreglo.length<=posicion)
            {if (posicionArreglo+1==Constantes.NUMERO_LIMITE_TABLERO)
            {
                System.out.printf(Constantes.LINEA_VACIA_TERMINAL);
            }
            else{
                System.out.printf(Constantes.LINEA_VACIA);
            }
            } else if ( arreglo.length>posicion) {

            if (posicionArreglo + 1 == (Integer) arreglo[posicion]) {
                 if ((Integer)arreglo[posicion]==Constantes.NUMERO_LIMITE_TABLERO)
                 {
                     numero = ArregloEquivalenteNumeros.devolverNumero((Integer) arreglo[posicion]);
                     System.out.printf("| " + mapaPiezas.get(numero) + " |");
                     posicion++;
                 }
                 else{
                     numero = ArregloEquivalenteNumeros.devolverNumero((Integer) arreglo[posicion]);
                     System.out.printf("| " + mapaPiezas.get(numero) + " ");
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
