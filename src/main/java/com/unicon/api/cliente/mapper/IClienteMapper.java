package com.unicon.api.cliente.mapper;

import com.unicon.api.cliente.beans.ClienteBean;

import java.util.List;

public interface IClienteMapper {
    public List<ClienteBean> selectClientesByName();
}
