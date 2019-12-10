package com.unicon.api.cliente.service;

import com.unicon.api.cliente.beans.ClienteBean;
import com.unicon.api.cliente.beans.ContactoBean;
import com.unicon.api.cliente.beans.ResponseBean;
import com.unicon.api.cliente.beans.ResponseContactoBean;
import com.unicon.api.cliente.dao.ClienteDao;
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
    public ResponseContactoBean crearClienteContacto(ContactoBean contacto) {
        contacto.setSecuencia(null);
        contacto.setEstado(null);
        return new ClienteDao(contacto.getIdMarca()).registrarClienteContacto(contacto);
    }

    @Override
    public ResponseContactoBean actualizarClienteContacto(ContactoBean contacto) {
        return new ClienteDao(contacto.getIdMarca()).registrarClienteContacto(contacto);
    }
}
