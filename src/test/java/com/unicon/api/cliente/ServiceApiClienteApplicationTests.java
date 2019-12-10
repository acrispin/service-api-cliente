package com.unicon.api.cliente;

import com.unicon.api.cliente.beans.ClienteBean;
import com.unicon.api.cliente.dao.ClienteDao;
import com.unicon.api.commons.db.dao.DaoApplication;
import com.unicon.api.commons.db.dao.mapper.AppMapper;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Log4j2
class ServiceApiClienteApplicationTests {

	@Test
	void contextLoads() {
		log.info("test -----------");
		String server = "", username = "", sessionId = "", enviroment = "";
		try (SqlSession session = DaoApplication.getSqlSessionFactorySdc("1").openSession(true)) {
			AppMapper mapper = session.getMapper(AppMapper.class);
			server = mapper.selectServer();
			username = mapper.selectUsername();
			sessionId = mapper.selectSessionId();
			enviroment = session.getConfiguration().getEnvironment().getId();
		} catch (PersistenceException | NullPointerException ex) {
			log.error(ex.getMessage(), ex);
		}
		log.info("server: " + server);
		log.info("username: " + username);
		log.info("sessionId: " + sessionId);
		log.info("enviroment: " + enviroment);

		List<ClienteBean> lista = new ClienteDao(1).selectClientesByName();
		log.info("size lista: " + lista.size());
	}

}
