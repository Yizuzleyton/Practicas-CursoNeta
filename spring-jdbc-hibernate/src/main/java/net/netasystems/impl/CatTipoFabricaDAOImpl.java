package net.netasystems.impl;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.netasystems.dao.CatTipoFabricaDAO;
import net.netasystems.persistence.entities.CatTipoFabrica;


/**
  *Clase AreaDAOImpl
 *<p> implementa los metodos de su interfaz<p/>
 * @author Neta Systems / Jose de Jesus Leyton Hernandez
 *
 * @version
 * 17/09/2018
 */
@Repository
@Transactional
public class CatTipoFabricaDAOImpl implements CatTipoFabricaDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<CatTipoFabrica> findAll() {
	
		List<CatTipoFabrica> listaDesdeBd = 
				sessionFactory
				.getCurrentSession()
				.createQuery("FROM CatTipoFabrica", CatTipoFabrica.class)
				.getResultList();
		
		return listaDesdeBd;
	}

	@Override
	public void insert(CatTipoFabrica entidadAGuardar) {
		sessionFactory.getCurrentSession().save(entidadAGuardar);
		
	}



	@Override
	public void updateNombre(CatTipoFabrica nombre) {
		sessionFactory.getCurrentSession().update(nombre);
		
	}

	@Override
	public void delete(CatTipoFabrica id) {
		sessionFactory.getCurrentSession().delete(id);
		
	}


		

}
