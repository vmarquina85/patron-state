/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstate;

import patronstate.estados.EstadoAlumno;
import patronstate.estados.EstadoRegistrado;

public class Alumno {

    public static final int ESTADO_REGISTRADO = 1;
    public static final int ESTADO_MATRICULADO = 2;
    public static final int ESTADO_EGRESADO = 3;
    public static final int ESTADO_SUSPENDIDO = 0;
    public static final int ESTADO_EXPULSADO = -1;
     public static final int ESTADO_ADVERTIDO = 4;

    private long id;
    private String codigo;
    private String nombre;
    //...
    //private int estado;
    private EstadoAlumno estado;


    public Alumno() {
        this.estado = new EstadoRegistrado(this);
    }

    /*
  1: registrado
  2: matriculadpo
  3: egresado
  0: suspendido
 -1: expulsado
     */



    public void setId(long id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(EstadoAlumno estado) {
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoAlumno getEstado() {
        return estado;
    }

}
