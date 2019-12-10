package com.unicon.api.cliente.service;

import com.unicon.api.cliente.beans.ClienteBean;
import com.unicon.api.cliente.beans.ContactoBean;
import com.unicon.api.cliente.beans.ResponseBean;
import com.unicon.api.cliente.beans.ResponseContactoBean;

import java.util.List;

public interface IClienteService {

    List<ClienteBean> obtenerClientes();

    ResponseBean crearCliente(ClienteBean cliente);

    ResponseBean actualizarCliente(ClienteBean cliente);

    ResponseContactoBean crearClienteContacto(ContactoBean contacto);

    ResponseContactoBean actualizarClienteContacto(ContactoBean contacto);

}
