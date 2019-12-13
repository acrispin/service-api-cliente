package com.unicon.api.cliente.controller;

import com.unicon.api.cliente.service.IClienteService;
import com.unicon.api.commons.beans.cliente.ClienteContactoBean;
import com.unicon.api.commons.beans.cliente.ResponseClienteContactoBean;
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

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contacto")
public class ContactoController {

    private static Logger log = LoggerFactory.getLogger(ContactoController.class);

    @Autowired
    public IClienteService clienteService;

    @GetMapping("")
    public List<ClienteContactoBean> getContactos() {
        log.info("listar clientes");
        List<ClienteContactoBean> list = new ArrayList<>();
        list.add(new ClienteContactoBean(1, "24872525983", "01", "Contacto 001", "Admin", "admin@admin.com", "92582389"));
        list.add(new ClienteContactoBean(1, "24872525983", "02", "Contacto 002", "Admin2", "admin2@admin.com", "92582389"));
        list.add(new ClienteContactoBean(1, "24872525983", "03", "Contacto 003", "Admin3", "admin3@admin.com", "92582389"));
        list.add(new ClienteContactoBean(1, "24872525983", "04", "Contacto 004", "Admin4", "admin4@admin.com", "92582389"));
        return list;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseClienteContactoBean crear(@RequestBody ClienteContactoBean contacto) {
        log.info("crear contacto: " + contacto.toString());
        return clienteService.crearClienteContacto(contacto);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseClienteContactoBean actualizar(@RequestBody ClienteContactoBean contacto) {
        log.info("actualizar contacto: " + contacto.toString());
        return clienteService.actualizarClienteContacto(contacto);
    }
}
