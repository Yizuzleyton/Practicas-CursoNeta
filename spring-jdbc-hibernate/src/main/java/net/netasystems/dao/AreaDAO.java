package net.netasystems.dao;

import java.math.BigDecimal;
import java.util.List;

import net.netasystems.persistence.entities.Area;

/**
 * interface de la tabla Area
 * @author Neta Systems / Jose de Jesus Leyton Hernandez
 *
 * @version
 * 17/09/2018
 */
public interface AreaDAO {
	/**
	 * Metodo
	 * <p>selecciona todos los datos de la tabla area</p>
	 *
	 * @return
	 */
	List<Area> finAll();
	
	/**
	 * Metodo
	 * <p>inserta datos en la tabla area</p>
	 *
	 * @param entidadAGuardar
	 */
	void insert(Area entidadAGuardar);

	/**
	 * Metodo
	 * <p>selec de la tabla area mediante id</p>
	 *
	 * @param id
	 * @return
	 */
	Area findById(BigDecimal id);

	/**
	 * Metodo
	 * <p> actualiza nombre de una dato de la tabla area</p>
	 *
	 * @param nombre
	 */
	void updateNombre(Area nombre);

	/**
	 * Metodo
	 * <p>elimina datos de la tabla area mediate id</p>
	 *
	 * @param id
	 */
	void delete(Area id);
	
}
