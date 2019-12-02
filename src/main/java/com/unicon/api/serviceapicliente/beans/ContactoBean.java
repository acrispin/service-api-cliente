package com.unicon.api.serviceapicliente.beans;

import java.io.Serializable;

public class ContactoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    protected int idMarca;
    protected String codigoCliente;
    protected String secuencia;
    protected String nombre;
    protected String cargo;
    protected String telefono;
    protected String telefono2;
    protected String email;
    protected String dni;
    protected String indicadorFacturacionElectronica;
    protected String apellido;
    protected String estado;
    protected int codigoUsuario;
    protected String codigoExterno;

    public ContactoBean() {
    }

    public ContactoBean(int idMarca, String codigoCliente, String secuencia, String nombre, String cargo, String email, String dni) {
        this.idMarca = idMarca;
        this.codigoCliente = codigoCliente;
        this.secuencia = secuencia;
        this.nombre = nombre;
        this.cargo = cargo;
        this.email = email;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "ContactoBean{" +
                "idMarca=" + idMarca +
                ", codigoCliente='" + codigoCliente + '\'' +
                ", secuencia='" + secuencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", telefono2='" + telefono2 + '\'' +
                ", email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                ", indicadorFacturacionElectronica='" + indicadorFacturacionElectronica + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estado='" + estado + '\'' +
                ", codigoUsuario=" + codigoUsuario +
                ", codigoExterno='" + codigoExterno + '\'' +
                '}';
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getIndicadorFacturacionElectronica() {
        return indicadorFacturacionElectronica;
    }

    public void setIndicadorFacturacionElectronica(String indicadorFacturacionElectronica) {
        this.indicadorFacturacionElectronica = indicadorFacturacionElectronica;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getCodigoExterno() {
        return codigoExterno;
    }

    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
}
