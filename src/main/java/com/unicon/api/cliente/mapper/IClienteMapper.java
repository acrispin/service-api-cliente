package com.unicon.api.cliente.mapper;

import com.unicon.api.cliente.beans.ClienteBean;
import com.unicon.api.cliente.beans.ContactoBean;
import com.unicon.api.cliente.beans.ResponseBean;

import java.util.List;

public interface IClienteMapper {

    List<ClienteBean> selectClientesByName();

    ResponseBean registrarCliente(ClienteBean cliente);

    ResponseBean registrarClienteContacto(ContactoBean contacto);

}
