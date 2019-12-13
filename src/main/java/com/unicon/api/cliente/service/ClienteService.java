package com.unicon.api.cliente.service;

import com.unicon.api.cliente.dao.ClienteDao;
import com.unicon.api.commons.beans.cliente.ClienteBean;
import com.unicon.api.commons.beans.cliente.ClienteContactoBean;
import com.unicon.api.commons.beans.cliente.ResponseClienteContactoBean;
import com.unicon.api.commons.beans.response.ResponseBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Override
    public List<ClienteBean> obtenerClientes() {
        return new ClienteDao(1).selectClientesByName();
    }

    @Override
    public ResponseBean crearCliente(ClienteBean cliente) {
        cliente.setCodigo(null);
        return new ClienteDao(cliente.getIdMarca()).registrarCliente(cliente);
    }

    @Override
    public ResponseBean actualizarCliente(ClienteBean cliente) {
        return new ClienteDao(cliente.getIdMarca()).registrarCliente(cliente);
    }

    @Override
    public ResponseClienteContactoBean crearClienteContacto(ClienteContactoBean contacto) {
        contacto.setSecuencia(null);
        contacto.setEstado(null);
        return new ClienteDao(contacto.getIdMarca()).registrarClienteContacto(contacto);
    }

    @Override
    public ResponseClienteContactoBean actualizarClienteContacto(ClienteContactoBean contacto) {
        return new ClienteDao(contacto.getIdMarca()).registrarClienteContacto(contacto);
    }
}
