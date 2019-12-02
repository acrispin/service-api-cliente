package com.unicon.api.serviceapicliente.beans;

import java.io.Serializable;

public class ResponseContactoBean extends ResponseBean implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String codigoCliente;
    protected String secuencia;
    protected Integer codigoUsuario;

    public ResponseContactoBean() {
        super();
    }

    public ResponseContactoBean(String codigoCliente, String secuencia, int codigoUsuario) {
        super();
        this.codigoCliente = codigoCliente;
        this.secuencia = secuencia;
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public String toString() {
        return "ResponseContactoBean{" +
                "codigoCliente='" + codigoCliente + '\'' +
                ", secuencia='" + secuencia + '\'' +
                ", codigoUsuario=" + codigoUsuario +
                ", id=" + id +
                ", codigo='" + codigo + '\'' +
                ", estado=" + estado +
                ", mensaje='" + mensaje + '\'' +
                ", resultado=" + resultado +
                '}';
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
}
