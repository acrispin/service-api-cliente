package com.unicon.api.cliente.beans;

import java.io.Serializable;

public class ClienteBean implements Serializable {

    private static final long serialVersionUID = 1L;

    protected int idMarca;
    protected String codigo;
    protected String tipoDocumento;
    protected String razonSocial;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String numeroDocumento;
    protected String codigoPostal;
    protected String direccion;
    protected String nombreUrbanizacion;
    protected String numeroCalle;
    protected String telefono;
    protected String tipoCalle;
    protected String nombre;
    protected String codigoVendedor;
    protected String estado;
    protected String codigoExterno;

    public ClienteBean() {
    }

    public ClienteBean(int idMarca, String codigo, String tipoDocumento, String razonSocial, String estado) {
        this.idMarca = idMarca;
        this.codigo = codigo;
        this.tipoDocumento = tipoDocumento;
        this.razonSocial = razonSocial;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ClienteBean{" +
                "idMarca=" + idMarca +
                ", codigo='" + codigo + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nombreUrbanizacion='" + nombreUrbanizacion + '\'' +
                ", numeroCalle='" + numeroCalle + '\'' +
                ", telefono='" + telefono + '\'' +
                ", tipoCalle='" + tipoCalle + '\'' +
                ", nombre='" + nombre + '\'' +
                ", codigoVendedor='" + codigoVendedor + '\'' +
                ", estado='" + estado + '\'' +
                ", codigoExterno='" + codigoExterno + '\'' +
                '}';
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreUrbanizacion() {
        return nombreUrbanizacion;
    }

    public void setNombreUrbanizacion(String nombreUrbanizacion) {
        this.nombreUrbanizacion = nombreUrbanizacion;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoCalle() {
        return tipoCalle;
    }

    public void setTipoCalle(String tipoCalle) {
        this.tipoCalle = tipoCalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoExterno() {
        return codigoExterno;
    }

    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
}
