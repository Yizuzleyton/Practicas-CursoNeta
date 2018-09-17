package net.netasystems.dao;

import java.math.BigDecimal;
import java.util.List;

import net.netasystems.persistence.entities.Area;
import net.netasystems.persistence.entities.CatTipoFabrica;



/**
 *interface de la tabla CatTipoFabrica
 * @author Neta Systems / Jose de Jesus Leyton Hernandez
 *
 * @version
 * 10/09/2018
 */
public interface CatTipoFabricaDAO {
	
	/**
	 * Metodo
	 * <p>selecciona todos los datos de la tabla cattipofabrica</p>
	 *
	 * @return
	 */
	List<CatTipoFabrica> findAll();
	
	/**
	 * Metodo
	 * <p>inserta datos a la tabla cattipofabrica</p>
	 *
	 * @param entidadAGuardar
	 */
	void insert(CatTipoFabrica entidadAGuardar);


	/**
	 * Metodo
	 * <p>actualiza nombre de una dato de la tabla cattipofabrica</p>
	 *
	 * @param nombre
	 */
	void updateNombre(CatTipoFabrica nombre);

	/**
	 * Metodo
	 * <p>elimita un dato de la tabla cattipofabrica mediante su id</p>
	 *
	 * @param id
	 */
	void delete(CatTipoFabrica id);
}
