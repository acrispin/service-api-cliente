package com.unicon.api.cliente.controller;

import java.util.ArrayList;
import java.util.List;

import com.unicon.api.cliente.beans.ClienteBean;
import com.unicon.api.cliente.beans.ResponseBean;
import com.unicon.api.cliente.service.IClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


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
        ResponseBean response = new ResponseBean();
        response.setId(0);
        response.setEstado(ResponseBean.STATUS_CREADO);
        response.setCodigo("045711");
        response.setMensaje("OK");
        response.setResultado(true);
        return response;
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseBean actualizar(@RequestBody ClienteBean cliente) {
        log.info("actualizar cliente: " + cliente.toString());
        ResponseBean response = new ResponseBean();
        response.setId(0);
        response.setEstado(ResponseBean.STATUS_MODIFICADO);
        response.setCodigo("045711");
        response.setMensaje("OK");
        response.setResultado(true);
        return response;
    }

}