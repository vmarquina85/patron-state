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
public class EstadoMatriculado implements EstadoAlumno {
private Alumno alumno;

public EstadoMatriculado(Alumno alumno){
this.alumno=alumno;
}
    
    @Override
    public void matricular() {}

    @Override
    public void finalizarCiclo() {
         this.alumno.setEstado(new EstadoRegistrado(this.alumno));
    }

    @Override
    public void cometerInfraccion() {
        this.alumno.setEstado(new EstadoSuspendido(this.alumno));
    }

    @Override
    public void cumplirTiempo() {}

    @Override
    public void expulsar() {
         this.alumno.setEstado(new EstadoExpulsado(this.alumno));
    }

    @Override
    public void cumplirCreditos() {
        this.alumno.setEstado(new EstadoEgresado(this.alumno));
    }

    @Override
    public void matricularAdvertido() {}

    @Override
    public void cumplirCondicion() {}

    @Override
    public void incumplirCondicion() {}
    
}
