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
public class EstadoRegistrado implements EstadoAlumno {

    private Alumno alumno;
    public EstadoRegistrado(Alumno alumno){
        this.alumno=alumno;
    }
    
    @Override
    public void matricular() {
       this.alumno.setEstado(new EstadoMatriculado(this.alumno));
    }

    @Override
    public void finalizarCiclo() {}

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
    public void cumplirCreditos() {}

    @Override
    public void matricularAdvertido() {
       this.alumno.setEstado(new EstadoAdvertido(this.alumno));  
    }

    @Override
    public void cumplirCondicion() {}

    @Override
    public void incumplirCondicion() {}
    
}
