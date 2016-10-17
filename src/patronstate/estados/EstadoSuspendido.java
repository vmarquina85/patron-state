/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstate.estados;

import patronstate.Alumno;

/**
 *
 * @author Administrator
 */
public class EstadoSuspendido implements EstadoAlumno {

    private Alumno alumno;

public EstadoSuspendido(Alumno alumno){
this.alumno=alumno;
}
    @Override
    public void matricular() {}

    @Override
    public void finalizarCiclo() {}

    @Override
    public void cometerInfraccion() {}

    @Override
    public void cumplirTiempo() {
          this.alumno.setEstado(new EstadoRegistrado(this.alumno));
    }

    @Override
    public void expulsar() {
          this.alumno.setEstado(new EstadoExpulsado(this.alumno));
    }

    @Override
    public void cumplirCreditos() {}

    @Override
    public void matricularAdvertido() {}

    @Override
    public void cumplirCondicion() {}

    @Override
    public void incumplirCondicion() {}
    
}
