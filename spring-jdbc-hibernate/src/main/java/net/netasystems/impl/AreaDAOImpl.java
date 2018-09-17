package net.netasystems.impl;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.netasystems.dao.AreaDAO;
import net.netasystems.persistence.entities.Area;

//@Component
//@Service
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
public  class AreaDAOImpl implements AreaDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public List<Area> finAll() {
		System.out.println("Llamando metodo desde la clase concreta");
		String hql = "FROM Area";
		// String hql = "SELECT ga FROM GlobalArea ga";
		// String hql = "SELECT idArea, nombre, estatus, fechaModificacion, idUsuario
		// FROM GlobalArea";
		Query<Area> query = sessionFactory
				.getCurrentSession()
				.createQuery(hql, Area.class);
		List<Area> listAreas = query.list();
		return listAreas;
	}

	public void insert(Area entidadAGuardar) {
		sessionFactory.getCurrentSession().save(entidadAGuardar);
	}

	public Area findById(BigDecimal id) {
		return sessionFactory.getCurrentSession().find(Area.class, id);
	}
	
	@Override
	public void updateNombre(Area nombre) {
		sessionFactory.getCurrentSession().update(nombre);
		
	}

	@Override
	public void delete(Area id) {
		sessionFactory.getCurrentSession().delete(id);
		
	}



	




}
