package com.unicon.api.cliente.controller;

import java.util.ArrayList;
import java.util.List;

import com.unicon.api.cliente.beans.ClienteBean;
import com.unicon.api.cliente.beans.ResponseBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class ClienteController {

    private static Logger log = LoggerFactory.getLogger(ClienteController.class);

    @GetMapping("")
    public List<ClienteBean> getClientes() {
        log.info("listar clientes");
        List<ClienteBean> list = new ArrayList<>();
        list.add(new ClienteBean(1, "24872525983", "RUC", "Cliente 001", "ACT"));
        list.add(new ClienteBean(1, "73473457774", "RUC", "Cliente 002", "ACT"));
        list.add(new ClienteBean(1, "89357474575", "RUC", "Cliente 003", "ACT"));
        list.add(new ClienteBean(1, "23452634664", "RUC", "Cliente 004", "ACT"));
        return list;
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
