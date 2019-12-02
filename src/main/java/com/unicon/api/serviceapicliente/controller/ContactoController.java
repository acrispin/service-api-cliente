package com.unicon.api.serviceapicliente.controller;

import com.unicon.api.serviceapicliente.beans.ContactoBean;
import com.unicon.api.serviceapicliente.beans.ResponseBean;
import com.unicon.api.serviceapicliente.beans.ResponseContactoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contacto")
public class ContactoController {

    private static Logger log = LoggerFactory.getLogger(ContactoController.class);

    @GetMapping("")
    public List<ContactoBean> getContactos() {
        log.info("listar clientes");
        List<ContactoBean> list = new ArrayList<>();
        list.add(new ContactoBean(1, "24872525983", "01", "Contacto 001", "Admin", "admin@admin.com", "92582389"));
        list.add(new ContactoBean(1, "24872525983", "02", "Contacto 002", "Admin2", "admin2@admin.com", "92582389"));
        list.add(new ContactoBean(1, "24872525983", "03", "Contacto 003", "Admin3", "admin3@admin.com", "92582389"));
        list.add(new ContactoBean(1, "24872525983", "04", "Contacto 004", "Admin4", "admin4@admin.com", "92582389"));
        return list;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseContactoBean crear(@RequestBody ContactoBean contacto) {
        log.info("crear contacto: " + contacto.toString());
        ResponseContactoBean response = new ResponseContactoBean();
        response.setCodigo(null);
        response.setId(null);
        response.setCodigoCliente("045711");
        response.setSecuencia("01");
        response.setCodigoUsuario(1234);
        response.setEstado(ResponseBean.STATUS_CREADO);
        response.setMensaje("OK");
        response.setResultado(true);
        return response;
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseContactoBean actualizar(@RequestBody ContactoBean contacto) {
        log.info("actualizar contacto: " + contacto.toString());
        ResponseContactoBean response = new ResponseContactoBean();
        response.setCodigo(null);
        response.setId(null);
        response.setCodigoCliente("045711");
        response.setSecuencia("01");
        response.setCodigoUsuario(1234);
        response.setEstado(ResponseBean.STATUS_MODIFICADO);
        response.setMensaje("OK");
        response.setResultado(true);
        return response;
    }
}
