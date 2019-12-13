package com.unicon.api.cliente.controller;

import java.util.List;


import com.unicon.api.cliente.service.IClienteService;
import com.unicon.api.commons.beans.cliente.ClienteBean;
import com.unicon.api.commons.beans.response.ResponseBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClienteController {

    private static Logger log = LoggerFactory.getLogger(ClienteController.class);

    @Autowired
    public IClienteService clienteService;

    @GetMapping("")
    public List<ClienteBean> getClientes() {
        log.info("listar clientes");
        return clienteService.obtenerClientes();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseBean crear(@RequestBody ClienteBean cliente) {
        log.info("crear cliente: " + cliente.toString());
        return clienteService.crearCliente(cliente);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseBean actualizar(@RequestBody ClienteBean cliente) {
        log.info("actualizar cliente: " + cliente.toString());
        return clienteService.actualizarCliente(cliente);
    }

}
