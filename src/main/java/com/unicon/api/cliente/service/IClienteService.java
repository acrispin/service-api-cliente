package com.unicon.api.cliente.service;

import com.unicon.api.commons.beans.cliente.ClienteBean;
import com.unicon.api.commons.beans.cliente.ClienteContactoBean;
import com.unicon.api.commons.beans.cliente.ResponseClienteContactoBean;
import com.unicon.api.commons.beans.response.ResponseBean;

import java.util.List;

public interface IClienteService {

    List<ClienteBean> obtenerClientes();

    ResponseBean crearCliente(ClienteBean cliente);

    ResponseBean actualizarCliente(ClienteBean cliente);

    ResponseClienteContactoBean crearClienteContacto(ClienteContactoBean contacto);

    ResponseClienteContactoBean actualizarClienteContacto(ClienteContactoBean contacto);

}
