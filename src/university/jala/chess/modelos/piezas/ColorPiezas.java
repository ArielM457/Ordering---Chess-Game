package university.jala.chess.modelos.piezas;

import university.jala.chess.modelos.asignaciones.Constantes;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para cambiar posicion del color opuesto al elegido principalmente
 *
 * @author universitario - estudiante: Ariel Murillo
 */
public class ColorPiezas {
 public List<String> asignadorColorPiezas(String color){
     String colorPiezas = " ";
     List<String> piezasColor= new ArrayList<>();
     if (color.equals(Constantes.NEGRO))  {
         colorPiezas = Constantes.SIGLA_NEGRO;
     } else if (color.equals(Constantes.BLANCO)){
         colorPiezas = Constantes.SIGLA_BLANCO;
     }
     for (EnumsPiezas pieza : EnumsPiezas.values()) {
         piezasColor.add(pieza.getSigla()+colorPiezas);
     }
     return piezasColor;
 }

}
