package com.unicon.api.cliente.dao;

import com.unicon.api.cliente.beans.ClienteBean;
import com.unicon.api.cliente.beans.ContactoBean;
import com.unicon.api.cliente.beans.ResponseBean;
import com.unicon.api.cliente.beans.ResponseContactoBean;
import com.unicon.api.cliente.mapper.IClienteMapper;
import com.unicon.api.commons.db.dao.DaoApplication;
import com.unicon.api.commons.db.dao.enums.EConnectionType;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Log4j2
public class ClienteDao extends DaoApplication<ClienteBean, IClienteMapper> {

    /**
     *
     * @param idMarca
     */
    public ClienteDao(int idMarca) {
        super(String.valueOf(idMarca));
    }

    /**
     * Obtiene el tipo de la clase que se usa para las operaciones DML de <code>insert</code>, <code>update</code> y los resultados de los <code>select</code>
     *
     * @return Tipo de la clase a usar
     */
    @Override
    protected Class<ClienteBean> getClassType() {
        return ClienteBean.class;
    }

    /**
     * @return Logger de la clase hija
     */
    @Override
    protected Logger getLogger() {
        return log;
    }

    /**
     * @return SqlSessionFactory
     */
    @Override
    protected EConnectionType getConnectionType() {
        return EConnectionType.SDC;
    }

    /**
     * @return Mapper type
     */
    @Override
    protected Class<IClienteMapper> getMapperType() {
        return IClienteMapper.class;
    }

    /**
     * Obtiene lista de clientes por marca
     * @return Lista de clientes
     */
    public List<ClienteBean> selectClientesByName() {
        return queryList("selectClientesByName");
    }

    public ResponseBean registrarCliente(ClienteBean cliente) {
        // return executeDml("registrarCliente", ClienteBean.class, cliente);
        return executeDml("registrarCliente", cliente);
    }

    public ResponseContactoBean registrarClienteContacto(ContactoBean contacto) {
        return executeDml("registrarClienteContacto", contacto);
    }
}
