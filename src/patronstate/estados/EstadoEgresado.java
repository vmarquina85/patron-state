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
public class EstadoEgresado implements EstadoAlumno {
private Alumno alumno;
public EstadoEgresado(Alumno alumno){
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
    }

    @Override
    public void incumplirCondicion() {

    }
    
}
