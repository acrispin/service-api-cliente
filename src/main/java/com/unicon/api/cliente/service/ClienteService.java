package com.unicon.api.cliente.service;

import com.unicon.api.cliente.beans.ClienteBean;
import com.unicon.api.cliente.dao.ClienteDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Override
    public List<ClienteBean> obtenerClientes() {
        return new ClienteDao("1").selectClientesByName();
    }
}
