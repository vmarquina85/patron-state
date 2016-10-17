/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstate;

/**
 *
 * @author Administrator
 */
public class Alumno {

    public static final int ESTADO_REGISTRADO = 1;
    public static final int ESTADO_MATRICULADO = 2;
    public static final int ESTADO_EGRESADO = 3;
    public static final int ESTADO_SUSPENDIDO = 0;
    public static final int ESTADO_EXPULSADO = -1;

    private long id;
    private String codigo;
    private String nombre;
    private int estado;
//...

    public Alumno() {
        this.estado = 1;
    }

    /*
  1: registrado
  2: matriculadpo
  3: egresado
  0: suspendido
 -1: expulsado
     */

    public void matricular() {
        if (this.estado == ESTADO_REGISTRADO) {
            this.estado = Alumno.ESTADO_MATRICULADO;
        }

    }

    public void finalizarCliclo() {
        if (this.estado == ESTADO_MATRICULADO) {
            this.estado = Alumno.ESTADO_REGISTRADO;
        }

    }

    public void cometerInfraccion() {
        if (this.estado == ESTADO_REGISTRADO || this.estado == ESTADO_MATRICULADO) {
            this.estado = Alumno.ESTADO_SUSPENDIDO;
        }

    }

    public void cumplirTiempo() {
        if (this.estado == ESTADO_SUSPENDIDO) {
            this.estado = Alumno.ESTADO_REGISTRADO;
        }
    }

    public void cumplirCreditos() {
        if (this.estado == ESTADO_MATRICULADO) {
            this.estado = Alumno.ESTADO_EGRESADO;
        }
    }

    public void Expulsar() {
        if (this.estado == ESTADO_SUSPENDIDO
                || this.estado == ESTADO_MATRICULADO
                || this.estado == ESTADO_REGISTRADO) {
            this.estado = Alumno.ESTADO_EXPULSADO;
        }
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(int estado) {
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

    public int getEstado() {
        return estado;
    }

}
