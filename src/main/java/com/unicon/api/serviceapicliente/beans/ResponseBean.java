package com.unicon.api.serviceapicliente.beans;

import java.io.Serializable;

public class ResponseBean implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Operación satisfactoria
     */
    public static final byte STATUS_OK = 0;

    /**
     * Objeto creado satisfactoriamente
     */
    public static final byte STATUS_CREADO = 1;

    /**
     * Objeto modificado satisfactoriamente
     */
    public static final byte STATUS_MODIFICADO = 2;

    /**
     * Objeto eliminado satisfactoriamente
     */
    public static final byte STATUS_ELIMINADO = 3;

    /**
     * Error realizando la operación
     */
    public static final byte STATUS_ERROR = -1;

    /**
     * Error realizando la operación
     */
    public static final byte STATUS_EXCEPTION = -2;

    protected int id;
    protected String codigo;
    protected byte estado;
    protected String mensaje;
    protected Boolean resultado;

    public ResponseBean() {
        id = -1;
        codigo = "";
        estado = STATUS_ERROR;
        mensaje = "";
        resultado = false;
    }


    @Override
    public String toString() {
        return "ResponseBean{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", estado=" + estado +
                ", mensaje='" + mensaje + '\'' +
                ", resultado=" + resultado +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }
}
