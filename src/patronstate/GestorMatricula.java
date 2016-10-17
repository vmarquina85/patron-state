/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstate;

import patronstate.estados.EstadoAlumno;

/**
 *
 * @author Administrator
 */
public class GestorMatricula {
    public void matricular(Alumno alumno){
       alumno.getEstado().matricular();
    }
      public void expulsar(Alumno alumno){
          EstadoAlumno estado =alumno.getEstado();
          estado.expulsar();
    }
}
