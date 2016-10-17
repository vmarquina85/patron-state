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
public class EstadoAdvertido implements EstadoAlumno{
private Alumno alumno;
public EstadoAdvertido(Alumno alumno){
    this.alumno=alumno;
}

    @Override
    public void matricular() {
         
    }

    @Override
    public void finalizarCiclo() {
        
    }

    @Override
    public void cometerInfraccion() {
        
    }

    @Override
    public void cumplirTiempo() {
        
    }

    @Override
    public void expulsar() {
        
    }

    @Override
    public void cumplirCreditos() {
        
    }

    @Override
    public void matricularAdvertido() {
        
    }

    @Override
    public void cumplirCondicion() {
        this.alumno.setEstado(new EstadoRegistrado(this.alumno));
    }

    @Override
    public void incumplirCondicion() {
          this.alumno.setEstado(new EstadoExpulsado(this.alumno));
    }
    
}
