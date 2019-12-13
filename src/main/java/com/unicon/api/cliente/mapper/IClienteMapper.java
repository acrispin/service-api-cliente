package com.unicon.api.cliente.mapper;

import com.unicon.api.commons.beans.cliente.ClienteBean;
import com.unicon.api.commons.beans.cliente.ClienteContactoBean;
import com.unicon.api.commons.beans.response.ResponseBean;

import java.util.List;

public interface IClienteMapper {

    List<ClienteBean> selectClientesByName();

    ResponseBean registrarCliente(ClienteBean cliente);

    ResponseBean registrarClienteContacto(ClienteContactoBean contacto);

}
