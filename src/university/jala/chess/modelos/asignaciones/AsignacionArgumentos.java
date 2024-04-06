package university.jala.chess.modelos.asignaciones;

import university.jala.chess.modelos.asignaciones.verificaciones.*;
import university.jala.chess.modelos.excepciones.ArgumentValidationException;

/**
 * Clase que asigna los argumentos a variables de nuestro programa usables para su ordenamiento y demostracion
 *
 *  @author universitario- estudiante:  Ariel Murillo
 */
public interface AsignacionArgumentos {

    /**
     * Metodo asigandor
     *
     * @param args: recibe los argumentos en un arreglo
     * @return: Retorna un arreglo con los argumentos posicionados
     */
    static String[] asignacion(String[] args) {
        VerificacionAlgoritmo verificacionAlgoritmo = new VerificacionAlgoritmo();
        VerificacionTipo verificacionTipo = new VerificacionTipo();
        VerificacionTipoOrdenamiento verificacionTipoOrdenamiento = new VerificacionTipoOrdenamiento();
        VerificacionNumeroPiezas verificacionNumeroPiezas = new VerificacionNumeroPiezas();
        boolean inVerdadero = false;
        String[] variables = new String[5];
        variables[4] = Constantes.VACIO;
        for (int posicionArregloArgumentos = 0; posicionArregloArgumentos < args.length; posicionArregloArgumentos++) {
            try {
                boolean verificador = false;
                String[] partes = args[posicionArregloArgumentos].split(Constantes.CARACTER_SEPARADOR);
                if (partes.length < 2) {
                    verificador = true;
                }
                if (partes[0].equals(Constantes.ALGORITMO)) {
                    VerificacionValorNulo.verificar(partes[0], verificador);
                    variables[0] = verificacionAlgoritmo.verificar(partes[1]);
                } else if (variables[0] == null && partes[0].equals(Constantes.TIPO)) {
                    ArgumentValidationException.sinAlgortimo();
                } else if (partes[0].equals(Constantes.TIPO)) {
                    variables[1] = verificacionTipo.verificar(partes[1]);
                } else if ((variables[1] == null) && (partes[0].equals(Constantes.TIPO_ORDENAMIENTO))) {
                    ArgumentValidationException.sinTipo();
                } else if (partes[0].equals(Constantes.TIPO_ORDENAMIENTO)) {
                    VerificacionValorNulo.verificar(partes[0], verificador);
                    variables[2] = verificacionTipoOrdenamiento.verificar(partes[1]);
                } else if ((variables[2] == null) && (partes[0].equals(Constantes.VALIDADOR_NUMERO_PIEZAS))) {
                    ArgumentValidationException.sinTipoOrdenamiento();
                } else if (partes[0].equals(Constantes.VALIDADOR_NUMERO_PIEZAS)) {
                    inVerdadero = VerificacionValidadorNumeroPiezas.verificar(partes[1]);
                } else if ((!inVerdadero) && partes[0].equals("r")) {
                    ArgumentValidationException.sinValidadorNumeroPiezas();
                } else if ((partes[0].equals(Constantes.NUMERO_PIEZAS)) && inVerdadero) {
                    variables[3] = verificacionNumeroPiezas.verificar(partes[1]);
                    inVerdadero = false;
                } else if ((variables[3] == null) && (partes[0].equals(Constantes.TIEMPO))) {
                    ArgumentValidationException.sinNumeroPiezas();
                } else if (partes[0].equals(Constantes.TIEMPO)) {
                    variables[4] = partes[1];
                    inVerdadero = true;
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                System.exit(1);
            }
        }

        if (variables.length < Constantes.LIMITE_ARGUMENTOS) {
            if (variables[4].equals(Constantes.VACIO)) {
                variables[4] = Constantes.NULO;
            }
        }

        return variables;
    }
     String verificar(String argumento);
}
